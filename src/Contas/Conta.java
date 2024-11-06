// melhorar programa - modificando o saque e deposito
// transferir entre contas
// 

package Contas;

public class Conta {
	public Integer numero;
	public Double saldo;
	public Double limite;
	public String nome;
	
	public Conta(Integer numero, Double saldo, Double limite, String nome) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite =limite;
		this.nome = nome;
	}
	
	public Boolean saca(Double valor) {
		if(valor<=this.saldo) {		
			this.saldo = this.saldo-valor;
			System.out.println("Saque realizado");
			return true;
		}
		System.out.println("Não foi possivel sacar");
		return false;
	
	}
	
	public void deposita(Double valor) {
		this.saldo = this.saldo+valor;
	}
	
	

}
