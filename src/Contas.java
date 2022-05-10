
public abstract class Contas implements IConta{
	
	private static final Integer AGENCIA_PADRAO = 1;
	private static Integer SEQUENCIAL = 1;
	
	protected	Integer	agencia;
	protected Integer	numero;
	protected Double saldo;
	
	public Contas() {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	
	@Override
	public void sacar(Double valor) {
		
		saldo -= saldo - valor;	
	}
	@Override
	public void depositar(Double valor) {
		
		saldo += saldo + valor;
	
	}
	
	@Override
	public void transferir(Double valor, Contas contaDestino) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	

	public Integer getAgencia() {
		return agencia;
	}
	public Integer getNumero() {
		return numero;
	}
	public Double getSaldo() {
		return saldo;
	}

	protected void ImprimirInfoscomuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}	
}
	