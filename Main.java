import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of your desired rectangle:");
        int length = in.nextInt();

        System.out.println("Enter width of your desired rectangle: ");
        int width = in.nextInt();

        Object rect = new Object(length,width);
        System.out.println(rect.drawRec());
        System.out.println(rect.tallWideRec(rect));
    }
}
