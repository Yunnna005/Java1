package labsheet1;

import java.util.Scanner;
public class ReadingIntoVeriables {
    public static void main(String[] args) {

        String name;
        int age;
        float height;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter age: ");
        age = input.nextInt();
        System.out.print("Enter height: ");
        height = input.nextFloat();

        System.out.println("\n********************\n\tDetails\n********************");
        System.out.println("Name: "+name+"\nAge: "+ age+"\nHeight: "+height);
    }
}
