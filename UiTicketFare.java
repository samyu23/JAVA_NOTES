import java.util.*;

public class UiTicketFare {
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
      System.out.println();
      System.out.println("        😊😁 YOUR TICKET IS GENERATED 😁😊            ");
      System.out.println("-------------------------------------------------");
      System.out.println("                    SRT Travels             ");
      System.out.println("-------------------------------------------------");
      System.out.println("Source: "+a+"                   | Destination: "+b);
      System.out.println("Number of Tickets: "+n+"        |");
      System.out.println("-------------------------------------------------");
      
      System.out.print("Ticket fare from '"+a+"' to '"+b+"' for "+n+" members:");
      
      if(a>b){
        
         System.out.println((a-b)*10*n);
      }
      else{
        System.out.println((b-a)*10*n);
      }
      System.out.println("-------------------------------------------------");
      System.out.println("    😎😎 THANK YOU FOR CHOOSING US  😎😎          ");
      System.out.println("-------------------------------------------------");
    }
  }

