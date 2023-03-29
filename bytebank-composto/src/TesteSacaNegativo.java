
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println(conta.getSaldo());
		conta.saca(200);
		System.out.println(conta.getSaldo());
	}
}
