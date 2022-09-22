package hu.petrik.aukcioprojekt;

import java.time.LocalDateTime;

public class Festmeny {

    private String cim;
    private String festo;
    private String stilus;
    private int licitekSzama;
    private int legmagasabbLicit;
    private LocalDateTime legutolsoLicitIdeje;
    private boolean elkelt;


    public Festmeny(String cim, String festo, String stilus) {

            this.cim = cim;
            this.festo = festo;
            this.stilus = stilus;
            this.licitekSzama =0;
            this.legmagasabbLicit =0;
            this.elkelt = false;
    }

    public String getFesto() {
        return this.festo;
    }

    public String getStilus()
    {
        return this.stilus;

    }

    public int getLicitekSzama() {
        return this.licitekSzama;
    }

    public int getLegmagasabbLicit() {
        return this.legmagasabbLicit;
    }

    public LocalDateTime getLegutolsoLicitIdeje() {
        return this.legutolsoLicitIdeje;
    }
    public boolean getElkelt()
    {
        return this.elkelt;

    }
    public void setElkelt(boolean elkelt)
    {
        this.elkelt = elkelt;

    }
    public void licit()
    {
        if (this.elkelt = true)
        {
            System.out.println("A festmény már elkelt!");
        }
        else if (this.licitekSzama ==0)
        {
            this.legmagasabbLicit +=100;
            this.licitekSzama ++;
            this.legutolsoLicitIdeje = LocalDateTime.now();

        }
        else {
            licit(10);
        }
    }
    public void licit(int mertek)
    {
        if (mertek<10||mertek>100)
        {
            System.out.println("Hibás paraméter!");

        }
        else if(this.licitekSzama ==0)
        {
            this.legmagasabbLicit +=100;
            this.licitekSzama ++;
            this.legutolsoLicitIdeje = LocalDateTime.now();

        }
        else if (this.licitekSzama>0)
        {
            double szazalek = (1 + mertek/100);
            this.legmagasabbLicit = (int)(this.legmagasabbLicit*szazalek);
            this.licitekSzama ++;
            this.legutolsoLicitIdeje = LocalDateTime.now();
        }
    }

    @Override
    public String toString() {
        if (this.elkelt ==true)
        {
         String alma =String.format("%s: %s (%s) \nElkelt\n%d $ - %s (összesen: %d db)",this.festo, this.cim, this.stilus, this.legmagasabbLicit, this.legutolsoLicitIdeje, this.licitekSzama);



            return alma;

        }
        else{

            String alma =String.format("%s: %s (%s) \n%d $ - %s (összesen: %d db)",this.festo, this.cim, this.stilus, this.legmagasabbLicit, this.legutolsoLicitIdeje, this.licitekSzama);
            return alma;
        }



    }
}
