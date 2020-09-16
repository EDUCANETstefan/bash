import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Konec {
    public static void main(String args[]) {

        String cislo;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> cisla = new ArrayList<Integer>();

        cislo = sc.nextLine();

        while(!cislo.equals("end")) {

            //přidání čísla do pole a převod na Integer
            cisla.add(Integer.parseInt(cislo));

            cislo = sc.nextLine();
        }

        //výpočet - suma
        int sum = cisla.stream().mapToInt(i -> i).sum();

        //výpočet - průměr
        double prumer = sum / cisla.size();

        //seřazení čísel v ArrayListu
        Collections.sort(cisla);
        
        //výpis
        System.out.println("Suma je: " + sum);
        System.out.println("Průměr je: " + prumer);
        System.out.println("Nejmenší číslo je: " + cisla.get(0));
        System.out.println("Největší číslo je: " + cisla.get(cisla.size() -1));

    }
}