package two;

public class TwoFive {
    public static void main(String[] args){
        int j = 0;
        for(int i = 100;i <= 1000;i++){
            if(i % 5 == 0 || i % 6 == 0){
                if(j == 10){
                    System.out.println();
                    j = 0;
                }else{
                    System.out.print(i + " ");
                    j++;
                }
            }
        }

    }
}
