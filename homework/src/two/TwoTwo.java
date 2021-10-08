package two;
import java.util.*;

public class TwoTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double r,s,area;

        System.out.print("请输入中心到顶点的长度：");
        r = input.nextDouble();
        s = 2 * r * Math.sin(Math.PI / 5);
        area = 5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5));

        System.out.println("五边形的面积是：" + area);
    }
}
