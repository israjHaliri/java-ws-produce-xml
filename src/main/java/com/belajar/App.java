package com.belajar;

import com.belajar.service.UserProfileServiceImpl;
import javax.xml.ws.Endpoint;


public class App {

	public static void main(String[] args) {
            System.out.println( "service is running at 9999 !" );
                Endpoint.publish("http://localhost:9999/ws/user_profile", new UserProfileServiceImpl());
	}
}
