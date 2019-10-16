import javax.swing.JOptionPane;

public class UsaEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estoque estoque1 = new Estoque();
		Estoque estoque2 = new Estoque();
		Estoque estoque3 = new Estoque();
		Estoque estoque4 = new Estoque();
		Estoque estoque5 = new Estoque();
		
		estoque1.setNome("Impressora Jato de Tinta");
		estoque1.setQtdAtual(13);
		estoque1.setQtdMinima(6);
		
		estoque2.setNome("Monitor LCD 17 Polegadas");
		estoque2.setQtdAtual(11);
		estoque2.setQtdMinima(13);
		
		estoque3.setNome("Mouse Óptico");
		estoque3.setQtdAtual(6);
		estoque3.setQtdMinima(2);
		
		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(4);
		
		estoque4.setQtdMinima(1);
		estoque4.repor(10);
		
		estoque5.setNome("Caneta");
		estoque5.setQtdAtual(-2);
		estoque5.setQtdMinima(3);
	
		System.out.println(estoque1.mostra()); 
		System.out.println("Precisa repor o estoque? "+ estoque1.getPrecisaRepor() + "\n");
		System.out.println(estoque2.mostra()); 
		System.out.println("Precisa repor o estoque? "+ estoque2.getPrecisaRepor() + "\n");
		System.out.println(estoque3.mostra()); 
		System.out.println("Precisa repor o estoque? "+ estoque3.getPrecisaRepor() + "\n");
		System.out.println(estoque4.mostra()); 
		System.out.println("Precisa repor o estoque? "+ estoque4.getPrecisaRepor() + "\n");
		System.out.println(estoque5.mostra()); 
		System.out.println("Precisa repor o estoque? "+ estoque5.getPrecisaRepor() + "\n");
	}
}
