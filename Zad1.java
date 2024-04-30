import java.util.Arrays;
import java.util.Scanner;

//udało mi się zrobić posortowaną tablice i ale nie wiem jak zrobić mediane


public class Zad1 {
    public static void main(String[] args) {
        Scanner wczytaj=new Scanner(System.in);
        double średnia=0;
        int i = 0, o = 0, p,ocena;
        int[] oceny = new int[20];
        String przedmiot;
        System.out.print("Podaj nazwę przedmiotu:");
        przedmiot=wczytaj.nextLine();
        System.out.println("Wpisz 0 jesli chcesz przestac wpisywac oceny");
        do {
            System.out.print("Podaj ocene:");
            ocena = wczytaj.nextInt();
            
            if(ocena>6 || ocena<0){
                System.out.println("Podałeś źłą ocene");
                continue;
            }
            else if (ocena==0){
                break;
            }
            else{
            oceny[i++] = ocena;
            o++;
            }
        } while(i < oceny.length && ocena != 0);
       
        wczytaj.close();
        
        Arrays.sort(oceny, 0, i);

        for(p=0;p<o;p++){
            średnia +=oceny[p];
        }
        System.out.print("Oceny z "+przedmiot+':');
        for(p=0;p<o;p++){
            System.out.print(oceny[p]+", ");
        } 
        System.out.println(" ");   
        System.out.println("Suma ocen z "+przedmiot+" wynosi:"+średnia);
        średnia=średnia/o;
        System.out.print("średnia z "+przedmiot+" wynosi:"+średnia);
    }
    
}
