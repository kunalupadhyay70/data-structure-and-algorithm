//print out all the sequences of the string or the substring over the symbol given
import java.util.ArrayList;
public class substring {
   static  void PrintSubString(int[] arr,int index, ArrayList<Integer> tempArr){
    // base case 
    if(index == arr.length){
        //printing the subsequence of the string 
        System.out.println(tempArr);
    return ;}
    // including the index element
    PrintSubString(arr, index+1, tempArr);
     //add the symbol of the string to the arraylist
     tempArr.add(arr[index]);
     // not including the index 
     PrintSubString(arr, index+1, tempArr);
     // removing the last values 
     tempArr.remove(tempArr.size()-1);
   }
    public static void main(String[] args) {
        int a[]={1,2};
        PrintSubString(a, 0, new ArrayList<>());
        
        
    }
}
 