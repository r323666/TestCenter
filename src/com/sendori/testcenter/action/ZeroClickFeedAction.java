package com.sendori.testcenter.action;

import org.apache.log4j.Logger;
import org.richfaces.event.FileUploadEvent;
import org.richfaces.model.UploadedFile;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
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
     * @return
     */
    public ZeroClickBean getZeroClickBean() {
        return zeroClickBean;
    }

    /**
     * @param zeroClickBean
     */
    public void setZeroClickBean(ZeroClickBean zeroClickBean) {
        this.zeroClickBean = zeroClickBean;
    }

    /**
     * @param event
     * @throws Exception
     */
    public void listener(FileUploadEvent event) throws Exception {

        file = event.getUploadedFile();

        String fileContent = new String(file.getData());

        StringTokenizer tokenizer = new StringTokenizer(fileContent, ",");

        while (tokenizer.hasMoreElements()) {
            this.zeroClickBean.getQueriesList().add(tokenizer.nextToken());
        }

        if (logger.isDebugEnabled()) {
            for (String str : this.zeroClickBean.getQueriesList()) {
                logger.debug(str);
            }
        }

        //sending request to Adserver Client
        AdserverClient.sendRequest(this.zeroClickBean.getQueriesList());

    }

    /**
     * @return
     */
    public String submit() {
        logger.info(zeroClickBean.toString());
        if (logger.isDebugEnabled()) {
            for (String str : zeroClickBean.getListFromString()) {
                logger.info(str);
            }
        }
        return "success";
    }
}
