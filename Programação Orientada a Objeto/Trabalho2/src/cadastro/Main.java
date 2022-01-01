package cadastro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import eleicao.View;

public class Main extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton pre, GOV, DF, DE, SEN, telai;
	JLabel texto;
	private static View telap;

	public Main(){

		getContentPane().setLayout(null);
		Acao objetolistener = new Acao();

		texto = new JLabel("CADASTRO");
		texto.setBounds(200,0,208,10);
		add(texto);
		
		pre = new JButton();
		pre.setText("PRESIDENTE");
		pre.setBounds(200,112,197,39);
		pre.addActionListener(objetolistener);
		add(pre);
		
		GOV = new JButton();
		GOV.setText("GOVERNADOR");
		GOV.setBounds(200,153,197,39);
		GOV.addActionListener(objetolistener);
		add(GOV);
		
		SEN = new JButton();
		SEN.setText("SENADOR");
		SEN.setBounds(200,193,197,39);
		SEN.addActionListener(objetolistener);
		add(SEN);
		
		DF = new JButton();
		DF.setText("DEPUTADO FEDERAL");
		DF.setBounds(200,234,197,39);
		DF.addActionListener(objetolistener);
		add(DF);
		
		DE = new JButton();
		DE.setText("DEPUTADO ESTADUAL");
		DE.setBounds(200,275,197,39);
		DE.addActionListener(objetolistener);
		add(DE);

		telai = new JButton();
		telai.setText("VOLTAR");
		telai.setBounds(200,320,197,39);
		telai.addActionListener(objetolistener);
		add(telai);

		setBounds(300,100,600,600);
		setVisible(true);}

	public static void main(String args[]){
		setTelap(new View());
	}
	public static View getTelap() {
		return telap;
	}

	public static void setTelap(View telap) {
		Main.telap = telap;
	}
	public class Acao implements ActionListener{
		private CadastroPR cadastropre;
		private CadastroGOV cadastrogov;
		private CadastroSEN cadastrosen;
		private CadastroDF cadastroDF;
		private CadastroDE cadastroDE;

		public void actionPerformed(ActionEvent event){
			
			if (event.getSource() == pre)
				setCadastropre(new CadastroPR());
			if (event.getSource() == GOV)
				setCadastrogov(new CadastroGOV());
			if (event.getSource() == SEN)
				setCadastrosen(new CadastroSEN());
			if (event.getSource() == DF)
				setCadastroDF(new CadastroDF());
			if (event.getSource() == DE)
				setCadastroDE(new CadastroDE());
			if (event.getSource() == telai)
				setVisible(false);
		}

		public CadastroPR getCadastropre() {
			return cadastropre;
		}

		public void setCadastropre(CadastroPR cadastropre) {
			this.cadastropre = cadastropre;
		}

		public CadastroGOV getCadastrogov() {
			return cadastrogov;
		}

		public void setCadastrogov(CadastroGOV cadastrogov) {
			this.cadastrogov = cadastrogov;
		}

		public CadastroDE getCadastroDE() {
			return cadastroDE;
		}

		public void setCadastroDE(CadastroDE cadastroDE) {
			this.cadastroDE = cadastroDE;
		}

		public CadastroDF getCadastroDF() {
			return cadastroDF;
		}

		public void setCadastroDF(CadastroDF cadastroDF) {
			this.cadastroDF = cadastroDF;
		}

		public CadastroSEN getCadastrosen() {
			return cadastrosen;
		}

		public void setCadastrosen(CadastroSEN cadastrosen) {
			this.cadastrosen = cadastrosen;
		}
	}
}
