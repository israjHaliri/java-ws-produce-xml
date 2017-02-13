/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.service;

/**
 *
 * @author israjhaliri
 */
public class BaseServiceImpl implements BaseService{

    private String email;
    private String password;
    
    @Override
    public String getData() {
        
        try{
            email = "israj.haliri@gmail.com";
        }catch(Exception e){
            e.printStackTrace();
        }
        return email;
    }

    @Override
    public String getDatabyId(String parameter) {
        
        try{
            email = parameter;
        }catch(Exception e){
            e.printStackTrace();
        }
        return email;
    }

    @Override
    public String PostData(String parameter1, String parameter2) {
       
        try{
            email = parameter1;
            password = parameter2;
        }catch(Exception e){
            e.printStackTrace();
        }
        return email;
    }
    
}
