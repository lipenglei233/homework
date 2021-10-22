package text;

import java.util.ArrayList;
import java.util.Scanner;

public class h7 {
    public static void main(String[] args){
        Scanner putIn = new Scanner(System.in);
        int[] intList = new int[100];
        int max = 1,maxIndex = 0,xLength = 0,yLength = 1,index,guess,x = 0,y = 0,length = 1,t = 1;

        for(int i = 0;i < 100;i++){
            intList[i] = putIn.nextInt();
        }

        for(int i = 0;i < 100;i++){
            if(intList[i] == 1){
                xLength++;
                t = 1;
                
                for(int j = 1;j < 9 - i / 10;j++){
                    if(intList[i + j * 10] == 1){
                        t++;
                        System.out.println("index = "+ (i + j * 10));
                    }else{
                        break;
                    }
                }
                if(xLength == 1){
                    yLength = t;
                } 
            }else{
                length = xLength < yLength ? xLength : yLength;
                System.out.println("xLength = "+xLength+" ylenght = "+yLength+" length = " + length);
                if(length > max){
                    max = length;
                    x = i / 10;
                    y = i % 10;
                }
                xLength = 0;
                yLength = 1;
            }
            
        }

        System.out.println(max + " (" + x + "," + y +")");
    }
}
