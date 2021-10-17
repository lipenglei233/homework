package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

public class h1 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    Scanner in = new Scanner(System.in);
    String s;

    while (true) {
      s = in.next();
      if (s.equals("****")) {
        break;
      }
      if (list.indexOf(s) == -1) {
        list.add(s);
      }
    }

    // list.sort(Comparator.naturalOrder());
    Collections.sort(list);

    System.out.println(list);
    in.close();
  }
}
