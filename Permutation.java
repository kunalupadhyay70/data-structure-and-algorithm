// Java program to print all permutations of a
public class Permutation {

	// Function call
	public static void main(String[] args)
	{
		String str = "ABC";
		int n = str.length();
		Permutation permutation = new Permutation();
		permutation.permute(str, 0, n - 1);
	}

	/**
	* permutation function
	* @param str string to calculate permutation for
	* @param l starting index
	* @param r end index
	*/
	public void permute(String str, int l, int r)
	{
		if (l == r)  //base case 
			System.out.println(str);
		else {    //loop for the swaping of the index elements
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);  //swap function calling
				permute(str, l + 1, r);  //recursion 
				str = swap(str, l, i);  //backtracking for th nxt 
			}
		}
	}

	/**
	* Swap Characters at position
	* @param a string value
	* @param i position 1
	* @param j position 2
	* @return swapped string
	*/
	public String swap(String a, int i, int j)
	{
		char temp;  //string immutable hoti hai toh apn string ko character array mai convert kr manipulate krenge
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
