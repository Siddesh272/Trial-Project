import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JToolBar;

public class SidCalculator {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField texFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SidCalculator window = new SidCalculator();
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
	public SidCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1087, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(87, 73, 244, 60);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(390, 73, 251, 60);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("Addition");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					ans=num1+num2;
					texFieldAns.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter a valid number");
					}
			}
		});
		btnNewButton.setBounds(820, 73, 202, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Subtraction");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					ans=num1-num2;
					texFieldAns.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter a valid number");
					}
			}
		});
		btnNewButton_1.setBounds(820, 147, 202, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiiplication");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					ans=num1*num2;
					texFieldAns.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter a valid number");
					}
			}
		});
		btnNewButton_2.setBounds(820, 226, 202, 40);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Division");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					ans=num1/num2;
					texFieldAns.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter a valid number");
					}
			}
		});
		btnNewButton_3.setBounds(820, 306, 202, 40);
		frame.getContentPane().add(btnNewButton_3);
		
		texFieldAns = new JTextField();
		texFieldAns.setBounds(390, 286, 251, 60);
		frame.getContentPane().add(texFieldAns);
		texFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Answer is:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(196, 283, 135, 60);
		frame.getContentPane().add(lblNewLabel);
	}
}
