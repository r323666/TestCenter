package com.sendori.testcenter.dto;

/**
 * TODO: Enter JavaDoc
 *
 * @since JDK 1.5
 */
public class ZeroClickFeedDTO {
    private String queryTerm;
    private String urlRedirectedTo;

    public String getQueryTerm() {
        return queryTerm;
    }

    public String getUrlRedirectedTo() {
        return urlRedirectedTo;
    }

    public void setUrlRedirectedTo(String urlRedirectedTo) {
        this.urlRedirectedTo = urlRedirectedTo;
    }

    public void setQueryTerm(String queryTerm) {
        this.queryTerm = queryTerm;
    }

    @Override
    public String toString() {
        return "ZeroClickFeedDTO{" +
                "queryTerm='" + queryTerm + '\'' +
                ", urlRedirectedTo='" + urlRedirectedTo + '\'' +
                '}';
    }
}
