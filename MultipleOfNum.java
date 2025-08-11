import java.util.*;
public class MultipleOfNum {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt(),mul=1;
      for(int i=2;i<=n;i=i++){
         mul*=i;
      }
      System.out.println(mul);
    }
  }