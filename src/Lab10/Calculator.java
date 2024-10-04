package Lab10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
	
	private JTextField txtField;
	private JPanel mainPanel;
	private String[] txtButton = {
			"C","CE","<","/",
			"1","2","3","x",
			"4","5","6","-",
			"7","8","9","+",
			"+/-","0",".","="
	};
	private String output = "";
	private char opt;
	private double stack[] = new double[3];
	private int Top = -1;
	
	private DecimalFormat formatter = new DecimalFormat("#,###.########");
	
	void push(double data) {
		Top++;
		stack[Top] = data;
	}
	
	double pop() {
		double data = stack[Top];
		Top--;
		
		return data;
	}
	
	double peek() {
		return stack[Top];
	}
	
	public Calculator () {
		super("CALCULATOR");
		
		txtField = new JTextField("0");
		txtField.setPreferredSize(new Dimension(300,200));
		txtField.setHorizontalAlignment(JTextField.RIGHT);
		txtField.setEditable(false);
		
		add(txtField,BorderLayout.NORTH);
		setSize(300,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(5, 4, 5, 5));
		
		for(int i=0; i<txtButton.length;i++) {
			JButton jbnum = new JButton(txtButton[i]);
			jbnum.addActionListener(this);
			mainPanel.add(jbnum);
		}
		add(mainPanel);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if(("0123456789.").contains(command)) {
			output += command;
			txtField.setText(formatter.format(Double.parseDouble(output)));
		}else if(command.equals("C")) {
			output = "";
			pop();
			txtField.setText("0");
		}else if(command.equals("CE")) {
			output = "";
			txtField.setText("0");
		}else {
			if (!output.isEmpty()) {
				push(Double.parseDouble(output));
				output = "";
			}
			
			if(command.equals("+")) {
				opt = '+';
				txtField.setText("0");
			}else if(command.equals("-")){
				opt = '-';
				txtField.setText("0");
			}else if(command.equals("x")){
				opt = '*';
				txtField.setText("0");
			}else if(command.equals("/")){
				opt = '/';
				txtField.setText("0");
			}else if(command.equals("=")) {
				if(Top > 0) {
					double b = pop();
					double a = pop();
					
					switch (opt) {
						case '+':
							push(a + b);
							break;
						case '-':
							push(a - b);
							break;
						case '*':
							push(a * b);
							break;
						case '/':
							if (b != 0) {
								push(a / b);
							} else {
								txtField.setText("Error");
								return;
							}
							break;
					}
					txtField.setText(formatter.format(peek()));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}