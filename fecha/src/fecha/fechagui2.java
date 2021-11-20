package fecha;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class fechagui2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fechagui2 frame = new fechagui2();
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
	public fechagui2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBaseUno = new JLabel("Base 1");
		lblBaseUno.setBounds(257, 40, 84, 25);
		contentPane.add(lblBaseUno);
		

		JLabel lblNewLabel = new JLabel("asasa");
		lblNewLabel.setBounds(238, 254, 255, 16);
		contentPane.add(lblNewLabel);
		
		ArrayList<LocalDateTime> tiempos = new ArrayList<LocalDateTime>();

		JButton btnReporte = new JButton("Reporte final");
		btnReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LocalDateTime ahora = LocalDateTime.now();
				tiempos.add(ahora);
				lblNewLabel.setText(ahora.toString());
				
			}
		});
		btnReporte.setBounds(213, 162, 117, 29);
		contentPane.add(btnReporte);
		
	}
}
