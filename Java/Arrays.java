public class Arrays {
        
    public static void main(String[] args) { 
  
    }
    
    // a method that returns true if the array contains the element.
    public static boolean contains(int[] a, int x) {
        for(int i=0; i<a.length; i++) {
            if(a[i]==x) {
                return true;
            }
        }
        return false;
    }
    
    // a method that returns true if the arrays have the same elements.
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
