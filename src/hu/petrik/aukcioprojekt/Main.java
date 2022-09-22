package hu.petrik.aukcioprojekt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        List <Festmeny> lista = new ArrayList<>();
        lista.add(new Festmeny("Festett kep","Bodor István","Barokk"));
        lista.add(new Festmeny("Festett vaszon","Bodor István","Romantikus"));
        System.out.println("Adja meg hány festményt szeretne hozzáadni: ");
        int n = sc.nextInt();
        sc.nextLine();











    }



}
