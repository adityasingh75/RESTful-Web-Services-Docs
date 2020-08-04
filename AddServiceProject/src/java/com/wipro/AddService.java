/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wipro;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author AD20104717
 */
@WebService(serviceName = "AddService")
public class AddService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddTwoNumber")
    public String addTwoNumber(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        int sum=num1+num2;
        return "Sum of the number is : "+sum;
    }
}
