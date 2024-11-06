package Contas;

public class Program {
	public static void main(String[] args) {
		Cliente t1 = new Cliente ("Henrique", "Bonfim", "000000000-00");
		Conta c1 = new Conta(1234, 30000.0, t1);
		
		
		System.out.printf("Titular: %s %s\n", c1.titular.nome, c1.titular.sobrenome);
		System.out.printf("Número da conta: %d\n", c1.numero);
		System.out.printf("Saldo da conta: R$%.2f\n", c1.saldo);
		System.out.printf("Limite da conta: R$%.2f\n", c1.limite);
		
		System.out.println();
		
		c1.deposita(10000.00);
		System.out.println("Depositando o valor de R$10.000,00");
		System.out.printf("Saldo da conta: R$%.2f\n", c1.saldo);
		
		c1.saca(1200.00);
		System.out.println("Sacando o valor de R$1.200,00");
		System.out.printf("Saldo da conta: R$%.2f\n", c1.saldo);
		
		System.out.println();
		
		System.out.println("CPF do titular: "+ c1.titular.cpf);
		

	}
}
