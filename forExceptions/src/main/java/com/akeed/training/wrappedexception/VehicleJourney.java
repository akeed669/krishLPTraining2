/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeed.training.wrappedexception;

import com.akeed.training.myexceptions.IgnitionBlockedException;
import com.akeed.training.myexceptions.VehicleDoorOpenException;

public class VehicleJourney {

    Boolean doorOpen = true;

    public static void main(String[] args) {
        VehicleJourney vehicleJourney = new VehicleJourney();
        vehicleJourney.driveCar();
    }

    public void driveCar() {
        try {
            startCar();

        } catch (VehicleDoorOpenException ex) {
            throw new IgnitionBlockedException("Cannot start the car!", ex);
        }

    }

    private void startCar() throws VehicleDoorOpenException {
        if (this.doorOpen) {
            throw new VehicleDoorOpenException("Vehicle door is open!");
        }
    }
}

//public class VehicleJourney {
//
//    Boolean doorOpen = true;
//
//    public static void main(String[] args) {
//
//        VehicleJourney vehicleJourney = new VehicleJourney();
//        try {
//            vehicleJourney.driveCar();
//        } catch (VehicleDoorOpenException ex) {
//
//        }
//
//    }
//
//    public void driveCar() throws VehicleDoorOpenException {
//
//        try {
//            startCar();
//
//        } catch (IgnitionBlockedException ex) {
//            throw new VehicleDoorOpenException("Vehicle door is open!");
//        }
//
//    }
//
//    private void startCar() {
//        if (this.doorOpen) {
//            throw new IgnitionBlockedException("Cannot start the car!");
//        }
//    }
//}
