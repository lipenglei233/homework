package four;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Testable {
    void test();
}

class SumOfDigits implements Testable{

    public int sumDigits(long number){
        // 在这里填写代码 
        int sum = 0;
        while(number != 0){
            long n = number % 10;
            sum+=n;
            number = number / 10;
        }
        return sum;
    }
    @Override
    public void test() {
        System.out.println("------------第1题------------");
        SumOfDigits sumOfDigits = new SumOfDigits();
        List<Integer> results = Stream.of(1234,-1234,0)
                .map(sumOfDigits::sumDigits)
                .collect(Collectors.toList());
        System.out.println(results);
    }
}

class Palindrome implements Testable{
    public boolean isPalindrome(int number){
        // 在这里填写代码
        if(number == reverse(number)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void test() {
        System.out.println("------------第2题------------");
        Palindrome palindrome = new Palindrome();
        List<Boolean> results = Stream.of(12321,1233333,111111)
                .map(palindrome::isPalindrome)
                .collect(Collectors.toList());
        System.out.println(results);
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
}

class EstimatePi implements Testable{

    public double estimate(int n){
        // 在这里填写代码
        double pi = 0;
        for(int i = 1;i <= n;i++){
            double son = Math.pow(-1, i + 1);
            double mom = 2 * i - 1;
            pi += son / mom;
        }
        pi *= 4;
        return pi;
    }

    @Override
    public void test() {
        System.out.println("------------第3题------------");
        EstimatePi estimatePi = new EstimatePi();
        List<Double> results = Stream.of(3,10,100)
                .map(estimatePi::estimate)
                .collect(Collectors.toList());
        System.out.println(results);
    }
}


class CheckPassword implements Testable {

    public String check(String input){
        // 在这里填写代码
        int count = 0;

        if(input.length() < 8){
            return "密码最少为8位";
        }

        while(input != ""){
            if(match(input.substring(0, 1)) == 1){
                count++;
            }else if(match(input.substring(0, 1)) == 0){
                return "只能包含数字和字母";
            }
            input = input.replaceFirst(input.substring(0,1), "");
        }

        if(count >= 2){
            return "正确";
        }else{
            return "最少包含两位数字";
        }
    }

    @Override
    public void test() {
        System.out.println("------------第4题------------");
        CheckPassword checkPassword = new CheckPassword();
        List<String> results = Stream.of("12ab","ab_123edge","1abceefad", "qazwsxedc123")
                .map(checkPassword::check)
                .collect(Collectors.toList());
        System.out.println(results);
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

class AverageArray implements Testable {

    public double average(double[] numbers){
        // 在这里填写代码
        double sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    public int average(int[] numbers){
        // 在这里填写代码
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    @Override
    public void test() {
        System.out.println("------------第5题------------");
        AverageArray averageArray = new AverageArray();
        List<Double> results = Stream.of(new double[]{1.0, 2.0, 3.0},
                new double[]{1.0, 2.0, 3.0, 4.0, 5.0},
                new double[]{-5.0, -2.0, 0.0, 2.0, 5.0})
                .map(averageArray::average)
                .collect(Collectors.toList());
        System.out.println(results);
        System.out.println(Stream.of(new int[]{1, 2, 3},
                new int[]{1, 2, 3, 4, 5},
                new int[]{-5, -2, 0, 2, 5})
                .map(averageArray::average)
                .collect(Collectors.toList()));
    }
}



public class Main {
    public static void main(String[] args){
        // Testable[] solutions = {
        //         new SumOfDigits(),
        //         new Palindrome(),
        //         new EstimatePi(),
        //         new CheckPassword(),
        //         new AverageArray()
        // };
        Testable[] solutions = {
            new AverageArray()
        };
        for (Testable sol: solutions) {
            sol.test();
        }

    }

}


