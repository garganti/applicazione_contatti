

import java.awt.*;

//Mostra come ottenere tutti i font presenti nel sistema
public class AvailableFont_a1
{
  public static void main(String[] args)
  {
    //Recupero l'ambiente grafico del sistema
    GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();

    //Recupero e stampa i font disponibili sul sistema
    String[] availableFont=ge.getAvailableFontFamilyNames();
    for (int i=0;i<availableFont.length;i++) System.out.println(availableFont[i]);
  }
}
