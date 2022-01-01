package votacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import eleicao.View;

public class VotoGOV extends JFrame {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField campo; 
	JLabel texto;
	JButton botao0, botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9, confirmar; 
	
	VotoGOV(){
		
		getContentPane().setLayout(null);
		Acao objetolistener = new Acao();
		
		texto = new JLabel();
		texto.setText("GOVERNADOR");
		texto.setBounds(28,10,500,30); 
		add(texto);
		
		campo = new JTextField();
		campo.setBounds(0,50,135,30);
		add(campo);
		
		botao1 = new JButton();
		botao1.setText("1");
		botao1.setBounds(0,90,45,30);
		botao1.addActionListener(objetolistener);
		add(botao1);
		
		botao2 = new JButton();
		botao2.setText("2");
		botao2.setBounds(45,90,45,30);
		botao2.addActionListener(objetolistener);
		add(botao2);
		
		botao3 = new JButton();
		botao3.setText("3");
		botao3.setBounds(90,90,45,30);
		botao3.addActionListener(objetolistener);
		add(botao3);
		
		botao4 = new JButton();
		botao4.setText("4");
		botao4.setBounds(0,120,45,30);
		botao4.addActionListener(objetolistener);
		add(botao4);
		
		botao5 = new JButton();
		botao5.setText("5");
		botao5.setBounds(45,120,45,30);
		botao5.addActionListener(objetolistener);
		add(botao5);
		
		botao6 = new JButton();
		botao6.setText("6");
		botao6.setBounds(90,120,45,30);
		botao6.addActionListener(objetolistener);
		add(botao6);
		
		botao7 = new JButton();
		botao7.setText("7");
		botao7.setBounds(0,150,45,30);
		botao7.addActionListener(objetolistener);
		add(botao7);
		
		botao8 = new JButton();
		botao8.setText("8");
		botao8.setBounds(45,150,45,30);
		botao8.addActionListener(objetolistener);
		add(botao8);
		
		botao9 = new JButton();
		botao9.setText("9");
		botao9.setBounds(90,150,45,30);
		botao9.addActionListener(objetolistener);
		add(botao9);
		
		botao0 = new JButton();
		botao0.setText("0");
		botao0.setBounds(0,180,45,30);
		botao0.addActionListener(objetolistener);
		add(botao0);
		
		confirmar = new JButton();
		confirmar.setText("OK");
		confirmar.setBounds(45,180,90,30);
		confirmar.addActionListener(objetolistener);
		add(confirmar);
				
		setBounds(550,300,150,245);
		setVisible(true);}

	public class Acao implements ActionListener{
		private VotoSEN votosen;

		public void actionPerformed (ActionEvent event){
				if (event.getSource() == botao1)
					campo.setText(campo.getText()+"1");
				if (event.getSource() == botao2)
					campo.setText(campo.getText()+"2");
				if (event.getSource() == botao3)
					campo.setText(campo.getText()+"3");
				if (event.getSource() == botao4)
					campo.setText(campo.getText()+"4");
				if (event.getSource() == botao5)
					campo.setText(campo.getText()+"5");
				if (event.getSource() == botao6)
					campo.setText(campo.getText()+"6");
				if (event.getSource() == botao7)
					campo.setText(campo.getText()+"7");
				if (event.getSource() == botao8)
					campo.setText(campo.getText()+"8");
				if (event.getSource() == botao9)
					campo.setText(campo.getText()+"9");
				if (event.getSource() == botao0)
					campo.setText(campo.getText()+"0");
				if(event.getSource()== confirmar){
							View.votogov(campo.getText());
							setVisible(false);
							setVotosen(new VotoSEN());
				}
		}

		public VotoSEN getVotosen() {
			return votosen;
		}

		public void setVotosen(VotoSEN votosen) {
			this.votosen = votosen;
		}
	}
}