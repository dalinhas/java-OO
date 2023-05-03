package veiculos;

public class Carro {

	public static void main(String[] args) {

		Concessionaria carroA = new Concessionaria();
		carroA.modelo = "uno";
		carroA.marca = "fiat";
		carroA.ano = 2015;
		carroA.cor = "vermelho";
		System.out.println(carroA.modelo);
		System.out.println(carroA.marca);
		System.out.println(carroA.ano);
		System.out.println(carroA.cor);

		carroA.acelera();
		carroA.freiar();
		System.out.println();

		Concessionaria carroB = new Concessionaria();
		carroB.modelo = "ecosport";
		carroB.marca = "ford";
		carroB.ano = 2022;
		carroB.cor = "branca";
		System.out.println(carroB.modelo);
		System.out.println(carroB.marca);
		System.out.println(carroB.ano);
		System.out.println(carroB.cor);

		carroB.buzinar();
		System.out.println();

		Concessionaria carroC = new Concessionaria();
		carroC.modelo = "celta";
		carroC.marca = "chevrolet";
		carroC.ano = 2012;
		carroC.cor = "prata";
		System.out.println(carroC.modelo);
		System.out.println(carroC.marca);
		System.out.println(carroC.ano);
		System.out.println(carroC.cor);

		carroC.freiar();
		carroC.acelera();
		System.out.println();

		Concessionaria carroD = new Concessionaria();
		carroD.modelo = "clio";
		carroD.marca = "renault";
		carroD.ano = 2005;
		carroD.cor = "preto";
		System.out.println(carroD.modelo);
		System.out.println(carroD.marca);
		System.out.println(carroD.ano);
		System.out.println(carroD.cor);

		carroD.acelera();
		carroD.freiar();
		carroD.buzinar();

	}

}
