package Gatos;

public class Program {
	public static void main(String[] args) {
		Gato g1 = new Gato();
		Gato g2 = new Gato("Roberto", 10, true);
		g2.comer();
		g1.dormir();		
		System.out.println("Nome: " +g1.nome);
		System.out.println("Quantidade de comida disponivel: " +g1.qtdComidaDisponivel);
		System.out.println("Sono: " +g1.sono);
		System.out.printf("%s - ",g1.nome);
		g1.miar();
		System.out.println();
		System.out.println("Nome: " +g2.nome);
		System.out.println("Quantidade de comida disponivel: " +g2.qtdComidaDisponivel);
		System.out.println("Sono: " +g2.sono);
		System.out.printf("%s - ", g2.nome);
		
		g2.miar();
		
	}
}
