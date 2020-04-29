import java.util.ArrayList;
public class PracticeArrayList {
    
    public static void main(String[] args) { 
        ArrayList<String> l = new ArrayList<String>();
        l.add("banana");
        l.add("berries");
        l.add("apple");
        l.add("orange");
        System.out.println(l);
        ArrayList<String> otherList = getWords(l, 'q');
        System.out.println(otherList);
    }
    
    // a method that takes an ArrayList of String and a char
    // it returns an ArrayList containing all the String that begins with the 
    // specified char
    /*
     * {"banana", "apple", "berries", "orange"}, 'b'
     * --> {"banana", "berries"}
     */ 
    public static ArrayList<String> getWords(ArrayList<String> list, char c) {
        // create an ArrayList
        ArrayList<String> beginsWithC = new ArrayList<String>();
        // populate it
        for(int i=0; i<list.size(); i++) {
            String element = list.get(i);
            if(element.charAt(0)==c) {
                beginsWithC.add(element);
            }
        }
        return beginsWithC;
    }
}
