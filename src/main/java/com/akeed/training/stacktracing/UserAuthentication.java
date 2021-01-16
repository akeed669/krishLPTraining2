/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeed.training.stacktracing;

import com.akeed.training.myexceptions.IncorrectPinException;

public class UserAuthentication {

    //private int myPin = 12345;

    public void checkPinNumber() throws IncorrectPinException {

        throw new IncorrectPinException("Pin number is wrong!");

    }

}
