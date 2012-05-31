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

public class SLangClient {

    private static final Logger logger = Logger.getLogger(AdserverClient.class);

    /**
     * @param keyWords
     */
    public static List<SLangBean> sendRequest(List<String> keyWords) {
        List<SLangBean> list = new ArrayList<SLangBean>();
        try {

            //TODO need to change below hardcoded URL. it is okay for testing

            String original = "http://ec2-204-236-166-21.us-west-1.compute.amazonaws.com:9000/search?domain=@keyWord";

            for (String keyWord : keyWords) {


                String url = new String(original);
                url = url.replaceFirst("@keyWord", keyWord);

                String responseXML = ResponseGenerator.getContent(url);

                SLangBean sLangBean = new SLangBean();
                sLangBean.setBrandTerm(keyWord);
                sLangBean.setDomain(responseXML);
                list.add(sLangBean);
            }

            AdserverQAUtil.writeSLangResponseToCSV("/home/user1/work/TestCenter/web/SLang/CSV/csvSlang.csv", list);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
