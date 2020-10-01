package exercici4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Fase2 {

	public static void main(String[] args) {
		int bitllet_5 = 5;
		int bitllet_10= 10;
		int bitllet_20 = 20;
		int bitllet_50 = 50;
		int bitllet_100 = 100;
		int bitllet_200 = 200;
		int bitllet_500 = 500;
		int preu_total[] = new int[5];
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

		    } 
	}

