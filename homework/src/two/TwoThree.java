package two;
import java.util.*;
import component.usefull;

public class TwoThree {
    public static void main(String[] args){
        usefull u = new usefull();
        Scanner input = new Scanner(System.in);
        String s = u.nextStr("字符串");
        u.pl("字符串的长度是：" + s.length() + "，字符串最后一个字母是：" + s.substring(s.length()-1));
    }

}
