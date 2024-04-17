import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

import usuario.Usuario;

public class Login {
	
	private Usuario usuario = Cadastro.usuario;
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private String names[] = {"ImagemLogin2.png"};
    private Icon icons[] = {new ImageIcon(Login.class.getResource(names[0]))};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Nome da empresa");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 414, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setBounds(10, 35, 44, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setBounds(10, 60, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(10, 84, 414, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Senha:");
		lblNewLabel_3.setBounds(10, 115, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 140, 414, 20);
		frame.getContentPane().add(passwordField);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Esqueceu sua senha?");
		tglbtnNewToggleButton.setBounds(10, 171, 159, 23);
		frame.getContentPane().add(tglbtnNewToggleButton);
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				EsqueceuSuaSenha esqueceuSenha = new EsqueceuSuaSenha();
				esqueceuSenha.main(null);
			}
			
		});
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			String email = textField.getText();
			String senha = passwordField.getText();
			
			if(email.contentEquals(usuario.getEmail())) {
				if(senha.contentEquals(usuario.getSenha())) {
					frame.dispose();
					PaginaInicial mainPG = new PaginaInicial();	
				}else {
					JOptionPane.showMessageDialog(frame, "Senha Incorreta!!");
				}
			}else {
				JOptionPane.showMessageDialog(frame, "Email Incorreta!!");
			}
			}			
		});
		btnNewButton.setBounds(96, 205, 105, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCadastrese = new JButton("Cadastre-se");
		btnCadastrese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.dispose();
			Cadastro cadastro = new Cadastro();
			
			}
		});
		
		btnCadastrese.setBounds(223, 205, 105, 45);
		frame.getContentPane().add(btnCadastrese);
		
		 JLabel labelImage = new JLabel();
         labelImage.setBounds(-44, -53, 478, 421);
         frame.getContentPane().add(labelImage);
         
                 // Set the icon for the label
                 labelImage.setIcon(icons[0]);
	}



}
