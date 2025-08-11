import java.util.*;
public class Swapcase {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      for(char ch:str.toCharArray()){
        if(ch>=97 && ch<=122) System.out.print((char)(ch-32));
        else System.out.print((char)(ch+32));
      }
    }
  }