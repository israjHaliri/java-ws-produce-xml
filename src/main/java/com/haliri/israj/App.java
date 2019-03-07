package com.haliri.israj;

import com.haliri.israj.service.UserProfileServiceImpl;

import javax.xml.ws.Endpoint;


public class App {

    public static void main(String[] args) {
        System.out.println("service is running at http://127.0.0.1:9999/ws/user_profile?wsdl !");
        Endpoint.publish("http://127.0.0.1:9999/ws/user_profile", new UserProfileServiceImpl());
    }
}
