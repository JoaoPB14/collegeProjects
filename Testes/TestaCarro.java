import java.util.Scanner;

public class TestaCarro {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String decisao ;
		boolean continuar = true ;
		
		s = new Scanner(System.in);
		Carro carro1 = new Carro();
		//Carro carro2 = new Carro();
		//Carro carro3 = new Carro();
		
		while (continuar == true ) {
			System.out.print("Insira o modelo do veiculo: ");
			carro1.setModelo(s.next());
			System.out.print("Insira a marca do veiculo: ");
			carro1.setMarca(s.next());
			System.out.print("Insira o ano de fabricação do veiculo: ");
			carro1.setAnoFab(s.nextInt());
			System.out.print("Insira o valor do veículo: ");
			carro1.setValor(s.nextFloat());
			carro1.calcValor(carro1.getValor());
			System.out.print(carro1.show());
			System.out.print("\nDeseja calcular o desconto de outro carro? ");
			decisao = s.next();
				if (decisao.equals("sim") || decisao.equals("SIM") || decisao.equals("s")) {
					continuar = true;
					System.out.print("\n");
				} else {
					continuar = false;
					System.out.print("\n");
				}
		}
	}
}
