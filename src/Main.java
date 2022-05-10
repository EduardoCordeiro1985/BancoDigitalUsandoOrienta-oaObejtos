
public class Main {

	public static void main(String[] args) {
		Contas cc = new ContaCorrente();
		Contas poupanca = new ContaPoupanca();
		
		cc.depositar(1);
		
		cc.ImprimirExtrato();
		poupanca.ImprimirExtrato();
		
	}
}
