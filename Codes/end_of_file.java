import java.util.*;

public class end_of_file {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
               int c =1;
               while(sc.hasNext()){
               String s = sc.nextLine();
               System.out.println(c+" "+s);
               c++;
            }
        }
   }
