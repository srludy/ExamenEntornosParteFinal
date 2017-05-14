package Ventana;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Logica.CalcularLetra;


/*
 * By Paco Gomez
 * Esta ventana tendrá dos JTextFields
 * El primero recojerá el DNI
 * El segundo calculará la letra al apretar el botón
 * 
 * */
public class VentanaLetraDNI extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;



	/**
	 * Create the frame.
	 */
	public VentanaLetraDNI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("Introduce DNI");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(1);
		
		JLabel lblNewLabel_1 = new JLabel("Letra DNI Calculada");
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		contentPane.add(textField_1);
		textField_1.setColumns(1);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnCalcular.addActionListener(this);
		btnCalcular.setActionCommand("CALCULAR");
		contentPane.add(btnCalcular);
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("CALCULAR")){
			if(!textField.getText().equals("") && textField.getText().length() == 8){
				CalcularLetra CL = new CalcularLetra(textField.getText());
				char text = CL.devolverLetra();
					if(text!='1'){
						String textToString = String.valueOf(text);
						textField_1.setText(textToString);
					}else{
						textField_1.setText("El DNI debe ser de 8 digitos [0 a 9] cada uno.");
					}
			}else{
				textField_1.setText("El DNI debe ser de 8 digitos [0 a 9] cada uno.");
			}
		}
		
	}

}
