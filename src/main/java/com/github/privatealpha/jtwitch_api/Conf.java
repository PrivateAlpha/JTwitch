/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.privatealpha.jtwitch_api;

/**
 *
 * @author alpha
 */
public class Conf {
    public static String BASE_URL = "https://api.twitch.tv/kraken";
    public static String VERSION_3_HEADER_NAME = "Accept";//Accept: application/vnd.twitchtv.v3+json
    public static String VERSION_3_HEADER_ARGS = "application/vnd.twitchtv.v3+json";
    
    public enum Permissions{
    user_read,
    user_blocks_read,
    user_blocks_edit,
    user_follows_edit,
    channel_read,
    channel_editor,
    channel_commercial,
    channel_stream,
    channel_subscriptions,
    channel_check_subscription,
    chat_login
    }
}
