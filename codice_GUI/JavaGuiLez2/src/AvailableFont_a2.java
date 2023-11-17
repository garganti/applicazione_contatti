import java.awt.*;

//Mostra come ottenere tutti i font presenti nel sistema e ne visualizza qualcuno random
public class AvailableFont_a2
{
  public static void main(String[] args)
  {
    //Recupero l'ambiente grafico del sistema
    GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();

    //Recupero i font disponibili sul sistema
    String[] availableFont=ge.getAvailableFontFamilyNames();

    //Creo un frame utilizzando un font presente sul sistema
    for (int i=0;i<10;i++)
    {
      int index=(int)(availableFont.length*Math.random());

      //Creo il font da utilizzare
      Font f=new Font(availableFont[index],Font.PLAIN,24);

      int x=(int)(400*Math.random());
      int y=(int)(400*Math.random());

      ColoredFrame frame=new ColoredFrame(availableFont[index],Color.white,f,x,y);
      frame.setVisible(true);
    }
  }
}
