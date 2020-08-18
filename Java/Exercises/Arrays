import java.util.*;

# Reversing an array
static int[] reverseArray(int[] a) {
        int[] result = new int[a.length];
        int j = 0; 
        for(int i= a.length-1; i>=0; i--){
            result[j] = a[i];
            j++;
        }
        return result;

    }
    
# Left rotation of an array
static int[] leftRotate(int[] a, int d){
int[] r = new int[a.length];
        for(int i=0; i<a.length-d; i++){
            r[i] = a[d+i];
        }
        for(int i=a.length-d, j=0; i<a.length; i++,j++){
            r[i] = a[j];
        }
        return r;
     }

# Matching strings from two different arrays
static int[] matchingStrings(String[] strings, String[] queries) {
        int[] res = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            for(int j=0; j<strings.length; j++){
                if(queries[i].equals(strings[j])) res[i]++;
            }
        }
        return res;
    }
    
# Possible SubArrays
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); 
        int[] a = new int[count];
        int sum=0;
        int neg =0;
        for(int i=0; i<count; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<a.length;i++){
            sum = a[i];
            for(int j=i; j<a.length; j++){
                if(i!=j){
                    sum = sum + a[j];
                }
                if(sum<0) 
                    neg++;
            }
        }
        System.out.println(neg);
    }
