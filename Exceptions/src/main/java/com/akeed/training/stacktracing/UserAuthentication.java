/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeed.training.stacktracing;

import com.akeed.training.customexceptions.IncorrectPinException;

public class UserAuthentication {    

    public void checkPinNumber(int userPIN) throws IncorrectPinException {
        
        if(userPIN!=00000){
           throw new IncorrectPinException("Pin number is wrong!"); 
        }

        

    }

}
