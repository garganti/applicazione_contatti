package dialoghi;

import javax.swing.*;

//Questo esempio mostra l'utilizzo della JOptionPane
public class OptionPaneSample extends JFrame
{
  public static void main(String[] args)
  {
    int scelta=JOptionPane.NO_OPTION;
    String input=null;
    while (scelta==JOptionPane.NO_OPTION)
    {
      //Visualizzo una finestra di input per inserire una stringa
      input=JOptionPane.showInputDialog(null,"Inserisci una stringa","Input",JOptionPane.QUESTION_MESSAGE);

      if (input==null||input.trim().length()==0)
        //Visualizzo un messaggio di errore
        JOptionPane.showMessageDialog(null,"Non hai inserito nessuna stringa!","Errore",JOptionPane.ERROR_MESSAGE);
      else
        //Visualizzo una finestra di conferma della stringa inserita
        scelta=JOptionPane.showConfirmDialog(null,"Hai inserito "+input+".\nSe sicuro?","Conferma",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    }

    //Visualizzo una finestra informativa
    JOptionPane.showMessageDialog(null,"La stringa inserita e': "+input,"Input",JOptionPane.INFORMATION_MESSAGE);
  }
}
