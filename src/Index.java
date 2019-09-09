import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Index extends JFrame {
	
	private static String action = "";
	private static int num1 = 0;
	private static int num2 = 0;
	private static float result = 0;
	private JPanel contentPane;
	private JTextField txtVal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Index() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtVal = new JTextField();
		txtVal.setBounds(5, 9, 248, 59);
		contentPane.add(txtVal);
		txtVal.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = txtVal.getText() + btn1.getText();
				txtVal.setText(str );
			}
		});
		btn1.setBounds(5, 86, 44, 40);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVal.setText(txtVal.getText()+btn2.getText());
			}
		});
		btn2.setBounds(59, 86, 44, 40);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVal.setText(txtVal.getText()+btn3.getText());
			}
		});
		btn3.setBounds(113, 86, 44, 40);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVal.setText(txtVal.getText()+btn4.getText());
			}
		});
		btn4.setBounds(5, 137, 44, 40);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtVal.setText(txtVal.getText()+btn5.getText());
			}
		});
		btn5.setBounds(59, 137, 44, 40);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVal.setText(txtVal.getText()+btn6.getText());
			}
		});
		btn6.setBounds(113, 137, 44, 40);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVal.setText(txtVal.getText()+btn7.getText());
			}
		});
		btn7.setBounds(5, 188, 44, 40);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVal.setText(txtVal.getText()+btn8.getText());
			}
		});
		btn8.setBounds(59, 188, 44, 40);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVal.setText(txtVal.getText()+btn9.getText());
			}
		});
		btn9.setBounds(113, 188, 44, 40);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVal.setText(txtVal.getText()+btn0.getText());
			}
		});
		btn0.setBounds(59, 239, 44, 40);
		contentPane.add(btn0);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVal.setText("");
				num1 = 0;
				num2 = 0;
				result = 0;
			}
		});
		btnC.setBounds(5, 239, 44, 40);
		contentPane.add(btnC);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Integer.valueOf(txtVal.getText());
				switch(action){
					case "+":
						result = (float) (num1 + num2);
						break;
					case "-":
						result = (float) num1 - num2;
						break;
					case "*":
						result = (float) num1 * num2;
						break;
					case "/":
						result =(float) num1 / num2;
						break;
				}
				DecimalFormat dc = new DecimalFormat("0.00");
				String formattedText = dc.format(result);
				txtVal.setText(formattedText);
				//txtVal.setText(String.valueOf(result));
								
			}
		});
		btnEqual.setBounds(113, 239, 44, 40);
		contentPane.add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	action = btnPlus.getText();
				action = "+";
				num1 = Integer.valueOf(txtVal.getText());
				txtVal.setText("");
			}
		});
		btnPlus.setBounds(177, 86, 71, 40);
		contentPane.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	action = btnMinus.getText();
				action = "-";
				num1 = Integer.valueOf(txtVal.getText());
				txtVal.setText("");
			}
		});
		btnMinus.setBounds(177, 137, 71, 40);
		contentPane.add(btnMinus);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//action = btnMultiply.getText();
				action = "*";
				num1 = Integer.valueOf(txtVal.getText());
				txtVal.setText("");
			}
		});
		btnMultiply.setBounds(177, 188, 71, 40);
		contentPane.add(btnMultiply);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action = "/";
				num1 = Integer.valueOf(txtVal.getText());
				txtVal.setText("");
			}
		});
		btnDivision.setBounds(177, 239, 71, 40);
		contentPane.add(btnDivision);
	}
}
