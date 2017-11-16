package br.com.olaMundo;

import javax.swing.JOptionPane;

public class Ola {
	
	private String nome;

	public Ola(){ //Construtor só é ativado quando se instancia a classe.
		
		System.out.println("OI Construtor");	
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(oi());
		System.out.println(somador());
		
	}
	
	public static String oi() {
		
		Ola ola = new Ola();
		
		ola.setNome("Nome OLA");
		
		String oi = "Oi mundo";
		return oi + " " + ola.getNome();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static String somador()
	{
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número:"));
		
		return "A soma dos números é: "+ (n1 + n2);
	}
	
}
