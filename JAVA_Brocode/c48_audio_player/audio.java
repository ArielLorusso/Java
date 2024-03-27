package c48_audio_player;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class audio {
    
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{

        String  path = "C:\\Users\\ariel\\OneDrive\\Documentos\\Visual_Studio_Projecs\\JAVA\\BroCode\\c48_audio_player";
        Scanner scanner = new Scanner(System.in);
        String response = "";
  // AUDIO FILE
        File file = new File(path+"/Chest.wav");
  // AUDIO STREAM
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
  // CLIP OBJECT
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
  
        // clip.start();  Program Would end before it plays
        // make a menu to avoid exiting
 
 
        while(!response.equals("Q"))  {  // Not QUIT
        System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
        System.out.print("Enter your choice: ");  // show menu
   
        response = scanner.next();                  // scan menu
        response = response.toUpperCase();


        switch(response) {                          //execute menu
            case ("P"): clip.start();   break;
            case ("S"): clip.stop();    break;
            case ("R"): clip.setMicrosecondPosition(0);     break;
            case ("Q"): clip.close();   break;
         default: System.out.println("Not a valid response");
        }
        scanner.close();   
  }
  System.out.println("Byeeee!"); 
 }
}