import java.util.Scanner;
import java.util.Random;
public class Lab1PartThree {
    public static void exercise1() {
        System.out.print("Enter Radius: ");
        Scanner Keyboard = new Scanner(System.in);
        double radius = Keyboard.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.print(String.format("A circle with radius %.1f", radius));
        System.out.println(String.format(" has an area of %.2f units.", area));  
    }
    
    public static void exercise2() {
        System.out.print("\nEnter a Number: ");
        Scanner Keyboard = new Scanner(System.in);
        int number = Keyboard.nextInt();
        int start = 2;
        
        System.out.println("Even Numbers from " + number + ": ");
        while (start <= number) {
            System.out.print(start + " ");
            start = start + 2;
        }
    }
    
    public static void main(String[] args) {
        exercise1();
        exercise2();
        
        Random r = new Random();
        int random1 = r.nextInt(1000);
        
        Random r2 = new Random();
        int random2 = r.nextInt(1000);
        
        int prod = random1 * random2;
        
        System.out.println(String.format("\n\nWhat is the product of %d and %d?", random1, random2));
        System.out.println(String.format("The answer is %d.", prod));
        
        System.out.println("\nType 'exit' to stop conversation");
        String[] words = new String[3];
        words[0] = "hi";
        words[1] = "howdy-doo";
        words[2] = "hey";
        
        Scanner Keyboard2 = new Scanner(System.in);
        String word = Keyboard2.nextLine();
        
        while (!word.equals("exit")) {
            Random ran = new Random();
            int random3 = ran.nextInt(3);
            System.out.println(words[random3]);
            word = Keyboard2.nextLine();            
        }
    }
}