import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String rev="";
      for(int i=str.length()-1;i>=0;i--){
        rev=rev+str.charAt(i);
      }
      if(rev.equals(str)) System.out.print("Palindrome");
      else System.out.print("Not a Palindrome");
    }
  }