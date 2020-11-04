import java.util.*;
abstract class Phone
{

    abstract void cat();
}
class Samsung extends Phone
{
    public void cat()
    {
        System.out.println("SELECT CATEGORY");
        System.out.println("1. SCREEN");
        System.out.println("2. BATTERY");
        System.out.println("3. CHARGING JACK");
        System.out.println("4. BACK PANEL");
        System.out.println("5. MIC");
        System.out.println("TO SELECT CATEGORY ENTER NUMBER IN BETWEEN 1-5 ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("PLEASE PAY RS. 1500/-, IN ORDER TO CHANGE SCREEN ");
                break;
            case 2:
                System.out.println("PLEASE PAY RS. 1400/-, IN ORDER TO CHANGE BATTERY ");
                break;
            case 3:
                System.out.println("PLEASE PAY RS. 300/-, IN ORDER TO CHANGE CHARGING JACK ");
                break;
            case 4:
                System.out.println("PLEASE PAY RS. 1000/-, IN ORDER TO CHANGE BACK PANEL ");
                break;
            case 5:
                System.out.println("PLEASE PAY RS. 700/-, IN ORDER TO CHANGE MIC ");
                break;
            default:
                System.out.println("PLEASE SELECT VALID NO.");
                break;
        }
    }
}



class Redmi extends Phone
{
    public void cat()
    {
        System.out.println("SELECT CATEGORY");
        System.out.println("1. SCREEN");
        System.out.println("2. BATTERY");
        System.out.println("3. CHARGING JACK");
        System.out.println("4. BACK PANEL");
        System.out.println("5. MIC");
        System.out.println("TO SELECT CATEGORY ENTER NUMBER IN BETWEEN 1-5 ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("PLEASE PAY RS. 1400/-, IN ORDER TO CHANGE SCREEN ");
                break;
            case 2:
                System.out.println("PLEASE PAY RS. 1300/-, IN ORDER TO CHANGE BATTERY ");
                break;
            case 3:
                System.out.println("PLEASE PAY RS. 350/-, IN ORDER TO CHANGE CHARGING JACK ");
                break;
            case 4:
                System.out.println("PLEASE PAY RS. 1000/-, IN ORDER TO CHANGE BACK PANEL ");
                break;
            case 5:
                System.out.println("PLEASE PAY RS. 750/-, IN ORDER TO CHANGE MIC ");
                break;
            default:
                System.out.println("PLEASE SELECT VALID NO.");
                break;
        }
    }
}



class Poco extends Phone
{
    public void cat()
    {
        System.out.println("SELECT CATEGORY");
        System.out.println("1. SCREEN");
        System.out.println("2. BATTERY");
        System.out.println("3. CHARGING JACK");
        System.out.println("4. BACK PANEL");
        System.out.println("5. MIC");
        System.out.println("TO SELECT CATEGORY ENTER NUMBER IN BETWEEN 1-5 ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("PLEASE PAY RS. 1500/-, IN ORDER TO CHANGE SCREEN ");
                break;
            case 2:
                System.out.println("PLEASE PAY RS. 1500/-, IN ORDER TO CHANGE BATTERY ");
                break;
            case 3:
                System.out.println("PLEASE PAY RS. 400/-, IN ORDER TO CHANGE CHARGING JACK ");
                break;
            case 4:
                System.out.println("PLEASE PAY RS. 1050/-, IN ORDER TO CHANGE BACK PANEL ");
                break;
            case 5:
                System.out.println("PLEASE PAY RS. 700/-, IN ORDER TO CHANGE MIC ");
                break;
            default:
                System.out.println("PLEASE SELECT VALID NO.");
                break;
        }
    }
}



class OnePlus extends Phone
{
    public void cat()
    {
        System.out.println("SELECT CATEGORY");
        System.out.println("1. SCREEN");
        System.out.println("2. BATTERY");
        System.out.println("3. CHARGING JACK");
        System.out.println("4. BACK PANEL");
        System.out.println("5. MIC");
        System.out.println("TO SELECT CATEGORY ENTER NUMBER IN BETWEEN 1-5 ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("PLEASE PAY RS. 1600/-, IN ORDER TO CHANGE SCREEN ");
                break;
            case 2:
                System.out.println("PLEASE PAY RS. 1500/-, IN ORDER TO CHANGE BATTERY ");
                break;
            case 3:
                System.out.println("PLEASE PAY RS. 350/-, IN ORDER TO CHANGE CHARGING JACK ");
                break;
            case 4:
                System.out.println("PLEASE PAY RS. 1300/-, IN ORDER TO CHANGE BACK PANEL ");
                break;
            case 5:
                System.out.println("PLEASE PAY RS. 750/-, IN ORDER TO CHANGE MIC ");
                break;
            default:
                System.out.println("PLEASE SELECT VALID NO.");
                break;
        }
    }
}



class Iphone extends Phone
{
    public void cat()
    {
        System.out.println("SELECT CATEGORY");
        System.out.println("1. SCREEN");
        System.out.println("2. BATTERY");
        System.out.println("3. CHARGING JACK");
        System.out.println("4. BACK PANEL");
        System.out.println("5. MIC");
        System.out.println("TO SELECT CATEGORY ENTER NUMBER IN BETWEEN 1-5 ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("PLEASE PAY RS. 3000/-, IN ORDER TO CHANGE SCREEN ");
                break;
            case 2:
                System.out.println("PLEASE PAY RS. 1800/-, IN ORDER TO CHANGE BATTERY ");
                break;
            case 3:
                System.out.println("PLEASE PAY RS. 800/-, IN ORDER TO CHANGE CHARGING JACK ");
                break;
            case 4:
                System.out.println("PLEASE PAY RS. 2000/-, IN ORDER TO CHANGE BACK PANEL ");
                break;
            case 5:
                System.out.println("PLEASE PAY RS. 1000/-, IN ORDER TO CHANGE MIC ");
                break;
            default:
                System.out.println("PLEASE SELECT VALID NO.");
                break;
        }
    }
}



public class Mobile_Repairing_Shop {


    private static void repair (Phone p)
    {
        p.cat();


    }
    public static void main(String[] args)
    {
        System.out.println("SELECT YOUR MOBILE BRAND");
        System.out.println("1. SAMSUNG");
        System.out.println("2. REDMI");
        System.out.println("3. POCO");
        System.out.println("4. ONE PLUS");
        System.out.println("5. IPHONE");
        System.out.println("TO SELECT BRAND ENTER NUMBER IN BETWEEN 1-5 ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n)
        {
            case 1:
                repair(new Samsung());
                break;
            case 2:
                repair(new Redmi());
                break;
            case 3:
                repair(new Poco());
                break;
            case 4:
                repair(new OnePlus());
                break;
            case 5:
                repair(new Iphone());
                break;
            default:
                System.out.println("PLEASE SELECT VALID NO.");
                break;


        }



    }
}
