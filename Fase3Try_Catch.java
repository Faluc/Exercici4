package exercici4;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Fase3Try_Catch {

	public static void main(String[] args) {
		int preu_total = 0;
		String[] menu = new String[5];
		int[] preu_plat = new int[5];
		int continuar = 1;
		Scanner llista_plats = new Scanner(System.in);
		Scanner llista_preus = new Scanner(System.in);
		Scanner continuar_comanda = new Scanner(System.in);
		ArrayList<String> comanda = new ArrayList<String>();
		
		for (int i = 0; i<5 ; i++){
            System.out.print("Introdueix el nom del plat " + (i+1) + ": ");
            menu[i] = llista_plats.nextLine();
            System.out.print("Introdueix el preu del plat " + (i+1) + ": ");
            preu_plat[i] = llista_preus.nextInt();}
		while (continuar == 1) {
        System.out.println("La nostra carta: ");
        for (int i = 0; i<5 ; i++){
            System.out.println(menu[i]+": "+ preu_plat[i]+" euros");}
        
        System.out.println("Què t'agradaria menjar?");
        comanda.add(llista_plats.nextLine());
        System.out.println("Vols demanar més plats? (1 = SI / 0 = NO)");
        continuar = continuar_comanda.nextInt();}

    System.out.println("Els plats demanats són: "+ comanda);
    try {
    for (int i = 0; i < comanda.size(); i++) {
        if (Objects.equals(comanda.get(i), menu[0])) {
            preu_total = preu_total + preu_plat[0];
        }
        if (Objects.equals(comanda.get(i), menu[1])) {
            preu_total = preu_total + preu_plat[1];
        }
        if (Objects.equals(comanda.get(i), menu[2])) {
            preu_total = preu_total + preu_plat[2];
        }
        if (Objects.equals(comanda.get(i), menu[3])) {
            preu_total = preu_total + preu_plat[3];
        }
        if (Objects.equals(comanda.get(i), menu[4])) {
            preu_total = preu_total + preu_plat[4];
        }
        if (!Objects.equals(comanda.get(i), menu[0]) && !Objects.equals(comanda.get(i), menu[1]) && !Objects.equals(comanda.get(i), menu[2]) && !Objects.equals(comanda.get(i), menu[3]) && !Objects.equals(comanda.get(i), menu[4])){
        	System.out.println("Algún dels plats demanats no existeix. Revisa la teva comanda.");
        }
        }
    } catch (Exception e) {
    	System.out.println("Hi ha algún error");
    }
    
    System.out.println("El preu total es de: " + (preu_total) + " euros.");
}
}

