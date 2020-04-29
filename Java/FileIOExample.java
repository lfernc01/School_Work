import java.io.*;
import java.util.Arrays;
public class FileIOExample {
    
    
    public static void main(String[] args) { 
        /*String[] w = {"apple", "orange", "passion fruit"};
        try {
            writeOnFile(w,"fruits.txt");
            //writeOnFile(w,"fruits.txt");
        } catch (IOException e) {
            System.out.println("something went wrong");
        }*/
        String[] l = readFromFile("fruits.txt");
        System.out.println(Arrays.toString(l));
    }
    
    // a method that reads all the lines from a file and stores them 
    // inside a String array. The method then returns the array
    public static String[] readFromFile(String filename) {
        String[] lines = null;
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            // read the first line of the file to retrieve the length
            int length = Integer.parseInt(br.readLine());
            lines = new String[length];
            // read all the other lines and store them in the array
            String currLine = br.readLine();
            int index =0;
            while(currLine != null) {
                lines[index] = currLine;
                currLine = br.readLine();
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
    
    // a method that takes an array of String as input
    // and a name of a file. It write each String in the
    // file, one per line
    public static void writeOnFile(String[] words, String fileName) throws IOException{
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        // go through all the elements of the array
        for(int i=0; i<words.length; i++) {
            // write each element on the file
            bw.write(words[i]);
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
    
}
