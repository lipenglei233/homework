package five;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;

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

        for(int i = 0;i < 1000000;i++){
            list.add((int)(Math.random() * 1000000 + 1));
        }

        Stopwatch watch = new Stopwatch();

        watch.start();
        list.sort(Comparator.naturalOrder());
        watch.stop();

        System.out.println("time is " + watch.getElapsedTime());
        
    }

}

class Account implements Testable{
// 这里填类定义，包括成员变量和方法
    int id;
    double balance;
    double annualInterestRate;
    String dateCreated;

    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        this.dateCreated = formatter.format(date);
    }

    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        this.dateCreated = formatter.format(date);
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public String getCreatedDate(){
        return this.dateCreated;
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return this.annualInterestRate * this.getMonthlyInterestRate();
    }

    public void withdraw(double value){
        this.balance = this.balance - value;
    }

    public void deposit(double value){
        this.balance = this.balance + value;
    }

    @Override
    public void test(){
        System.out.println("------------第4题------------");

        Account account = new Account(1122,20000);

        account.setAnnualInterestRate(0.045);
        account.withdraw(2500);
        account.deposit(3000);

        String s = String.format("%.5f", account.getMonthlyInterest());
        System.out.println(account.getBalance());
        System.out.println(s);
        System.out.println(account.getCreatedDate());
    }


}

public class Main {
    public static void main(String[] args){
        Testable[] solutions = {
            new Rectangle(),new Stock(),new Stopwatch(),new Account()
        };

        for (Testable sol: solutions) {
            sol.test();
        }
    }
}
