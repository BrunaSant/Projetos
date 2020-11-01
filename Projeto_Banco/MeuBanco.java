package projeto_banco;

import java.util.Scanner;

public class MeuBanco {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		ContaBanco p1 = new ContaBanco();
		boolean laco = true;
		/*p1.setNumConta(2416);
		
		System.out.println("Digite seu nome: ");
		p1.setDono(leia.next());
		p1.abrirConta("CC");
		p1.estadoAtual();*/
		
		System.out.print("Olá, por favor digite o seu nome: ");
		p1.setDono(leia.next());
		linha();
		
		System.out.print("Olá, "+p1.getDono()+ ". Gostaria de abrir uma conta com Banco Edinheiro? \n[S]Sim \n[N]Não: ");
		char opc = leia.next().toUpperCase().charAt(0);
		linha();
		while(opc != 'S' && opc != 'N') {
			System.out.println("Digite uma opção válida: ");
			System.out.print("Olá, "+p1.getDono()+ ". Gostaria de abrir uma conta com Banco Edinheiro? \n[S]Sim \n[N]Não");
			opc = leia.next().toUpperCase().charAt(0);
			linha();
		}
		if(opc == 'S') {
			p1.setNumConta(Math.random()*1000);
			System.out.print("Qual conta gostaria de abrir? \n[1] Conta Corrente \n[2]Conta Poupança");
			int OPCConta = leia.nextInt();
			linha();
			while(OPCConta != 1 && OPCConta != 2) {
				System.out.println("Por favor, digite uma opção válida.");
				System.out.print("Qual conta gostaria de abrir? \n[1] Conta Corrente \n[2]Conta Poupança");
				OPCConta = leia.nextInt();
				linha();
			}
			if(OPCConta == 1) {
				p1.abrirConta("CC");
				p1.estadoAtual();
			}else {
				p1.abrirConta("CP");
				p1.estadoAtual();
			}
						
			
			while(laco == true) {
				System.out.print("O que você gostaria de fazer: \n[1] Depositar\n[2] Sacar\n[3] Status\n[4] Fechar Conta");
				int opcMenu= leia.nextInt();
				
				
				
				linha();
				while(opcMenu != 1 && opcMenu != 2 && opcMenu != 3 && opcMenu != 4 && opcMenu != 5) {
					System.out.println("Por favor, digite uma opção válida");
					System.out.print("O que você gostaria de fazer: [1] Depositar\n[2] Sacar\n[3] Status \n[4] Fechar Conta");
					opcMenu= leia.nextInt();
					linha();
				}
				if(opcMenu == 1) {
						System.out.print("Quanto gostaria de depositar? ");
						p1.depositar(leia.nextFloat());
						p1.isStatus();
						p1.estadoAtual();
						
				}
				else if(opcMenu ==2) {
					System.out.print("Quanto gostaria de Sacar? ");
					p1.sacar(leia.nextFloat());
					p1.isStatus();
					p1.estadoAtual();
					
			
				}
				else if(opcMenu == 4){
					p1.estadoAtual();
				
				}
				else {
					p1.fecharConta();
					if(p1.getSaldo() == 0 ) {
						laco = false;
					}
				}
						
			}
		}		
		else {
			System.out.println("Obrigada pela visita\nVolte Sempre\n Abrir conta no Banco Edinheiro, não Edificil");
		}
		
		leia.close();
	}

	public static void linha() {
		System.out.println("\n----------------------------------------------------------------");
		
	}

}
