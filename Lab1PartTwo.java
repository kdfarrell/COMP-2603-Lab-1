import java.util.Scanner;
public class Lab1PartTwo {
    public static void main(String[] args) {
        System.out.println("My name is Englebert.");
        
        String lastname = "Humperdink";
        System.out.println("My name is Englebert " + lastname);
        
        // Alternative ways
        //System.out.println("My name is Englebert Humperdink");
        // System.out.println("My name is Englebert " + "Humperdink");
        
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("\nEnter your name: ");
        String name = Keyboard.nextLine();
        System.out.println("My name is " + name);
        
        System.out.println("\nHi, what's your name?");
        Scanner Keyboard2 = new Scanner(System.in);
        String name2 = Keyboard.nextLine();
        System.out.println("Nice to meet you " + name2);
        
        
        
        
        
    }
}