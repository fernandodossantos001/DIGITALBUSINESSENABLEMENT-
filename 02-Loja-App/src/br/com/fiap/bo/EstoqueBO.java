package br.com.fiap.bo;


import java.util.Properties;

import br.com.fiap.bean.Produto;

public class EstoqueBO {
	private Properties properties;
	
	public static  Produto consultarProduto(int cod)throws Exception{
		
		if (cod == 401) {
			return new Produto(1,"Camiseta Branca",2.99,4);
		} else if (cod == 402) {
			return new Produto(2,"Camiseta Azul",2.99,4);
		} else if (cod == 403) {
			return new Produto(3,"Camiseta Rosa",2.99,4);
		} else {
			return new Produto();
		}
		
		
		
	}

}
