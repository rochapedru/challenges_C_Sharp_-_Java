import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class compareToo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > q = new ArrayList < > ();
    int m = scanner.nextInt();
    for (int i = 0; i < m + 1; i++) {
      String w = scanner.nextLine();
      q.add(w);
    }
    String[] r = q.toArray(new String[q.size()]);

    String temp;

    for (int i = 0; i < r.length; i++) {
        for (int j = i + 1; j < r.length; j++) {
            if (r[i].compareTo(r[j]) > 0) {
                temp = r[i];
                r[i] = r[j];
                r[j] = temp;
            }
        }
    }
    System.out.println();
    for (int i = 0; i < m + 1 ; i++) {
        System.out.println(r[i]);
    }
  }
}
