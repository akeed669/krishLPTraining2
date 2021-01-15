/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akeed.training.stacktracing;

import com.akeed.training.myexceptions.ATMBalanceInsufficientException;


public class WithdrawMoney {
    
     public static void main(String []args){
        
        try{
            WithdrawMoney cardVerification=new WithdrawMoney();
            cardVerification.checkCard();
                    
        }catch(ATMBalanceInsufficientException balance){
            balance.printStackTrace();             
        }   
            
    }
    
    public void checkCard()throws ATMBalanceInsufficientException{
        
        UserBalance userBalance = new UserBalance();
        userBalance.checkUserBalance();
    
    }    

}
