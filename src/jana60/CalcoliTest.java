package jana60;

public class CalcoliTest {

	public static void main(String[] args) {
		
		//Test del metodo che calcola la somma due numeri interi
		System.out.println("\n______Calcola Somma______");
		
		System.out.println(CalcoliHelper.sum(5, 10));
		
		//Test del metodo che calcola la differenza tra due numeri interi
		System.out.println("\n______Calcola Differenza______");
		
		System.out.println(CalcoliHelper.diff(27, 41));	//Minuendo < Sottraendo
		System.out.println(CalcoliHelper.diff(41, 27));	//Minuendo > Sottraendo

		//Test del metodo che calcola il prodotto di due numeri interi
		System.out.println("\n______Calcola Prodotto______");
		
		System.out.println(CalcoliHelper.mult(4, 9));

		//Test del metodo che calcola il valore assoluto di un numero intero
		System.out.println("\n______Calcola Valore Assoluto______");
		
		System.out.println(CalcoliHelper.absolute(-77));			//Valore negativo
		System.out.println(CalcoliHelper.absolute(52));			//Valore positivo
		
		//Test del metodo che calcola il valore Massimo tra due numeri interi
		System.out.println("\n______Calcola Massimo______");
		
		System.out.println(CalcoliHelper.whoMax(47, 32));	// num1 > num2
		System.out.println(CalcoliHelper.whoMax(32, 47));	// num1 < num2
		System.out.println(CalcoliHelper.whoMax(5, 5));	// num1 = num2

		//Test del metodo che calcola il valore Minimo tra due numeri interi
		System.out.println("\n______Calcola Minimo______");
		
		System.out.println(CalcoliHelper.whoMin(47, 32));	// num1 > num2
		System.out.println(CalcoliHelper.whoMax(32, 47));	// num1 < num2
		System.out.println(CalcoliHelper.whoMax(5, 5));	// num1 = num2
		
		
		System.out.println(CalcoliHelper.sum(10.00, 52.00));	//Test del metodo che somma parametri double
		
		/* Il principio della programmazione ad oggetti che sfrutta la possibilità di scrivere lo stesso metodo
		 * per tipi di parametri diversi viene detto OVERLOAD. 
		 */
		
		//Test del metodo che calcola il valore di un numero elevato a potenza
		System.out.println("\n______Calcolo Potenze______");
		
		System.out.println(CalcoliHelper.power(5, 1));		//Base positiva, esponente positivo
		System.out.println(CalcoliHelper.power(-5, 2));		//Base negativa, esponente positivo	pari
		System.out.println(CalcoliHelper.power(-5, 3));		//Base negativa, esponente positivo dispari
		
		System.out.println(CalcoliHelper.power(5, -1));		//Base positiva, esponente negativo
		System.out.println(CalcoliHelper.power(-5, -2));	//Base negativa, esponente negativo	pari
		System.out.println(CalcoliHelper.power(-5, -3));	//Base negativa, esponente negativo dispari
		
		System.out.println(CalcoliHelper.power(0, 0));		//Base ed Esponente uguali a 0, segnala valore indefinito con 1
	
	}

}
