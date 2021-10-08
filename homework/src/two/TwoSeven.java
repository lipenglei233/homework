package two;
import component.usefull;

public class TwoSeven {
    public static void main(String[] args){
        usefull u = new usefull();

        long l = u.nextInt("一个正整数");
        u.pl("结果为：" + sumDigits(l));
    }

    public static int sumDigits(long n){
        int sum = 0;
        while(true){
            if(n > 10){
                sum += n % 10;
                n = n / 10;
            }else{
                sum += n;
                return sum;
            }
        }
    }
}
