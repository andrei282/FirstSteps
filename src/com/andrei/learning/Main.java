package com.andrei.learning;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Punct p1 = new Punct();
        //Cerc c1 = new Cerc();
        //Punct p2 =  new Cerc();

        //System.out.println(p1 instanceof Cerc);
        /*System.out.println(c1 instanceof Cerc);
        System.out.println(p2 instanceof Punct);
        System.out.println(p2 instanceof Cerc);

        AnonimTypes a1 = new AnonimTypes(4000,3);
        AnonimTypes a2 = new AnonimTypes(2500,2);
        AnonimTypes primarie = new AnonimTypes(1000,1){
            @Override
            public double calculeazaSalariu(){
                return 5000;
            }
        };

        System.out.println(a1.calculeazaSalariu());
        System.out.println(a2.calculeazaSalariu());
        System.out.println(primarie.calculeazaSalariu());*/

        TreeSet<TreeSetExtendingComparablePersoana> persoanaTreeSet = new TreeSet<>();

        TreeSetExtendingComparablePersoana p1 = new TreeSetExtendingComparablePersoana("Liviu", 30);
        TreeSetExtendingComparablePersoana p2 = new TreeSetExtendingComparablePersoana("Cristi", 25);
        TreeSetExtendingComparablePersoana p3 = new TreeSetExtendingComparablePersoana("Bogdan", 28);

        persoanaTreeSet.add(p1);
        persoanaTreeSet.add(p2);
        persoanaTreeSet.add(p3);

        for(TreeSetExtendingComparablePersoana persoana : persoanaTreeSet){
            System.out.println(persoana);
        }
    }

    public static class Punct {

        Punct(){
            System.out.println("Punct a fost creat " );
        }
    }
    public static class Cerc extends Punct{

        Cerc(){
            System.out.println("Cerc a fost creat ");
        }

    }


}
