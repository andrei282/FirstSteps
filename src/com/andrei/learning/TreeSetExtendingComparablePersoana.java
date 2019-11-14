package com.andrei.learning;

public class TreeSetExtendingComparablePersoana implements Comparable<TreeSetExtendingComparablePersoana> {

    String nume;
    Integer varsta;

    public TreeSetExtendingComparablePersoana(String nume, Integer varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public int compareTo(TreeSetExtendingComparablePersoana o) {
        return this.varsta - o.varsta;
    }

    @Override
    public String toString() {
        return this.nume + " ";
    }

}
