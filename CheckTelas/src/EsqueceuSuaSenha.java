import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import usuario.Usuario;

public class EsqueceuSuaSenha {
	
	private Usuario usuario = Cadastro.usuario;
	private JFrame frame;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EsqueceuSuaSenha window = new EsqueceuSuaSenha();
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
	public EsqueceuSuaSenha() {
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
		
		JLabel lblNewLabel = new JLabel("Esqueceu sua senha?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 414, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Recuperação de senha:");
		lblNewLabel_1.setBounds(10, 28, 324, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Digite sua nova senha:");
		lblNewLabel_2.setBounds(10, 53, 294, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 78, 414, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Digite novamente:");
		lblNewLabel_3.setBounds(10, 109, 272, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(10, 134, 414, 20);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnNewButton = new JButton("Cadastre nova senha");
		btnNewButton.setBounds(248, 227, 176, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				String senha = passwordField.getText();
				String senhaConf =passwordField_1.getText();

				if(senha.contentEquals(senhaConf)) {
					usuario.setSenha(senhaConf);
				}
	
//				Login login = new Login();
//				login.main(null);
			}
			
		});
	}

}