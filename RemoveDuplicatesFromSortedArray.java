public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length <= 1) {
            return A.length;
        }
        int i=0;
        for(int j=1; j < A.length; j++) {
            if(A[i] != A[j]) {
                A[++i] = A[j];                
            }
        }
        return i+1;
    }
	
   public static void main(String[] args) {
		int[] a = { 1, 1, 2 };
		System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(a));

	}
}
