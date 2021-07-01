package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import model.SQLiteJDBC;
//import javax.swing.UIManager;

public class Simulador extends JFrame{
	
	private static final long serialVersionUID = 1L;
	public JMenuBar menuBar;
	public Cadastro_Questao cadQuest;
	public Cadastro_Usuario cadUser;
	public Consultar_Questoes conQuest;
	private Login login;
	
	public Simulador() {
		this.setTitle("Simulator");
		getContentPane().setLayout(null);
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		//try {
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		//} catch (Exception e) {
			//e.printStackTrace();
		//}
		
		login = new Login(this);
		login.setLocation(10, 32);
		add(login);
		login.setVisible(true);
		
		cadQuest = new Cadastro_Questao();
		cadQuest.setLocation(10, 32);
		add(cadQuest);
		cadQuest.setVisible(false);
		
		cadUser = new Cadastro_Usuario();
		cadUser.setLocation(10, 32);
		add(cadUser);
		cadUser.setVisible(false);
		
		conQuest = new Consultar_Questoes();
		conQuest.setLocation(10, 32);
		add(conQuest);
		conQuest.setVisible(false);
		
		
		carregarMenu();
		menuBar.setVisible(false);
		
	}
	
	private void carregarMenu(){
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 794, 21);
		getContentPane().add(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				cadUser.setVisible(false);
				cadQuest.setVisible(false);
				menuBar.setVisible(false);
				conQuest.setVisible(false);
				login.setVisible(true);
				Simulador.this.repaint();
				
			}
		});
		mnArquivo.add(mntmLogout);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnArquivo.add(mntmSair);
		
		JMenu mnCadastrar = new JMenu("Cadastrar");
		menuBar.add(mnCadastrar);
		
		JMenuItem mntmNovaQuesto = new JMenuItem("Quest\u00E3o");
		ImageIcon img_1 = new ImageIcon(getClass().getResource("/bloco.png"));
		mntmNovaQuesto.setIcon(img_1);
		mntmNovaQuesto.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				login.setVisible(false);
				cadUser.setVisible(false);
				conQuest.setVisible(false);
				cadQuest.setVisible(true);
				Simulador.this.repaint();
								
			}
		});
		mnCadastrar.add(mntmNovaQuesto);
		
		JMenuItem mntmNovoUsurio = new JMenuItem("Usu\u00E1rio");
		ImageIcon img_2 = new ImageIcon(getClass().getResource("/user.png"));
		mntmNovoUsurio.setIcon(img_2);
		mnCadastrar.add(mntmNovoUsurio);
		mntmNovoUsurio.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				login.setVisible(false);
				cadQuest.setVisible(false);
				conQuest.setVisible(false);
				cadUser.setVisible(true);
				Simulador.this.repaint();
				
			}
		});
		
		JMenuItem mntmMatria = new JMenuItem("Mat\u00E9ria");
		ImageIcon img_3 = new ImageIcon(getClass().getResource("/livro2.png"));
		mntmMatria.setIcon(img_3);
		mntmMatria.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				new Cadastro_Materia(Simulador.this).setVisible(true);
			}
		});
		mnCadastrar.add(mntmMatria);
		
		JMenu mnConsultar = new JMenu("Consultar");
		menuBar.add(mnConsultar);
		
		JMenuItem mntmQuestes = new JMenuItem("Quest\u00F5es");
		mntmQuestes.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				cadUser.setVisible(false);
				cadQuest.setVisible(false);
				menuBar.setVisible(true);
				login.setVisible(false);
				conQuest.setVisible(true);
				Simulador.this.repaint();
				
			}
		});
		mnConsultar.add(mntmQuestes);
		
		JMenuItem mntmUsurios = new JMenuItem("Usu\u00E1rios");
		mnConsultar.add(mntmUsurios);
		
		//JMenuItem mntmMatrias = new JMenuItem("Mat\u00E9rias");
		//mnConsultar.add(mntmMatrias);
		
	}
	
	public static void main(String[] args) {
		new SQLiteJDBC().initBD();
		new Simulador().setVisible(true);
	}
}
