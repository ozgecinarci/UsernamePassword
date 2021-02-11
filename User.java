import java.util.Scanner;


public class User {
	public static void main (String[] args){
		String isim="Ozge";
		String parola="019283";
		Scanner scan = new Scanner (System.in);
		System.out.println("Kullanýcý adý:");
		String username=scan.nextLine();
		System.out.println("Parola:");
		String password=scan.nextLine();
		if (!(isim.equals(username))&& !(parola.equals(password))){
			System.out.println("Kullanýcý adý ve parola yanlýþ");
		}
		else if (isim.equals(username)&& !(parola.equals(password))){
			System.out.println("Parolayý yanlýþ girdiniz");
		}
		else if (!(isim.equals(username)&& (parola.equals(password)))){
			System.out.println("Kullanýcý adýný yanlýþ girdiniz");
		}
		else{
			System.out.println("Giriþ baþarýlý...");
		}

}
}
