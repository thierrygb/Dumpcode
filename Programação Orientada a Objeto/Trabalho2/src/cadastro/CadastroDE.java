package cadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import eleicao.View;
import estrutura.Destadual;

public class CadastroDE extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField campoparaonome, campoparapartido, campoparanumero;
	JButton Cadastrar;
	JLabel texto;
	
	CadastroDE(){
		getContentPane().setLayout(null);
		Acao objetolistener = new Acao();
		texto = new JLabel("DEPUTADO ESTADUAL");
		texto.setBounds(40, 0, 221, 38);
		add(texto);
	
		campoparaonome = new JTextField();
		campoparaonome.setBounds(0, 37, 180, 43);
		campoparaonome.setText("CANDIDAT0");
		add(campoparaonome);
		
		campoparapartido = new JTextField();
		campoparapartido.setBounds(0, 62, 180, 43);
		campoparapartido.setText("PARTIDO");
		add(campoparapartido);
		
		campoparanumero = new JTextField();
		campoparanumero.setBounds(0, 117, 219, 43);
		campoparanumero.setText("NUMERO");
		add(campoparanumero);
		
		Cadastrar = new JButton();
		Cadastrar.setBounds(0, 139, 202, 43);
		Cadastrar.setText("CADASTRO");
		Cadastrar.addActionListener(objetolistener);
		add(Cadastrar);

		setBounds(429, 261, 216, 243);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public class Acao implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == Cadastrar) {
				if (campoparanumero.getText().length() == 5){
					setVisible(false);
					Destadual DE = new Destadual();
					DE.setNome(campoparaonome.getText());
					DE.setPartido(campoparapartido.getText());
					int entrada = Integer.parseInt(campoparanumero.getText());
					DE.setNumero(entrada);
					View.cadastrarDE(DE);
				}
			}
		}
	}
}
