import java.util.*;
public class Factors{
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt(),sum=0,cnt=0;
      for(int i=1;i<=n;i++){
         if(n%i==0){
          int pc=2;
          for(int j=2;j<=i/2;j++){
            if(i%j==0) pc++;
          }
          if(pc==2){
            System.out.println(i);
          }
        } 
      }
      System.out.println();
      
    }
  }
