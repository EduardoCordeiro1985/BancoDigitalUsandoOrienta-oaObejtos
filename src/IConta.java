
public interface IConta {
	void sacar(Double valor);
		
	void depositar(Double valor);
	
	void transferir(Double valor, Contas contaDestino);
	
	void ImprimirExtrato();
	
}
