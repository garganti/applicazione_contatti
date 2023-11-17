
import javax.swing.*;
import java.awt.event.*;

//Questo esempio mostra una finestra che manda un messaggio alla chiusura
//(usa il WindowAdapter)
public class WindowFrame_b1 extends JFrame
{
  public WindowFrame_b1()
  {
    setTitle("finestra cavia");
    setSize(300,200);
    setLocation(300,200);
    AscoltatoreEventiFrame_b1 mioAscoltatore=new AscoltatoreEventiFrame_b1();
    addWindowListener(mioAscoltatore);
  }

  public static void main(String[] args)
  {
    JFrame frame= new WindowFrame_b1();
    frame.setVisible(true);
  }
}

//Il Listener degli eventi del Frame,
//estende la classe WindowAdapter
class AscoltatoreEventiFrame_b1 extends WindowAdapter
{
  //overriding del metodo windowClosing
  public void windowClosing(WindowEvent e)
  {
    System.out.println("la finestra si sta chiudendo");
    System.exit(0);
  }
}
