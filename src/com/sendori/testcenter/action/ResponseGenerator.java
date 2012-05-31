package com.sendori.testcenter.action;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class ResponseGenerator {

    /**
     * Hits the server and stores response in the String variable _content
     * @param url
     * @throws IOException
     * @throws ClientProtocolException
     * @throws Exception
     */
    public static String getContent(String url){
        String _content = null;
        try{
            HttpUriRequest getHTTPRequest = new HttpGet(url);
            DefaultHttpClient client = new DefaultHttpClient();
            HttpResponse response = client.execute(getHTTPRequest);
            HttpEntity entity = response.getEntity();
            _content = EntityUtils.toString(entity);
        }catch(ClientProtocolException cpe){
            System.out.println("Error in the Protocol : "+url);
        }catch(IOException ie){
            ie.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return _content;
    }
}
