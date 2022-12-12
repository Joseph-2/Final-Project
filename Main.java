import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //creates new scanner object to process user input
        Scanner in = new Scanner(System.in);

        //gets the length from user input
        System.out.println("Enter length of your desired rectangle:");
        int length = in.nextInt();
        //gets the width from user input
        System.out.println("Enter width of your desired rectangle: ");
        int width = in.nextInt();

        //creates a new rectangle object using user input
        Object rect = new Object(length,width);
        //draws the rectangle and returns if it's a tall or wide rectangle
        System.out.println(rect.drawRec());
        System.out.println(rect.tallWideRec(rect));
    }
}
