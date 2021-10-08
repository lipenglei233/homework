package two;
import java.util.ArrayList;
import java.util.Collections;

import component.usefull;

public class TwoSix {
    public static void main(String[] args){
        usefull u = new usefull();
        ArrayList<String> list = new ArrayList<String>();

        int n = u.nextInt("一个正整数");
        int oldN = n;
        for(int i = 2;i <= n;i++){
            if(n % 2 == 0){
                list.add("2,");
                n = n / 2;
                i = 1;
            }else if(isPrime(i)){
                if(n % i == 0){
                    list.add(i + ",");
                    n = n / i;
                    i = 1;
                }
            }
        }
        Collections.sort(list);

        u.p(oldN + "的最小公约数有：");
        for(int j = 0;j < list.size();j++){
            u.p(list.get(j));
        }
    }

    public static boolean isPrime(int n){
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
