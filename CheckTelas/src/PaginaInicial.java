import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PaginaInicial extends JFrame {

	private JFrame frame;
	private String names[] = { "drone2.jpg", "celula2.jpg", "computador.jpg", "avatarHomem.png" };
	private Icon icons[] = { new ImageIcon(Cadastro.class.getResource(names[0])),
			new ImageIcon(Cadastro.class.getResource(names[1])), new ImageIcon(Cadastro.class.getResource(names[2])),
			new ImageIcon(Cadastro.class.getResource(names[3])) };
	private final JPanel fotoPerfil = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaInicial window = new PaginaInicial();
					window.frame.setVisible(true);
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
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("NOME");
		lblNewLabel.setBounds(1407, 39, 41, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("CONTA BASICA");
		lblNewLabel_1.setBounds(1344, 64, 104, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_1);

		JPanel compra1 = new JPanel();
		compra1.setBounds(60, 274, 380, 248);
		frame.getContentPane().add(compra1);

		// imagem drone
		JLabel labelImageDrone = new JLabel();
		compra1.add(labelImageDrone);

		// Set the icon for the label
		labelImageDrone.setIcon(icons[0]);

//		frame.setSize(new Dimension(450, 300));
//		frame.setLocationRelativeTo(null);
//		frame.setVisible(true);

		JPanel compra2 = new JPanel();
		compra2.setBounds(578, 274, 380, 248);
		frame.getContentPane().add(compra2);

		// imagem celular
		JLabel labelImageCel = new JLabel();
		compra2.add(labelImageCel);

		// Set the icon for the label
		labelImageCel.setIcon(icons[1]);

//		frame.setSize(new Dimension(450, 300));
//		frame.setLocationRelativeTo(null);
//		frame.setVisible(true);

		JPanel compra3 = new JPanel();
		compra3.setBounds(1132, 274, 380, 248);
		frame.getContentPane().add(compra3);

		// imagem placa de video
		JLabel labelImagePlaca = new JLabel();
		compra3.add(labelImagePlaca);

		// Set the icon for the label
		labelImagePlaca.setIcon(icons[2]);

		JLabel lblNewLabel_2 = new JLabel("SUAS COMPRAS:");
		lblNewLabel_2.setBounds(628, 169, 182, 29);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		frame.getContentPane().add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Rastrear Pacote");
		btnNewButton.setBounds(138, 533, 203, 36);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton);

		JButton btnDevolucaoReembolso = new JButton("Devolucao / Reembolso");
		btnDevolucaoReembolso.setBounds(138, 580, 203, 36);
		btnDevolucaoReembolso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDevolucaoReembolso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnDevolucaoReembolso);

		JButton btnVerOSeu = new JButton("Ver o seu item");
		btnVerOSeu.setBounds(138, 627, 203, 36);
		btnVerOSeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerOSeu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnVerOSeu);

		JButton btnVerOSeu_1 = new JButton("Ver o seu item");
		btnVerOSeu_1.setBounds(664, 627, 203, 36);
		btnVerOSeu_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnVerOSeu_1);

		JButton btnDevolucaoReembolso_1 = new JButton("Devolucao / Reembolso");
		btnDevolucaoReembolso_1.setBounds(664, 580, 203, 36);
		btnDevolucaoReembolso_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnDevolucaoReembolso_1);

		JButton btnNewButton_1 = new JButton("Rastrear Pacote");
		btnNewButton_1.setBounds(664, 533, 203, 36);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnNewButton_1);

		JButton btnVerOSeu_2 = new JButton("Ver o seu item");
		btnVerOSeu_2.setBounds(1229, 627, 203, 36);
		btnVerOSeu_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnVerOSeu_2);

		JButton btnDevolucaoReembolso_2 = new JButton("Devolucao / Reembolso");
		btnDevolucaoReembolso_2.setBounds(1229, 580, 203, 36);
		btnDevolucaoReembolso_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnDevolucaoReembolso_2);

		JButton btnNewButton_2 = new JButton("Rastrear Pacote");
		btnNewButton_2.setBounds(1229, 533, 203, 36);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Continuar Comprando...");
		btnNewButton_3.setBounds(1314, 780, 188, 43);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton_3);

		JLabel labelImagefpf = new JLabel();
		fotoPerfil.setBounds(1476, 26, 104, 88);
		frame.getContentPane().add(fotoPerfil);
		fotoPerfil.add(labelImagefpf);

		// imagem perfil
		JLabel labelImageFotoPerf = new JLabel();
		fotoPerfil.add(labelImageFotoPerf);

		// Set the icon for the label
		labelImageFotoPerf.setIcon(icons[3]);

		// frame.setUndecorated(true);
		frame.setVisible(true);
	}
}
