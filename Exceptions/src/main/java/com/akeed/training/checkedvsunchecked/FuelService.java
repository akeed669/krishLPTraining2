package com.akeed.training.checkedvsunchecked;

import com.akeed.training.myexceptions.FuelPumpBlockedException;
import com.akeed.training.myexceptions.InsufficientFuelException;
import java.util.Scanner;


public class FuelService {    
  
    boolean pumpBlocked = true;
    
    public static void main(String[]args){ 
        
        Scanner userInput = new Scanner(System.in);        
        System.out.println("How much fuel is remaining in system?");
        int fuelRemaining = userInput.nextInt();
                
        try{
             FuelService fuelService = new FuelService();
             fuelService.pumpFuel(fuelRemaining);
        }
        catch(InsufficientFuelException exception){            
            System.out.println(exception.getMessage());
        }       
       
    }
    
    public void pumpFuel(int fuelRemaining)throws InsufficientFuelException{     
        
        //check fuel level - checked exception
        if (fuelRemaining<75){
            throw new InsufficientFuelException("Fuel balance is below threshold!");            
        }               
        
        //check whether pump is blocked or not - unchecked exception
        isPumpFunctioningProperly();
      
    }

    private void isPumpFunctioningProperly() {
        
        if(this.pumpBlocked){
            throw new FuelPumpBlockedException("Fuel pump is blocked!");
        }
        
    }

}
