package Gatos;

public class Gato {
	public String nome;
	public Integer qtdComidaDisponivel;
	public Boolean sono;
	
	public Gato() {
		this.nome = "Sushi";
		this.qtdComidaDisponivel = 3;
		this.sono = true;
	}
	public Gato(String nome, Integer qtdComidaDisponivel, Boolean sono) {
		this.nome = nome;
		this.qtdComidaDisponivel = qtdComidaDisponivel;
		this.sono = sono;
	}
	
	public void miar() {
		System.out.println("Miau!");
	}
	
	public void comer() {
		this.qtdComidaDisponivel--;
	}
	
	public void dormir(){
		this.sono = false;
	}
}
