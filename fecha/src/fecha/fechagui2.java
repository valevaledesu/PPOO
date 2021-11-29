package fecha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class fechagui2 extends JFrame {

	private Combi arrayCombis[]= new Combi[7] ;
	private ruta arrayRuta[]= new ruta[2] ;
	private JPanel contentPane;
	private JTextField tfruta;
	private JTextField tfcombi;
	private JTextField textconductor;
	private JTextField textllegada;
	private JTextField textsalida;
	private JTextField texttiempo;
	private JTextField textruta;
	private boolean x= false;


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


	
	 
	 
	public fechagui2() {
		arrayCombis[1]= new Combi ("Conductor ", 1, null, null,0, 1, "Ruta norte");
		arrayCombis[2]= new Combi ("Conductor2", 2, null, null,0, 1, "Ruta norte");
		arrayCombis[3]= new Combi ("Conductor3", 3, null, null,0, 1, "Ruta norte");
		arrayCombis[4]= new Combi ("Conductor4", 4, null, null,0, 2, "Ruta sur");
		arrayCombis[5]= new Combi ("Conductor5", 5, null, null,0, 2, "Ruta sur");
		arrayCombis[6]= new Combi ("Conductor6", 6, null, null,0, 2, "Ruta sur");
		arrayRuta[0]=new ruta(1,"Ruta norte");
		arrayRuta[0]=new ruta(2,"Ruta sur");

			
		 
	        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(353, 18, 157, 16);
		contentPane.add(lblNewLabel);
		
		ArrayList<LocalTime> tiempos = new ArrayList<LocalTime>();

		JButton btnSalida = new JButton("Salida");
		btnSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				LocalTime ahora = LocalTime.now();
				tiempos.add(ahora);
					
					btnSalida.setEnabled(false);
				

				try {
				int combiident=Integer.parseInt(tfcombi.getText());
				arrayCombis[combiident].setSalida(ahora.toString());
				textsalida.setText(arrayCombis[combiident].getSalida());
				lblNewLabel.setText("Se registro la hora: " +ahora.toString()+ " salida");
				x=true;
				} catch (Exception ArrayIndexOutOfBoundsException){
					JOptionPane.showMessageDialog(null, "No ingreso numero de combi");
				}
			}
		});
		btnSalida.setBounds(347, 49, 117, 29);
		contentPane.add(btnSalida);
		
		JLabel lblNewLabel_1 = new JLabel("Ruta: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(18, 102, 45, 16);
		contentPane.add(lblNewLabel_1);
		
		tfruta = new JTextField();
		tfruta.setEditable(false);
		tfruta.setBounds(61, 100, 109, 19);
		contentPane.add(tfruta);
		tfruta.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Combi: ");
		lblNewLabel_2.setBounds(201, 134, 88, 13);
		contentPane.add(lblNewLabel_2);
		
		tfcombi = new JTextField();
		tfcombi.setEditable(false);
		tfcombi.setBounds(61, 130, 45, 19);
		contentPane.add(tfcombi);
		tfcombi.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Registrar hora de: ");
		lblNewLabel_3.setBounds(441, 18, 128, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnLlegada = new JButton("Llegada");
		btnLlegada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LocalTime ahora = LocalTime.now();
				tiempos.add(ahora);
				try {
					int combiident=Integer.parseInt(tfcombi.getText());
					arrayCombis[combiident].setLlegada(ahora.toString());
					textllegada.setText(arrayCombis[combiident].getLlegada());
					lblNewLabel.setText("Se registro la hora: " +ahora.toString()+ " llegada");

					} catch (Exception ArrayIndexOutOfBoundsException){		
						JOptionPane.showMessageDialog(null, "No ingreso número de combi");
}
				btnLlegada.setEnabled(false);
			}
		});
		btnLlegada.setBounds(464, 49, 117, 29);
		contentPane.add(btnLlegada);
		
		JButton btnReporte = new JButton("Generar Reporte Final");
		btnReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int combiident=Integer.parseInt(tfcombi.getText());
				textconductor.setText(arrayCombis[combiident].getConductor());
				textllegada.setText(arrayCombis[combiident].getLlegada());
				textsalida.setText(arrayCombis[combiident].getSalida());
				textruta.setText(arrayCombis[combiident].getRuta());
				texttiempo.setText(String.valueOf(arrayCombis[combiident].getTiempo()));
			}
		});
		btnReporte.setBounds(138, 372, 176, 29);
		contentPane.add(btnReporte);
		
		textconductor = new JTextField();
		textconductor.setBounds(309, 187, 117, 17);
		contentPane.add(textconductor);
		textconductor.setColumns(10);
		
		textllegada = new JTextField();
		textllegada.setBounds(309, 267, 66, 17);
		contentPane.add(textllegada);
		textllegada.setColumns(10);
		
		textsalida = new JTextField();
		textsalida.setBounds(309, 237, 66, 17);
		contentPane.add(textsalida);
		textsalida.setColumns(10);
		
		texttiempo = new JTextField();
		texttiempo.setBounds(309, 292, 66, 17);
		contentPane.add(texttiempo);
		texttiempo.setColumns(10);
		
		textruta = new JTextField();
		textruta.setBounds(309, 212, 66, 17);
		contentPane.add(textruta);
		textruta.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Conductor");
		lblNewLabel_4.setBounds(201, 190, 83, 11);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Ruta");
		lblNewLabel_4_1.setBounds(201, 215, 83, 11);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Hora de llegada");
		lblNewLabel_4_2.setBounds(201, 270, 100, 11);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Hora de salida");
		lblNewLabel_4_3.setBounds(201, 240, 100, 11);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Tiempo de ruta");
		lblNewLabel_4_4.setBounds(201, 295, 100, 11);
		contentPane.add(lblNewLabel_4_4);
		
		
	
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfcombi.setText(comboBox.getSelectedItem().toString());
				limpiaControles();
				lblNewLabel.setText("Registro");
				tfruta.setText(arrayCombis[Integer.parseInt(comboBox.getSelectedItem().toString())].getRuta());
				int combiident=Integer.parseInt(tfcombi.getText());
				textconductor.setText(arrayCombis[combiident].getConductor());
				textllegada.setText(arrayCombis[combiident].getLlegada());
				textsalida.setText(arrayCombis[combiident].getSalida());
				textruta.setText(arrayCombis[combiident].getRuta());
				texttiempo.setText(String.valueOf(arrayCombis[combiident].getTiempo()));
			}
		});
		comboBox.setBounds(250, 132, 45, 19);
		contentPane.add(comboBox);
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3"); 
		comboBox.addItem("4"); 
		comboBox.addItem("5"); 
		comboBox.addItem("6");
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(32, 34, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textsalida.setText("");
				textllegada.setText("");
				btnLlegada.setEnabled(true);
				btnSalida.setEnabled(true);
				
				
			}
		});
		btnActualizar.setBounds(381, 372, 117, 29);
		contentPane.add(btnActualizar);
		
		
		
	
	
	}
	
	private void limpiaControles() {
		textconductor.setText("");
		textllegada.setText("");
		textsalida.setText("");
		texttiempo.setText("");
		textruta.setText("");

			}
}
