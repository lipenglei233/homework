package two;

import java.util.Random;

public class TwoNine {
    public static void main(String[] args){
        Random r = new Random();
        for(int i = 0;i < 10;i++){
            System.out.print(r.nextInt(10));
        }
    }
}
