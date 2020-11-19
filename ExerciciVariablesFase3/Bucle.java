
public class Bucle {

	public static void main(String[] args) {
		
		int n=1994; //Año de nacimiento//
		
		for(int i=1948; i<=n; i=i+4){ //cada 4 años es bisiesto//
			
			System.out.println(i);
			
		}
		
		String Traspàs= "L'any de naixement es de traspàs";
		
		String NoTraspàs= "L'any de naixement no es de traspàs";
				
		
		if (n%4==0){
			
			//si es divisible por 4 es bisiesto con lo cual el residuo de la división ha de ser igual a 0//
			
			System.out.println(Traspàs);
		} else {
			System.out.println(NoTraspàs);
		}	
	}

}
