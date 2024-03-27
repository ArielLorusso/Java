package c46_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class fileWrither {
    public static void main(String[] args) {
        //abstract representation of file and pathname
        String path = "C:\\Users\\ariel\\OneDrive\\Documentos\\Visual_Studio_Projecs\\JAVA\\BroCode\\c46_FileWriter";
        System.out.println(path);
        
        try{
            FileWriter writer = new FileWriter("./a.txt");
            writer.write("hello\n");
            writer.append("you'r out of your minde Bruce Wayne");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
