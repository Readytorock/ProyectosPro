package ordenarArray;
public class Principal {
public static void main(String[] args) {
	//Creamos las cadenas
	String[] dias = {"A","C","F","D","B","E","G"};
	//llamamos al método
	ordenarArray.Prácticas.ordenarStrings(dias);
	//Creamos el for para recorrerlo
	for (int i = 0; i < dias.length; i++) {
		System.out.println(dias[i]);
	}
}
}
