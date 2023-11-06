package labsheet11.exercise3;

public class TestAnimal {
    public static void main(String[] args) {


        System.out.println("testing the no-argument constructor....");
        Animal animal1 = new Animal();
        System.out.println(animal1);
        String[] lionContinents = {"Africa","Asia"};


        System.out.println("\n\n\ntesting the 4-argument constructor....");
        animal1 = new Animal("Lion",lionContinents,200,40);
        System.out.println(animal1);
        lionContinents[0] = "Europe";
        System.out.println("\n" + animal1);
    }

}
