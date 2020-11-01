package projeto_banco;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("Conta: "+this.getNumConta());
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Dono: "+this.getDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.isStatus());
		System.out.println("----------------------------------------------------------------");
	}

	public void abrirConta(String t) {
		this.setTipo(t); 
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(1);
		} else if(t == "CP"){
			this.setSaldo(2);
		}
		System.out.println("Conta aberta com sucesso!!!");
	}
	public void fecharConta() {
		if(this.getSaldo() > 0 ) {
			System.out.println("Você não pode fechar a conta, você tem dinheiro na conta");
		}else if(this.getSaldo() < 0 ) {
			System.out.println("Você não pode fechar a conta, você esta negativo");
			
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
			System.out.println("Edinheiro, Banco feito pra você.");
		}
	}
	public void depositar(float v) {
		if(this.isStatus()) {
			//this.saldo = this.saldo + v;
			this.setSaldo(this.getSaldo() + v);
			this.getSaldo();
			System.out.print("Deposito de "+v);
			System.out.println(" realizado com sucesso na conta "+ this.getDono());
		}else {
			System.out.println("Impossível realizar deposito em uma conta fechada, "+this.getDono());
			
		}
	}
	public void sacar(float v) {
		if(this.isStatus()) {
			if(this.getSaldo()>= v) {
				this.setSaldo(this.getSaldo()-v);
				System.out.println("Saque realizado na conta de "+this.getDono());
			}else {
				System.out.println("Saldo insuficiente para saqui");
			}
		}else {
			System.out.println("Impossivel sacar de uma conta fechada");
		}
	}
	public void pagarMensalidade() {
		int v;
		if (this.getTipo() == "CP") {
			v = 12;
		} else {
			v = 20;
		}
		if(this.isStatus()) {
			this.setSaldo(this.getSaldo()-v);
			System.out.println("Mensalidade paga com sucesso por"+this.getDono());
		}else {
			System.out.println("Impossivel pagar uma conta fechada");
		}
	}
	
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public double getNumConta() {
		return numConta;
	}
	public void setNumConta(double numConta) {
		this.numConta = (int) numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	
	
	
	
}
