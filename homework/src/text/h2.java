package text;

import java.util.ArrayList;
import java.util.Scanner;

public class h2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num, max = 1;
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> count = new ArrayList<Integer>();

    while (true) {
      num = in.nextInt();
      int i = list.indexOf(num);

      if (num == 0)
        break;

      if (i == -1) {
        list.add(num);
        count.add(1);
      } else {
        if (count.get(i) == max)
          max++;
        count.set(i, count.get(i) + 1);
      }
    }

    for (int j = 0; j < list.size(); j++) {
      if (count.get(j) == max) {
        System.out.println(list.get(j));
      }
    }

  }
}
