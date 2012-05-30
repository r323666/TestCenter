package com.sendori.testcenter.action;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 312087
 * Date: 5/29/12
 * Time: 11:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class ZeroClickBean implements Serializable {

    private String pubAPIKey;
    private double rp;
    private double rpm;
    private double rd;
    private List<String> queriesList = new ArrayList<String>();

    public ZeroClickBean() {

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
        return queriesList.isEmpty()?"":queriesList.toString();
    }

    public void setQueries(String queries) {
        queriesList.add(queries);
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
                ", Queries='" + queriesList.toArray() + '\'' +
                '}';
    }
}
