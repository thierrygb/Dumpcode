package Lista01;
import javax.swing.JOptionPane;
import javax.swing.JApplet;

@SuppressWarnings("serial")
public class Exercicio09 extends JApplet{
	public void init()
	{
		String km,litros,aux;
		int distancia,consumo,i=1;
		float media;
		while(i==1)
		{
			km=JOptionPane.showInputDialog("Digite quantos Km andou");
			litros=JOptionPane.showInputDialog("Digite quantos litros foram usados");
			
			distancia=Integer.parseInt(km);
			consumo=Integer.parseInt(litros);
			
			media=(distancia/consumo);
			JOptionPane.showMessageDialog(null, "Seu veiculo faz "+media+" Km por litro");
			aux=JOptionPane.showInputDialog("Deseja repetir a operação?\n"+"1:Sim\n"+"2:Não");
			i=Integer.parseInt(aux);
		}
		
	}

}
