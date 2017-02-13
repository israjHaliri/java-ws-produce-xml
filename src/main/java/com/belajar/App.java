package com.belajar;

import com.belajar.service.BaseServiceImpl;
import javax.xml.ws.Endpoint;


public class App {

	public static void main(String[] args) {
            System.out.println( "Hello World!" );
                Endpoint.publish("http://localhost:9999/ws/base", new BaseServiceImpl());
	}
}
