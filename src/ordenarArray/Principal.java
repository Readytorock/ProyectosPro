package ordenarArray;
public class Principal {
public static void main(String[] args) {
	//Creamos las cadenas
	String[] dias = {"A","C","F","D","B","E","G"};
	//llamamos al m�todo
	ordenarArray.Pr�cticas.ordenarStrings(dias);
	//Creamos el for para recorrerlo
	for (int i = 0; i < dias.length; i++) {
		System.out.println(dias[i]);
	}
}
}
