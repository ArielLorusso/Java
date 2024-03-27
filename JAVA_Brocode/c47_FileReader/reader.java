package c47_FileReader;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class reader {

    public static void main (String[] args) {
        //abstract representation of file and pathname
        String path = "C:\\Users\\ariel\\OneDrive\\Documentos\\Visual_Studio_Projecs\\JAVA\\BroCode\\c47_FileReader";
        System.out.println(path);       //https://www.asciiart.eu/food-and-drinks/coffee-and-tea
        
        try{
            FileReader reader = new FileReader( path +"/art.txt");
            int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
        
        } catch (FileNotFoundException e) {
            // @TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("not found Exception");  
        } catch (IOException e) {
            // @TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Unknown Exception");
        }
    }
}

