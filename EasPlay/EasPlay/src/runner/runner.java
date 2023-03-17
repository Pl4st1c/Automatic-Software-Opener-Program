package runner;

import java.io.IOException;

public class runner {
  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();
    try {
      runtime.exec("notepad"); // Apre Notepad (esempio)
      Process p = runtime.exec("C:\\Steamunlocked\\Transformers Fall of Cybertron\\Transformers.Fall.of.Cybertron.Incl.ALL.DLCs\\Transformers - Fall of Cybertron\\Binaries\\TFOC.exe"); // Apre il gioco
      // Per copie non originali cambiare il percorso per Process p
      System.out.println("I programmi sono stati avviati correttamente!");
    } catch (IOException ioe) {
      System.out.println("Eccezione: " + ioe);
    }
  }
}