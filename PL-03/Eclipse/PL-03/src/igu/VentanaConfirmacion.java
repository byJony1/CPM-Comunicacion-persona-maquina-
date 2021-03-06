package igu;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaConfirmacion extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblOk;
	private JLabel lblAviso;
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JButton btFinalizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConfirmacion dialog = new VentanaConfirmacion();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public VentanaConfirmacion() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("McDonald's: Confirmacion del pedido");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaConfirmacion.class.getResource("/img/logo.png")));
		setResizable(false);
		setBounds(100, 100, 658, 244);
		getContentPane().setLayout(null);
		getContentPane().add(getLblOk());
		getContentPane().add(getLblAviso());
		getContentPane().add(getLblCodigo());
		getContentPane().add(getTxtCodigo());
		getContentPane().add(getBtFinalizar());

	}
	private JLabel getLblOk() {
		if (lblOk == null) {
			lblOk = new JLabel("New label");
			lblOk.setIcon(new ImageIcon(VentanaConfirmacion.class.getResource("/img/ok.png")));
			lblOk.setBackground(Color.WHITE);
			lblOk.setBounds(56, 35, 47, 38);
		}
		return lblOk;
	}
	private JLabel getLblAviso() {
		if (lblAviso == null) {
			lblAviso = new JLabel("Pulse finalizar para confirmar su pedido");
			lblAviso.setFont(new Font("Arial Black", Font.PLAIN, 18));
			lblAviso.setHorizontalAlignment(SwingConstants.LEFT);
			lblAviso.setBounds(133, 43, 411, 26);
		}
		return lblAviso;
	}
	private JLabel getLblCodigo() {
		if (lblCodigo == null) {
			lblCodigo = new JLabel("El c\u00F3digo de recogida es:");
			lblCodigo.setFont(new Font("Arial", Font.PLAIN, 15));
			lblCodigo.setBounds(151, 93, 170, 18);
		}
		return lblCodigo;
	}
	private JTextField getTxtCodigo() {
		if (txtCodigo == null) {
			txtCodigo = new JTextField();
			txtCodigo.setEditable(false);
			txtCodigo.setBounds(329, 88, 113, 31);
			txtCodigo.setColumns(10);
		}
		return txtCodigo;
	}
	private JButton getBtFinalizar() {
		if (btFinalizar == null) {
			btFinalizar = new JButton("Finalizar");
			btFinalizar.setBackground(new Color(50, 205, 50));
			btFinalizar.setBounds(455, 149, 89, 23);
		}
		return btFinalizar;
	}
}
