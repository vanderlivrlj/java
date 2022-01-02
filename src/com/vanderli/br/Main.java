package com.vanderli.br;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Integer> a = new ArrayList<Integer>();
	    ArrayList<Integer> b = new ArrayList<Integer>();

	    a.add(1);
        a.add(3);
        a.add(4);

        b.add(3);
        b.add(1);
        b.add(2);

        int PontosAlice = 0;
        int PontosBob = 0;
        for (int i = 0; i < a.size(); i++){

            if (a.get(i) > b.get(i) ){
                PontosAlice = PontosAlice + 1;
            }
            else if (a.get(i) < b.get(i)){
                PontosBob = PontosBob + 1;
            }
        }
        System.out.println("Pontos Alice: " +PontosAlice
                +"\nPontos Bob:" +PontosBob);

    }
}
