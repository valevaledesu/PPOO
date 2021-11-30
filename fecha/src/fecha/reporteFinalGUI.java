package fecha;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.UIManager;
import java.awt.Font;
import java.time.LocalTime;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;

public class reporteFinalGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldGeneradoPor;
	private JTextField textField_1;
	private Combi arrayCombis[];
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combi[] combis = new Combi[6];
					
					reporteFinalGUI frame = new reporteFinalGUI(combis);
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
	
	//Constructor del jframe que resibe el array de combis
	public reporteFinalGUI(Combi arrayCombis[]) {
		ArrayList<LocalTime> tiempos = new ArrayList<LocalTime>();
		LocalTime ahora = LocalTime.now();
		tiempos.add(ahora);
		
		//Guarda el array de combis que nos mando fechagui2 en el array local de la línea 23
		this.arrayCombis = arrayCombis;
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
		
		textFieldGeneradoPor = new JTextField();
		textFieldGeneradoPor.setEditable(false);
		textFieldGeneradoPor.setBounds(194, 63, 168, 26);
		contentPane.add(textFieldGeneradoPor);
		textFieldGeneradoPor.setColumns(10);
		textFieldGeneradoPor.setText("admin");
		
		JLabel lblNewLabel_1 = new JLabel("a las:");
		lblNewLabel_1.setBounds(374, 68, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(417, 63, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setText(ahora.toString().substring(0, 5));
		
		
		String[] columnas = {"Conductor", "Llegada", "Salida", "Ruta", "Tiempo"};
		String[][] filas = {{arrayCombis[0].getConductor(), arrayCombis[0].getLlegada(), 
			arrayCombis[0].getSalida(), arrayCombis[0].getRuta(), String.valueOf(arrayCombis[0].getTiempo())}};
		
		DefaultTableModel tableModel = new DefaultTableModel();
		tableModel.addColumn("Nombre");
		
		JButton btnExcel = new JButton("Imprimir como Excel");
		btnExcel.setBounds(441, 335, 161, 29);
		contentPane.add(btnExcel);
		
		JButton btnPDF = new JButton("Imprimir como PDF");
		btnPDF.setBounds(31, 335, 168, 29);
		contentPane.add(btnPDF);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{arrayCombis[0].getConductor(), arrayCombis[0].getLlegada(), 
					arrayCombis[0].getSalida(), arrayCombis[0].getRuta(), String.valueOf(arrayCombis[0].getTiempo())},
				{arrayCombis[1].getConductor(), arrayCombis[1].getLlegada(), 
						arrayCombis[1].getSalida(), arrayCombis[1].getRuta(), String.valueOf(arrayCombis[1].getTiempo())},
				{arrayCombis[2].getConductor(), arrayCombis[2].getLlegada(), 
							arrayCombis[2].getSalida(), arrayCombis[2].getRuta(), String.valueOf(arrayCombis[2].getTiempo())},
				{arrayCombis[3].getConductor(), arrayCombis[3].getLlegada(), 
								arrayCombis[3].getSalida(), arrayCombis[3].getRuta(), String.valueOf(arrayCombis[3].getTiempo())},
				{arrayCombis[4].getConductor(), arrayCombis[4].getLlegada(), 
									arrayCombis[4].getSalida(), arrayCombis[4].getRuta(), String.valueOf(arrayCombis[4].getTiempo())},
				{arrayCombis[5].getConductor(), arrayCombis[5].getLlegada(), 
										arrayCombis[5].getSalida(), arrayCombis[5].getRuta(), String.valueOf(arrayCombis[5].getTiempo())},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(47, 115, 500, 166);
		contentPane.add(table);
	}
}
