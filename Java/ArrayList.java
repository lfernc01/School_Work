import java.util.ArrayList;
public class ArrayList {
    
    public static void main(String[] args) { 
       
    }
    
    
    // returns an ArrayList containing all the String that begins with the char
    public static ArrayList<String> startWithC(ArrayList<String> list, char c) {
        ArrayList<String> temp = new ArrayList<String>();
        
        for(int i=0; i<list.size(); i++) {
            String element = list.get(i);
            if(element.charAt(0)==c) {
                temp.add(element);
            }
        }
        return temp;
    }
}
