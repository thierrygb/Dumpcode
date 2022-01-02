package eleicao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import cadastro.Main;
import estrutura.main;
import votacao.VotoPRE;

public class View extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton cadastro, votar, verresult;
		
	static List <main> listapre = new ArrayList <main>();
	static List <main> listagov = new ArrayList <main>();
	static List <main> listasen = new ArrayList <main>();
	static List <main> listaDF = new ArrayList <main>();
	static List <main> listaDE = new ArrayList <main>();
	

		public static void main(String args[])	{
			View View = new View();
		}
		public View(){
			
			getContentPane().setLayout(null);
			Acao objetolistener = new Acao();
			
			cadastro = new JButton();
			cadastro.setText("Cadastrar");
			cadastro.setBounds(200,100,200,50);
			cadastro.addActionListener(objetolistener);
			add(cadastro);
			
			votar = new JButton();
			votar.setText("Votar");
			votar.setBounds(200,150,200,50);
			votar.addActionListener(objetolistener);
			add(votar);
			
			verresult = new JButton();
			verresult.setText("Resultados");
			verresult.setBounds(200,200,200,50);
			verresult.addActionListener(objetolistener);
			
			setBounds(300,100,600,600);
			setVisible(true);}
		
		public class Acao implements ActionListener{
			public void actionPerformed (ActionEvent event){
				if(event.getSource()==votar){
					remove(cadastro);
					votar.setBounds(0,0,150,50);
					verresult.setBounds(0,50,150,50);
					add(verresult);
					VotoPRE Votar = new VotoPRE();
				}
				if(event.getSource()==cadastro){
					Main Main = new Main();
				}
				if(event.getSource()==verresult){
					resultado();
				}
			}
		}
		public static void cadastrarpre(main main){
			listapre.add(main);
		}
		public static void cadastrargov(main main){
			listagov.add(main);
		}
		public static void cadastrarsen(main main){
			listasen.add(main);
		}
		public static void cadastrarDF(main main){
			listaDF.add(main);}
		public static void cadastrarDE(main main){
			listaDE.add(main);
		}
		public static void votopre(String entrada){
			long voto = Integer.parseInt(entrada);
			for(main i:listapre){
				if(voto == i.getNumero()){
					i.setNumVotos();
				}
			}
		}
		public static void votogov(String entrada){
			long voto = Integer.parseInt(entrada);
		    for(main i:listagov){
		        if(voto == i.getNumero()){
					i.setNumVotos();
				}
		    }
		}
		public static void votosen(String entrada){
			long voto = Integer.parseInt(entrada);
			for(main i:listasen){
				if(voto == i.getNumero()){
					i.setNumVotos();
				}
			}
		}
		public static void votoDF(String entrada){
			long voto = Integer.parseInt(entrada);
			for(main i:listaDF){
				if(voto == i.getNumero()){
					i.setNumVotos();
				}
			}
		}
		public static void votoDE(String entrada){
			long voto = Integer.parseInt(entrada);
			for(main i:listaDE){
				if(voto == i.getNumero()){
					i.setNumVotos();
				}
			}
		}
		public void resultado(){
			String resultado="", maisvotadopre="", maisvotadogov="", maisvotadosen="", maisvotadoDF="", maisvotadoDE="";
			long votospre = 0, votosgov = 0, votossen = 0, votosDF = 0, votosDE = 0;
			for (main i:listapre){
				if (i.getNumVotos()>votospre){
					votospre = i.getNumVotos();
					maisvotadopre = i.getNome();
				}
			}
			for (main i:listagov){
				if (i.getNumVotos()>votosgov){
					votosgov = i.getNumVotos();
					maisvotadogov= i.getNome();
				}
			}
			for (main i:listasen){
				if (i.getNumVotos()>votossen){
					votossen = i.getNumVotos();
					maisvotadosen = i.getNome();
				}
			}
			for (main i:listaDF){
				if (i.getNumVotos()>votosDF){
					votosDF = i.getNumVotos();
					maisvotadoDF = i.getNome();
				}
			}
			for (main i:listaDE){
				if (i.getNumVotos()>votosDE){
					votosDE = i.getNumVotos();
					maisvotadoDE = i.getNome();
				}
			}
			resultado += "RESULTADO\nPresidente: " + maisvotadopre + " com " + votospre + " votos.\n" +
							"Governador: " + maisvotadogov + " com " + votosgov+ " votos.\n" +
								"Senador: " + maisvotadosen + " com " + votossen+ " votos.\n" +
									"Deputado Federal " + maisvotadoDF + " com " + votosDF + " votos.\n" +
										"Deputado Estadual: " + maisvotadoDE + " com " + votosDE + " votos.";
											
			JOptionPane.showMessageDialog(null,resultado);
		}
}