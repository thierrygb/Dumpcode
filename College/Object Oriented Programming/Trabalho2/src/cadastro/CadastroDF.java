package cadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import eleicao.View;
import estrutura.Dfederal;

public class CadastroDF extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField campoparanome, campoparapartido, campoparanumero;
	JButton Cadastrar;
	JLabel texto;

	CadastroDF(){ 
		
		getContentPane().setLayout(null);
		Acao objetolistener = new Acao();
		
		texto = new JLabel("DEPUTADO FEDERAL");
		texto.setBounds(39, 0, 207, 43);
		add(texto);
		
		campoparanome = new JTextField();
		campoparanome.setBounds(0, 29, 217, 43);
		campoparanome.setText("CANDIDATO");
		add(campoparanome);
		
		campoparapartido = new JTextField();
		campoparapartido.setBounds(0, 85, 219, 41);
		campoparapartido.setText("PARTIDO");
		add(campoparapartido);
		
		campoparanumero = new JTextField();
		campoparanumero.setBounds(0, 113, 206, 41);
		campoparanumero.setText("NUMERO");
		add(campoparanumero);
		
		Cadastrar = new JButton();
		Cadastrar.setBounds(0, 137, 208, 32);
		Cadastrar.setText("CADASTRO");
		Cadastrar.addActionListener(objetolistener);
		add(Cadastrar);

		setBounds(441, 262, 207, 241);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public class Acao implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == Cadastrar){
					if (campoparanumero.getText().length() == 4){
						setVisible(false);
						Dfederal DF = new Dfederal();
						DF.setNome(campoparanome.getText());
						DF.setPartido(campoparapartido.getText());
						int entrada = Integer.parseInt(campoparanumero.getText());
						DF.setNumero(entrada);

						View.cadastrarDF(DF);
					 }
			}
		}
	}
}
