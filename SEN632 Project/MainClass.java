
package Travel;
import java.util.Scanner;

/**
 *
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please Enter your Name!");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String price1 = "$1000.00";            /*Sets price1*/
        String price2 = "$2000.00";
        String price3 = "$3000.00";
        Customer c = new Customer();
        c.setName(name);
        Ticket tp = new Ticket();
        Ticket pl = new Ticket();
        Ticket lt = new Ticket();
        City t = new City();
        City p = new City();
        City l = new City();
        t.setName("Tokyo");               /*Sets name to p.name*/
        p.setName("Paris");
        l.setName("Los Angles");
        tp.setBclass("Business");
        tp.setFromCity(t.getName());
        tp.setToCity(p.getName());
        tp.setPrice(price1);
        pl.setBclass("Business");
        pl.setFromCity(p.getName());
        pl.setToCity(l.getName());
        pl.setPrice(price2);
        lt.setBclass("Business");
        lt.setFromCity(l.getName());
        lt.setToCity(t.getName());
        lt.setPrice(price3);
        
        System.out.println("Pleae select city from the list below");            /*Displays user the options*/
        System.out.println("1=Paris");
        System.out.println("2=Los Angles");
        System.out.println("3=Tokyo");
        int choice = scan.nextInt();
        if(choice == 1){                            /*User enters option 1*/
            System.out.println("The price of the ticket is "+tp.getPrice());
            System.out.println("Please type the amount of the ticket");
            int a = scan.nextInt();
            if (a>=1000){
                System.out.println("Congratulations you have bought the ticket to "+p.getName());
            }
            else{
                System.out.println("Sorry you don't have enough funds to buy the Ticket to "+p.getName());
            }
        }
        else if(choice == 2){                        /*User enters option 2*/
            System.out.println("The price of the ticket is "+pl.getPrice());
            System.out.println("Please type the amount of the ticket");
            int a = scan.nextInt();
            if (a>=2000){
                System.out.println("Congratulations you have bought the ticket to "+l.getName());
            }
            else{
                System.out.println("Sorry you don't have enough funds to buy the Ticket to "+l.getName());
            }
        }
        else if(choice == 3){                         /*User enters option 3*/
            System.out.println("The price of the ticket is "+lt.getPrice());
            System.out.println("Please type the amout of the ticket");
            int a = scan.nextInt();
            if (a>=3000){
                System.out.println("Congratulations you have bought the ticket to "+t.getName());
            }
            else{
                System.out.println("Sorry you don't have enough funds to buy the Ticket to "+t.getName());
            }
        }
        else
            System.out.println("Right now there are no tickets available to other cities");
        
        System.out.println("Dear " + c.getName() + " Thank you for using ticket automation system.");
    }
    
}
