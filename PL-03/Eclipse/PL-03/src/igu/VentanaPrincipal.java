package igu;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblLogo;
	private JLabel lblMcDonalds;
	private JLabel lblArticulos;
	private JComboBox cbArticulos;
	private JButton btSiguiente;
	private JButton btCancelar;
	private JLabel lblPrecioPedido;
	private JTextField textField;
	private JButton btA?adir;
	private JLabel lblUnidades;
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setResizable(false);
		setTitle("McDonald\u00B4s Espa\u00F1a");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/img/logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 403);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblLogo());
		contentPane.add(getLblMcDonalds());
		contentPane.add(getLblArticulos());
		contentPane.add(getCbArticulos());
		contentPane.add(getBtSiguiente());
		contentPane.add(getBtCancelar());
		contentPane.add(getLblPrecioPedido());
		contentPane.add(getTextField());
		contentPane.add(getBtA?adir());
		contentPane.add(getLblUnidades());
		contentPane.add(getSpinner());
	}
	private JLabel getLblLogo() {
		if (lblLogo == null) {
			lblLogo = new JLabel("New label");
			lblLogo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/logo.png")));
			lblLogo.setBounds(30, 26, 147, 138);
		}
		return lblLogo;
	}
	private JLabel getLblMcDonalds() {
		if (lblMcDonalds == null) {
			lblMcDonalds = new JLabel("McDonald's");
			lblMcDonalds.setFont(new Font("Arial Black", Font.BOLD, 44));
			lblMcDonalds.setBounds(220, 55, 299, 76);
		}
		return lblMcDonalds;
	}
	private JLabel getLblArticulos() {
		if (lblArticulos == null) {
			lblArticulos = new JLabel("Articulos:");
			lblArticulos.setFont(new Font("Arial", Font.PLAIN, 14));
			lblArticulos.setBounds(30, 191, 74, 14);
		}
		return lblArticulos;
	}
	private JComboBox getCbArticulos() {
		if (cbArticulos == null) {
			cbArticulos = new JComboBox();
			cbArticulos.setBounds(30, 216, 276, 22);
		}
		return cbArticulos;
	}
	private JButton getBtSiguiente() {
		if (btSiguiente == null) {
			btSiguiente = new JButton("Siguiente");
			btSiguiente.setBackground(new Color(50, 205, 50));
			btSiguiente.setBounds(351, 313, 89, 23);
		}
		return btSiguiente;
	}
	private JButton getBtCancelar() {
		if (btCancelar == null) {
			btCancelar = new JButton("Cancelar");
			btCancelar.setBackground(Color.RED);
			btCancelar.setBounds(450, 313, 89, 23);
		}
		return btCancelar;
	}
	private JLabel getLblPrecioPedido() {
		if (lblPrecioPedido == null) {
			lblPrecioPedido = new JLabel("Precio pedido:");
			lblPrecioPedido.setFont(new Font("Arial", Font.PLAIN, 14));
			lblPrecioPedido.setBounds(351, 237, 109, 14);
		}
		return lblPrecioPedido;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(351, 262, 86, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtA?adir() {
		if (btA?adir == null) {
			btA?adir = new JButton("A\u00F1adir");
			btA?adir.setBackground(new Color(50, 205, 50));
			btA?adir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btA?adir.setBounds(414, 203, 89, 23);
		}
		return btA?adir;
	}
	private JLabel getLblUnidades() {
		if (lblUnidades == null) {
			lblUnidades = new JLabel("Unidades:");
			lblUnidades.setFont(new Font("Arial", Font.PLAIN, 14));
			lblUnidades.setBounds(351, 178, 86, 14);
		}
		return lblUnidades;
	}
	private JSpinner getSpinner() {
		if (spinner == null) {
			spinner = new JSpinner();
			spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
			spinner.setBounds(351, 204, 55, 22);
		}
		return spinner;
	}
}
