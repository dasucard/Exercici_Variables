package ExerciciM1Boolean;

public class Bucle {

	public static void main(String[] args) {
		
		int n=1994; //A�o de nacimiento//
		
		for(int i=1948; i<=n; i=i+4){ //cada 4 a�os es bisiesto//
			
			System.out.println(i);
			
		}
		
		String Traspas= "L'any de naixement es de trasp�s";
		
		String NoTraspas= "L'any de naixement no es de trasp�s";
				
		
		if (n%4==0){
			
			//si es divisible por 4,es bisiesto con lo cual el residuo de la divisi�n ha de ser igual a 0//
			
			System.out.println(Traspas);
		} else {
			System.out.println(NoTraspas);
		}	
	}

}
