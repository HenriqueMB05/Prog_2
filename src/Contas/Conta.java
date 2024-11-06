// melhorar programa - modificando o saque e deposito
// transferir entre contas
// 

package Contas;

public class Conta {
	public Integer numero;
	public Double saldo;
	public Double limite;
	public Cliente titular;
	
	public Conta(Integer numero, Double saldo, Double limite, Cliente titular) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite =limite;
		this.titular = titular;
	}
	
	public Conta(Integer numero, Double limite, Cliente titular) {
		this.numero = numero;
		this.titular= titular;
		this.saldo = 0.0;
		this.limite = limite;
	}
	
	public Boolean saca(Double valor) {
			if(valor<=this.saldo && valor>0) {		
				this.saldo = this.saldo-valor;
				return true;
			}
		System.out.println("Valor informado para saque inválido!");	
		return false;
	
	}
	
	public void deposita(Double valor) {
		if(valor>0) {
			this.saldo = this.saldo+valor;
		} else {
			System.out.println("Valor informado para deposito inválido!");
			return;
		}
	}	
	

}
