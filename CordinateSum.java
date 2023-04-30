import java.util.*;
public class CordinateSum {
    public static int printSumCordinates(int a[][],int r1,int c1,int r2, int c2){
        int sum=0;
        for(int i=r1;i<r2;i++) //no. of time loop run over the row is r2-r1
          {  for(int j=c1;j<c2;j++) //no. of time loop run over the coloumn is c2-c1
            {
                sum+=a[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int r1,r2,c1,c2;
        int a[][]={};
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number of the rows in the matrixes");
         int m=sc.nextInt();
        System.out.println("enter the number of the coloumn");
         int n=sc.nextInt();
        System.out.println(" enter the elemetns of the arrays");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(" enter the detail to find the sum of the elements over the coordinates ");
        System.out.println("enter the row 1");
        r1=sc.nextInt();
        System.out.println("enter the coloumn 1");
        c1=sc.nextInt();
        System.out.println("enter the second row");
        r2=sc.nextInt();
        System.out.println("enter the column 2");
        c2= sc.nextInt();
        System.out.println( printSumCordinates(a,r1,c1,r2,c2));
    }
}