package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class h3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String s;
        boolean flag = true;
        String[] keywordString = { "abstract", "finally", "public", "boolean", "float", "return", "break", "for",
                "short", "byte", "goto", "static", "case", "if", "super", "catch", "implements", "switch", "char",
                "import", "synchronized", "class", "instanceof", "this", "const", "int", "throw", "continue",
                "interface", "throws", "default", "long", "transient", "do", "native", "try", "double", "new", "void",
                "else", "package", "volatile", "extends", "private", "while", "final", "protected", "true", "null" };
        List<String> keyword = Arrays.asList(keywordString);

        while (true) {
            s = in.nextLine();
            if (s.equals("****")) {
                break;
            }
            String[] st = s.split(" ");
            for (int i = 0; i < st.length; i++) {
                if (st[i].equals("//")) {
                    continue;
                }
                if (st[i].equals("/*") || st[i].equals("/**")) {
                    flag = false;
                }
                if (st[i].equals("*/")) {
                    flag = true;
                }
                if (flag == true) {
                    if (keyword.indexOf(st[i]) != -1 && list.indexOf(st[i]) == -1) {
                        list.add(st[i]);
                    }
                }
            }

        }

        for(int j=0;j<list.size();j++){
            System.out.print(list.get(j)+" ");
        }
    }
}
