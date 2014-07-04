/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.privatealpha.jtwitch_api.v3.Model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alpha
 */

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "user")
public class AuthorizedUser extends UnauthorizedUser{
    
        //authenticated objects
    @XmlAttribute(name = "email")
    private String email;
    
    @XmlAttribute(name = "isPartnered")
    private boolean isPartnered;
    
    //TODO These will break
    @XmlAttribute(name = "followedStreams")
    private List followedStreams;
    
    //TODO These will break
    @XmlAttribute(name = "FollowedVideos")
    private List FollowedVideos; //EasyPeasy method to get videos from followed streams
    
    // <editor-fold desc="Getters and Setters">
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsPartnered() {
        return isPartnered;
    }

    public void setIsPartnered(boolean isPartnered) {
        this.isPartnered = isPartnered;
    }

    public List getFollowedStreams() {
        return followedStreams;
    }

    public void setFollowedStreams(List followedStreams) {
        this.followedStreams = followedStreams;
    }

    public List getFollowedVideos() {
        return FollowedVideos;
    }

    public void setFollowedVideos(List FollowedVideos) {
        this.FollowedVideos = FollowedVideos;
    }
    // </editor-fold>
}
