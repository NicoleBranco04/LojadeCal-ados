package br.com.lojacalcados.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;

public class TelaFuncionario extends JFrame {
	private JTextField txtNomeFun;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	public TelaFuncionario() {
		getContentPane().setLayout(null);
		
		JPanel pnlDP = new JPanel();
		pnlDP.setLayout(null);
		pnlDP.setBounds(31, 196, 432, 208);
		getContentPane().add(pnlDP);
		
		JLabel lblNomeFuncionario = new JLabel("Nome do Funcion\u00E1rio:");
		lblNomeFuncionario.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeFuncionario.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNomeFuncionario.setBounds(10, 11, 129, 14);
		pnlDP.add(lblNomeFuncionario);
		
		JLabel lblCpf = new JLabel("CPF do Funcion\u00E1rio:");
		lblCpf.setHorizontalAlignment(SwingConstants.LEFT);
		lblCpf.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblCpf.setBounds(10, 37, 129, 14);
		pnlDP.add(lblCpf);
		
		JLabel lblDN = new JLabel("Data de Nascimento:");
		lblDN.setHorizontalAlignment(SwingConstants.LEFT);
		lblDN.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblDN.setBounds(10, 62, 129, 14);
		pnlDP.add(lblDN);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSexo.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblSexo.setBounds(10, 87, 46, 18);
		pnlDP.add(lblSexo);
		
		txtNomeFun = new JTextField();
		txtNomeFun.setColumns(10);
		txtNomeFun.setBounds(176, 11, 156, 20);
		pnlDP.add(txtNomeFun);
		
		JFormattedTextField txtCPF = new JFormattedTextField((AbstractFormatter) null);
		txtCPF.setBounds(176, 37, 156, 20);
		pnlDP.add(txtCPF);
		
		JFormattedTextField txtDataNascimento = new JFormattedTextField((AbstractFormatter) null);
		txtDataNascimento.setBounds(176, 62, 87, 20);
		pnlDP.add(txtDataNascimento);
		
		JComboBox cboSexo = new JComboBox();
		cboSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Outros"}));
		cboSexo.setBounds(176, 87, 74, 18);
		pnlDP.add(cboSexo);
		
		JPanel pnlContato = new JPanel();
		pnlContato.setLayout(null);
		pnlContato.setBounds(541, 196, 432, 208);
		getContentPane().add(pnlContato);
		
		JLabel lblTR = new JLabel("Telefone Resid\u00EAncial:");
		lblTR.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTR.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTR.setBounds(10, 11, 126, 21);
		pnlContato.add(lblTR);
		
		JLabel lblTCE = new JLabel("Telefone Celular:");
		lblTCE.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTCE.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTCE.setBounds(10, 34, 126, 21);
		pnlContato.add(lblTCE);
		
		JLabel lblTCOR = new JLabel("Telefone Cormecial:");
		lblTCOR.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTCOR.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTCOR.setBounds(10, 60, 126, 21);
		pnlContato.add(lblTCOR);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblEmail.setBounds(10, 84, 113, 21);
		pnlContato.add(lblEmail);
		
		JFormattedTextField txtTResidencial = new JFormattedTextField((AbstractFormatter) null);
		txtTResidencial.setBounds(146, 11, 113, 20);
		pnlContato.add(txtTResidencial);
		
		JFormattedTextField txtTCelular = new JFormattedTextField((AbstractFormatter) null);
		txtTCelular.setBounds(146, 34, 113, 20);
		pnlContato.add(txtTCelular);
		
		JFormattedTextField txtTComercial = new JFormattedTextField((AbstractFormatter) null);
		txtTComercial.setBounds(146, 60, 113, 20);
		pnlContato.add(txtTComercial);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(147, 84, 112, 20);
		pnlContato.add(textField_1);
		
		JPanel pnlEndereco = new JPanel();
		pnlEndereco.setLayout(null);
		pnlEndereco.setBounds(21, 454, 647, 119);
		getContentPane().add(pnlEndereco);
		
		JLabel lbltipo = new JLabel("Tipo de logradouro:");
		lbltipo.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lbltipo.setBounds(10, 11, 114, 14);
		pnlEndereco.add(lbltipo);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNumero.setBounds(10, 61, 83, 14);
		pnlEndereco.add(lblNumero);
		
		JLabel lblcomplemto = new JLabel("Complemento:");
		lblcomplemto.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblcomplemto.setBounds(10, 86, 114, 14);
		pnlEndereco.add(lblcomplemto);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblCep.setBounds(341, 11, 114, 14);
		pnlEndereco.add(lblCep);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setHorizontalAlignment(SwingConstants.LEFT);
		lblBairro.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblBairro.setBounds(341, 36, 114, 14);
		pnlEndereco.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setHorizontalAlignment(SwingConstants.LEFT);
		lblCidade.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblCidade.setBounds(341, 61, 114, 14);
		pnlEndereco.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstado.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblEstado.setBounds(341, 86, 114, 14);
		pnlEndereco.add(lblEstado);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(123, 58, 108, 20);
		pnlEndereco.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(123, 83, 108, 20);
		pnlEndereco.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(401, 33, 196, 20);
		pnlEndereco.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(401, 58, 196, 20);
		pnlEndereco.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(401, 83, 108, 20);
		pnlEndereco.add(textField_6);
		
		JComboBox cboTipo = new JComboBox();
		cboTipo.setBounds(123, 7, 108, 22);
		pnlEndereco.add(cboTipo);
		
		JFormattedTextField txtCEP = new JFormattedTextField((AbstractFormatter) null);
		txtCEP.setBounds(401, 8, 108, 20);
		pnlEndereco.add(txtCEP);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblLogradouro.setBounds(10, 36, 83, 14);
		pnlEndereco.add(lblLogradouro);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(123, 33, 108, 20);
		pnlEndereco.add(textField_7);
		
		JPanel pnlTitulo = new JPanel();
		pnlTitulo.setLayout(null);
		pnlTitulo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pnlTitulo.setBackground(new Color(102, 102, 102));
		pnlTitulo.setBounds(10, 11, 970, 144);
		getContentPane().add(pnlTitulo);
		
		JLabel lblicone = new JLabel("");
		lblicone.setIcon(new ImageIcon("C:\\Users\\nicole.agbranco.SENACEDU\\Documents\\LojaCalcados\\imagens\\carteira-de-identidade.png"));
		lblicone.setBounds(10, 11, 149, 122);
		pnlTitulo.add(lblicone);
		
		JLabel lblFuncionarios = new JLabel("Gerenciar Funcionarios");
		lblFuncionarios.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblFuncionarios.setBounds(209, 32, 162, 78);
		pnlTitulo.add(lblFuncionarios);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\nicole.agbranco.SENACEDU\\Documents\\LojaCalcados\\imagens\\salve-.png"));
		btnSalvar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnSalvar.setBounds(628, 38, 126, 71);
		pnlTitulo.add(btnSalvar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\nicole.agbranco.SENACEDU\\Documents\\LojaCalcados\\imagens\\lupa.png"));
		btnConsultar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnConsultar.setBounds(812, 38, 132, 71);
		pnlTitulo.add(btnConsultar);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFuncionario frame = new TelaFuncionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

