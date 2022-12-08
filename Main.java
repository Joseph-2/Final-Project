import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Object rect = new Object(12,10);
        System.out.println(rect.drawRec());
        System.out.println(rect.tallWideRec(rect));
    }
}
