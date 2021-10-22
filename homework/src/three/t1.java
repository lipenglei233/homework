package three;

import component.usefull;

public class t1 {
    public static void main(String[] args){
        usefull u = new usefull();
        int a,b,c;

        a = u.nextInt("a");
        b = u.nextInt("b");
        c = u.nextInt("c");

        if(Math.pow(b, 2) - 4 * a * c > 0){
            u.pl("有两个根");
        }else if(Math.pow(b, 2) - 4 * a * c == 0){
            u.pl("有一个根");
        }else {
            u.pl("没有根");
        }
    }
    
}
