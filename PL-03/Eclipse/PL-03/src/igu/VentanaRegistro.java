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
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;

public class VentanaRegistro extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btSiguiente;
	private JButton btCancelar;
	private JPanel pnPedido;
	private JRadioButton rbLocal;
	private JRadioButton rbLlevar;
	private JPanel pnDatosCliente;
	private JLabel lbNombre;
	private JTextField tfNombreApellidos;
	private JLabel lbAño;
	private JComboBox<String> cbAño;
	private JLabel lblPass;
	private JPasswordField pwContraseña;
	private JLabel lblPass2;
	private JPasswordField pwContraseña2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setTitle("McDonald\u00B4s: Datos de Registro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
	
	// Cambiar esto para que compruebe primero si hay alguno vacio y en caso de que no, se compruebe si es todo lo mismo.
	private JButton getBtSiguiente() {
		if (btSiguiente == null) {
			btSiguiente = new JButton("Siguiente");
			btSiguiente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkFields()) {
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
		if (!tfNombreApellidos.getText().isBlank() && !String.valueOf(pwContraseña.getPassword()).isBlank()
				&& !String.valueOf(pwContraseña2.getPassword()).isBlank()) {
			if (String.valueOf(pwContraseña.getPassword()).equals(String.valueOf(pwContraseña2.getPassword()))) {
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
			buttonGroup.add(rbLocal);
			rbLocal.setSelected(true);
			rbLocal.setBackground(new Color(255, 255, 255));
			rbLocal.setBounds(19, 16, 80, 23);
		}
		return rbLocal;
	}
	private JRadioButton getRbLlevar() {
		if (rbLlevar == null) {
			rbLlevar = new JRadioButton("Llevar");
			buttonGroup.add(rbLlevar);
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
			pnDatosCliente.add(getLbNombre());
			pnDatosCliente.add(getTfNombreApellidos());
			pnDatosCliente.add(getLbAño());
			pnDatosCliente.add(getCbAño());
			pnDatosCliente.add(getLblPass());
			pnDatosCliente.add(getPwContraseña());
			pnDatosCliente.add(getLblPass2());
			pnDatosCliente.add(getPwContraseña2());
		}
		return pnDatosCliente;
	}
	private JLabel getLbNombre() {
		if (lbNombre == null) {
			lbNombre = new JLabel("Nombre y apellidos:");
			lbNombre.setBounds(10, 29, 115, 13);
		}
		return lbNombre;
	}
	private JTextField getTfNombreApellidos() {
		if (tfNombreApellidos == null) {
			tfNombreApellidos = new JTextField();
			tfNombreApellidos.setBounds(133, 26, 215, 19);
			tfNombreApellidos.setColumns(10);
		}
		return tfNombreApellidos;
	}
	private JLabel getLbAño() {
		if (lbAño == null) {
			lbAño = new JLabel("A\u00F1o nacimiento:");
			lbAño.setBounds(10, 65, 115, 13);
		}
		return lbAño;
	}
	private JComboBox<String> getCbAño() {
		if (cbAño == null) {
			String[] años = new String[90];
			for (int i=0; i<90; i++) {
				años[i] = "" + ((90-i)+1920);
			}
			cbAño = new JComboBox<String>();
			cbAño.setModel(new DefaultComboBoxModel<String>(años));
			//cbAño.setModel(new DefaultComboBoxModel(new String[] {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"}));
			cbAño.setBounds(133, 61, 75, 21);
		}
		return cbAño;
	}
	private JLabel getLblPass() {
		if (lblPass == null) {
			lblPass = new JLabel("Password:");
			lblPass.setBounds(10, 101, 115, 13);
		}
		return lblPass;
	}
	private JPasswordField getPwContraseña() {
		if (pwContraseña == null) {
			pwContraseña = new JPasswordField();
			pwContraseña.setBounds(133, 98, 141, 19);
		}
		return pwContraseña;
	}
	private JLabel getLblPass2() {
		if (lblPass2 == null) {
			lblPass2 = new JLabel("Password:");
			lblPass2.setBounds(10, 137, 115, 13);
		}
		return lblPass2;
	}
	private JPasswordField getPwContraseña2() {
		if (pwContraseña2 == null) {
			pwContraseña2 = new JPasswordField();
			pwContraseña2.setBounds(133, 134, 141, 19);
		}
		return pwContraseña2;
	}
}
