package hu.petrik.aukcioprojekt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


       /*Scanner sc = new Scanner(System.in);
        Festmenyek festmenyek = new Festmenyek();

        System.out.println("Adja meg hány festményt szeretne hozzáadni: ");
        int n = sc.nextInt();
        sc.nextLine();*/
        Festmeny festmeny = new Festmeny("Macskajajj", "Bodor István", "Romantikus");
        festmeny.licit();
        System.out.println(festmeny);
        festmeny.licit();
        System.out.println(festmeny);
        festmeny.licit();

        System.out.println(festmeny);
        festmeny.licit(50);
        System.out.println(festmeny);











    }



}
