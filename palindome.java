// time complexity is O(n)
// space complexity is O(1) no extra space is using 
import java.util.Scanner;
import java.io.*;
class palindrome {
     public static void main(String []args)throws IOException,InterruptedException{
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        int a[]= new int [5];
        System.out.println("enter the elements of the array ");
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++){
            a[i]= sc.nextInt();
         } 
         sc.close();
         int flags=0;
         for (int i=0;i<5/2 ;i++)
         {if (a[i]!=a[5-i-1]){
            flags++;
            System.out.println("this is not a palindrome ");
            break;
         }
        }
        if(flags==0)
        System.out.println("palindrome hai ");
     }
 
    }
