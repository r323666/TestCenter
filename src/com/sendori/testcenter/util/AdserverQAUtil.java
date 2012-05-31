package com.sendori.testcenter.util;

import com.sendori.testcenter.action.AdserverClient;
import com.sendori.testcenter.action.SLangBean;
import com.sendori.testcenter.dto.ZeroClickFeedDTO;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
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
    public static String postRequest(String url) {

        String responseBody = null;
        HttpUriRequest getHTTPRequest = new HttpGet(url);

        try {

            DefaultHttpClient client = new DefaultHttpClient();
            HttpResponse response = client.execute(getHTTPRequest);

            HttpEntity entity = response.getEntity();

            logger.info("Request URL:" + url);

            // Execute the method.
            int statusCode = response.getStatusLine().getStatusCode();

            logger.info("Status Code" + statusCode);

            if (statusCode != HttpStatus.SC_OK) {
                logger.info("Method failed: " + response.getStatusLine());
            }

            responseBody = EntityUtils.toString(entity);

            responseBody = prettyFormat(responseBody, 2);

            if (logger.isDebugEnabled()) {
                logger.debug("Response XML ::::::" + responseBody);
            }

        } catch (Exception e) {
            logger.info("Fatal protocol violation: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Release the connection.
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
            BufferedWriter out = new BufferedWriter(new FileWriter(filePath, true));

            out.write(response);
            out.flush();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
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
    public static void writeToCSV(String fileName, List<ZeroClickFeedDTO> dtoList) {

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

    /**
     * @param fileName
     * @param sLangBeans
     */
    public static void writeSLangResponseToCSV(String fileName, List<SLangBean> sLangBeans) {
        try {
            FileWriter writer = new FileWriter(fileName);

            writer.append("Brand Term");
            writer.append(',');
            writer.append("Response Domain");
            writer.append('\n');

            for (SLangBean sLangBean : sLangBeans) {
                writer.append(sLangBean.getBrandTerm());
                writer.append(',');
                writer.append(sLangBean.getDomain());
                writer.append('\n');
            }

            writer.flush();
            writer.close();
        } catch (Exception exp) {
            logger.info("Exception in writeToCSV() :::: " + exp.getMessage());
        }

    }
}
