package component;
import java.util.*;

public class usefull {
    public String nextStr(String tip){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入" + tip + ":");
        String s = input.next();
        return s;
    }

    public int nextInt(String tip){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入" + tip + ":");
        int s = input.nextInt();
        return s;
    }

    public double nextDouble(String tip){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入" + tip + ":");
        double s = input.nextInt();
        return s;
    }
    public double nextDouble(){
        Scanner input = new Scanner(System.in);
        double s = input.nextInt();
        return s;
    }

    public void pl(String tip){
        System.out.println(tip);
    }

    public void p(String tip){
        System.out.print(tip);
    }

}
