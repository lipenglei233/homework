package three;

import java.util.ArrayList;
import java.util.Scanner;

interface Testable {
    void test();
}

class SolveQuadratic implements Testable{

    public void displayRoot(double a, double b, double c){
        double delta = b * b - 4 * a * c;
        if(delta >= 0){
            double sqrtDelta = Math.sqrt(delta);
            double r1 = (b + sqrtDelta) / a;
            double r2 = (b - sqrtDelta) / a;
            System.out.println("root1 = " + r1 + ", root2 = " + r2);
        }else if(delta == 0){
            double sqrtDelta = Math.sqrt(delta);
            double r1 = (b + sqrtDelta) / a;
            System.out.println("root1 = " + r1);
        }else{
            System.out.println("root1 = Null");
        }
    }

    @Override
    public void test() {
        System.out.println("------------第1题------------");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        displayRoot(a, b ,c);
    }
}

class RandomMonth implements Testable{
    public void getMouth(int m){
        String[] mouth = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("随机数是：" + m + ",对应的月份是：" + mouth[m - 1]);
    }

    @Override
    public void test() {
        System.out.println("------------第2题------------");
        int m = (int)Math.random() * 12 + 1;
        getMouth(m);
    }
}

class ShippingCost implements Testable{
    public void getCost(double w){
        if(w > 0){
            if(w <= 1){
                System.out.println("花费是3.5美元");
            }else if(w <= 3){
                System.out.println("花费是5.5美元");
            }else if(w <= 10){
                System.out.println("花费是8.5美元");
            }else if(w <= 20){
                System.out.println("花费是10.5美元");
            }else{
                System.out.println("the package cannot be shipped.");
            }
        }
    }

    @Override
    public void test() {
        System.out.println("------------第3题------------");
        Scanner input = new Scanner(System.in);
        double w = input.nextDouble();
        getCost(w);
    }
}

class FindChar implements Testable{
    public void getAscll(int a){
        System.out.println("对应的Ascll码是：" + (char)a);
    }

    @Override
    public void test() {
        System.out.println("------------第4题------------");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        getAscll(a);
    }
}

class StudentMajor implements Testable{
    public void getStudent(String m,int i){
        String[] n = {"大一","大二","大三","大四"};

        System.out.println("这个学生是" + (m.equals("M") ? "Mathematics" : (m.equals("C") ? "Computer Science" : "Information Technology")) + "专业的" + n[i + 1] + "学生");
    }

    @Override
    public void test() {
        System.out.println("------------第5题------------");
        Scanner input = new Scanner(System.in);
        String m = input.next();
        int i = input.nextInt();
        getStudent(m, i);
    }
}

class FindHighestScore implements Testable{
    public void getHighestScore(int i){
        Scanner input = new Scanner(System.in);
        int score = 0,j,in;
        String name = "null",n;

        for(j = 0;j < i;j++){
            n = input.next();
            in = input.nextInt();
            if(in > score){
                name = n;
                score = in;
            }
        }

        System.out.println("成绩最高的是：" + name);
    }

    @Override
    public void test() {
        System.out.println("------------第6题------------");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        getHighestScore(i);
    }
}

class FindIntegerFactor implements Testable{
    public void getIntegerFactor(int i){
        int j = 1;

        while(i != 1){
            j++;
            if(i % j == 0){
                i = i / j;
                System.out.print(j + " ");
                j = 1;
            }
        }
    }

    @Override
    public void test() {
        System.out.println("------------第7题------------");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        getIntegerFactor(i);
    }
}

// 这后面的代码不需要修改
public class t2 {
    public static void main(String[] args) {
        Testable[] solutions = {new RandomMonth()};
        // {new SolveQuadratic(),
        //     new RandomMonth(), new ShippingCost(),
        //         new FindChar(), new StudentMajor(),new FindHighestScore(),
        // new FindIntegerFactor()};
        // Testable[] solutions = {new FindIntegerFactor()};
        for (Testable sol: solutions) {
            sol.test();
        }
    }
}
