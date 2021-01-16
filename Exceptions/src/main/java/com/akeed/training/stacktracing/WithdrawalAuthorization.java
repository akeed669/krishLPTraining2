/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akeed.training.stacktracing;

import com.akeed.training.myexceptions.AuthorizationDeniedException;
import com.akeed.training.myexceptions.PinAuthenticationFailedException;

public class WithdrawalAuthorization {
    
    public void authorizeWithdrawal()throws AuthorizationDeniedException{
        CardVerification cardVerification = new CardVerification();
        try {
            cardVerification.verifyCard();
        } catch (PinAuthenticationFailedException ex) {
            throw new AuthorizationDeniedException("User authorization failed!", ex);
        }
    }

    
}
