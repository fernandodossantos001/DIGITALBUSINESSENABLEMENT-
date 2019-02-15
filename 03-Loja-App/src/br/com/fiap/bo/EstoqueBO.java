package br.com.fiap.bo;


import java.util.Properties;

import org.apache.log4j.Logger;

import br.com.fiap.bean.Produto;

public class EstoqueBO {
	private Properties properties;
	private static Logger log = Logger.getLogger(EstoqueBO.class);
	
	public static  Produto consultarProduto(int cod)throws Exception{
		
		if (cod == 401) {
			log.debug(cod + "camiseta branca");
			return new Produto(1,"Camiseta Branca",2.99,4);
		} else if (cod == 402) {
			
			log.debug(cod + "camiseta azul");
			return new Produto(2,"Camiseta Azul",2.99,4);
		} else if (cod == 403) {
			log.debug(cod + "camiseta Roa");
			return new Produto(3,"Camiseta Rosa",2.99,4);
		} else {
			log.error("codigo nao encontrado");
			return new Produto();
		}
	
		
	}

}
