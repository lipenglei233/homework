package five;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.print.attribute.SetOfIntegerSyntax;

interface Testable {
    void test();
}

class Rectangle implements Testable{
// 这里填类定义，包括成员变量和方法
    double width = 1;
    double height = 1;

    public Rectangle(){
    }

    public Rectangle(double w,double h){
        this.width = w;
        this.height = h;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public void set(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double getPerimeter(){
        return this.height * 2 + this.width * 2;
    }

    @Override
    public void test() {
        System.out.println("------------第1题------------");
        Rectangle rectangle = new Rectangle();
        rectangle.set(4, 4.5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        rectangle.set(3.5, 35.9);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }

}

class Stock implements Testable{
// 这里填类定义，包括成员变量和方法
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(){
    }
    
    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(){
        return this.currentPrice - this.previousClosingPrice;
    }

    @Override
    public void test(){
        System.out.println("------------第2题------------");
        Stock stock = new Stock();
        stock.symbol =  "ORCL";
        stock.name = "Oracle Corporation";
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.println(stock.getChangePercent());
    }
}

class Stopwatch implements Testable{
// 这里填类定义，包括成员变量和方法
    private long startTime;
    private long endTime;

    public Stopwatch(){
        this.startTime  = System.currentTimeMillis();
    }

    public void getStartTime(){
        this.startTime = System.currentTimeMillis();
    }

    public void getEndTime(){
        this.endTime = System.currentTimeMillis();
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime;
    } 

    @Override
    public void test(){
        System.out.println("------------第3题------------");
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i < 100000;i++){
            list.add((int)(Math.random() * 100000 + 1));
        }

        Stopwatch watch = new Stopwatch();
        watch.start();
        list.sort(Comparator.naturalOrder());
        watch.stop();

        
    }

}

class Account{
// 这里填类定义，包括成员变量和方法
}

public class Main {
    public static void main(String[] args){
        Testable[] solutions = {
            new Rectangle()
        };

        for (Testable sol: solutions) {
            sol.test();
        }
    }
}
