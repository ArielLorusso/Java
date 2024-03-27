package c48_audio_player;
// https://odoepner.wordpress.com/2013/07/19/play-mp3-or-ogg-using-javax-sound-sampled-mp3spi-vorbisspi/


/*



import javax.sound.sampled.Line;
  
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import static javax.sound.sampled.AudioSystem.getAudioInputStream;
import static javax.sound.sampled.AudioFormat.Encoding.PCM_SIGNED;






public class mp3 {
    
    public static void main(String[] args) {
        final AudioFilePlayer player = new AudioFilePlayer ("Chest.mp3");
        player.play();
    }
    
    public void play(String filePath) {
        final File file = new File(filePath);
 
        try (final AudioInputStream in = getAudioInputStream(file)) {
             
            final AudioFormat outFormat = getOutFormat(in.getFormat());
            final Line.Info info = new Line.Info(SourceDataLine.class, outFormat);
 
            try (final SourceDataLine line =
                     (SourceDataLine) AudioSystem.getLine(info)) {
 
                if (line != null) {
                    line.open(outFormat);
                    line.start();
                    stream(getAudioInputStream(outFormat, in), line);
                    line.drain();
                    line.stop();
                }
            }
 
        } catch (UnsupportedAudioFileException 
               | LineUnavailableException 
               | IOException e) {
            throw new IllegalStateException(e);
        }
    }
 
    private AudioFormat getOutFormat(AudioFormat inFormat) {
        final int ch = inFormat.getChannels();
        final float rate = inFormat.getSampleRate();
        return new AudioFormat(PCM_SIGNED, rate, 16, ch, ch * 2, rate, false);
    }
 
    private void stream(AudioInputStream in, SourceDataLine line) 
        throws IOException {
        final byte[] buffer = new byte[65536];
        for (int n = 0; n != -1; n = in.read(buffer, 0, buffer.length)) {
            line.write(buffer, 0, n);
        }
    }
}

// https://github.com/zackj/CSC335_Jukebox/blob/master/src/songplayer/AudioFilePlayer.java

public class AudioFilePlayer extends Thread {

    private String filename;
  
    private ArrayList<EndOfSongListener> listeners;
  
    public AudioFilePlayer(String fileName) {
      this.filename = fileName;
      listeners = new ArrayList<EndOfSongListener>();
    }
  
    /**
     * Register an EndOfSongListener
     * 
     * @param listener A reference to an EndOfSongListener that is
     * interested in knowing when the audio file has finished. 
     */ /*
    public void addEndOfSongListener(EndOfSongListener listener) {
      listeners.add(listener);
    }
  
    // User call Thread's start() method which calls this run method
    @Override
    public void run() {
      play();
    }
  
    // This Code snippet is from JavaZOOM'a JLayer project
    public void play() {
      AudioFormat decodedFormat = null;
      try {
        File file = new File(filename);
        AudioInputStream in = AudioSystem.getAudioInputStream(file);
        AudioInputStream din = null;
        AudioFormat baseFormat = in.getFormat();
  
        decodedFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,
            baseFormat.getSampleRate(), 16, baseFormat.getChannels(),
            baseFormat.getChannels() * 2, baseFormat.getSampleRate(), false);
  
        din = AudioSystem.getAudioInputStream(decodedFormat, in);
        // Play now.
        rawplay(decodedFormat, din);
        in.close();
        //     stop();
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  
    // This Code snippet is from JavaZOOM
    private void rawplay(AudioFormat targetFormat, AudioInputStream din) {
      SourceDataLine line = null;
      try {
        byte[] data = new byte[4096];
        try {
          line = getLine(targetFormat);
        } catch (LineUnavailableException e) {
          // @TODO Auto-generated catch block
          e.printStackTrace();
        }
        if (line != null) {
          // Start
          line.start();
          int nBytesRead = 0;
          @SuppressWarnings("unused")
          int nBytesWritten = 0;
          while (nBytesRead != -1) {
            nBytesRead = din.read(data, 0, data.length);
            if (nBytesRead != -1)
              nBytesWritten = line.write(data, 0, nBytesRead);
          }
          // Stop
          line.drain();
          line.stop();
          line.close();
          din.close();
          // Notify the one listener 
          for (int index = 0; index < listeners.size(); index++)
            listeners.get(index).songFinishedPlaying(filename);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  
    private SourceDataLine getLine(AudioFormat audioFormat)
        throws LineUnavailableException {
      SourceDataLine res = null;
      DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
      res = (SourceDataLine) AudioSystem.getLine(info);
      res.open(audioFormat);
      return res;
    }
  }

 */