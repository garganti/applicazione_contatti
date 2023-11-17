package mvc2.calculator;
// structure/calc-mvc/CalcView.java - View component
//    Presentation only.  No user actions.
// Fred Swartz -- December 2004

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;

class CalcView extends JFrame implements Observer {
    
    //... Components
    private JTextField m_userInputTf = new JTextField(5);
    private JTextField m_totalTf     = new JTextField(20);
    private JButton    m_multiplyBtn = new JButton("Multiply");
    private JButton    m_clearBtn    = new JButton("Clear");
    
    private CalcModel m_model;
    
    //======================================================= constructor
    /** Constructor */
    CalcView(CalcModel model) {
        
    	m_model = model;
    	
    	m_model.addObserver(this);
    	
        //... Initialize components
        m_totalTf.setText(model.getValue());
        m_totalTf.setEditable(false);
        
        //... Layout the components.      
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Input"));
        content.add(m_userInputTf);
        content.add(m_multiplyBtn);
        content.add(new JLabel("Total"));
        content.add(m_totalTf);
        content.add(m_clearBtn);
        
        //... finalize layout
        this.setContentPane(content);
        this.pack();
        
        this.setTitle("Simple Calc - MVC");
        // The window closing event should probably be passed to the 
        // Controller in a real program, but this is a short example.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        
    String getUserInput() {
        return m_userInputTf.getText();
    }    
    
    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
    
    void addMultiplyListener(ActionListener mal) {
        m_multiplyBtn.addActionListener(mal);
    }
    
    void addClearListener(ActionListener cal) {
        m_clearBtn.addActionListener(cal);
    }

	private void update() {
		m_totalTf.setText(m_model.getValue());
	}

	@Override
	public void update(Observable o, Object arg) {
		update();		
	}
}
