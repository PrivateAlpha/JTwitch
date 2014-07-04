/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.privatealpha.jtwitch_api.v3.Model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author alpha
 */
public class Team {

    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "created_at")
    private String created_at;
    @XmlAttribute(name = "updated_at")
    private String updated_at;
    @XmlAttribute(name = "background")
    private String background;
    @XmlAttribute(name = "banner")
    private String banner;
    @XmlAttribute(name = "logo")
    private String logo;
    @XmlAttribute(name = "_links")
    private SelfLink self;
    @XmlAttribute(name = "_id")
    private int id;
    @XmlAttribute(name = "info")
    private String info;
    @XmlAttribute(name = "display_name")
    private String display_name;
    
    //<editor-fold desc="Getters And Setters">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public SelfLink getSelf() {
        return self;
    }

    public void setSelf(SelfLink self) {
        this.self = self;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }
    //</editor-fold>
}
