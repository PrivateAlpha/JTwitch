/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.privatealpha.jtwitch_api.v3.Model;

import java.net.URL;
import java.util.Date;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alpha
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "users")
public class UnauthorizedUser{

    @Override
    public String toString() {
        return "ID: " + _id + "\n"
                + "Display name: " + display_name + "\n"
                + "User name: " + name + "\n"
                + "Type: " + type + "\n"
                + "Bio: " + bio + "\n"
                + "Created at: " + created_at + "\n"
                + "Updated at: " + updated_at + "\n"
                + "logo: " + logo + "\n"
                + "Self Link: " + selfLink.getLink();

    }
    @XmlAttribute(name = "display_name")
    private String display_name;
    
    @XmlAttribute(name = "_id")
    private int _id;
    
    @XmlAttribute(name = "name")
    private String name;
    
    @XmlAttribute(name = "type")
    private String type;
    
    @XmlAttribute(name = "bio")
    private String bio;
    
    @XmlAttribute(name = "created_at")
    private String created_at;
    
    @XmlAttribute(name = "updated_at")
    private String updated_at;
    
    @XmlAttribute(name = "logo")
    private String logo;
    
    @XmlAttribute(name = "_links")
    private SelfLink selfLink;
    
    public static String getURI(String Username)
    {
        return "/users/"+Username;
    }

    
    //<editor-fold desc="Getters And Setters">
    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public SelfLink getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(SelfLink SelfLink) {
        this.selfLink = selfLink;
    }
    

}

/**
 * GET /users/:user     	[]Get user object
 * GET /user                    [authorized]Get user object
 * GET /streams/followed 	[authorized]Get list of streams user is following
 * GET /videos/followed 	[authorized]Get list of videos belonging to channels user is following
 **/