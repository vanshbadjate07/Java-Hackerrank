import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class static_initializer {
    private static int B;
    private static int H;
    private static boolean flag;
    
    static{
        Scanner s = new Scanner(System.in);
        B=s.nextInt();
        H=s.nextInt();
        s.close();
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag=false;
        }
        else{
            flag=true;
        }
    }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

