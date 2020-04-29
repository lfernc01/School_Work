public class ArraysEqual {
        
    public static void main(String[] args) { 
        int[] x = {1,2,3,4};
        int[] y = {1,2,3,4};
        int[] z = {1,2,3};
        int[] w = {1,2,6,7};
        System.out.println(x);
        String s = "cats";
        String t = "dogs";
        //!s.equals(t);
    }
    
    // a method that takes an int array and an int 
    // returns true if the array contains the element, false otherwise
    public static boolean contains(int[] a, int x) {
        for(int i=0; i<a.length; i++) {
            if(a[i]==x) {
                return true;
            }
        }
        return false;
    }
    
    // a method that takes two arrays as input and returns true
    // if the arrays contain the same elements, false otherwise.
    public static boolean areEqual(int[] a, int[] b) {
        if(a==b) {
            return true;
        }
        if(a.length != b.length) {
            return false;
        }
        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
