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
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

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
		setTitle("Inicio de administrador");
		setIconImage(Toolkit.getDefaultToolkit().getImage(fechagui.class.getResource("/Iconos/van.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 371);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnCambioJframe1 = new JButton("Acceder");
		btnCambioJframe1.setHorizontalAlignment(SwingConstants.LEFT);
		btnCambioJframe1.setIcon(new ImageIcon(fechagui.class.getResource("/Iconos/login (1).png")));
		btnCambioJframe1.setBackground(SystemColor.activeCaption);
		btnCambioJframe1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				String Usuario = "admin";
				String Contrasena="12345";
				
				String Pass = new String(passwordField.getPassword());
				
				if(textField.getText().equals(Usuario)&& Pass.equals(Contrasena) ) {
					
					fechagui2 RC = new fechagui2();
					RC.setVisible(true);
					dispose();
					
					
					
				}
				else {
					
					JOptionPane.showInputDialog(this, "Usuario o Contraseña Incorrectas");
				}

				
			}
			
			
			
		});
		btnCambioJframe1.setBounds(248, 275, 117, 29);
		btnCambioJframe1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnCambioJframe1);
		
		JLabel lbUsuario = new JLabel("Usuario");
		lbUsuario.setBounds(57, 130, 61, 16);
		contentPane.add(lbUsuario);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setBounds(57, 213, 85, 16);
		contentPane.add(lblContrasena);
		
		textField = new JTextField();
		textField.setBounds(181, 126, 257, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(181, 208, 257, 26);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("ADMINISTRADOR");
		lblNewLabel.setBounds(264, 25, 117, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(fechagui.class.getResource("/Iconos/LOGO.jpg")));
		lblNewLabel_1.setBounds(39, 8, 77, 66);
		contentPane.add(lblNewLabel_1);
	}
}
