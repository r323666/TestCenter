package com.sendori.testcenter.action;


import com.sendori.testcenter.dto.ZeroClickFeedDTO;
import com.sendori.testcenter.util.AdserverQAUtil;
import com.sendori.testcenter.xsd.LookSmartResults;
import com.sendori.testcenter.xsd.SsResult;
import org.apache.log4j.Logger;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * TODO: Enter JavaDoc
 *
 * @since JDK 1.5
 */

public class AdserverClient {

    private static final Logger logger = Logger.getLogger(AdserverClient.class);

    /**
     * @param keyWords
     */
    public static void sendRequest(List<String> keyWords) {
        try {

            //TODO need to change below hardcoded URL. it is okay for testing

            String original = "https://ads.pureleads.com/r?key=@keyWord&spid=1000&fmt=debug%7Cres";

            List<ZeroClickFeedDTO> list = new ArrayList<ZeroClickFeedDTO>();

            for (String keyWord : keyWords) {


                String url = new String(original);
                url = url.replaceFirst("@keyWord", keyWord);

                String responseXML = AdserverQAUtil.postRequest(url);

                //unmarshalling response xml to JAXB objects
                LookSmartResults response = com.sendori.testcenter.action.UnmarshallResponseXML.getJAXB(new InputStreamReader(AdserverQAUtil.stringToInputStream(responseXML)));

                if(logger.isDebugEnabled()){
                    AdserverQAUtil.writeToFile("/Users/danny/IdeaProjects/TestCenter/out/response.xml", responseXML);
                }

                if (response.getSsResultSet() != null && response.getSsResultSet().getSsResult() != null) {

                    SsResult ssResult = response.getSsResultSet().getSsResult();

                    ZeroClickFeedDTO dto = new ZeroClickFeedDTO();

                    dto.setQueryTerm(ssResult.getNormalizedKwText());
                    dto.setUrlRedirectedTo(ssResult.getOriginalDestinationUrl());

                    list.add(dto);
                }
                AdserverQAUtil.writeToCSV("/Users/danny/IdeaProjects/zero_click_feed.csv", list);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}