package com.sendori.testcenter.action;

import java.io.Serializable;

public class SLangBean implements Serializable{
    private String brandTerm;
    private String domain;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getBrandTerm() {
        return brandTerm;
    }

    public void setBrandTerm(String brandTerm) {
        this.brandTerm = brandTerm;
    }

    @Override
    public String toString() {
        return "SLangBean{" +
                "Brand Term" + brandTerm +
                "Domain=" + domain +
                "}";
    }
}
