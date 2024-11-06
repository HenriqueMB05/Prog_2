package Contas;

public class Program {
	public static void main(String[] args) {
		Conta c1 = new Conta(1234, 1200.00, 30000.00, "Henrique");
		
		
		c1.saca(1200.00);
		c1.deposita(10000.00);
		System.out.println(c1.saldo);
	}
}
