
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario gustavo = new Gerente();
		gustavo.setNome("Gustavo de Santana");
		gustavo.setCpf("001.001.001-01");
		gustavo.setSalario(1000.00);
		
		System.out.println(gustavo.getNome());
		System.out.println(gustavo.getBonificacao());
	}

}
