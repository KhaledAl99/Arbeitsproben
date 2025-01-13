import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class Pizza {

	private JFrame frmPizzabuilder;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza window = new Pizza();
					window.frmPizzabuilder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pizza() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPizzabuilder = new JFrame();
		frmPizzabuilder.setTitle("PizzaBuilder");
		frmPizzabuilder.setBounds(100, 100, 450, 300);
		frmPizzabuilder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPizzabuilder.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Klein ( 7 €)");
		buttonGroup.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton.setBounds(31, 25, 109, 23);
		frmPizzabuilder.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Groß ( 9 €)");
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		
		
		rdbtnNewRadioButton_1.setBounds(157, 25, 109, 23);
		frmPizzabuilder.getContentPane().add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(272, 26, 86, 20);
		frmPizzabuilder.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(272, 68, 86, 20);
		frmPizzabuilder.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(272, 99, 86, 20);
		frmPizzabuilder.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(272, 130, 86, 20);
		frmPizzabuilder.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(272, 161, 86, 20);
		frmPizzabuilder.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(272, 191, 86, 20);
		frmPizzabuilder.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
	
		
		

		textField_6.setBounds(140, 222, 263, 20);
		frmPizzabuilder.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Salami 0.50€");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if (chckbxNewCheckBox.isSelected()) {textField_1.setText("0.50€");}
			else {textField_1.setText("");}
			}
		});
		chckbxNewCheckBox.setBounds(74, 67, 140, 23);
		frmPizzabuilder.getContentPane().add(chckbxNewCheckBox);
		//textField_2
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Schinken 0.50€");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_1.isSelected()) {textField_2.setText("0.50€");}
				else {textField_2.setText("");}
				
			}
		});
		chckbxNewCheckBox_1.setBounds(74, 98, 140, 23);
		frmPizzabuilder.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Paprika  0.40€");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (chckbxNewCheckBox_2.isSelected()) {textField_3.setText("0.40€");}
				else {textField_3.setText("");}
				
			}
		});
		chckbxNewCheckBox_2.setBounds(74, 129, 140, 23);
		frmPizzabuilder.getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Champignons 0.30€");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxNewCheckBox_3.isSelected()) {textField_4.setText("0.30€");}
				else {textField_4.setText("");}
				
			}
		});
		chckbxNewCheckBox_3.setBounds(74, 160, 140, 23);
		frmPizzabuilder.getContentPane().add(chckbxNewCheckBox_3);
		
		JLabel lblNewLabel = new JLabel("Trinkgeld");
		lblNewLabel.setBounds(94, 194, 101, 14);
		frmPizzabuilder.getContentPane().add(lblNewLabel);
		
		
		
		
		
		JButton btnNewButton_1 = new JButton("Summe");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				berechneSumme();
			}
		});
		btnNewButton_1.setBounds(31, 221, 89, 23);
		frmPizzabuilder.getContentPane().add(btnNewButton_1);
		
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton.isSelected()) {textField.setText("7,00");}
				else if (rdbtnNewRadioButton_1.isSelected()) {textField.setText("9,00");}
				
				else {textField.setText("");}		
			}
		});
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton.isSelected()) {textField.setText("7,00");}
				else if (rdbtnNewRadioButton_1.isSelected()) {textField.setText("9,00");}
				else {textField.setText("");}
			}
		});
		
		
		
		
	}
	
	public void berechneSumme() {
	    double f1, f2, f3, f4, f5, f6, summe;
	    try {
	        f1 = textField.getText().isEmpty()   ? 0.0 : Double.parseDouble(textField.getText().replace(",", "."));
	        f2 = textField_1.getText().isEmpty() ? 0.0 : Double.parseDouble(textField_1.getText().replace(",", "."));
	        f3 = textField_2.getText().isEmpty() ? 0.0 : Double.parseDouble(textField_2.getText().replace(",", "."));
	        f4 = textField_3.getText().isEmpty() ? 0.0 : Double.parseDouble(textField_3.getText().replace(",", "."));
	        f5 = textField_4.getText().isEmpty() ? 0.0 : Double.parseDouble(textField_4.getText().replace(",", "."));
	        f6 = textField_5.getText().isEmpty() ? 0.0 : Double.parseDouble(textField_5.getText().replace(",", "."));
	        
	        summe = f1 + f2 + f3 + f4 + f5 + f6;
	        
	        textField_6.setText(Double.toString(summe));
	    } catch (Exception e1) {
	        JOptionPane.showMessageDialog(null, "Ungültige Eingabe!");
	    }
	}

}
