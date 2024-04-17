
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import usuario.Usuario;


public class Cadastro extends JFrame {
	
	public Usuario usuario = new Usuario(" ", " ", " ");
	private JFrame frame;
	private JFrame frame2;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private String names[] = { "cadastrarLogin.png" };
	private Icon icons[] = { new ImageIcon(Cadastro.class.getResource(names[0])) };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
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
		frame.setResizable(false);

		JLabel lblNewLabel = new JLabel("Cadastre-se");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nome Completo:");
		lblNewLabel_1.setBounds(10, 55, 190, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(10, 73, 206, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setBounds(10, 104, 155, 14);
		frame.getContentPane().add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 127, 206, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Senha:");
		lblNewLabel_3.setBounds(10, 158, 155, 14);
		frame.getContentPane().add(lblNewLabel_3);

		passwordField = new JPasswordField();
		passwordField.setBounds(10, 173, 206, 20);
		frame.getContentPane().add(passwordField);

		JButton btnNewButton = new JButton("Cadastre-se");
		btnNewButton.setBounds(274, 227, 150, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = textField.getText();
				String email = textField_1.getText();
				String senha = passwordField.getPassword().toString();
			
				usuario.setNome(nome);
				usuario.setEmail(email);
				usuario.setSenha(senha);
				
				frame.dispose();
				Login login = new Login();
				login.main(null);
				
			}
			
		});
		JLabel labelImage = new JLabel();
		labelImage.setBounds(318, 29, 106, 108);
		frame.getContentPane().add(labelImage);

		// Set the icon for the label
		labelImage.setIcon(icons[0]);

		frame.setSize(new Dimension(450, 300));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	
	}
}
