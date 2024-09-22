package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JLogin extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin frame = new JLogin();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame
	 */
	
	public JLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(49, 62, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(71, 11, 284, 240);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuário");
		lblNewLabel.setBounds(27, 52, 46, 14);
		panel.add(lblNewLabel);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(27, 66, 192, 20);
		panel.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(27, 113, 46, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textFieldUsuario.getText() != null 
						&& !textFieldUsuario.getText().isEmpty()
						&& passwordField.getText() != null
						&& !passwordField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(btnNewButton, "Informações válidas");
				} else {
					JOptionPane.showMessageDialog(btnNewButton, "Verifique as informaçõse",
							                      "Aviso", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(76, 179, 106, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Bem vindo");
		lblNewLabel_2.setBounds(97, 11, 73, 14);
		panel.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(26, 127, 193, 20);
		panel.add(passwordField);
	}
}
