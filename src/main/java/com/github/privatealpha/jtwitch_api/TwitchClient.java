/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.privatealpha.jtwitch_api;

import com.github.privatealpha.jtwitch_api.v3.Model.UnauthorizedChannel;
import com.github.privatealpha.jtwitch_api.v3.Model.UnauthorizedUser;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 *
 * @author alpha
 */
public class TwitchClient {

    

    //TODO remove this, just for testing
    public static void main(String[] args) throws Exception {

        try {
            Client client = ClientBuilder.newClient();
            WebTarget resourceTarget = client.target(Conf.BASE_URL + UnauthorizedChannel.getURI("slowpoke101"));

            // Build a HTTP GET request that accepts "text/plain" response type
            // and contains a custom HTTP header entry "Foo: bar".
            Invocation invocation = resourceTarget.request("Application/json")
                    .header(Conf.VERSION_3_HEADER_NAME, Conf.VERSION_3_HEADER_ARGS)
                    .buildGet();

            // Invoke the request using generic interface
            UnauthorizedChannel response = invocation.invoke(UnauthorizedChannel.class);
            client.close();

            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
