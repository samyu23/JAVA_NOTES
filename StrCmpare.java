import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str1=s.nextLine();
      String str2=s.nextLine();
      
      if(str1.length()!=str2.length()) 
          System.out.println("Not equal");
      else{
        int flag=0;
        for(int i=0;i<str1.length();i++){
          char ch1=(str1.charAt(i)>=97 && str1.charAt(i)<=122)?(char)(str1.charAt(i)-32):(char)(str1.charAt(i));
          char ch2=(str2.charAt(i)>=97 && str2.charAt(i)<=122)?(char)(str2.charAt(i)-32):(char)(str2.charAt(i));
          if(ch1!=ch2){
            flag=1;
            break;
          }
        }
        if(flag==0) System.out.println("Equal");
        else System.out.println("Not Equal");
      }
      
    }
  }