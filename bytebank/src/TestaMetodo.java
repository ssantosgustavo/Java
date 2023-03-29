
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoGustavo = new Conta();
		contaDoGustavo.saldo = 100;
		contaDoGustavo.deposita(50);
		System.out.println(contaDoGustavo.saldo);
		
		contaDoGustavo.saca(100);
		System.out.println(contaDoGustavo.saldo);
		
		Conta contaDaTau = new Conta();
		contaDaTau.deposita(3000);
		contaDaTau.transfere(1000, contaDoGustavo);
		System.out.println(contaDoGustavo.saldo);
		System.out.println(contaDaTau.saldo);
		
	    if(contaDaTau.transfere(300, contaDoGustavo)) {
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }

	}
}
