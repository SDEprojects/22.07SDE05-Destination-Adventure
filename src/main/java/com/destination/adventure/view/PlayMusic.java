package com.destination.adventure.view;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.FloatControl.Type;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PlayMusic {

  // FIELDS
  public static Clip clip;

  // CONSTRUCTOR
  public static void RunMusic(String path) {

    try {
      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
      InputStream is = classLoader.getResourceAsStream(path);
      AudioInputStream inputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(is));
      clip = AudioSystem.getClip();
      clip.open(inputStream);
      clip.loop(Clip.LOOP_CONTINUOUSLY);

    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
      throw new RuntimeException(e);
    }

  }

  // METHODS
  public static void decreaseVolume() {
    FloatControl gainControl = (FloatControl) clip.getControl(Type.MASTER_GAIN);
    gainControl.setValue(-10.0f);
  }

  public static void increaseVolume() {
    FloatControl gainControl = (FloatControl) clip.getControl(Type.MASTER_GAIN);
    gainControl.setValue(5.0f);
  }

}
