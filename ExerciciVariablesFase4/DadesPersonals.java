
public class DadesPersonals {

	public static void main(String[] args) {
		
		String Nom="David";
		String Cognom1="Su�rez";
		String Cognom2="C�rdenas";
		String EmDic= Nom+" "+Cognom1+" "+Cognom2+" ";
		
		
		System.out.println("El meu nom �s "+EmDic);
		
		
		int dia=04;
		int mes=05;
		int any=1994;
		String VaigNeixer= dia+"/"+mes+"/"+any;
		
		System.out.println("Vaig neixer el "+VaigNeixer);
		

		String Trasp�s= "El mey any de naixement es de trasp�s";
		
		String NoTrasp�s= "El meu any de naixement no es de trasp�s";
				
		
		if (any%4==0){
			
			//si es divisible por 4,es bisiesto con lo cual el residuo de la divisi�n ha de ser igual a 0//
			
			System.out.println(Trasp�s);
		} else {
			System.out.println(NoTrasp�s);
		}	
				

	}

}
