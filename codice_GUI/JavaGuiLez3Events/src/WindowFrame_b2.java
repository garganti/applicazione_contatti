
import javax.swing.*;
import java.awt.event.*;

//Questo esempio mostra una finestra che manda un messaggio alla chiusura
//(usa il WindowAdapter lo definisce "al volo")
public class WindowFrame_b2 extends JFrame
{
  public WindowFrame_b2()
  {
    setTitle("finestra cavia");
    setSize(300,200);
    setLocation(300,200);
    addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent e)
      {
        System.out.println("la finestra si sta chiudendo");
        System.exit(0);
      }
    });
  }

  public static void main(String[] args)
  {
    JFrame frame= new WindowFrame_b2();
    frame.setVisible(true);
  }
}
