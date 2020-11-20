
public class DadesPersonals {

	public static void main(String[] args) {
		
		String Nom="David";
		String Cognom1="Suárez";
		String Cognom2="Cárdenas";
		String EmDic= Nom+" "+Cognom1+" "+Cognom2+" ";
		
		
		System.out.println("El meu nom és "+EmDic);
		
		
		int dia=04;
		int mes=05;
		int any=1994;
		String VaigNeixer= dia+"/"+mes+"/"+any;
		
		System.out.println("Vaig neixer el "+VaigNeixer);
		

		String Traspàs= "El mey any de naixement es de traspàs";
		
		String NoTraspàs= "El meu any de naixement no es de traspàs";
				
		
		if (any%4==0){
			
			//si es divisible por 4,es bisiesto con lo cual el residuo de la división ha de ser igual a 0//
			
			System.out.println(Traspàs);
		} else {
			System.out.println(NoTraspàs);
		}	
				

	}

}
