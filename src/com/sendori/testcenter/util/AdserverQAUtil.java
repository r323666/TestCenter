package com.sendori.testcenter.util;

import com.sendori.testcenter.action.AdserverClient;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.Logger;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.List;

/**
 * TODO: Enter JavaDoc
 *
 * @since JDK 1.5
 */
public class AdserverQAUtil {

    private static final Logger logger = Logger.getLogger(AdserverClient.class);

    /**
     * This method is used to invoke Adserver
     *
     * @return
     */
    public static String postRequest(String request) {

        String responseBody = null;

        HttpClient httpClient = new HttpClient();

        PostMethod method = new PostMethod();

        try {

            method.setPath(request);
            logger.info("Request URL:" + request);

            // Execute the method.
            int statusCode = httpClient.executeMethod(method);

            logger.info("Status Code" + statusCode);

            if (statusCode != HttpStatus.SC_OK) {
                logger.info("Method failed: " + method.getStatusLine());
            }

            responseBody = inputStreamToString(method.getResponseBodyAsStream());

            responseBody = prettyFormat(responseBody, 2);

            if (logger.isDebugEnabled()) {
                logger.debug("Response XML ::::::" + responseBody);
            }

        } catch (HttpException e) {
            logger.info("Fatal protocol violation: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            logger.info("Fatal transport error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Release the connection.
            method.releaseConnection();
        }
        return responseBody;
    }

    /**
     * This method is used to format response xml
     *
     * @param input
     * @param indent
     * @return
     */
    public static String prettyFormat(String input, int indent) {
        try {
            Source xmlInput = new StreamSource(new StringReader(input));
            StringWriter stringWriter = new StringWriter();
            StreamResult xmlOutput = new StreamResult(stringWriter);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            transformerFactory.setAttribute("indent-number", indent);
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(xmlInput, xmlOutput);
            return xmlOutput.getWriter().toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method is used to write response xml to a file
     *
     * @param response
     */
    public static void writeToFile(String filePath, String response) {

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(filePath,true));

            out.write(response);
            out.flush();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is used to convert inputstream to String
     *
     * @param inputStream
     * @return
     */
    public static String inputStreamToString(InputStream inputStream) {

        if (inputStream != null) {

            try {

                //read it with BufferedReader
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

                StringBuilder sb = new StringBuilder();

                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }

                return sb.toString();

            } catch (Exception exp) {
                logger.info("Exception :::: " + exp.getMessage());
            }
        }
        return null;
    }

    /**
     * This method is used to convert String to InputStream
     *
     * @param str
     * @return
     */
    public static InputStream stringToInputStream(String str) {

        if (str != null) {

            try {

                // convert String into InputStream
                InputStream is = new ByteArrayInputStream(str.getBytes());

                return is;

            } catch (Exception exp) {
                logger.info("Exception :::: " + exp.getMessage());
            }
        }
        return null;
    }

    /**
     * @param fileName
     * @param dtoList
     */
    public static void writeToCSV(String fileName, List<com.sendori.testcenter.dto.ZeroClickFeedDTO> dtoList) {

        try {
            FileWriter writer = new FileWriter(fileName);

            writer.append("Query Term");
            writer.append(',');
            writer.append("Redirected URL");
            writer.append('\n');

            for (com.sendori.testcenter.dto.ZeroClickFeedDTO dto : dtoList) {
                writer.append(dto.getQueryTerm());
                writer.append(',');
                writer.append(dto.getUrlRedirectedTo());
                writer.append('\n');
            }

            writer.flush();
            writer.close();
        } catch (Exception exp) {
            logger.info("Exception in writeToCSV() :::: " + exp.getMessage());
        }

    }
}
