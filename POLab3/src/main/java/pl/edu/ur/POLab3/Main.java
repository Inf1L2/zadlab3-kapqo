/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;
/**
 *
 * @author Kacper Kowalik lab2
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        //zadanie1.4
        int x=12;
        int x1=-12;
        int y=3;
        int z =x<<y;
        int z1 =x>>y;
        int z2 =x1>>>y;
        System.out.println("Przesunięcie liczby 12 o 3 miejsca w lewo da nam liczbę równą " + z);
        System.out.println("Przesunięcie liczby 12 o 3 miejsca w prawo da nam liczbę równą " + z1);
        System.out.println("Przesunięcie liczby -12 o 3 miejsca w prawo, bez znaku da nam liczbę równą " + z2);
        */
        
        /*
        //zadanie1.7
        int a=5;
        int b=3;
        int z=a^b;
        int z1=~a;
        
        System.out.println("Za operacje XOR odpowiada operator ^ , przykład 5^3= "+z);
        System.out.println("Za operacje NOT odpowiada operator ~ , przykład ~5= "+z1);
        */
        
        /*
        //zadanie2.2
        String test= new String("Czesc jestem Kacper");
        System.out.println("Wartość początkowa: "+test);
        System.out.println("Wartość zwrócona po zastosowaniu metody toCharString: ");   //toCharString
        System.out.println(test.toCharArray() );
        
        byte[] test2 = test.getBytes();                                                 //getbytes
        System.out.println("Wartość zwrócona po zastosowaniu metody getBytes: ");
        for(int i=0;i<test2.length;i++)
        {
        System.out.println(i+".'"+test2[i]+"' ");
        }
        
        String jeden = "czesc";
        String dwa = "czesc";
        System.out.println("Poróananie dwóch takich samych stringów metodą equals()");  //boolean equals
        System.out.println(jeden==dwa);
        System.out.println(jeden.equals(dwa)+ "\n\n");
        
        String comp1 = "Oni są ważni";
        String comp2 = "Oni są ważni";
        String comp3 = "Oni nie są ważni";
        System.out.println("Porównanie dwóch takich samych stringów metodą compareTo, wynik: ");    //compareTo
        int wynik = comp1.compareTo(comp2);
        System.out.println(wynik);
        System.out.println("Porównanie dwóch innych stringów metodą compareTo, wynik: ");
        wynik = comp2.compareTo(comp3);
        System.out.println(wynik + "\n\n");
        
        String test3 = "Cześć jestem Kacper";
        System.out.println("Metoda indexOf podaje nam indeks, na którym znajduje się dana litera w naszym stringu\n");     //indexOf
        System.out.println("Znaleziony indeks: ");
        System.out.println(test3.indexOf('K')+"\n\n");
        
        System.out.println("Metoda lastIndexOf podaje nam ostatni indeks, na którym znajduje się odana litera w naszym stringu\n"); //lastIndexOf
        System.out.println("Znaleziony indeks: ");
        System.out.println(test3.lastIndexOf('e')+"\n\n");
        
        System.out.println("Metoda substring zwraca wybrany fragment ciągu znaków o podanym zakresie indeksów \n");      //substring
        System.out.println(test3.substring(6,12)+"\n\n");
        
        System.out.println("Metoda replace zamienia podaną litere w stringu na inną \n");      //replace
        System.out.println(test3.replace('e', 'Y')+"\n\n");
        
        System.out.println("Metoda trim usuwa wszystkie białe znaki na początku i końca stringa \n");      //trim
        System.out.println(test3.trim()+"\n\n");
        
        System.out.println("Metoda toLowerCase zamienia wszystkie duże litery na małe \n");      //toLowerCase
        System.out.println(test3.toLowerCase()+"\n\n");
        
        System.out.println("Metoda toUpperCase zamienia wszystkie małe litery na duże \n");      //toUpperCase
        System.out.println(test3.toUpperCase()+"\n\n");
        
        System.out.println("Metoda split rozbija ciąg znaków na fragmenty \n");      //split
        String[] test4 = test3.split("\\s"); 
        
        for(String w:test4){
            System.out.println(w);
        }
        */
        
        /*
        //zadanie3.3
        Scanner sca = new Scanner(System.in);
        int a;
        int b;
        long w=1;
        System.out.println("Jaką liczbę chcesz spotęgować? ");
        a = sca.nextInt();
        System.out.println("Podaj wykładnik: ");
        b = sca.nextInt();
        System.out.println("Liczba " +a+ " ^ " +b+ " wynosi: "+potega(a, b));
       
        System.out.println("Iteracyjnie\n");
        System.out.println("Liczba " +a+ " ^ " +b+ " wynosi: "+w);
        */
        
        /*
        //zadanie3.4
        Scanner sca = new Scanner(System.in);
        int x;
        System.out.println("Który wyraz ciągu Fibonacciego chcesz wyświetlić? ");
        x = sca.nextInt();
        System.out.println(x+"-ty wyraz ciągu Fibonacciego wynosi: "+fibb(x));
        */
        
        
        
}
        public static int potega(int a, int b){
        if(b==0) return 1;
                else return a*potega(a, --b);
                    }
        
        public static int fibb(int x)
        {
            if ((x==1)||(x==2)) return 1;
            else return fibb(x-1)+fibb(x-2);
        }

        public static int inte(int a, int b, long w)
        {
             for(int i=1; i<=b; i++)
        {
            w=w*a;
        }
        return 0;
        }
}
