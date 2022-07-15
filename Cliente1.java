package Cliente;

public class Cliente1 {
	public static String nome;
	public static String produto;
	public static String cpf;
	public static String pagamento;
	public static String endereco;
	public static String entrega;
	
	public Cliente1(){
	}
	
	public Cliente1(String nome, String produto, String cpf, String pagamento, String endereco, String entrega){
		super();
		this.nome = nome;
		this.produto = produto;
		this.cpf = cpf;
		this.pagamento = pagamento;
		this.endereco = endereco;
		this.entrega = entrega;
	}
	static void Dados() {
		
		System.out.println("Nome do cliente: "+nome);
		System.out.println("Produto: "+produto);
		System.out.println("CPF do cliente: "+cpf);
		System.out.println("Forma de pagamento cliente: "+pagamento);
		System.out.println("Endereco de entrega: "+endereco);
		System.out.println("Data da entrega: "+entrega);
		
		
		
	}

}
