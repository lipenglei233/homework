package two;
import component.usefull;

public class TwoTen {
    public static void main(String[] args){
        usefull u = new usefull();
        double[] array = new double[10];
        int[] intArray = new int[10];

        for(int i = 0;i < 10;i++){
            array[i] = u.nextDouble();
        }

        for(int j = 0;j < 10;j++){
            intArray[j] = (int)array[j];
        }

        double s1 = average(array);
        int s2 = average(intArray);

        u.pl("数组的double平均数是：" + s1);
        u.pl("数组的int平均数是：" + s2);

    }

    public static int average(int[] array){
        int sum = 0;
        for(int i = 0;i < array.length;i++){
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double average(double[] array){
        double sum = 0;
        for(int i = 0;i < array.length;i++){
            sum += array[i];
        }
        return sum / array.length;
    }
}
