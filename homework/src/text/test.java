package text;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PrimeIterator p = new PrimeIterator(n);

        // int count = 1;
        // GenericStack g = new GenericStack();
        // g.push(2);

        // for(int i = 3;count < n;i++){
        //     if(isPrime(i)){
        //         g.push(i);
        //         count++;
        //     }
        // }

        // for(int i = 0;i < count;i++){
        //     System.out.print(g.pop() + " ");
        // }

        
    }

    public static class GenericStack{
        private ArrayList<Integer> list = new ArrayList<Integer>();

        public void push(int n){
            list.add(n);
        }

        public int pop(){
            int num = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return num;
        }
    }

    public static boolean isPrime(int n){
        for(int i = 2;i <= n/2;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static class PrimeIterator{
        ArrayList<Integer> list = new ArrayList<Integer>();

        public PrimeIterator(int n){
            list.add(2);
            for(int i = 3;i <= n;i++){
                if(isPrime(i)){
                    list.add(i);
                    System.out.print(i + " ");
                }
            }
        }
    }
}
