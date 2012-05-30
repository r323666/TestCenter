package com.sendori.testcenter.action;

import org.apache.log4j.Logger;
import org.richfaces.event.FileUploadEvent;
import org.richfaces.model.UploadedFile;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * TODO: Enter JavaDoc
 *
 * @since JDK 1.5
 */
@ManagedBean(name = "zeroClick")
@SessionScoped
public class ZeroClickFeedAction {

    private static final Logger logger = Logger.getLogger(ZeroClickFeedAction.class);

    private ZeroClickBean zeroClickBean = new ZeroClickBean();

    private UploadedFile file = null;

    /**
     *
     * @return
     */
    public ZeroClickBean getZeroClickBean() {
        return zeroClickBean;
    }

    /**
     *
     * @param zeroClickBean
     */
    public void setZeroClickBean(ZeroClickBean zeroClickBean) {
        this.zeroClickBean = zeroClickBean;
    }

    /**
     *
     * @param event
     * @throws Exception
     */
    public void listener(FileUploadEvent event) throws Exception {

        file = event.getUploadedFile();

        try {

            DataInputStream in = new DataInputStream(file.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            StringTokenizer tokenizer = null;

            String strLine;
            while ((strLine = br.readLine()) != null) {
                tokenizer = new StringTokenizer(strLine,",");
                while(tokenizer.hasMoreElements()){
                    this.zeroClickBean.getQueriesList().add(tokenizer.nextToken());
                }
            }
            in.close();
            br.close();
            for(String str : this.zeroClickBean.getQueriesList()){
                if(logger.isDebugEnabled()){
                    logger.debug(str);
                }
            }

            //sending request to Adserver Client
            AdserverClient.sendRequest(this.zeroClickBean.getQueriesList());

        } catch (Exception ex) {
            logger.info(ex.getMessage());
        }
    }

    /**
     *
     * @return
     */
    public String submit() {
        System.out.println(zeroClickBean.toString());
        System.out.println(file.getData());
        return "success";
    }
}
