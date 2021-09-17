package igu;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;

public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JButton btSiguiente;
	private JButton btCancelar;
	private JPanel pnPedido;
	private JRadioButton rbLocal;
	private JRadioButton rbLlevar;
	private JPanel pnDatosCliente;
	private JLabel lblNewLabel;
	private JTextField tfNombreApellidos;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JLabel lblNewLabel_2;
	private JPasswordField psContraseña;
	private JLabel lblNewLabel_2_1;
	private JPasswordField psContraseñaSeguro;

	/**
	 * Acordar cambiarlo en cada WS modificar el modo lazy. En Window>>Preferences>>WindowBuilder>>Swing>>Lazy
	 * Acabar el guion practica 2 y acabar la interfaz
	 */
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
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
	public VentanaRegistro() {
		setTitle("Datos del cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 306);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtSiguiente());
		contentPane.add(getBtCancelar());
		contentPane.add(getPnPedido());
		contentPane.add(getPnDatosCliente());
	}
	private JButton getBtSiguiente() {
		if (btSiguiente == null) {
			btSiguiente = new JButton("Siguiente");
			btSiguiente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkFields().equals(true)) {
						JOptionPane.showMessageDialog(null, "Pedido realizado con exito!");
					} else {
						JOptionPane.showMessageDialog(null, "Ha surgido algun problema con el pedido!");	
					}
				}
			});
			btSiguiente.setBackground(new Color(60, 179, 113));
			btSiguiente.setBounds(257, 225, 89, 23);
		}
		return btSiguiente;
	}
	
	private Boolean checkFields() {
		if (!tfNombreApellidos.getText().isBlank() && !String.valueOf(psContraseña.getPassword()).isBlank()
				&& !String.valueOf(psContraseñaSeguro.getPassword()).isBlank()) {
			if (String.valueOf(psContraseña.getPassword()).equals(String.valueOf(psContraseñaSeguro.getPassword()))) {
				return true;
			}
		}
		return false;
	}
	
	private JButton getBtCancelar() {
		if (btCancelar == null) {
			btCancelar = new JButton("Cancelar");
			btCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btCancelar.setBackground(new Color(255, 0, 0));
			btCancelar.setBounds(356, 225, 89, 23);
		}
		return btCancelar;
	}
	private JPanel getPnPedido() {
		if (pnPedido == null) {
			pnPedido = new JPanel();
			pnPedido.setBackground(new Color(255, 255, 255));
			pnPedido.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Pedido", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
			pnPedido.setBounds(10, 212, 205, 47);
			pnPedido.setLayout(null);
			pnPedido.add(getRbLocal());
			pnPedido.add(getRbLlevar());
		}
		return pnPedido;
	}
	private JRadioButton getRbLocal() {
		if (rbLocal == null) {
			rbLocal = new JRadioButton("Local");
			rbLocal.setSelected(true);
			rbLocal.setBackground(new Color(255, 255, 255));
			rbLocal.setBounds(19, 16, 80, 23);
		}
		return rbLocal;
	}
	private JRadioButton getRbLlevar() {
		if (rbLlevar == null) {
			rbLlevar = new JRadioButton("Llevar");
			rbLlevar.setBackground(new Color(255, 255, 255));
			rbLlevar.setBounds(101, 16, 85, 23);
		}
		return rbLlevar;
	}
	private JPanel getPnDatosCliente() {
		if (pnDatosCliente == null) {
			pnDatosCliente = new JPanel();
			pnDatosCliente.setBackground(Color.WHITE);
			pnDatosCliente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos del Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			pnDatosCliente.setBounds(10, 10, 435, 194);
			pnDatosCliente.setLayout(null);
			pnDatosCliente.add(getLblNewLabel());
			pnDatosCliente.add(getTfNombreApellidos());
			pnDatosCliente.add(getLblNewLabel_1());
			pnDatosCliente.add(getComboBox());
			pnDatosCliente.add(getLblNewLabel_2());
			pnDatosCliente.add(getPsContraseña());
			pnDatosCliente.add(getLblNewLabel_2_1());
			pnDatosCliente.add(getPsContraseñaSeguro());
		}
		return pnDatosCliente;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Nombre y apellidos:");
			lblNewLabel.setBounds(10, 29, 115, 13);
		}
		return lblNewLabel;
	}
	private JTextField getTfNombreApellidos() {
		if (tfNombreApellidos == null) {
			tfNombreApellidos = new JTextField();
			tfNombreApellidos.setBounds(133, 26, 215, 19);
			tfNombreApellidos.setColumns(10);
		}
		return tfNombreApellidos;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("A\u00F1o nacimiento:");
			lblNewLabel_1.setBounds(10, 65, 115, 13);
		}
		return lblNewLabel_1;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"}));
			comboBox.setBounds(133, 61, 75, 21);
		}
		return comboBox;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Password:");
			lblNewLabel_2.setBounds(10, 101, 115, 13);
		}
		return lblNewLabel_2;
	}
	private JPasswordField getPsContraseña() {
		if (psContraseña == null) {
			psContraseña = new JPasswordField();
			psContraseña.setBounds(133, 98, 141, 19);
		}
		return psContraseña;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Password:");
			lblNewLabel_2_1.setBounds(10, 137, 115, 13);
		}
		return lblNewLabel_2_1;
	}
	private JPasswordField getPsContraseñaSeguro() {
		if (psContraseñaSeguro == null) {
			psContraseñaSeguro = new JPasswordField();
			psContraseñaSeguro.setBounds(133, 134, 141, 19);
		}
		return psContraseñaSeguro;
	}
}
