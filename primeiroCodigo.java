
public class Main {

	public static void main(String[] args) {
		
		/* 
		 %f == ponto flutuante
		 %d == inteiro
		 %s == texto
		 %n == quebra de linha
		 	*/
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int   age  = 30;
		int code = 5290;
		char gender = 'F';
		
	    double price1 = 2100.0;
	    double price2 = 650.50;
	    double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s , wich price is $ %f %n", product1,price1);
		System.out.printf("%s , wich price is $ %f %n" , product2, price2);
		System.out.print("record:");
		System.out.printf(" %s years old, code %d and gender: %s %n ", age, code, gender);
		System.out.printf("measure with eight decimal places %.4f  %n: ", measure);
		System.out.printf("Rouded(three decimal places): %.2f %n", measure);
		System.out.printf("US decimal point: %.2f", measure);
	}

}
