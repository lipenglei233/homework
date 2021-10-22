package text;

import java.util.Scanner;

public class h4 {
    public static void main(String[] args){
        Scanner sentence = new Scanner(System.in);
        char[] charList = sentence.nextLine().toCharArray();
        int a = 98,new_a = 98,new_length = 0,letter_length = 0;
        String letter = "a",maxLetter = "a";

        for(int i = 0;i < charList.length;i++){
            if(charList[i] == new_a){
                letter = letter + (char)new_a;
                new_a++;
                new_length++;
            }else if(charList[i] > new_a){
                letter = letter + charList[i];
                new_a = (int)charList[i];
            }else{
                if(letter_length == 0){
                    maxLetter = letter;
                    letter_length = new_length;
                }else{
                    if(new_length > letter_length){
                        maxLetter = letter;
                        letter_length = new_length;
                    }
                }
            }
        }

        System.out.println(maxLetter);

    }
}
