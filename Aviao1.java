package Aviao;

	public class Aviao1 {

		public static String companhia;
		public static String nome;
		public static String piloto;
		public static String aeroporto;
		public static String cidade;
		
		public Aviao1(){
		}
		
		public Aviao1(String companhia, String nome, String piloto, String aeroporto, String cidade) {
			super();
			this.companhia= companhia;
			this.nome = nome;
			this.piloto = piloto;
			this.aeroporto = aeroporto;
			this.cidade = cidade;
			
		}
		static void Informacoes() {
			
			System.out.println("Companhia Aerea: "+companhia);
			System.out.println("Linha do aviao: "+nome);
			System.out.println("Piloto: "+piloto);
			System.out.println("Aeroporto de Partindo: "+aeroporto);
			System.out.println("Aeroporto de destino : "+cidade);
		}
	
	}

