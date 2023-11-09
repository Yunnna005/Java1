package PS7.b;

public class TestPhysicsCalculator {
    public static void main(String[] args) {

        PhysicsCalculator physicsCalculator = new PhysicsCalculator();
        System.out.println("Calling static method energyFromMass() to determine the amount of energy\n" +
                "that is equivalent to a mass of 1.3 nanograms");

        System.out.println("\nEnergy equivalent of 1.3 nanograms is " + physicsCalculator.energyFromMass(1.3E-9) + " Joules");

        System.out.println("\nCalling static method energyFromFrequency() to determine the amount of energy\n" +
                "that is equivalent to a frequency of 345.87 teraHertz");

        System.out.println("\nEnergy equivalent of 345.87 teraHertz is " + physicsCalculator.energyFromFrequency(345.87E12) + " Joules");

        System.out.println("\nCalling static method coulombForce() to determine the Force that exists\n" +
                "between 2 electrical charges whose values are 4.58 microCoulomb and\n-38.56 microCoulomb." +
                "The charges are separated by a distance of 0.528 metres");

        System.out.println("\nForce between the two charges is " + physicsCalculator.coulombForce(4.58E-6,-38.56E-6,0.528) + " Newtons");
    }
}
