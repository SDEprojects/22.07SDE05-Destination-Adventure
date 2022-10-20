package com.destination.adventure.view;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PlayMusic {

  public static void RunMusic(String path){
    try {
      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
      InputStream is = classLoader.getResourceAsStream(path);
      AudioInputStream inputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(is));
      Clip clip = AudioSystem.getClip();
      clip.open(inputStream);
      clip.loop(0);
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
      throw new RuntimeException(e);
    }

  }

}
