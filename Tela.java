import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;

public class Tela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public Tela() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		Data javaTree = new Data();

		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		Data data = new Data();

		JButton btnG208N = new JButton("G208N");
		JButton btnKAP302 = new JButton("KAP302");

		// OPÇÕES Prefixos
		JComboBox comboBoxPrefix = new JComboBox();
		comboBoxPrefix.setBounds(5, 54, 150, 31);
		comboBoxPrefix.setModel(new DefaultComboBoxModel(new String[] { "ATIVAÇÃO", "DINÂMICO" }));
		comboBoxPrefix.setFont(new Font("Txt_IV50", Font.BOLD, 15));
		comboBoxPrefix.setToolTipText("IPS");

		JLabel LabelSelectPrefix = new JLabel();
		LabelSelectPrefix.setFont(new Font("Txt_IV50", Font.PLAIN, 11));
		LabelSelectPrefix.setToolTipText("SELECTIPS");
		LabelSelectPrefix.setBounds(5, 79, 172, 14);
		contentPane.add(comboBoxPrefix);
		// Desabilitar o botão dificuldade
		LabelSelectPrefix.setEnabled(false);

		// OPÇÕES IP's
		JComboBox comboBoxIPS = new JComboBox();
		comboBoxIPS.setBounds(5, 104, 150, 31);
		comboBoxIPS.setModel(new DefaultComboBoxModel(new String[] { "192.168.0.XXX", "192.168.1.XXX", "192.168.2.XXX",
				"192.168.3.XXX", "192.168.100.XXX" }));
		comboBoxIPS.setFont(new Font("Txt_IV50", Font.BOLD, 15));
		comboBoxIPS.setToolTipText("IPS");

		JLabel LabelSelectIPS = new JLabel();
		LabelSelectIPS.setFont(new Font("Txt_IV50", Font.PLAIN, 11));
		LabelSelectIPS.setToolTipText("SELECTIPS");
		LabelSelectIPS.setBounds(5, 79, 172, 14);
		contentPane.add(comboBoxIPS);
		// Desabilitar o botão dificuldade
		LabelSelectIPS.setEnabled(false);

		// TÍTULO PARA DIGITAR IP
		JLabel lblTitleIp = new JLabel("Digite o IP:");
		lblTitleIp.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleIp.setFont(new Font("Txt_IV50", Font.PLAIN, 25));
		lblTitleIp.setBounds(262, 150, 278, 41);
		lblTitleIp.setToolTipText("TITLEIP");
		contentPane.setLayout(null);

		// DECLARAÇÃO txtIp's
		JTextField txtIp[] = new JTextField[4];
		txtIp[0] = new JTextField();
		txtIp[1] = new JTextField();
		txtIp[2] = new JTextField();
		txtIp[3] = new JTextField();

		// ÁREA PARA DIGITAR O IP1
		txtIp[0].setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
		txtIp[0].setForeground(Color.BLACK);
		txtIp[0].setBounds(50, 220, 100, 56);
		txtIp[0].setHorizontalAlignment(SwingConstants.CENTER);
		txtIp[0].setFont(new Font("Txt_IV50", Font.ITALIC, 30));
		txtIp[0].setToolTipText("IP");
		txtIp[0].setColumns(10);
		contentPane.add(txtIp[0]);

		// ÁREA PARA DIGITAR O IP2
		txtIp[1].setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
		txtIp[1].setForeground(Color.BLACK);
		txtIp[1].setBounds(150, 220, 100, 56);
		txtIp[1].setHorizontalAlignment(SwingConstants.CENTER);
		txtIp[1].setFont(new Font("Txt_IV50", Font.ITALIC, 30));
		txtIp[1].setToolTipText("IP");
		txtIp[1].setColumns(10);
		contentPane.add(txtIp[1]);

		// ÁREA PARA DIGITAR O IP3
		txtIp[2].setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
		txtIp[2].setForeground(Color.BLACK);
		txtIp[2].setBounds(250, 220, 100, 56);
		txtIp[2].setHorizontalAlignment(SwingConstants.CENTER);
		txtIp[2].setFont(new Font("Txt_IV50", Font.ITALIC, 30));
		txtIp[2].setToolTipText("IP");
		txtIp[2].setColumns(10);
		contentPane.add(txtIp[2]);

		// ÁREA PARA DIGITAR O IP4
		txtIp[3].setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
		txtIp[3].setForeground(Color.BLACK);
		txtIp[3].setBounds(350, 220, 100, 56);
		txtIp[3].setHorizontalAlignment(SwingConstants.CENTER);
		txtIp[3].setFont(new Font("Txt_IV50", Font.ITALIC, 30));
		txtIp[3].setToolTipText("IP");
		txtIp[3].setColumns(10);
		contentPane.add(txtIp[3]);

		G208N g208n = new G208N();
		KAP302 kap302 = new KAP302();

		// BOTÃO PARA CONFIRMAR IP OU PREFIXO
		JButton btnConfirm = new JButton("CONFIRMAR");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = "";
				String[] aux;
				List<String> ll = new LinkedList<String>();

				if (btnKAP302.isEnabled() && !btnG208N.isEnabled()) {
					try {
						data.CarregarKAP302();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}

					aux = text.split("[\n=]+");
					for (int i = 0; i < aux.length; i++) {
						ll.add(aux[i]);
					}

					if (comboBoxPrefix.isEnabled() == true) {
						if (comboBoxIPS.getSelectedItem() == "ATIVACAO") {
							kap302.alteradorAtivKAP302(txtIp[3], ll);
						} else {
						}
					} else {
						if (comboBoxIPS.getSelectedItem() == "192.168.0.XXX") {
							kap302.alteradorDinKAP302(0, txtIp, ll);
						} else if (comboBoxIPS.getSelectedItem() == "192.168.1.XXX") {
							kap302.alteradorDinKAP302(1, txtIp, ll);
						} else if (comboBoxIPS.getSelectedItem() == "192.168.2.XXX") {
							kap302.alteradorDinKAP302(2, txtIp, ll);
						} else if (comboBoxIPS.getSelectedItem() == "192.168.3.XXX") {
							kap302.alteradorDinKAP302(3, txtIp, ll);
						} else if (comboBoxIPS.getSelectedItem() == "192.168.100.XXX") {
							kap302.alteradorDinKAP302(4, txtIp, ll);
						}
					}

					String aux2 = "";
					try {
						data.excessao(aux, aux2, ll);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					try {
						data.CarregarG208N();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}

					aux = text.split("[\n=]+");
					for (int i = 0; i < aux.length; i++) {
						ll.add(aux[i]);
					}

					if (comboBoxPrefix.isEnabled() == true) {
						if (comboBoxIPS.getSelectedItem() == "ATIVACAO") {
							g208n.alteradorAtivG208N(txtIp[3], ll);
						}
					} else {
						if (comboBoxIPS.getSelectedItem() == "192.168.0.XXX") {
							g208n.alteradorDinG208N(0, txtIp, ll);
						} else if (comboBoxIPS.getSelectedItem() == "192.168.1.XXX") {
							g208n.alteradorDinG208N(1, txtIp, ll);
						} else if (comboBoxIPS.getSelectedItem() == "192.168.2.XXX") {
							g208n.alteradorDinG208N(2, txtIp, ll);
						} else if (comboBoxIPS.getSelectedItem() == "192.168.3.XXX") {
							g208n.alteradorDinG208N(3, txtIp, ll);
						} else if (comboBoxIPS.getSelectedItem() == "192.168.100.XXX") {
							g208n.alteradorDinG208N(4, txtIp, ll);
						}
					}

					String aux2 = "";
					try {
						data.excessao(aux, aux2, ll);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnConfirm.setBackground(new Color(154, 205, 50));
		btnConfirm.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnConfirm.setToolTipText("CONFIRM");
		btnConfirm.setBounds(364, 300, 128, 23);
		contentPane.add(btnConfirm);

		// Desabilitar o botão confirmar IP
		btnConfirm.setEnabled(false);
		txtIp[0].setEnabled(false);
		txtIp[1].setEnabled(false);
		txtIp[2].setEnabled(false);
		txtIp[3].setEnabled(false);

		// BOTÃO PARA CONFIRMAR QUAL IP
		JButton btnConfirmIP = new JButton("CONFIRMAR");
		btnConfirmIP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIp[0].setText(comboBoxIPS.getSelectedItem().toString().substring(0, 3));
				txtIp[1].setText(comboBoxIPS.getSelectedItem().toString().substring(4, 7));
				txtIp[2].setText(comboBoxIPS.getSelectedItem().toString().substring(8, 9));

				if (comboBoxPrefix.isEnabled() == true) {
					// Habilitar o botão confirmar IP
					txtIp[3].setEnabled(true);
					btnConfirm.setEnabled(true);
				} else {
					// Habilitar o botão confirmar IP
					btnConfirm.setEnabled(true);
					txtIp[0].setEnabled(true);
					txtIp[1].setEnabled(true);
					txtIp[2].setEnabled(true);
					txtIp[3].setEnabled(true);
				}
			}
		});
		btnConfirmIP.setBackground(new Color(154, 205, 50));
		btnConfirmIP.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnConfirmIP.setToolTipText("CONFIRM");
		btnConfirmIP.setBounds(25, 150, 128, 23);
		contentPane.add(btnConfirmIP);

		JButton btnPrefix = new JButton(" ");
		JButton btnDin = new JButton(" ");

		// BOTÃO HABILITAR BOTÃO PREFIXO
		btnPrefix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxIPS.setEnabled(false);
				comboBoxPrefix.setEnabled(true);
			}
		});
		btnPrefix.setBackground(new Color(154, 205, 50));
		btnPrefix.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnPrefix.setToolTipText(" ");
		btnPrefix.setBounds(160, 55, 25, 25);
		contentPane.add(btnPrefix);

		// BOTÃO HABILITAR BOTÃO DINÂNIMCO
		btnDin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxIPS.setEnabled(true);
				comboBoxPrefix.setEnabled(false);
			}
		});
		btnDin.setBackground(new Color(154, 205, 50));
		btnDin.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnDin.setToolTipText(" ");
		btnDin.setBounds(160, 105, 25, 25);
		contentPane.add(btnDin);

		// BOTÃO G208N
		btnG208N.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConfirmIP.setEnabled(true);
				comboBoxPrefix.setEnabled(true);
				btnDin.setEnabled(true);
				txtIp[3].setEnabled(true);
				btnPrefix.setEnabled(true);
				btnDin.setEnabled(true);
			}
		});
		btnG208N.setBackground(new Color(154, 205, 50));
		btnG208N.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnG208N.setToolTipText("CONFIRM");
		btnG208N.setBounds(450, 50, 128, 23);
		contentPane.add(btnG208N);

		// BOTÃO KAP302
		btnKAP302.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConfirmIP.setEnabled(true);
				comboBoxPrefix.setEnabled(true);
				btnDin.setEnabled(true);
				txtIp[3].setEnabled(true);
				btnPrefix.setEnabled(true);
				btnDin.setEnabled(true);
			}
		});
		btnKAP302.setBackground(new Color(154, 205, 50));
		btnKAP302.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnKAP302.setToolTipText("CONFIRM");
		btnKAP302.setBounds(250, 50, 128, 23);
		contentPane.add(btnKAP302);

		// Desabilitar todas as opções
		btnConfirmIP.setEnabled(false);
		comboBoxPrefix.setEnabled(false);
		comboBoxIPS.setEnabled(false);
		btnPrefix.setEnabled(false);
		btnDin.setEnabled(false);

	}

}
