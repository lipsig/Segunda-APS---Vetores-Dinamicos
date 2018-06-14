package aps;

public class MainTeste {

	//Classe teste
	
	public static void main(String[] args) {
		VetorDinamico a1= new VetorDinamico();
		
		/*a1.addFinal(12);
		System.out.print(a1.size());
		System.out.println(a1.get(5));
		System.out.println(a1.isIndexValid(2));
			a1.insere(0,2);
		a1.insere(1,2);
		*/
		
		System.out.print(a1.size());
		a1.insereInicio(1);
		a1.insere(1, 2);
		a1.insere(2, 3);
		System.out.println(a1.get(0));
		a1.remove(1);
		System.out.println(a1.get(1));
		System.out.println(a1.get(0));
		a1.removeInicio();
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));

	
		
	}

}
