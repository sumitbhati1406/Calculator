package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 536);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSimpleCalculator = new JLabel("Simple Calculator");
		lblSimpleCalculator.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSimpleCalculator.setBounds(0, 0, 386, 47);
		frame.getContentPane().add(lblSimpleCalculator);
		
		textField = new JTextField();
		textField.setBounds(39, 68, 306, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn1.setBounds(35, 180, 69, 62);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn2.setBounds(113, 180, 69, 62);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn3.setBounds(192, 180, 69, 62);
		frame.getContentPane().add(btn3);
		
		JButton btn15 = new JButton("+");
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operation="+";
			}
		});
		btn15.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn15.setBounds(271, 180, 69, 62);
		frame.getContentPane().add(btn15);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn6.setBounds(192, 252, 69, 62);
		frame.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn9.setBounds(192, 327, 69, 62);
		frame.getContentPane().add(btn9);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation=="+")
				{
				  result=first+second;
				  answer=String.format("%.2f", result);
				  textField.setText(answer);
				}
				else if(operation=="-")
				{
				  result=first-second;
				  answer=String.format("%.2f", result);
				  textField.setText(answer);
				}
				else if(operation=="*")
				{
				  result=first*second;
				  answer=String.format("%.2f", result);
				  textField.setText(answer);
				}
				else if(operation=="/")
				{
				  result=first/second;
				  answer=String.format("%.2f", result);
				  textField.setText(answer);
				}
				}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnEqual.setBounds(192, 399, 69, 62);
		frame.getContentPane().add(btnEqual);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn7.setBounds(35, 327, 69, 62);
		frame.getContentPane().add(btn7);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number=textField.getText()+btn0.getText();
			textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn0.setBounds(35, 399, 69, 62);
		frame.getContentPane().add(btn0);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn4.setBounds(35, 252, 69, 62);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn5.setBounds(113, 252, 69, 62);
		frame.getContentPane().add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn8.setBounds(113, 327, 69, 62);
		frame.getContentPane().add(btn8);
		
		JButton btn10 = new JButton(".");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn10.getText();
				textField.setText(number);
			}
		});
		btn10.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn10.setBounds(113, 399, 69, 62);
		frame.getContentPane().add(btn10);
		
		JButton btn14 = new JButton("-");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btn14.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn14.setBounds(271, 252, 69, 62);
		frame.getContentPane().add(btn14);
		
		JButton btn13 = new JButton("*");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btn13.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn13.setBounds(271, 327, 69, 62);
		frame.getContentPane().add(btn13);
		
		JButton btn12 = new JButton("/");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btn12.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn12.setBounds(271, 399, 69, 62);
		frame.getContentPane().add(btn12);
	}

}
