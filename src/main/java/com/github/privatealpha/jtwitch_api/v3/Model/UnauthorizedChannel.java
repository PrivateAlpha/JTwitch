/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.privatealpha.jtwitch_api.v3.Model;

import java.util.HashMap;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author alpha
 */
public class UnauthorizedChannel {

    @Override
    public String toString() {
        return "UnauthorizedChannel{\n" + " name=" + name + ",\n game=" + game + ",\n created_at=" + created_at + ",\n delay=" + delay + ",\n teams=" + teams + ",\n mature=" + mature + ",\n url=" + url + ",\n display_name=" + display_name + ",\n title=" + title + ",\n updated_at=" + updated_at + ",\n banner=" + banner + ",\n video_banner=" + video_banner + ",\n background=" + background + ",\n abuse_reported=" + abuse_reported + ",\n status=" + status + ",\n id=" + id + ",\n logo=" + logo + ",\n profile_banner=" + profile_banner + ",\n profile_banner_background_color=" + profile_banner_background_color + ",\n views=" + views + ",\n followers=" + followers + ",\n"+links.toString()+"\n }";
    }
    
    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "game")
    private String game;
    @XmlAttribute(name = "created_at")
    private String created_at;
    @XmlAttribute(name = "delay")
    private int delay;
    @XmlAttribute(name = "teams")
    @XmlElement(name="Team")
    private Team[] teams;
    @XmlAttribute(name = "mature")
    private boolean mature;
    @XmlAttribute(name = "url")
    private String url;
    @XmlAttribute(name = "display_name")
    private String display_name;
    @XmlAttribute(name = "title")
    private String title;
    @XmlAttribute(name = "updated_at")
    private String updated_at;
    @XmlAttribute(name = "banner")
    private String banner;
    @XmlAttribute(name = "video_banner")
    private String video_banner;
    @XmlAttribute(name = "background")
    private String background;
    @XmlAttribute(name = "_links")
    private HashMap<String,String> links;
    @XmlAttribute(name = "abuse_reported")
    private boolean abuse_reported;
    @XmlAttribute(name = "status")
    private String status;
    @XmlAttribute(name = "_id")
    private int id;
    @XmlAttribute(name = "logo")
    private String logo;
    @XmlAttribute(name = "profile_banner")
    private String profile_banner;
    @XmlAttribute(name = "profile_banner_background_color")
    private String profile_banner_background_color;
    @XmlAttribute(name = "views")
    private int views;
    @XmlAttribute(name = "followers")
    private int followers;
    
    
    public static String getURI(String username)
    {
        return "/channels/"+username+"/";
    }
    
    //<editor-fold desc="Getters And Setters">
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public boolean isMature() {
        return mature;
    }

    public void setMature(boolean mature) {
        this.mature = mature;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getVideo_banner() {
        return video_banner;
    }

    public void setVideo_banner(String video_banner) {
        this.video_banner = video_banner;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public HashMap<String,String> getLinks() {
        return links;
    }

    public void setLinks(HashMap<String,String> links) {
        this.links = links;
    }
    
        public boolean isAbuse_reported() {
        return abuse_reported;
    }

    public void setAbuse_reported(boolean abuse_reported) {
        this.abuse_reported = abuse_reported;
    }
    
    //</editor-fold>

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getProfile_banner() {
        return profile_banner;
    }

    public void setProfile_banner(String profile_banner) {
        this.profile_banner = profile_banner;
    }

    public String getProfile_banner_background_color() {
        return profile_banner_background_color;
    }

    public void setProfile_banner_background_color(String profile_banner_background_color) {
        this.profile_banner_background_color = profile_banner_background_color;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }


}

