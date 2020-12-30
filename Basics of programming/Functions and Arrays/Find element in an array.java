import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();



        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int idx = -1;
        boolean exists = false;
        int d = scn.nextInt();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == d) {
                System.out.println(i);
                exists = true;
                idx = i;
                break;
            }
        }

        if (!exists) {
            System.out.println(idx);
        }
    }
}
