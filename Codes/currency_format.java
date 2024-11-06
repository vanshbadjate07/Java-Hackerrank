import java.util.*;
import java.text.*;

public class currency_format {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat usFORMAT=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indFORMAT=NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat chainaFORMAT=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFORMAT=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String us=usFORMAT.format(payment);
        String ind=indFORMAT.format(payment);
        String chaina=chainaFORMAT.format(payment);
        String france=franceFORMAT.format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + ind);
        System.out.println("China: " + chaina);
        System.out.println("France: " + france);
    }
}
