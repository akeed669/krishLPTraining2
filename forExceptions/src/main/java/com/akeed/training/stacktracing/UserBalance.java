/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akeed.training.stacktracing;

import com.akeed.training.myexceptions.ATMBalanceInsufficientException;


public class UserBalance {
    
    public void checkUserBalance()throws ATMBalanceInsufficientException{
        WithdrawalLimit withdrawalLimit = new WithdrawalLimit();
        withdrawalLimit.checkWithdrawalLimit();
    }

}
