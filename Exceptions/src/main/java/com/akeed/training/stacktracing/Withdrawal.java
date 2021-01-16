package com.akeed.training.stacktracing;

import com.akeed.training.myexceptions.AuthorizationDeniedException;
import com.akeed.training.myexceptions.WithdrawalFailedException;

public class Withdrawal {
    
     public static void main(String []args){
        
        try{
            Withdrawal withdrawal=new Withdrawal();
            withdrawal.makeWithdrawal();
                    
        }catch(WithdrawalFailedException exception){            
            System.out.println(exception.getMessage());
        }   
            
    }
    
    public void makeWithdrawal()throws WithdrawalFailedException{
        
        WithdrawalAuthorization withdrawalAuthorization = new WithdrawalAuthorization();
        //CardVerification cardVerification = new CardVerification();
         try { 
             withdrawalAuthorization.authorizeWithdrawal();
             
         } catch (AuthorizationDeniedException ex) {
             throw new WithdrawalFailedException("Withdrawal failed", ex);
         }
   
    }    

}
