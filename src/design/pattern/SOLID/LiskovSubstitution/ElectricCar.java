package design.pattern.SOLID.LiskovSubstitution;

/**
 *
 * @author maidul
 */
public class ElectricCar implements ElectricVehicle{

    @Override
    public void speed() {
        System.out.println("Speed up.....");
    }

    /// here break the substitution principle
//    @Override
//    public void addFuel() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public void addCharge() {
        System.out.println("Batery charging....");
    }
    
}
