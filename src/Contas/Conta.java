// melhorar programa - modificando o saque e deposito
// transferir entre contas
// 

package Contas;

public class Conta {
	public Integer numero;
	public Double saldo;
	public Double limite;
	public Cliente titular;
	public static final Double limiteMaximo = 100.0;
	
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
	
/*
  Minha tentativa antes do professor resolver problema em sala	
  public Boolean saca(Double valor) {
			if(valor<=this.saldo && valor>0) {
				this.saldo = this.saldo-valor;
				return true;
			}
		return false;
	
	}
*/
	// Resolução do professor
	public Boolean saca(Double valor) {
		if(valor>0) {
			if(valor<=this.saldo) {
				this.saldo -= valor;
				return true;
			} else if(valor <= this.saldo+this.limite) {
				valor -= this.saldo;
				this.saldo = 0.0;
				this.limite -= valor;
				return true;
			} else return false;
		}
		return false;
	}
/*	public void deposita(Double valor) {
		if(valor>0) {
			this.saldo = this.saldo+valor;
		} else {
			System.out.println("Valor informado para deposito inválido!");
			return;
		}
	}	
*/
	
	public Boolean deposita(Double valor) {
		if(valor>0){
			if(this.limite < Conta.limiteMaximo ){
				Double diferenca = Conta.limiteMaximo - this.limite;
				if(diferenca<valor){
					valor -= diferenca;
					this.saldo += valor;
					return true;
				} else{
					this.limite += valor;
					return true;
				}
			} else {
				this.saldo += valor;
				return true;
			}
			
		}else return false;
	}
	

	public Boolean transfere(Conta destino,Double valor){
		this.saca(valor);
		destino.deposita(valor);
		return true;
	}
}
