import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Scanner class has been defineted.
        Scanner index= new Scanner(System.in);

        //The variable data types have been defined.
        double pear=2.14, apple=3.67,tomato=1.11,banana=0.95,eggplant=5.0;
        double p,a,t,b,e;

        //Get values from the user.
        System.out.print ("How many kilograms of pears? = " );
        p=index.nextDouble();

        System.out.print ("How many kilograms of apples? = " );
        a=index.nextDouble();

        System.out.print ("How many kilograms of tomatoes? = " );
        t=index.nextDouble();

        System.out.print ("How many kilograms of bananas? = " );
        b=index.nextDouble();

        System.out.print ("How many kilograms of eggplants? = " );
        e=index.nextDouble();

        //The price has been calculated.
        double price=((pear*p)+(apple*a)+(tomato*t)+(banana*b)+(eggplant*e));
        System.out.print("Total price= "+price+" TL");;

    }
}