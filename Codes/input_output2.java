import java.util.*;
public class input_output2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();

        System.out.println("String: "+str);
        System.out.println("Double: "+d);
        System.out.println("Int: "+i);
    }
}