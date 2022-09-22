package hu.petrik.aukcioprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Festmenyek {
    private List <Festmeny> lista = new ArrayList<>();

    public Festmenyek() {
    }

    public Festmenyek(String fajlNev) throws IOException {

        FileReader fr = new FileReader(fajlNev);
        BufferedReader br = new BufferedReader(fr);
        String sor = br.readLine();
        while (sor != null && !sor.equals(""))
        {
            String[] adatok = sor.split(";");
            Festmeny festmeny = new Festmeny(adatok[1], adatok[0], adatok[2]);
            this.lista.add(festmeny);
            sor = br.readLine();
        }
        br.close();
        fr.close();
    }

    public Festmenyek(Festmeny[] emberTomb) {

        this.lista.addAll(Arrays.asList(emberTomb));
    }





}
