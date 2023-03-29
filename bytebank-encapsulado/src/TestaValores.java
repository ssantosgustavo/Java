
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(123, 12345);
		
		Cliente gustavo = new Cliente();
		conta.setTitular(gustavo);
		gustavo.setNome("Gustavo Santana");
		conta.deposita(500);
		
		System.out.println(conta.getSaldo());
		
		System.out.println(Conta.getTotal());
		
	}
}
