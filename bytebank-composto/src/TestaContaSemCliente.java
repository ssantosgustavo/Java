
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaTau = new Conta();
		
		contaDaTau.titular = new Cliente();
		
		contaDaTau.titular.nome = "Tauana Borges";
		System.out.println(contaDaTau.titular.nome);
		System.out.println(contaDaTau.getSaldo());
	}
}
