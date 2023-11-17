package mvc.list2;
import java.awt.*;
import javax.swing.*;


import java.awt.event.*;

public class TestFrame extends JFrame {

    private JTextField  textField;
    private JButton     button;
    private JList<String>       list;
    private SimpleListModel<String> listModel;

    public TestFrame() {
        super("Test Application");
        Dimension screenSize = getToolkit().getScreenSize();

        setBounds(screenSize.width/4, screenSize.height/4,
                  screenSize.width/2, screenSize.height/2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        listModel = new SimpleListModel<String>();
        list = new JList<String>(listModel);

        this.add(list, BorderLayout.CENTER);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (text != "") {
                    listModel.add(text);
                    textField.setText("");
                }
            }
        };

        textField = new JTextField();
        textField.addActionListener(actionListener);

        button = new JButton("Add");
        button.addActionListener(actionListener);

        JPanel panel = new JPanel(new GridLayout(1,2));
        panel.add(textField);
        panel.add(button);

        this.add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        TestFrame frame = new TestFrame();
        frame.setVisible(true);
    }
}
