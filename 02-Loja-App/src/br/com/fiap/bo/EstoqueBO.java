package br.com.fiap.bo;


import java.io.FileInputStream;
import java.util.Properties;

import br.com.fiap.bean.Produto;

public class EstoqueBO {
	private Properties properties;
	
	public  Produto consultarProduto(int cod)throws Exception{
		
		if (cod == 401) {
			System.out.println("Camiseta Branca");
		} else if (cod == 402) {
			System.out.println("Camiseta Azul");
		} else if (cod == 403) {
			System.out.println("Camiseta Rosa");
		} else {
			System.out.println("Produto não Encontrado");
		}
		
		properties= new Properties();
		
		FileInputStream file = new FileInputStream("fernando.txt");
		properties.load(file);
		
		
		
		
		
		
		return null;
		
		
	}

}
