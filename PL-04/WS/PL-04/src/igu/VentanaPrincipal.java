package igu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Articulo;
import logica.Carta;
import logica.Pedido;

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
import javax.swing.DefaultComboBoxModel;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Carta carta;
	private Pedido pedido;
	private JPanel contentPane;
	private JLabel lblLogo;
	private JLabel lblMcDonalds;
	private JLabel lblArticulos;
	private JComboBox<Articulo> cbArticulos;
	private JButton btSiguiente;
	private JButton btCancelar;
	private JLabel lblPrecioPedido;
	private JTextField txPrecio;
	private JButton btAñadir;
	private JLabel lblUnidades;
	private JSpinner spinner;
	private JTextField txUnidades;
	private JLabel lbUnidades;


	/**
	 * Create the frame.
	 */
	public VentanaPrincipal(Carta carta, Pedido pedido) {
		this.carta = carta;
		this.pedido = pedido;
		setResizable(false);
		setTitle("McDonald\u00B4s Espa\u00F1a");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/img/logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 403);
		setLocationRelativeTo(null);
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
		contentPane.add(getTxPrecio());
		contentPane.add(getBtAñadir());
		contentPane.add(getLblUnidades());
		contentPane.add(getSpinner());
		contentPane.add(getTxUnidades());
		contentPane.add(getLbUnidades());
	}
	
	public Pedido getPedido() {
		return pedido;
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
	private JComboBox<Articulo> getCbArticulos() {
		if (cbArticulos == null) {
			cbArticulos = new JComboBox<Articulo>();
			cbArticulos.setModel(new DefaultComboBoxModel<Articulo>(carta.getArticulos()));
			cbArticulos.setBounds(30, 216, 296, 22);
		}
		return cbArticulos;
	}
	private JButton getBtSiguiente() {
		if (btSiguiente == null) {
			btSiguiente = new JButton("Siguiente");
			btSiguiente.setEnabled(false);
			btSiguiente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarVentanaRegistro();
				}
			});
			btSiguiente.setBackground(new Color(50, 205, 50));
			btSiguiente.setBounds(351, 313, 89, 23);
		}
		return btSiguiente;
	}
	private JButton getBtCancelar() {
		if (btCancelar == null) {
			btCancelar = new JButton("Cancelar");
			btCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
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
	private JTextField getTxPrecio() {
		if (txPrecio == null) {
			txPrecio = new JTextField();
			txPrecio.setEditable(false);
			txPrecio.setBounds(351, 262, 86, 20);
			txPrecio.setColumns(10);
		}
		return txPrecio;
	}
	private JButton getBtAñadir() {
		if (btAñadir == null) {
			btAñadir = new JButton("A\u00F1adir");
			btAñadir.setBackground(new Color(50, 205, 50));
			btAñadir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addPedido();
				}
			});
			btAñadir.setBounds(414, 203, 89, 23);
		}
		return btAñadir;
	}
	
	private void addPedido() {
		pedido.add((Articulo)getCbArticulos().getSelectedItem(), (Integer)getSpinner().getValue());
		String precio = String.format("%.2f", pedido.getTotal());
		getTxPrecio().setText(precio + " \u20AC");
		int aux = Integer.parseInt(getTxUnidades().getText());
//		int spinnerAm = Integer.parseInt(getSpinner().getValue());
//		int unidades = String.valueOf(aux + Integer.parseInt(getSpinner().getValue()));
		getTxUnidades().setText(String.valueOf(aux + (int)getSpinner().getValue()));
		if (!getBtSiguiente().isEnabled()) {
			getBtSiguiente().setEnabled(true);
		}
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
			spinner.setModel(new SpinnerNumberModel(1, 1, null, 1));
			spinner.setBounds(351, 204, 55, 22);
		}
		return spinner;
	}
	
	private void mostrarVentanaRegistro() {
		VentanaRegistro frame = new VentanaRegistro(this);
		frame.setLocationRelativeTo(null); // lo que hace esto es centrar la ventana respeto al componente pasado como parametro
		frame.setModal(true); // lo que hace esto es que la ventana anterior no pueda ser editada
		frame.setVisible(true);
	}
	private JTextField getTxUnidades() {
		if (txUnidades == null) {
			txUnidades = new JTextField();
			txUnidades.setEditable(false);
			txUnidades.setBounds(471, 262, 86, 20);
			txUnidades.setColumns(10);
		}
		return txUnidades;
	}
	private JLabel getLbUnidades() {
		if (lbUnidades == null) {
			lbUnidades = new JLabel("Unidades:");
			lbUnidades.setFont(new Font("Arial", Font.PLAIN, 14));
			lbUnidades.setBounds(470, 238, 69, 14);
		}
		return lbUnidades;
	}
}
