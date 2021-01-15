/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akeed.training.checkedvsunchecked;

import com.akeed.training.myexceptions.FuelPumpBlockedException;
import com.akeed.training.myexceptions.InsufficientFuelException;


public class FuelService {
    
    int fuelRemaining = 150;
    boolean pumpBlocked = false;
    
    public static void main(String[]args){
        
        try{
             FuelService fuelService = new FuelService();
             fuelService.pumpFuel();
        }
        catch(InsufficientFuelException exception){
            exception.printStackTrace();
        }
       
    }
    
    public void pumpFuel()throws InsufficientFuelException{
        
        //check whether pump is blocked or not - unchecked exception
        isPumpFunctioningProperly();
        
        //check fuel level - checked exception
        if (this.fuelRemaining<75){
            throw new InsufficientFuelException("Fuel balance is below threshold!");
        }               
      
    }

    private void isPumpFunctioningProperly() {
        
        if(this.pumpBlocked){
            throw new FuelPumpBlockedException("Fuel pump is blocked!");
        }
        
    }

}
