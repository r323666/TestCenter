package com.sendori.testcenter.action;


import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Enter JavaDoc
 */
public class ZeroClickFeedTest {

    public static void main(String[] args) {
        List<String> keyWords = new ArrayList<String>();

        keyWords.add("flowers");
        keyWords.add("rod");
        keyWords.add("comcast");
        keyWords.add("att");
        keyWords.add("yahoo");

        AdserverClient.sendRequest(keyWords);
    }
}
