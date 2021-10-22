package text;

import java.util.Scanner;

public class h6 {
    public static void main(String[] args){
        Scanner putIn = new Scanner(System.in);
        int[] intList = new int[100];
        int max = 1,maxIndex = 0,xLength = 0,yLength = 0,j;

        for(int i = 0;i < 100;i++){
            intList[i] = putIn.nextInt();
        }

        for(int i = 0;i < 100;i++){
            if(intList[i] == 1){
                xLength = 1;
                yLength = 1;
                j = i + 1;
                while(intList[j] != 0){
                    xLength++;
                    j++;
                }
                j = i + 10;
            }
        }
    }
}
