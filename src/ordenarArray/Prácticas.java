package ordenarArray;

public class Prácticas {

	public static String[] ordenarStrings(String[] dias) {
		//Con esto comparamos las cadenas para ser ordenadas
		 for(int i=0;i<(dias.length-1);i++){
             for(int j=i+1;j<dias.length;j++){
                 if(dias[i].compareToIgnoreCase(dias[j])>0){
                     //Intercambiamos valores
                     String variableauxiliar=dias[i];
                     dias[i]=dias[j];
                     dias[j]=variableauxiliar;

                 }
             }
         }
//Devolvemos el valor
		return dias;
	}
	
}
