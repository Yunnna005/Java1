package PS7.b;

public class PhysicsCalculator {
    private int speed_of_light = 299792458;
    private double planck_constant = 6.62607004E-34;
    private double permittivity_of_vacuum = 8.8542E-12;

    public double energyFromMass(double mass){
        return mass*speed_of_light*speed_of_light;
    }
    public double energyFromFrequency(double frequency){
        return planck_constant*frequency;
    }

    public double coulombForce(double q1, double q2, double d){
        return (q1*q2)/(4*Math.PI*permittivity_of_vacuum*d*d);
    }
}
