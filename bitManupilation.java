import java.util.Scanner;

public class bitManupilation {
    public static void main(String[] args) {
        boolean a,b;
        Scanner sc= new Scanner (System.in);
 System.out.println("enter the boolean value(true amd false)");
 a=sc.nextBoolean();
 System.out.println("enter the  2nd boolean value(true amd false)");
 b= sc.nextBoolean(); // and operation
 Boolean c = (a&b);
 System.out.println("the AND operation result of the value is " + c);
 // or operation
 c=a|b;
 System.out.println("the OR operation result of the value is  "+c);

    }
    
}
