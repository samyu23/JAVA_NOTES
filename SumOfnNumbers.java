import java.util.*;

public class SumOfnNumbers {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt(),sum=0;
      for(int i=1;i<=n;i++){
        sum+=i;
      }
      System.out.println(sum);
      System.out.println((n*(n+1))/2);
    }
  }
