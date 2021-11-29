package fecha;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;

public class reporteFinalGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable table_Reporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reporteFinalGUI frame = new reporteFinalGUI();
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
	public reporteFinalGUI() {
		setFont(new Font("Apple Symbols", Font.PLAIN, 12));
		setForeground(UIManager.getColor("TextPane.selectionBackground"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 406);
		contentPane = new JPanel();
		contentPane.setForeground(UIManager.getColor("TextPane.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reporte generado por:");
		lblNewLabel.setBounds(47, 68, 160, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(194, 63, 168, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("a las:");
		lblNewLabel_1.setBounds(374, 68, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(417, 63, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		table = new JTable();
		table.setBounds(96, 308, 352, -145);
		contentPane.add(table);
		
		table_Reporte = new JTable();
		table_Reporte.setForeground(UIManager.getColor("TextField.selectionBackground"));
		table_Reporte.setBounds(68, 123, 489, 189);
		contentPane.add(table_Reporte);
		
		JButton btnExcel = new JButton("Imprimir como Excel");
		btnExcel.setBounds(441, 335, 161, 29);
		contentPane.add(btnExcel);
		
		JButton btnPDF = new JButton("Imprimir como PDF");
		btnPDF.setBounds(31, 335, 168, 29);
		contentPane.add(btnPDF);
	}
}
