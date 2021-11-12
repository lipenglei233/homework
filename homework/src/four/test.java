package four;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class test {
    public static void main(String[] args){
        int count = 0;
        String input = "655flslfsj";

        if(input.length() < 8){
            System.out.println("密码最少为8位");
        }

        while(input != ""){
            if(match(input.substring(0, 1)) == 1){
                count++;
            }else if(match(input.substring(0, 1)) == 0){
                System.out.println("只能包含数字和字母");
            }
            
            input = input.replaceFirst(input.substring(0,1), "");
            System.out.println(input);
        }

        if(count >= 2){
            System.out.println("正确");
        }else{
            System.out.println("最少包含两位数字");
        }
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
