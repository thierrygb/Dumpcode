package cadastro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import eleicao.View;
import estrutura.Governador;

public class CadastroGOV extends JFrame {		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField campoparanome, campoparapartido, campoparanumero;
	JButton Cadastrar;
	JLabel texto;

	CadastroGOV(){

		getContentPane().setLayout(null);
		Acao objetolistener = new Acao();

		texto = new JLabel("DEPUTADO GOVERNADOR");
		texto.setBounds(38, 0, 198, 43);
		add(texto);
		
		campoparanome = new JTextField();
		campoparanome.setBounds(0, 40, 200, 43);
		campoparanome.setText("CANDIDATO");
		add(campoparanome);
		
		campoparapartido = new JTextField();
		campoparapartido.setBounds(0, 75, 200, 43);
		campoparapartido.setText("PARTIDO");
		add(campoparapartido);
		
		campoparanumero = new JTextField();
		campoparanumero.setBounds(0, 110, 200, 43);
		campoparanumero.setText("NUMERO");
		add(campoparanumero);
		
		Cadastrar = new JButton();
		Cadastrar.setBounds(0, 150, 200, 43);
		Cadastrar.setText("CADASTRO");
		Cadastrar.addActionListener(objetolistener);
		add(Cadastrar);

		setBounds(450, 250, 210, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public class Acao implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == Cadastrar) {
				if (campoparanumero.getText().length() == 2) {
					setVisible(false);
					Governador gov = new Governador();
					gov.setNome(campoparanome.getText());
					gov.setPartido(campoparapartido.getText());
					int entrada = Integer.parseInt(campoparanumero.getText());
					gov.setNumero(entrada);
					View.cadastrargov(gov);
				}
			}
		}
	}
}
