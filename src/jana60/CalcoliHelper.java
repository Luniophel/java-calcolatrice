package jana60;

public class CalcoliHelper {
	
	private CalcoliHelper() {
		//private Constructor
	}
	
	//METHODS
	
	//Metodi per Interi
	//Calcola la somma di due numeri interi
	public static int sum(int num1, int num2) 
	{
		return num1 + num2;
	}
	
	//Calcola la differenza tra due numeri interi
	public static int diff(int num1, int num2) 
	{
		return num1 - num2;
	}
	
	//Calcola il prodotto di due numeri interi
	public static int mult(int num1, int num2)
	{
		return num1 * num2;
	}
	
	//Calcola il valore assoluto di un numero intero
	public static int absolute (int num)
	{
		if (num >= 0)
		{
			return num;
		}
		else
		{
			return -num;
		}
	}
	
	//Calcola il valore minimo tra due interi
	public static int whoMin (int num1, int num2)
	{
		if (num1 > num2)
		{
			return num2;
		}
		else if (num1 < num2)
		{
			return num1;
		}
		else
		{
			System.out.println("ATTENZIONE: Hai dichiarato due numeri identici.");
			return num1;
		}
	}
	
	//Calcola il valore massimo tra due interi
	public static int whoMax (int num1, int num2)
	{
		if (num1 > num2)
		{
			return num1;
		}
		else if (num1 < num2)
		{
			return num2;
		}
		else
		{
			System.out.println("ATTENZIONE: Hai dichiarato due numeri identici.");
			return num1;
		}
	}

	//Metodi per Double
	public static double sum(double num1, double num2) 
	{
		return num1 + num2;
	}
	
	//Calcola la differenza tra due numeri interi
	public static double diff(double num1, double num2) 
	{
		return num1 - num2;
	}
	
	//Calcola il prodotto di due numeri interi
	public static double mult(double num1, double num2)
	{
		return num1 * num2;
	}
	
	//Calcola il valore assoluto di un numero intero
	public static double absolute (double num)
	{
		if (num >= 0)
		{
			return num;
		}
		else
		{
			return -num;
		}
	}
	
	//Calcola il valore minimo tra due interi
	public static double whoMin (double num1, double num2)
	{
		if (num1 > num2)
		{
			return num2;
		}
		else if (num1 < num2)
		{
			return num1;
		}
		else
		{
			System.out.println("ATTENZIONE: Hai dichiarato due numeri identici.");
			return num1;
		}
	}
	
	//Calcola il valore massimo tra due interi
	public static double whoMax (double num1, double num2)
	{
		if (num1 > num2)
		{
			return num1;
		}
		else if (num1 < num2)
		{
			return num2;
		}
		else
		{
			System.out.println("ATTENZIONE: Hai dichiarato due numeri identici.");
			return num1;
		}
	}

}
