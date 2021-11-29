package fecha;

import java.awt.BorderLayout;
import java.time.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class fechagui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fechagui frame = new fechagui();
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
	public fechagui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnCambioJframe1 = new JButton("Acceder");
		btnCambioJframe1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				String Usuario = "admin";
				String Contraseña="12345";
				
				String Pass = new String(passwordField.getPassword());
				
				if(textField.getText().equals(Usuario)&& Pass.equals(Contraseña) ) {
					
					RutaCombi RC = new RutaCombi();
					RC.setVisible(true);
					dispose();
					
					fechagui2 abrir = new fechagui2();
					abrir.setVisible(true);
					
				}
				else {
					
					JOptionPane.showInputDialog(this, "Usuario o Contraseña Incorrectas");
				}

				
			}
			
			
			
		});
		btnCambioJframe1.setBounds(223, 293, 117, 29);
		btnCambioJframe1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnCambioJframe1);
		
		JLabel lbUsuario = new JLabel("Usuario");
		lbUsuario.setBounds(57, 130, 61, 16);
		contentPane.add(lbUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setBounds(57, 213, 85, 16);
		contentPane.add(lblContraseña);
		
		textField = new JTextField();
		textField.setBounds(181, 125, 257, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(181, 208, 257, 26);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("ADMINISTRADOR");
		lblNewLabel.setBounds(231, 26, 124, 16);
		contentPane.add(lblNewLabel);
	}
}
