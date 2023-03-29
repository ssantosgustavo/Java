
public class TestaBanco {
	public static void main(String[] args) {
		Cliente gustavo = new Cliente();
		gustavo.nome = "Gustavo de Santana";
		gustavo.cpf = "437.239.488-80";
		gustavo.profissao = "Programador";
		
		Conta contaDoGustavo = new Conta();
		contaDoGustavo.deposita(1000);
		
		contaDoGustavo.titular = gustavo;
		System.out.println(contaDoGustavo.titular.nome);
		System.out.println(contaDoGustavo.titular);
	}
}
