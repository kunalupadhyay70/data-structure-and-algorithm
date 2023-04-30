//selection sort we first find out the minimum value in the array and then replace it to the
//curent array index 
//one loop for the traverse 
//another for the iteration
//time complexity O(n^2),space comolexity O(1)->constat
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
class selectionSort{
  public  void print(int arr[]){
        System.out.println("the sorted array is "+Arrays.toString(arr));//printing the array in string form
    }

  public void sort(int arr[])
    { 
        int n= arr.length;
        int minIdx;
        for (int i=0;i<n-1;i++){ //lopp run till the n-2  for step 
            minIdx=i;  // let minidx is i'th element 
            for (int j=i+1;j<n;j++){ //start with index ahead from the i
                if (arr[j]<arr[minIdx])
                minIdx=j;      //checking and arranging the minidx 
            }
            int temp=arr[i]; //swaping of i'th and minIdx element   . 
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;

        }
        
        print(arr);
    }
   public static void main(String...args)throws IOException ,InterruptedException {
    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    Scanner scan = new Scanner(System.in);
    int a;
    System.out.println("enter the size of the array ");
    a=scan.nextInt();
    System.out.println("enter the element of the array ");
    int arr[]= new int[a];
   for(int i=0;i<a;i++){
    arr[i]=scan.nextInt();
   }
    selectionSort selct = new selectionSort(); 
    selct.sort(arr);
    scan.close();
    }
}
