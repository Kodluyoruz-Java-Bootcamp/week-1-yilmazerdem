package com.example.kodluyoruz;

import java.lang.reflect.Array;
import java.util.*;

public class Mylist {

    public static void main(String[] args) {
        Set<String> strlist = new HashSet<>(5);
        System.out.println("EKLEME YAP");
        Scanner scan = new Scanner(System.in);
        String not = scan.nextLine();
        String name = String.valueOf(not.charAt(0));


        //EKLEME KOŞULU
        if (name.equals("C")){
            System.out.println("Ekleme Islemi : " + strlist.add(not));
        }
        else {
            System.out.println("Ilk harf C degildir. Ekleme basarisiz" );
        }
        //TÜM LİSTE
        System.out.println("lISTE : "+strlist);
    }
}
