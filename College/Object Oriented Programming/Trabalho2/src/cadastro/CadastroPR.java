package cadastro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import eleicao.View;
import estrutura.Presidente;

public class CadastroPR extends JFrame {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField campoparanome, campoparapartido, campoparanumero;
	JButton Cadastrar;
	JLabel texto;

	CadastroPR() {

		getContentPane().setLayout(null);
		Acao objetolistener = new Acao();

		texto = new JLabel("PRESIDENTE");
		texto.setBounds(35, 0, 200, 30);
		add(texto);
		
		campoparanome = new JTextField();
		campoparanome.setBounds(0, 40, 200, 30);
		campoparanome.setText("CANDIDAT0");
		add(campoparanome);
		
		campoparapartido = new JTextField();
		campoparapartido.setBounds(0, 75, 200, 30);
		campoparapartido.setText("PARTID0");
		add(campoparapartido);
		
		campoparanumero = new JTextField();
		campoparanumero.setBounds(0, 110, 200, 30);
		campoparanumero.setText("NUMER0");
		add(campoparanumero);
		
		Cadastrar = new JButton();
		Cadastrar.setBounds(0, 150, 200, 30);
		Cadastrar.setText("CADASTRAR");
		Cadastrar.addActionListener(objetolistener);
		add(Cadastrar);

		setBounds(450, 250, 210, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

	public class Acao implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == Cadastrar) {
				if (campoparanumero.getText().length() == 2){
					setVisible(false);
					Presidente pre = new Presidente();
					pre.setNome(campoparanome.getText());
					pre.setPartido(campoparapartido.getText());
					int entrada = Integer.parseInt(campoparanumero.getText());
					pre.setNumero(entrada);
					View.cadastrarpre(pre);
				}
			}
		}
	}
}
