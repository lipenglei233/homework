package two;
import component.*;

public class TwoEight {
    public static void main(String[] args){
        usefull u = new usefull();

        int n = u.nextInt("一个正整数");
        u.pl(n + (isPalindrome(n) ? "是" : "不是") +"回文体");

    }

    public static int reverse(int number){
        int sum = 0;
        while(true){
            if(number > 10){
                sum = sum * 10 + number % 10;
                number = number / 10;
            }else{
                sum = sum * 10 + number;
                return sum;
            }
        }
    }

    public static boolean isPalindrome(int number){
        int rn = reverse(number);
        return rn == number;
    }
}
