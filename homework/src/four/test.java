package four;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class test {
    public static void main(String[] args){
        String str = "Dkjhhgg";
        System.out.println(match(str.substring(0,1)));
        System.out.println(str.replaceFirst(str.substring(0,1), ""));
    }

    public static int reverse(int number){
        int last = 0;
        while(number != 0){
            last *= 10;
            last += number % 10;
            number /= 10;
        }
        return last;
    }

    public static int match(String str) {
        String regex = "[0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if(matcher.matches()){
            return 1;
        }else{
            regex = "[a-zA-Z]";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(str);
            if(matcher.matches()){
                return 2;
            }
        }
        return 0;
    }
}
