package sec.schonherz;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static String caesarCode(String szoveg, int eltolas){
        StringBuilder titkositottUzenet = new StringBuilder();
        for(char karakter : szoveg.toCharArray()){
        char eltoltKarakter = karakter;

        //Nagybetű kezelés
        if(Character.isUpperCase(eltoltKarakter)){
            eltoltKarakter = (char) ((karakter - 'A' + eltolas) % 26 + 'A');
        }
        //Kisbetű kezelés
        if(Character.isLowerCase(eltoltKarakter)){
            eltoltKarakter = (char) ((karakter - 'a' + eltolas) % 26 + 'a');
        }
        titkositottUzenet.append(eltoltKarakter);
        }
        return titkositottUzenet.toString();
    }
    public static void main(String[] args) {
        //11. feladat
        List<Nev> nevek = List.of(
                new Nev("Kovács", "László"),
                new Nev("Tóth", "Sándor"),
                new Nev("Szabó", "Anna"),
                new Nev("Nagy", "Béla"),
                new Nev("Varga", "Zsolt")
        );

        String vezeteknevS = nevek.stream()
                .filter(nev -> nev.getKeresztnev().equals("Sándor"))
                .findFirst()
                .map(Nev::getVezeteknev)
                .orElse(null);
        System.out.println(vezeteknevS);

        //12. feladat
        Scanner sc = new Scanner(System.in);
        int szam = sc.nextInt();
        for (int i = 1; i <= szam; i++) {
            if(szam % i == 0) System.out.print(i + " ");
        }
        sc.close();
    }
}
