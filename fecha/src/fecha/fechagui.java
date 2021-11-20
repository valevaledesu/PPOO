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

public class fechagui extends JFrame {

	private JPanel contentPane;

	
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
		contentPane.setLayout(null);
		
		JButton btnCambioJframe1 = new JButton("Bases");
		btnCambioJframe1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fechagui2 abrir = new fechagui2();
				abrir.setVisible(true);
				
			}
		});
		btnCambioJframe1.setBounds(62, 161, 117, 29);
		contentPane.add(btnCambioJframe1);
	}
}
