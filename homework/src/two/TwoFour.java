package two;
import component.*;

public class TwoFour {
    public static void main(String[] args){
        usefull u = new usefull();

        String s1 = u.nextStr("第一个字符串");
        String s2 = u.nextStr("第二个字符串");
        System.out.println("第二个字符串" + (s1.indexOf(s2) == -1 ? "不是" : "是") + "第一个字符串的子字符串");
    }
}
