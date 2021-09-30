package igu;

import java.awt.EventQueue;

import logica.Carta;
import logica.Pedido;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Carta carta = new Carta();
		Pedido pedido = new Pedido();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal(carta, pedido);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
