package aps;

public class VetorDinamico { //classe principal Vetor dinamico
	
	private int [] data= new int [5];
	private int contador = 5;
	
	public void VerificaCheio() {  //Verificou se esta cheio
		if (contador < data.length) return;
		int[] novoArray = new int[2* data.length];
		for (int i=0; i <data.length; i++)
			novoArray[i]= data[i];
		data = novoArray;
			
	 }
	
	public void insereFinal(int valor) { //inseriu no final e criou mais uma posição no array
		VerificaCheio();
		data[contador]=valor;
		contador = contador +1;
	}
	
	public void insereInicio(int valor) { //inserir incio
		VerificaCheio();
		moveElementsForward(0);
		data[0]=valor;
	
	}

	
	public void insere (int index, int value ) { //insere posição especifica
	    if ( isIndexValid (index )) {
	    	VerificaCheio();
	        moveElementsForward (index);
	        data[index] = value;
	        contador = contador + 1;
	    }
	}
	
	private void moveElementsForward(int index) { //mover para frente
		  if ( isIndexValid (index))
		        for (int i = contador; i > index; i = i - 1)
		            data[i] = data[i - 1];
		
	}
	
	private void moveElementsBackward (int index ) { //mover para tras
 		if (isIndexValid (index)) {
        for (int i = index + 1; i < contador; i = i + 1)
            data[i - 1] = data[i];
       }
    
	}       		
            		
	
	public void remove (int index ) { //remover indice especifico
	    if (isIndexValid(index)) {
	        moveElementsBackward(index);
	        contador = contador - 1;
	    {
	    if(isIndexValid(index) == false)
	    	System.out.print(index+": indice invalido.");
	    }
	   
	    }
	}
	
	public void removeInicio() { //remover primeiro indice
	        moveElementsBackward(0);
	        contador = contador - 1;
	   	    
	}
	
	public void removeFim() { //remover ultimo indice (nao consegui)	
}
	
	
	public void set(int index, int valor) { //mudar valor de indice existente
		if (isIndexValid(index)) 
		{
		data[index]= valor;
		}
		
	    if(isIndexValid(index ) == false)
	    {
	    System.out.print(index+": indice invalido.");
	    }
		
	}

	public int size() { //retornou o tamanho do array
		return contador;
	}
	
	
	public int get (int indice) { //retornou o indice desejado e seu valor
		return data[indice];
		
	}
	
	public boolean isIndexValid (int indice) { 
	   if ( indice >= 0  && indice < contador ) {
		   return true;
	   }
	return false;
   
	}
	
	

}
