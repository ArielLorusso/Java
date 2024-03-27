package c45_file_class;

import java.io.File;

public class file {
    public static void main(String[] args) {
//abstract representation of file and pathname
        String path = "C:\\Users\\ariel\\OneDrive\\Documentos\\Visual_Studio_Projecs\\JAVA\\BroCode\\c45_file_class";
        System.out.println(path);
        
        File file = new File(path+"/a.txt");
        if (file.exists())  { 
            System.out.println("file exist");
            System.out.println(file.getPath() );
            System.out.println(file.getAbsolutePath() );
            System.out.println(file.isFile() );
            System.out.println(file.canRead() );
            System.out.println(file.canWrite() );
            //file.delete();
        }
        else                { System.out.println("file no exist");}

    }
}
