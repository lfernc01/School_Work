import java.util.ArrayList;
public class ArrayList {
    
    public static void main(String[] args) { 
       
    }
    
    // a method that takes an ArrayList of String and a char
    // it returns an ArrayList containing all the String that begins with the 
    // specified char

    public static ArrayList<String> getWords(ArrayList<String> list, char c) {
        ArrayList<String> beginsWithC = new ArrayList<String>();
        
        for(int i=0; i<list.size(); i++) {
            String element = list.get(i);
            if(element.charAt(0)==c) {
                beginsWithC.add(element);
            }
        }
        return beginsWithC;
    }
}
