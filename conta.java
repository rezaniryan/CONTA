package banco;

public class conta {

	    private double saldo;
	    private int consultas;

	    // classe construtora
	    public conta() {
	        saldo = 0.0;
	        consultas = 0;
	    }
        // realiza o deposito
	    public void deposito(double valor) {
	        double taxa = valor * 0.01;
	        saldo += (valor - taxa);
	        System.out.printf("Depósito: R$%.2f | Saldo: R$%.2f%n", valor, saldo);
	    }
	    
        //realiza o saque
	    public void saque(double valor) {
	        double taxa = valor * 0.005;
	        if (valor + taxa <= saldo) {
	            saldo -= (valor + taxa);
	            System.out.printf("Saque: R$%.2f | Saldo: R$%.2f%n", valor, saldo);
	        } else {
	            System.out.println("Saldo insuficiente.");
	        }
	    }
        //consulta o saldo
	    public void consulta() {
	        consultas++;
	        if (consultas % 5 == 0) {
	            saldo -= 0.59; // desconto
	            System.out.println("Cobrança de R$0.59 pela consulta.");
	        }
	        System.out.printf("Saldo: R$%.2f%n", saldo);
	    }

	    //testa a classe
	    public static void main(String[] args) {
	        conta conta = new conta();
	        conta.deposito(1000.00);  // deposito
	        conta.saque(350);      // saque
	        conta.consulta();     // saldo
	        conta.consulta();     // saldo
	        conta.consulta();     // saldo
	        conta.consulta();     // saldo
	        conta.consulta();     // saldo - cobrança
	    }
	}

	

