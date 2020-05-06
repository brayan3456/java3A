package games;

import java.util.Random;
import java.util.Scanner;
/**
 * @author Brayan Vallejo
 */
public class Games {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CHALLENGE 1: P I P I P I P I ...
        //CHALLENGE 2: I P I P I P I P ...
        //CHALLENGE 3: P P P P P P P P ... IF LIMIT IS 4 THE 4 NUMBERS MUST BE PAIRS
        //CHALLENGE 4: I I I I I I I I ...
        //CHALLENGE 5: I I I I I I I I ...
        Random N = new Random();

        Scanner keyboard = new Scanner(System.in);
        int x = 0, i = 0, contP = 0, acumP = 0, contI = 0, acumI = 0, limit = 0;
        
        //Quantity of numbers to generate
        System.out.println("Please, type a random limit number to generate the list: ");
        limit = keyboard.nextInt();
        
        for(i=1;i<=limit;i++){
            x = (int)(N.nextDouble()* 10 + 1); //Limits: * UpperLimit + LowerLimit
            //System.out.println(x);
            if(x % 2 == 0){
                contP = contP + 1; //Counter
                acumP = acumP + x; //Accumulator
                System.out.println(x + "es PAR");
            }else{
                contI = contI + 1; //Counter
                acumI = acumI + x; //Accumulator
                System.out.println(x + "es IMPAR");
            }
        }
        System.out.println("Total de pares generados: " + contP);
        System.out.println("Suma de pares generados: " + acumP);
        System.out.println("Total de impares generados: " + contI);
        System.out.println("Suma de impares generados: " + acumI);
        
        //DADOS
        Random D = new Random();
        int d1 = 0, d2 = 0;
        d1 = (int)(N.nextDouble()* 10 + 1); 
        d2 = (int)(N.nextDouble()* 10 + 1);
        
        System.out.println("######################");
        
        System.out.println("Dado 1: " + d1);
        System.out.println("Dado 1: " + d2);
        
    }
}
    