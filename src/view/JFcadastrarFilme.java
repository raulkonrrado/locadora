package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class JFcadastrarFilme extends JFrame {

	private JPanel contentPane;
	private JTextField txttitulo;
	private JTextField txtsinopse;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFcadastrarFilme frame = new JFcadastrarFilme();
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
	public JFcadastrarFilme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro ");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 24));
		lblNewLabel.setBounds(10, 11, 136, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EDtulo");
		lblNewLabel_1.setBounds(10, 60, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txttitulo = new JTextField();
		txttitulo.setBounds(10, 81, 451, 20);
		contentPane.add(txttitulo);
		txttitulo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Sinopse");
		lblNewLabel_2.setBounds(10, 112, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(117, 162, 2, 2);
		contentPane.add(scrollPane);
		
		txtsinopse = new JTextField();
		txtsinopse.setBounds(10, 137, 451, 76);
		contentPane.add(txtsinopse);
		txtsinopse.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(154, 181, 2, 2);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 137, 4, 22);
		contentPane.add(textArea);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(256, 196, 2, 2);
		contentPane.add(scrollPane_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(275, 177, 4, 22);
		contentPane.add(textArea_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(83, 181, 2, 2);
		contentPane.add(scrollPane_3);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(10, 137, 451, 76);
		contentPane.add(textArea_2);
		
		JLabel lblNewLabel_3 = new JLabel("Categoria");
		lblNewLabel_3.setBounds(10, 224, 75, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(10, 249, 146, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tempo");
		lblNewLabel_4.setBounds(10, 280, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(10, 305, 46, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel_5 = new JLabel("Imagem");
		lblNewLabel_5.setBounds(127, 280, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton btn2D = new JRadioButton("2D");
		btn2D.setBounds(127, 304, 41, 23);
		contentPane.add(btn2D);
		
		JRadioButton btn3D = new JRadioButton("3D");
		btn3D.setBounds(183, 304, 53, 23);
		contentPane.add(btn3D);
		
		ButtonGroup imagem = new ButtonGroup();
		imagem.add(btn3D);
		imagem.add(btn2D);
		
		JLabel lblNewLabel_6 = new JLabel("\u00C1udio");
		lblNewLabel_6.setBounds(285, 280, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JRadioButton rdbtnDublado = new JRadioButton("Dublado");
		rdbtnDublado.setBounds(285, 304, 76, 23);
		contentPane.add(rdbtnDublado);
		
		JRadioButton rdbtnLegendado = new JRadioButton("Legendado");
		rdbtnLegendado.setBounds(365, 304, 109, 23);
		contentPane.add(rdbtnLegendado);
		
		ButtonGroup audio = new ButtonGroup();
		audio.add(rdbtnLegendado);
		audio.add(rdbtnDublado);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(7, 348, 101, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(116, 348, 109, 23);
		contentPane.add(btnCancelar);
	}
}
