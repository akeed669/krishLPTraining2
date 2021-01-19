/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akeed.training.stacktracing;

import com.akeed.training.customexceptions.IncorrectPinException;
import com.akeed.training.customexceptions.PinAuthenticationFailedException;


public class CardVerification {

    public void verifyCard() throws PinAuthenticationFailedException {
        UserAuthentication userAuthentication = new UserAuthentication();
        try {
            userAuthentication.checkPinNumber(12345);
        } catch (IncorrectPinException ex) {
            throw new PinAuthenticationFailedException("Pin verification has failed!", ex);
        }
    }

}
