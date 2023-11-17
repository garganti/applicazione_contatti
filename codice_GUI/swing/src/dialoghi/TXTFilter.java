package dialoghi;
import javax.swing.filechooser.FileFilter;
import java.io.*;

// Filtro per le immagini TXT
public class TXTFilter extends FileFilter
{
  public boolean accept(File f)
  {
    return f.getName().toLowerCase().endsWith(".txt")||f.isDirectory();
  }

  public String getDescription()
  {
    return "File TXT";
  }

  public String toString()
  {
    return "txt";
  }
}
