package Exercicio05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Venda {
			
		List<Produto> produtos = new ArrayList<Produto>();
		Produto produtoaserremovido = new Produto();
		Produto produtomaiscaro = new Produto();
		
		String imprimirtodososprodutos="Todos os Produtos:\n\n";
		
		double somatorioprecos = 0;
		double maiorpreco = 0;
		
		public void inserirproduto(Produto produto){
			produtos.add(produto);
		}
		public void removerproduto(String nomedoproduto){
			for (Produto produto : produtos){
				if(produto.nome.contains(nomedoproduto)){
					produtoaserremovido = produto;
				} 
			}
			
			produtos.remove(produtoaserremovido);
			imprimirtodososprodutos="Todos os Produtos:\n\n";
			somatorioprecos = 0;
		}
		public String todosprodutos(){
			
			imprimirtodososprodutos = "Todos os Produtos\n\n";
			somatorioprecos = 0;
			
			for (Produto produto : produtos){
				 
				imprimirtodososprodutos += "Produto: "+produto.getNome()+" Preço: R$ "+produto.getPreco()+"\n"; 
				 somatorioprecos+=produto.getPreco();
			}
			imprimirtodososprodutos+="\n\n\n Total de Vendas = R$ " + somatorioprecos;
			return imprimirtodososprodutos;
		}
		public Produto maisCaro(){
			for (Produto produto : produtos) {
				 if(produto.getPreco()>maiorpreco){
					 maiorpreco = produto.getPreco();
					 produtomaiscaro = produto;
				 }
			}
			return produtomaiscaro;
		}
}