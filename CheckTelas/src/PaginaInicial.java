
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PaginaInicial extends JFrame {

	private JFrame frame;
	private String names[] = { "drone2.jpg", "avatarHomem.png", "celula2.jpg", "computador.jpg" };
	private Icon icons[] = { new ImageIcon(Cadastro.class.getResource(names[0])),
			new ImageIcon(Cadastro.class.getResource(names[1])), new ImageIcon(Cadastro.class.getResource(names[2])),
			new ImageIcon(Cadastro.class.getResource(names[3])) };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaInicial frame = new PaginaInicial();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PaginaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Suas compras:");
		lblNewLabel.setBounds(10, 91, 166, 14);
		frame.getContentPane().add(lblNewLabel);

		JPanel panel_compra1 = new JPanel();
		panel_compra1.setBounds(10, 127, 122, 89);
		frame.getContentPane().add(panel_compra1);

		//imagem drone
		JLabel labelImageDrone = new JLabel();
		panel_compra1.add(labelImageDrone);

		// Set the icon for the label
		labelImageDrone.setIcon(icons[0]);

		frame.setSize(new Dimension(450, 300));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		JButton btnNewButton = new JButton("Adicionar compras");
		btnNewButton.setBounds(278, 227, 146, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(265, 21, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Conta basica");
		lblNewLabel_2.setBounds(265, 46, 96, 14);
		frame.getContentPane().add(lblNewLabel_2);

		//imagem perfil
		JLabel labelImagepfp = new JLabel();
		labelImagepfp.setBounds(360, 11, 64, 64);
		frame.getContentPane().add(labelImagepfp);

		// Set the icon for the label
		labelImagepfp.setIcon(icons[1]);

		//imagem celular
		JPanel panel_compra2 = new JPanel();
		panel_compra2.setBounds(152, 127, 122, 89);
		frame.getContentPane().add(panel_compra2);

		JLabel labelImageCel = new JLabel();
		panel_compra2.add(labelImageCel);

		// Set the icon for the label
		labelImageCel.setIcon(icons[2]);

		JPanel labelImagemCel = new JPanel();
		labelImagemCel.setBounds(10, 127, 122, 89);
		frame.getContentPane().add(labelImagemCel);

		frame.setSize(new Dimension(450, 300));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		// imagem placa de video
		JPanel panel_compra3 = new JPanel();
		panel_compra3.setBounds(302, 127, 122, 89);
		frame.getContentPane().add(panel_compra3);

		JLabel labelImageComp = new JLabel();
		panel_compra3.add(labelImageComp);

		// Set the icon for the label
		labelImageComp.setIcon(icons[3]);

		frame.setSize(new Dimension(450, 300));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
