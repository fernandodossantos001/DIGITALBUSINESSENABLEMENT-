package br.com.fiap.teste;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Teste {
	
	
	private static Properties properties;

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		
		FileInputStream file = new FileInputStream(new File("fernando.txt"));
		properties.load(file);
		
		System.out.println(properties.toString());	
		
		
	}

}
