package com.andrei.learning;

public class AnonimTypes{
    public double salariu;
    public int vechime;

    public AnonimTypes(double salariu, int vechime) {
        this.salariu = salariu;
        this.vechime = vechime;
    }

    public double calculeazaSalariu(){
        if(vechime >= 3)
            return salariu += 500;
        else
            return salariu;
    }
}
