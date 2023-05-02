package aula1;
//Aqui instanciamos a classe Caneta com seus 5 atributos, será o molde para a intanciação de outros objetos caneta.
public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Uma caneta" + this.cor);
	}
	
 //Aqui criamos 3 métodos void para essa classe. dica: "o método void não retorna nada".
	void rabiscar() {

	}

	void tampar() {

	}

	void destampar() {

	}

}
