import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int op=1;
  int od;
  int inv=0;
  while(n!=0) {
      od=n%10;
      int id=op;
      int ip=od;
      
      inv = inv + id*(int)Math.pow(10,ip-1);
      
      n=n/10;
      op++;
      
  }
  System.out.println(inv);
 }
}
