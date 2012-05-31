package com.sendori.testcenter.action;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created with IntelliJ IDEA.
 * User: 312087
 * Date: 5/29/12
 * Time: 11:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class ZeroClickBean {

    private String pubAPIKey;
    private double rp;
    private double rpm;
    private double rd;
    private String queries;
    private List<String> queriesList = new ArrayList<String>();
    private double rpValue;
    private String queryValue;


    public ZeroClickBean() {

    }

    public String submit() {
        return "success";
    }

    public String getPubAPIKey() {
        return pubAPIKey;
    }

    public void setPubAPIKey(String pubAPIKey) {
        this.pubAPIKey = pubAPIKey;
    }

    public double getRp() {
        return rp;
    }

    public void setRp(double rp) {
        this.rp = rp;
    }

    public double getRpm() {
        return rpm;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }

    public double getRd() {
        return rd;
    }

    public void setRd(double rd) {
        this.rd = rd;
    }

    public String getQueries() {
        return queries;
    }

    public void setQueries(String queries) {
        this.queries = queries;
    }

    public List<String> getQueriesList() {
        return queriesList;
    }

    public void setQueriesList(List<String> queriesList) {
        this.queriesList = queriesList;
    }

    @Override
    public String toString() {
        return "ZeroClickBean{" +
                "pubAPIKey='" + pubAPIKey + '\'' +
                ", rp=" + rp +
                ", rpm=" + rpm +
                ", rd=" + rd +
                ", queries='" + queries + '\'' +
                ", queriesList=" + queriesList +
                '}';
    }

    /**
     * @return
     */
    public List<String> getListFromString() {
        StringTokenizer tokenizer = new StringTokenizer(this.queries, ",");
        List<String> tempList = new ArrayList<String>();
        while (tokenizer.hasMoreElements()) {
            tempList.add(tokenizer.nextToken());
        }
        return tempList;
    }

    public void CsvSubmitValidation(FacesContext facesContext, UIComponent uiComponent, Object value) throws ValidatorException {
        String csv = (String) value;

        if (queryValue.equals("") && csv.equals("")) {
            throw new ValidatorException(new FacesMessage("Please enter the Queries or Submit the list of Queries as csv file"));
        }
    }

}
