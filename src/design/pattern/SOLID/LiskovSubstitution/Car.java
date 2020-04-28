/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.SOLID.LiskovSubstitution;

/**
 *
 * @author maidul
 */
public class Car implements NormalVehicle{

    @Override
    public void speed() {
        System.out.println("Car speed up...");
    }

    @Override
    public void addFuel() {
        System.out.println("Fuel added....");
    }
    
}
