package Lab8_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main implements ActionListener{
	private int clickCount = 0;

	public static void main(String[] args) { 
       	JFrame frame = new JFrame("Test"); 
        frame.setSize(250, 300); 
        frame.setVisible(true); 
        frame.setEnabled(true);
        
        JButton jb = new JButton("click");
        JPanel center = new JPanel();
        center.add(jb);
        frame.getContentPane().add(center, BorderLayout.CENTER); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        main click = new main();
        jb.addActionListener(click);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		clickCount++;
		
		JButton cc = (JButton) e.getSource();
		cc.setText(clickCount+"");
	}
}


