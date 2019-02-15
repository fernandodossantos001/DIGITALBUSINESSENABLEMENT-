package br.com.fiap.teste;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import br.com.fiap.bean.Produto;
import br.com.fiap.bo.EstoqueBO;
import br.com.fiap.singleton.PropertySingleton;

public class TerminalConsulta {
	private static Logger log = Logger.getLogger(TerminalConsulta.class);
	

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		log.warn("Inicio da aplicação");
		
		String nome = PropertySingleton.getInstance().getProperty("nome");
		
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern(PropertySingleton.getInstance().getProperty("mascara"));
		
		System.out.println(nome + " " + hoje.format(formatador));
		
		int cd = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da loja"));
	
		Produto produto = EstoqueBO.consultarProduto(cd);
		
		System.out.println(produto.getDescricao());
		
		
		log.warn("Fim da aplicação");
		
		
	}

}
