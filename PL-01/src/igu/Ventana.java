package igu;

import java.awt.Color;

import javax.swing.*;

public class Ventana extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Los objetos creados seran siempre privados
	 */
	private JPanel panel;
	private JButton btAceptar;
	private JButton btCancelar;
	private JTextField txtField;
	private JLabel label;

	/**
	 * Siempre que se tenga que cambiar alguna propiedad de la ventana se hara
	 * en el constructor, menos la visibilidad para que se muestre la ventana
	 * una vez el constructor se haya acabado de ejecutar.
	 */
	public Ventana() {
		this.setTitle("Practica 01");
		this.setBounds(100, 100, 450, 300);
		
		panel = new JPanel();
		this.setContentPane(panel); //Hay que extender el panel
		panel.setBackground(Color.gray);
		panel.setLayout(null);
		
		btAceptar = new JButton();
		btAceptar.setText("Aceptar!");
		btAceptar.setBounds(170, 220, 100, 30);
		btAceptar.setForeground(Color.blue);
		

		btCancelar = new JButton();
		btCancelar.setText("Cancelar!");
		btCancelar.setBounds(280, 220, 100, 30);
		btCancelar.setForeground(Color.blue);
		
		txtField = new JTextField();
		txtField.setBounds(200, 100, 150, 30);
		
		label = new JLabel();
		label.setText("Introduzca su nombre:");
		label.setBounds(70, 100, 150, 30);
		
		panel.add(btAceptar);
		panel.add(btCancelar);
		panel.add(txtField);
		panel.add(label);
	}

	public static void main(String[] args) {
		Ventana window = new Ventana();
		window.setVisible(true);
	}

}
