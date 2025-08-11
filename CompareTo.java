import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str1=s.nextLine();
      String str2=s.nextLine();
      int len=(str1.length()>str2.length()?str2.length():str1.length());
      if(str1.equals(str2)) System.out.println(0);
      else{
        for(int i=0;i<len;i++){
          if(str1.charAt(i)!=str2.charAt(i)){
            System.out.print(str1.charAt(i)-str2.charAt(i));
            break;
          }
        }
      }
      
  }
}