import java.io.*;
import java.util.Arrays;
public class FileIOExample {
    
    
    public static void main(String[] args) { 
       
    }
    
    // read lines from a file and stores them inside String array. 
    public static String[] readFromFile(String filename) {
        String[] lines = null;
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            
            int length = Integer.parseInt(br.readLine());
            lines = new String[length];
            
            String temp = br.readLine();
            int index =0;
            while(temp != null) {
                lines[index] = temp;
                temp = br.readLine();
                index++;
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("the file was not there");
        } catch (IOException e) {
            System.out.println("something went wrong");
        }
        return lines;
    }
    
    // write each String of String array in the file
    public static void writeOnFile(String[] words, String fileName) throws IOException{
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
  
        for(int i=0; i<words.length; i++) {
            bw.write(words[i]);
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
    
}
