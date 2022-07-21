package PolimorfismoHerança;


public class Testeanimal {
	
	
public static void main(String[] args) {

Animal Preguica = new Animal();
	
	Preguica.nome = "Flecha a Preguica ";
	Preguica.idade = 9;
	Preguica.EmitirSom();
	Preguica.Movimento();
	
	
	Animal Cavalo = new Animal();

	
	Cavalo.nome = "Spirit o Cavalo";
	Cavalo.idade = 3;
	Cavalo.EmitirSom();
	Cavalo.Movimento();
	
	Animal Cachorro= new Animal();
	
	Cachorro.nome="Vagabundo o Cachorro";
	Cachorro.idade= 15;
	Cachorro.EmitirSom();
	Cachorro.Movimento();
	
}
}
