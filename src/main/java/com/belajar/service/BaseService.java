/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author israjhaliri
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface BaseService {
    
    @WebMethod String getData();
    @WebMethod String getDatabyId(String parameter);
    @WebMethod String PostData(String Parameter1,String parameter2);
    
}
