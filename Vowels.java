import java.util.*;
public class Vowels{
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int vcnt=0,ccnt=0;
      for(char ch:str.toCharArray()){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
          vcnt++;
        }
        else ccnt++;
      }
      System.out.println("Vowels: "+vcnt);
      System.out.println("Consonants: "+ccnt);
    }
  }