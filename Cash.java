package cash;

import static java.lang.Math.round;
import java.util.ArrayList;
public class Cash {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 10000);
        int roundednum;
        roundednum = round(num);
        int[] array1 = moneyCounter(roundednum);
        int[] array2 = {10, 5, 5, 20, 20, 20, 50};
            boolean isCashRegisterValid = compareArrays(array1, array2).equals(array1);
        if(isCashRegisterValid){
            for(int i = 0; i < array1.length; i++){
                System.out.println(array1[i]);
            }
        }else{System.out.println("Az adott összeg nem fizethető ki az adott bankjegyekkel.");}
    }
    public static int[] moneyCounter(int x) {
        int[] array = new int[7];
        
        
        for (int i = array.length; i > 0; i--) {
           
            if (x > 500) {
                array[0] += 1;
                x -= 500;
            }
            if (x > 200) {
                array[1] += 1;
                x -= 200;
            }
            if (x > 100) {
                array[2] += 1;
                x -= 100;
            }
            if (x > 50) {
                array[3] += 1;
                x -= 50;
            }
            if (x > 20) {
                array[4] += 1;
                x -= 20;
            }
            if (x > 10) {
                array[5] += 1;
                x -= 10;
            }
            if (x > 5) {
                array[6] += 1;
                x -= 5;
            }

        }
        return array;
    }

     public static int[] compareArrays(int[] optimalAmountOfCash, int[] cashRegister) {
        
         for (int i = 0; i < optimalAmountOfCash.length; i++) {
            if (optimalAmountOfCash[i] > cashRegister[i]) {
                return optimalAmountOfCash;
            }
        }
        return cashRegister;
    }
    

    
    
}
