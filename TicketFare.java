import java.util.*;

public class TicketFare {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter your Source(a,b,c,d)");
      char a=s.next().charAt(0);
      char b=' ';
      System.out.println("Enter number of persons:");
      int n=s.nextInt();
      if(a=='a'|| a=='b'|| a=='c' || a=='d')
      {
        System.out.println("Enter your Destination(a,b,c,d)");
        b=s.next().charAt(0);
      }
      else{
        System.out.println("Enter valid source");
      }
      System.out.println("Source: "+a);
      System.out.println("Destination: "+b);
      System.out.println("Number of Tickets: "+n);
      System.out.print("Ticket fare from '"+a+"' to '"+b+"' for "+n+" members:");
      if(a>b){
        
         System.out.print((a-b)*10*n);
      }
      else{
        System.out.print((b-a)*10*n);
      }
      
  }
}
