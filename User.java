import java.util.Scanner;


public class User {
	public static void main (String[] args){
		String isim="Ozge";
		String parola="019283";
		Scanner scan = new Scanner (System.in);
		System.out.println("Kullan�c� ad�:");
		String username=scan.nextLine();
		System.out.println("Parola:");
		String password=scan.nextLine();
		if (!(isim.equals(username))&& !(parola.equals(password))){
			System.out.println("Kullan�c� ad� ve parola yanl��");
		}
		else if (isim.equals(username)&& !(parola.equals(password))){
			System.out.println("Parolay� yanl�� girdiniz");
		}
		else if (!(isim.equals(username)&& (parola.equals(password)))){
			System.out.println("Kullan�c� ad�n� yanl�� girdiniz");
		}
		else{
			System.out.println("Giri� ba�ar�l�...");
		}

}
}
