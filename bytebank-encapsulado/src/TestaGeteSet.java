
public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta(123, 12345	);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente gustavo = new Cliente();
		gustavo.setNome("Gustavo de Santana");
		conta.setTitular(gustavo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
	}
}
