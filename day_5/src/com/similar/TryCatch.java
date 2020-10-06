/*You will be given two integers and as input, you have to compute . If and are not bit signed integers or if is zero, exception will occur and you have to report it.
 *  Read sample Input/Output to know what to report in case of exceptions.
 */

package com.similar;
import java.util.*;
import java.text.*;
import java.math.*;

public class TryCatch {
	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        try{
        try{
            int x = new Integer(sc.nextInt());
            int y = new Integer(sc.nextInt());
            System.out.println(""+(x/y));
        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
        
        
    
	


