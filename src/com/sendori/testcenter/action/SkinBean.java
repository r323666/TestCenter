package com.sendori.testcenter.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 * Created with IntelliJ IDEA.
 * User: danny
 * Date: 5/31/12
 * Time: 11:39 AM
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@SessionScoped
public class SkinBean {

    @ManagedProperty(value = "testcenter")
    private String skin;

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }
}
