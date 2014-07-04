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
 public class SelfLink{
    @XmlAttribute(name = "self")
    private String link;
    


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
}
