import java.util.Scanner;

class Logindetails {
    static Scanner sc = new Scanner(System.in);
    private long mobno;
    private String username;
    private String pass;

    void setmob(long mobno) {
        this.mobno = mobno;
    }

    void setuser(String username) {
        this.username = username;
    }

    void setpass(String pass) {
        this.pass = pass;
    }

    long getmob() {
        return mobno;
    }

    String getuser() {
        return username;
    }
    String getpass()
    {
     return pass;
    }
}

class User {
    static Scanner sc = new Scanner(System.in);
    static final String purpe = "\u001b[35;1m";
    final String reset = "\u001b[0m";
    static final String blue = "\u001b[34;1m";
    static final String blink = "\u001b[5m";
    static final String yellow = "\u001b[33;1m";
    static final String red = "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
     static final String skblue = "\u001b[36;1m";

    
void login() {
        Logindetails ob = new Logindetails();
        System.out.println();
        System.out.println();
        System.out.println(blink);
        System.out.println(red);
        System.out.println("");
        System.out.println("*                                                               *");
        System.out.print(blink);
        System.out.print("*");
        System.out.print(blue);
        System.err.print("----------------->>WELCOME TO EVENTS.INSIDER<<-----------------");
        System.out.print(red);
        System.out.println("*");
        System.out.println("*                                                               *");
        System.out.println("");
        System.out.println();
        System.out.println(reset);
        System.out.println(purpe);
        System.out.println("READY TO MAKE A PLAN?");
        System.out.print(reset);
	System.out.print(skblue);
        System.out.println("Get tickets to LIVE concerts,comedy shows,sports and much more!");
	 System.out.print(reset);
        System.out.println();
	System.out.println();
        System.out.println(red+"-----------------"+reset+green+"Login"+reset+red+"-----------------"+reset);
	System.out.print(reset);
        
        //login
         
         System.out.print("Enter mobile number: ");
          ob.setmob(sc.nextLong());
         int digitsLogMethod = (int) Math.log10(Math.abs(ob.getmob())) + 1;
         if(digitsLogMethod == 10)
        
        {
      
        System.out.print("Create Username: ");
        ob.setuser(sc.next());
        System.out.print("Create password: ");
        ob.setpass(sc.next());
        System.out.print("Re-enter and confirm your password :");
        String password=sc.next();
        

        String pass=ob.getpass();
        String username = ob.getuser();
        if (  password.equals(pass))
        {
            System.out.println();
            System.out.print(yellow);
            System.out.println(":::::::::::::::  LOGIN  SUCCESSFULL   :::::::::::::::");
            System.out.println();
            System.out.println(":::::::::::::::   WELCOME  " + username + "   :::::::::::::::");
            System.out.println();
            System.out.print(reset);
            System.out.println();
        } 
        else {
            System.out.println("Invalid Credentials");
            
            System.exit(0);
            
        }
      
       }
        else
        {
           System.out.println("Invalid Number");
           System.exit(0);
        }
    }
}


interface Concerts {
    static Scanner ac = new Scanner(System.in);
    static final String red = "\u001b[31;1m";
    final String reset = "\u001b[0m";
    default void eventsoptions() {
        System.out.println();
        String d = "Concerts";
        System.out.println("You have selected the event: " +red+ d);
        System.out.println(reset);
        System.out.println("1. Music\n2. Standup Comedy\n3. To go Back");
        System.out.print("Choose a concert : ");
        int m = ac.nextInt();
        if (m == 1) {
            music();

        } else if (m == 2) {
            comedy();
        } 
        else if (m==3)
        {
          back();
        }
        else {
            System.out.println("Invalid selection.");
            System.exit(0);

        }
    }

    void music();

    void comedy();
    void back();
}

interface Amusementparks {
    static Scanner acc = new Scanner(System.in);
     static final String red = "\u001b[31;1m";
    final String reset = "\u001b[0m";
    default void parkoptions() {

        System.out.println();
        String d = "Amusementparks";
        System.out.println("You have selected the event: " +red+ d);
	System.out.print(reset);
        System.out.println("1. Water parks");
        System.out.println("2. Snow parks");
        System.out.println("3. Theme parks");
        System.out.println("4. To Go Back");
        System.out.print("Choose a park : ");
       
        int n = acc.nextInt();
        if (n == 1) {
            waterparks();
        } else if (n == 2) {
            snowparks();
        } else if (n == 3) {
            themeparks();
        }
        else if (n==4)
        {
          back();
        }
       else {
            System.out.println("Invalid selection.");
            System.exit(0);
        }

    }

    void waterparks();

    void snowparks();

    void themeparks();
    void back();
}

interface LiveSportsMatches {
    static Scanner scsc = new Scanner(System.in);
     static final String red = "\u001b[31;1m";
    final String reset = "\u001b[0m";
    default void sportsoptions() {
        System.out.println();
        String d = "Live Sports Matches";
        System.out.println("You have selected the event: " +red+ d);
        System.out.println(reset);
        System.out.println("1. Kabaddi\n2. Cricket\n3. To Go Back");
        System.out.print("Choose a Sport: ");
        int mv = scsc.nextInt();
        if (mv == 1) {
            kabaddi();
        } else if (mv == 2) {
            cricket();
        } 
        else if (mv==3)
        {
          back();
        }


       else {
            System.out.println("Invalid selection.");
            System.exit(0);
        }
    }

    void kabaddi();

    void cricket();
    void back();
}

interface Workshops {
    static Scanner sc = new Scanner(System.in);
     static final String red = "\u001b[31;1m";
    final String reset = "\u001b[0m";
    default void workshopoptions() {
        System.out.println();
        String d = "Workshops";
        System.out.println("You have selected the event: " +red+ d);
	System.out.print(reset);
        System.out.println("Choose a workshop:");
        System.out.println();
        System.out.println("1. Pottery\n2. painting\n3. Texture Art\n4. Photography\n5. To GO Back");
        int g = sc.nextInt();
        if (g == 1) {
            pottery();
        } else if (g == 2) {
            painting();
        } else if (g == 3) {
            textureart();
        } else if (g == 4) {
            photography();
        } 
        else if (g==5)
        {
          back();
        }

       else {
            System.out.println("Invalid selection.");
            System.exit(0);
        }
    }

    void pottery();

    void painting();

    void textureart();

    void photography();
    void back();
}

abstract class Calculate {
    static final String green = "\u001b[32;1m";
    static Scanner ob = new Scanner(System.in);

    abstract void overallCost(String eventName, int ticketPrice, int quantity, String location, String dat);

    String pay(double totalCost) {
        Double balance = 100000d;
        if (balance > totalCost) {
            System.out.print("Enter your pin : ");
            int pin = ob.nextInt();
            System.out.println();
            System.out.print(green);
            return " ------------ PaymentSuccessfull ------------";
        }
        System.out.println();
        System.out.print(green);
        return " ------------ PaymentUnsuccessfull ------------ ";
    }
    String atm(double totalCost)
    {
      
      Double balance = 100000d;
      if(balance>totalCost)
      {
       System.out.print("Enter your Atmcardnumber : ");
       long Atmcardno=ob.nextLong();
       System.out.print("Enter your cvv number : ");
       int cvvno=ob.nextInt();
       System.out.print("Enter your expirydate of your card : ");
       String expdate=ob.next();
       System.out.println();
       System.out.print(green);
       return  " ------------ PaymentSuccessfull ------------       ";
     }
     System.out.println();
     System.out.print(green);
   return " ------------ PaymentUnsuccessfull ------------        ";
  }
}


class Home extends Calculate implements Concerts, Amusementparks, LiveSportsMatches, Workshops {
    static Scanner ssc = new Scanner(System.in);
    final String reset = "\u001b[0m";
    static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red = "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purpe = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred = "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

    void homepage() {
	System.out.print(skblue+blink);
        System.out.println("Find New Experiences");
        System.out.println(reset);
        System.out.println("1. Concerts\n2. Amusementparks\n3. Live Sports Matches\n4. WorkShops");
        System.out.print(green);
        System.out.print(blink);
        System.out.print("Choose An Event:");
        System.out.print(reset);
        int n = ssc.nextInt();
        if (n == 1) {
            eventsoptions();
        } else if (n == 2) {
            parkoptions();
        } else if (n == 3) {
            sportsoptions();
        } else if (n == 4) {
            workshopoptions();
        } else {
            System.out.println("Invalid Selection");
            System.exit(0);
        }
    }

    public void music() {

        System.out.println();
        System.out.println("1. Rockstar DSP Live.");
        System.out.println("   Price (INR 999)   - Gachibowli Stadium.");
        System.err.println("   Date and Time - 23rd November, 2024, 07:00 PM");

        System.out.println();
        System.out.println();
        System.out.println("2. Guru Randhawa Moon Rise Tour.");
        System.out.println("   Price (INR 2,499) - Aahloanam Resort, Gandipet.");
        System.out.println("   Date and Time - 24th November, 2024, 06:00 PM");
        System.out.println();
        System.out.println();
        System.out.println("3. Geetha Madhuri Live.");
        System.out.println("   Price (INR 599)   - 36 Downtown Brew Pub, Jubilee Hills.");
        System.out.println("   Date and Time - 30th November, 2024, 07:00 PM");
        System.out.println();
        System.out.println();
        System.out.println("4. Shreya Ghoshal All Hearts Tour.");
        System.out.println("   Price (INR 1,999) - Qatar National Convention Centre.");
        System.out.println("   Date and Time - 1st December, 2024, 07:00 PM");
        System.out.println();
        System.out.println();
        System.out.println("5. Arijit Singh One Night Only Tour.");
        System.out.println("   Price (INR 2,000) - GMR Arena.");
        System.out.println("   Date and Time - 7th December 7th, 2024, 05:00 PM");
        System.out.println();
        System.out.println();
        System.out.println("6. Karthik Live.");
        System.out.println("   Price (INR 1,599) - Boulder Hills.");
        System.out.println("   Date and Time - 23rd November, 2024, 05:00 PM");
        System.out.println();
        System.out.println();
        System.out.println("7. To Go Back.");
        System.out.print(green);
        System.out.println("***************        SELECT THE MUSICEVENT        ***************");
        System.out.print(reset);
        int n = ssc.nextInt();
        String eventName = "";
        int ticketPrice = 0;
        String dat = "";
        String location = "";
        switch (n) {
            case 1:
                eventName = "Rockstar DSP Live.";
                ticketPrice = 999;
                location = "Gachibowli Stadium.";
                dat = "24th November, 2024, 06:00 PM";
                break;
            case 2:
                eventName = "Guru Randhawa Moon Rise Tour.";
                ticketPrice = 2499;
                location = "Aahloanam Resort, Gandipet.";
                dat = "24th November, 2024, 06:00 PM";
                break;
            case 3:
                eventName = "Geetha Madhuri Live.";
                ticketPrice = 599;
                location = "36 Downtown Brew Pub, Jubilee Hills.";
                dat = "30th November, 2024, 07:00 PM";
                break;
            case 4:
                eventName = "Shreya Ghoshal All Hearts Tour.";
                ticketPrice = 1999;
                location = "Qatar National Convention Centre.";
                dat = "1st December, 2024, 07:00 PM";
                break;
            case 5:
                eventName = "Arijit Singh One Night Only Tour.";
                ticketPrice = 2000;
                location = "GMR Arena.";
                dat = "7th December, 2024, 05:00 PM";
                break;
            case 6:
                eventName = "Karthik Live.";
                ticketPrice = 1599;
                location = "Boulder Hills.";
                dat = "23rd November, 2024, 05:00 PM";
                break;
            case 7:
                   back();
                   break;
            default:
                System.out.println("Invalid selection.");
                System.exit(0);
        }

        System.out.println("You have selected                   : " + eventName);
        System.out.println("Event Date and Time                 : " + dat);
        System.out.println("Event Location                      : " + location);
        System.out.println("Ticket Price                        : " + ticketPrice);
        System.out.print(red);
        System.out.print(blink);
        System.out.println("500 discount on more than 5 tickets");
        System.out.print(reset);

        System.out.print("Enter quantity                      : ");
        int quantity = ssc.nextInt();
        overallCost(eventName, ticketPrice, quantity, location, dat);
    }

    public void comedy() {

        System.out.println();
        System.out.println("1. Kunal Kamra Live");
        System.out.println("   Price (INR 999) - Venue:KIN Prasad Auditorium.");
        System.out.println("   Date & Time: 1st December 2024, 07:30 PM");
        System.out.println();
        System.out.println("2. 'Who Are You?' by Rahul Subramaniam");
        System.out.println("   Price (INR 799) - Venue: Shilpakala Vedika, Hyderabad");
        System.out.println("   Date & Time: 5th December 2024, 08:00 PM");
        System.out.println();
        System.out.println("3. Abhishek Upmanyu Live");
        System.out.println("   Price (INR 599) - Venue:Cafe Bistro,Hyderabad");
        System.out.println("   Date & Time: 10th December 2024, 06:30 PM");
        System.out.println();
        System.out.println("4. Gaurav Gupta Live");
        System.out.println("   Price (INR 499) - Venue: The Comedy Theatre, Hyderabad");
        System.out.println("   Date & Time: 15th December 2024, 07:00 PM");
        System.out.println();
        System.out.println("5. Vivek Samtani Live");
        System.out.println("   Price (INR 499) - Venue:The Hashtag Cafe, Hyderabad");
        System.out.println("   Date & Time: 20th December 2024, 07:30 PM");
        System.out.println();
        System.out.println("6. To Go Back.");
        System.out.println(green);
        System.out.println("***************        SELECT THE COMEDYSHOW        ***************");
	System.out.print(reset);
        int n = ssc.nextInt();
        String eventName = "";
        int ticketPrice = 0;
        String dat = "";
        String location = "";
        switch (n) {
            case 1:
                eventName = "Kunal Kamra Live";
                ticketPrice = 999;
                location = "KIN Prasad Auditorium";
                dat = "1st December 2024, 07:30 PM";
                break;
            case 2:
                eventName = "'Who Are You?' by Rahul Subramaniam";
                ticketPrice = 799;
                location = "Shilpakala Vedika, Hyderabad";
                dat = "5th December 2024, 08:00 PM";
                break;
            case 3:
                eventName = "Abhishek Upmanyu Live";
                ticketPrice = 599;
                location = "Cafe Bistro,Hyderabad";
                dat = "10th December 2024, 06:30 PM";
                break;
            case 4:
                eventName = "Gaurav Gupta Live";
                ticketPrice = 499;
                location = "The Comedy Theatre, Hyderabad";
                dat = "15th December 2024, 07:00 PM";
                break;
            case 5:
                eventName = "Vivek Samtani Live";
                ticketPrice = 499;
                location = "The Hashtag Cafe, Hyderabad";
                dat = "20th December 2024, 07:30 PM";
                break;
            case 6:
                   back();
                   break;
            default:
                System.out.println("Invalid selection.");
                System.exit(0);
        }
        System.out.println("You have selected                   : " + eventName);
        System.out.println("Event Date and Time                 : " + dat);
        System.out.println("Event Location                      : " + location);
        System.out.println("Ticket Price                        : " + ticketPrice);
        System.out.print(red);
        System.out.print(blink);
        System.out.println("500 discount on more than 5 tickets");
        System.out.print(reset);

        System.out.print("Enter quantity                      : ");
        int quantity = ssc.nextInt();
        overallCost(eventName, ticketPrice, quantity, location, dat);
    }
     public void back()
     {
      homepage();
     }

    public void waterparks() {

        System.out.println();
        System.out.println("1. Wonderla ");
        System.out.println("   Price (INR 1064)   - Nehru outer ring road, Hyderabad.");
        System.out.println("   Open on all  days of the week from 11:00 AM to 7:00 PM.");

        System.out.println();
        System.out.println();
        System.out.println("2. Jalavihar");
        System.out.println("   Price (INR 450) - Secunderabad.");
        System.out.println("   Open on all  days of the week from 11:00 AM to 7:00 PM.");
        System.out.println();
        System.out.println();
        System.out.println("3. Dream valley ");
        System.out.println("   Price (INR 699)   - chilkur x road, Hyderabad.");
        System.out.println("   Open on all  days of the week from 11:00 AM to 7:00 PM.");
        System.out.println();
        System.out.println();
        System.out.println("4. To Go Back.");
        System.out.println(green);
        System.out.println("***************        SELECT THE WATERPARK        ***************");
	System.out.print(reset);
        int n = ssc.nextInt();
        String ParkName = "";
        int ticketPrice = 0;
        String dat = "";
        String location = "";
        switch (n) {
            case 1:
                ParkName = "Wonderla";
                ticketPrice = 1064;
                location = "Nehru outer ring road";
                dat = "Open on all  days of the week from 11:00 AM to 7:00 PM.";
                break;
            case 2:
                ParkName = "Jalavihar";
                ticketPrice = 450;
                location = "Secunderabad";
                dat = "Open on all  days of the week from 11:00 AM to 7:00 PM.";
                break;
            case 3:
                ParkName = "Dream Valley";
                ticketPrice = 699;
                location = "Chilkur x road";
                dat = "Open on all  days of the week from 11:00 AM to 7:00 PM.";
                break;
            case 4:
                   back();
                   break;
            default:
                System.out.println("Invalid selection.");
                System.exit(0);

        }
        System.out.println("You have selected                   : " + ParkName);
        System.out.println("Event Date and Time                 : " + dat);
        System.out.println("Event Location                      : " + location);
        System.out.println("Ticket Price                        : " + ticketPrice);
        System.out.print(red);
        System.out.print(blink);
        System.out.println("500 discount on more than 5 tickets");
        System.out.print(reset);

        System.out.print("Enter quantity                      : ");
        int quantity = ssc.nextInt();
        overallCost(ParkName, ticketPrice, quantity, location, dat);

    }

    public void snowparks() {

        System.out.println();
        System.out.println("1. Snow kingdom");
        System.out.println("   Price (INR 750)   - Kondapur, Hyderabad.");
        System.out.println("   Open on all  days of the week from 11:00 AM to 7:00 PM.");
        System.out.println();
        System.out.println();
        System.out.println("2. Snow world ");
        System.out.println("   Price (INR 450) - Tankbund, Hyderabad.");
        System.out.println("   Open on all  days of the week from 11:00 AM to 7:00 PM.");
        System.out.println();
        System.out.println("3. To Go Back.");
        System.out.print(green);
        System.out.println("***************        SELECT THE SNOWPARK        ***************");
        System.out.print(reset);
        int n = ssc.nextInt();
        String ParkName = "";
        int ticketPrice = 0;
        String dat = "";
        String location = "";
        switch (n) {
            case 1:
                ParkName = "Snow kingdom ";
                ticketPrice = 750;
                location = "Kondapur, Hyderabad";
                dat = "Open on all  days of the week 11:00 AM to 7:00 PM.";
                break;
            case 2:
                ParkName = "Snow world";
                ticketPrice = 450;
                location = "Tankbund, Hyderabad";
                dat = "Open on all  days of the week 11:00 AM to 7:00 PM.";
                break;
             case 3:
                   back();
                   break;
            default:
                System.out.println("Invalid selection.");
                System.exit(0);

        }
        System.out.println("You have selected                   : " + ParkName);
        System.out.println("Event Date and Time                 : " + dat);
        System.out.println("Event Location                      : " + location);
        System.out.println("Ticket Price                        : " + ticketPrice);
        System.out.print(red);
        System.out.print(blink);
        System.out.println("500 discount on more than 5 tickets");
        System.out.print(reset);

        System.out.print("Enter quantity                      : ");
        int quantity = ssc.nextInt();

        overallCost(ParkName, ticketPrice, quantity, location, dat);
    }

    public void themeparks() {

        System.out.println();
        System.out.println("1. Ramojifilmcity");
        System.out.println("   Price (INR 1475)   - Abdullahpurmet, Hyderabad");
        System.out.println("   Open on all  days of the week 11:00 AM to 7:00 PM.");
        System.out.println();
        System.out.println();
        System.out.println("2. Flyzone");
        System.out.println("   Price (INR 767) - Gandipet, Hyderabad");
        System.out.println("   Open on all  days of the week 11:00 AM to 7:00 PM.");
        System.out.println();
        System.out.println();
        System.out.println("3. District Gravity");
        System.out.println("   Price (INR 589)   - bommarasipet, Hyderabad");
        System.out.println("   Open on all  days of the week 11:00 AM to 7:00 PM.");
        System.out.println();
        System.out.println();
        System.out.println("4. Suhas park");
        System.out.println("   Price (INR 1179) - Hayat nagar,Hyderabad");
        System.out.println("   Open on all  days of the week 11:00 AM to 7:00 PM.");
        System.out.println();
        System.out.println();
        System.out.println("5. To Go Back.");
        System.out.print(green);
        System.out.println("***************        SELECT THE THEMEPARK        ***************");
        System.out.print(reset);
        int n = ssc.nextInt();
        String ParkName = "";
        int ticketPrice = 0;
        String dat = "";
        String location = "";
        switch (n) {
            case 1:
                ParkName = "Ramojifilmcity";
                ticketPrice = 1475;
                location = "Abdullahpurmet, Hyderabad";
                dat = "Open on all  days of the week 11:00 AM to 7:00 PM.";
                break;
            case 2:
                ParkName = "Flyzone";
                ticketPrice = 767;
                location = "Gandipet, Hyderabad";
                dat = "Open on all  days of the week 11:00 AM to 7:00 PM.";
                break;

            case 3:
                ParkName = "District Gravity";
                ticketPrice = 767;
                location = "Gandipet, Hyderabad";
                dat = "Open on all  days of the week 11:00 AM to 7:00 PM.";
                break;
            case 4:
                ParkName = "Suhas park";
                ticketPrice = 1179;
                location = "Hayat nagar, Hyderabad";
                dat = "Open on all  days of the week 11:00 AM to 7:00 PM.";
                break;
             case 5:
                   back();
                   break;
            default:
                System.out.println("Invalid selection.");
                System.exit(0);
        }
        System.out.println("You have selected                   : " + ParkName);
        System.out.println("Event Date and Time                 : " + dat);
        System.out.println("Event Location                      : " + location);
        System.out.println("Ticket Price                        : " + ticketPrice);
        System.out.print(red);
        System.out.print(blink);
        System.out.println("500 discount on more than 5 tickets");
        System.out.print(reset);

        System.out.print("Enter quantity                      : ");
        int quantity = ssc.nextInt();
        overallCost(ParkName, ticketPrice, quantity, location, dat);

    }

    public void kabaddi() {

        System.out.println();
        System.out.println("1. Telugu Titans vs Dabang Delhi");
        System.out.println("   Price (INR 500) - Gachibowli Stadium, Hyderabad.");
        System.out.println("   Date and Time - 21st November, 2024, 07:00 PM");
        System.out.println();
        System.out.println("2. Jaipur Pink Panthers vs Tamil Thalaivas");
        System.out.println("   Price (INR 750) - Gachibowli Stadium, Hyderabad.");
        System.out.println("   Date and Time - 22nd November, 2024, 07:00 PM");
        System.out.println();
        System.out.println("3. UP Yoddhas vs Gujarat Giants");
        System.out.println("   Price (INR 900) - Gachibowli Stadium, Hyderabad.");
        System.out.println("   Date and Time - 23rd November, 2024, 07:00 PM");
        System.out.println();
        System.out.println();
        System.out.println("4. To Go Back.");
        System.out.print(green);
        System.out.println("***************          SELECT The MATCH        ***************");
        System.out.print(reset);
        int n = ssc.nextInt();
        String matchName = "";
        int ticketPrice = 0;
        String dat = "";
        String location = "Gachibowli Stadium, Hyderabad.";

        switch (n) {
            case 1:
                matchName = "Telugu Titans vs Dabang Delhi";
                ticketPrice = 500;
                location = "Gachibowli Stadium, Hyderabad";
                dat = "21st November, 2024, 07:00 PM";
                break;
            case 2:
                matchName = "Jaipur Pink Panthers vs Tamil Thalaivas";
                ticketPrice = 750;
                location = "Gachibowli Stadium, Hyderabad";
                dat = "22nd November, 2024, 07:00 PM";
                break;
            case 3:
                matchName = "UP Yoddhas vs Gujarat Giants";
                ticketPrice = 900;
                location = "Gachibowli Stadium, Hyderabad";
                dat = "23rd November, 2024, 07:00 PM";
                break;
             case 4:
                   back();
                   break;
             default:
                System.out.println("Invalid selection.");
                System.exit(0);
        }

        System.out.println("You have selected                   : " + matchName);
        System.out.println("Event Date and Time                 : " + dat);
        System.out.println("Event Location                      : " + location);
        System.out.println("Ticket Price                        : " + ticketPrice);
        System.out.print(red);
        System.out.print(blink);
        System.out.println("500 discount on more than 5 tickets");
        System.out.print(reset);

        System.out.print("Enter quantity                      : ");

        int quantity = ssc.nextInt();
        overallCost(matchName, ticketPrice, quantity, location, dat);
    }

    public void cricket() {

        System.out.println();
        System.out.println("1. India vs Australia - T20 Match");
        System.out.println("   Price (INR 1200) - Rajiv Gandhi International Cricket Stadium, Hyderabad.");
        System.out.println("   Date and Time - 21st November, 2024, 07:00 PM");

        System.out.println();
        System.out.println("2. India vs Pakistan - ODI Match");
        System.out.println("   Price (INR 2000) - Rajiv Gandhi International Cricket Stadium, Hyderabad.");
        System.out.println("   Date and Time - 24th November, 2024, 02:00 PM");
        System.out.println();
        System.out.println("3. India vs England - Test Match");
        System.out.println("   Price (INR 1500) - Rajiv Gandhi International Cricket Stadium, Hyderabad.");
        System.out.println("   Date and Time - 27th November, 2024, 09:30 AM");
        System.out.println();
        System.out.println();
        System.out.println("4. To Go Back.");
        System.out.print(green);
        System.out.println("***************          SELECT The MATCH         ***************");
        System.out.print(reset);
        int n = ssc.nextInt();
        String matchName = "";
        int ticketPrice = 0;
        String dat = "";
        String location = "Rajiv Gandhi International Cricket Stadium, Hyderabad.";

        switch (n) {
            case 1:
                matchName = "India vs Australia - T20 Match";
                ticketPrice = 1200;
                location = "Rajiv Gandhi International Cricket Stadium, Hyderabad";
                dat = "21st November, 2024, 07:00 PM";
                break;
            case 2:
                matchName = "India vs Pakistan - ODI Match";
                ticketPrice = 2000;
                location = "Rajiv Gandhi International Cricket Stadium, Hyderabad";
                dat = "24th November, 2024, 02:00 PM";
                break;
            case 3:
                matchName = "India vs England - Test Match";
                ticketPrice = 1500;
                location = "Rajiv Gandhi International Cricket Stadium, Hyderabad";
                dat = "27th November, 2024, 09:30 AM";
                break;
           case 4:
                   back();
                   break;
             default:
                System.out.println("Invalid selection.");
                System.exit(0);
        }

        System.out.println("You have selected                   : " + matchName);
        System.out.println("Event Date and Time                 : " + dat);
        System.out.println("Event Location                      : " + location);
        System.out.println("Ticket Price                        : " + ticketPrice);
        System.out.print(red);
        System.out.print(blink);
        System.out.println("500 discount on more than 5 tickets");
        System.out.print(reset);

        System.out.print("Enter quantity                      : ");

        int quantity = ssc.nextInt();
        overallCost(matchName, ticketPrice, quantity, location, dat);
    }

    public void pottery() {

        System.out.println();
        System.out.println("1. Pottery Workshop at house of gourmet");
        System.out.println("   Price (INR 999) - House of gourmet, jubilee hills,Hyderabad.");
        System.err.println("   Date and Time - 23rd November, 2024, 10:00 AM");

        System.out.println();
        System.out.println();
        System.out.println("2. Pottery workshop by the lake");
        System.out.println("   Price (INR 899) - last coffee by the lake, madhapur,Hyderabad.");
        System.out.println("   Date and Time - 24th November, 2024, 12:00 PM");

        System.out.println();
        System.out.println();
        System.out.println("3. Pottery workshop at mindspace social");
        System.out.println("   Price (INR 1499) - SCC sky cinema,Hyderabad.");
        System.out.println("   Date and Time - 25th November, 2024, 02:00 PM");
        System.out.println();
        System.out.println();
        System.out.println("4. To Go Back.");
        System.out.print(green);
        System.out.println("***************        SELECT The WORKSHOP        ***************");
        System.out.print(reset);
        int n = ssc.nextInt();
        String eventName = "";
        int ticketPrice = 0;
        String dat = "";
        String location = "";
        switch (n) {
            case 1:
                eventName = "Pottery Workshop at house of gourmet";
                ticketPrice = 999;
                location = "House of gourmet, jubilee hills,Hyderabad";
                dat = "23rd November, 2024, 10:00 AM";
                break;
            case 2:
                eventName = "Pottery workshop by the lake";
                ticketPrice = 899;
                location = "last coffee by the lake, madhapur,Hyderabad";
                dat = "24th November, 2024, 12:00 PM";
                break;
            case 3:
                eventName = "Pottery workshop at mindspace social";
                ticketPrice = 1499;
                location = "SCC sky cinema,Hyderabad";
                dat = "25th November, 2024, 02:00 PM";
                break;
           case 4:
                   back();
                   break;
             default:
                System.out.println("Invalid selection.");
                System.exit(0);
        }
        System.out.println("You have selected                   : " + eventName);
        System.out.println("Event Date and Time                 : " + dat);
        System.out.println("Event Location                      : " + location);
        System.out.println("Ticket Price                        : " + ticketPrice);
        System.out.print(red);
        System.out.print(blink);
        System.out.println("500 discount on more than 5 tickets");
        System.out.print(reset);

        System.out.print("Enter quantity                      : ");
        int quantity = ssc.nextInt();
        overallCost(eventName, ticketPrice, quantity, location, dat);
    }

    public void painting() {

        System.out.println();
        System.out.println("1. Canvas Painting");
        System.out.println("   Price (INR 699) - Trailing Ivy Cafe,Hyderabad.");
        System.out.println("   Date and Time - 24th November, 2024, 02:00 PM");
        System.out.println();
        System.out.println();
        System.out.println("2. Diya Painting");
        System.out.println("   Price (INR 499) - The Garden Cafe,Hyderabad.");
        System.out.println("   Date and Time - 1st December, 2024, 02:00 PM");
        System.out.println();
        System.out.println();
        System.out.println("3. Water colour Painting");
        System.out.println("   Price (INR 799) - Sound of soul Nightclub,Hyderabad.");
        System.out.println("   Date and Time - 8th December, 2024, 02:00 PM");
        System.out.println();
        System.out.println();
        System.out.println("4. To Go Back.");
        System.out.print(green);
        System.out.println("***************        SELECT The WORKSHOP        ***************");
        System.out.print(reset);
        int n = ssc.nextInt();
        String eventName = "";
        int ticketPrice = 0;
        String dat = "";
        String location = "";
        switch (n) {
            case 1:
                eventName = "Canvas Painting";
                ticketPrice = 699;
                location = "Trailing Ivy Cafe,Hyderabad";
                dat = "24th November, 2024, 02:00 PM";
                break;
            case 2:
                eventName = "Diya Painting";
                ticketPrice = 499;
                location = "The Garden Cafe,Hyderabad";
                dat = "1st December, 2024, 02:00 PM";
                break;
            case 3:
                eventName = "Water colour Painting";
                ticketPrice = 799;
                location = "Sound of soul Nightclub,Hyderabad";
                dat = "8th December, 2024, 02:00 PM";
                break;
           case 4:
                   back();
                   break;
             default:
                System.out.println("Invalid selection.");
                System.exit(0);
        }
        System.out.println("You have selected                   : " + eventName);
        System.out.println("Event Date and Time                 : " + dat);
        System.out.println("Event Location                      : " + location);
        System.out.println("Ticket Price                        : " + ticketPrice);
        System.out.print(red);
        System.out.print(blink);
        System.out.println("500 discount on more than 5 tickets");
        System.out.print(reset);

        System.out.print("Enter quantity                      : ");
        int quantity = ssc.nextInt();
        overallCost(eventName, ticketPrice, quantity, location, dat);
    }

    public void textureart() {

        System.out.println();
        System.out.println("1. Textureart");
        System.out.println("   Price (INR 699) - Brew house Cafe,Hyderabad.");
        System.out.println("   Date and Time - 24th November, 2024, 11:00 AM");
        System.out.println();
        System.out.println();
        System.out.println("2. Texture art workshop by Inspiring pigments");
        System.out.println("   Price (INR 1500) - Over the Moon Brew Co,Hyderabad.");
        System.out.println("   Date and Time - 7th December, 2024, 12:00 PM");
        System.out.println();
        System.out.println();
        System.out.println("3. To Go Back.");
        System.out.print(green);
        System.out.println("***************        SELECT The WORKSHOP        ***************");
        System.out.print(reset);
        int n = ssc.nextInt();
        String eventName = "";
        int ticketPrice = 0;
        String dat = "";
        String location = "";
        switch (n) {
            case 1:
                eventName = "Textureart";
                ticketPrice = 699;
                location = "Brew house Cafe,Hyderabad";
                dat = "24th November, 2024, 11:00 AM";
                break;
            case 2:
                eventName = "Texture art workshop by Inspiring pigments";
                ticketPrice = 1500;
                location = "Over the Moon Brew Co,Hyderabad";
                dat = "7th December, 2024, 12:00 PM";
                break;
            case 4:
                   back();
                   break;
             default:
                System.out.println("Invalid selection.");
                System.exit(0);
        }
        System.out.println("You have selected                   : " + eventName);
        System.out.println("Event Date and Time                 : " + dat);
        System.out.println("Event Location                      : " + location);
        System.out.println("Ticket Price                        : " + ticketPrice);
        System.out.print(red);
        System.out.print(blink);
        System.out.println("500 discount on more than 5 tickets");
        System.out.print(reset);

        System.out.print("Enter quantity                     : ");
        int quantity = ssc.nextInt();
        overallCost(eventName, ticketPrice, quantity, location, dat);

    }

    public void photography() {

        System.out.println();
        System.out.println("1. Master your pohotograph basics");
        System.out.println("   Price (INR 6000) - Qutub Shahi Tombs,Hyderabad.");
        System.out.println("   Date and Time - 21st - 23th November, 11:00 AM");
        System.out.println();
        System.out.println();
        System.out.println("2. Demo Session");
        System.out.println("   Price (INR 1000) - Kalyan Cricket Academy,Hyderabad.");
        System.out.println("   Date and Time - 5th - 7th December, 2024, 11:00 AM");
        System.out.println();
        System.out.println();
        System.out.println("3. Capture Professional Way");
        System.out.println("   Price (INR 2000) - Sri laxmi sai towers,Hyderabad.");
        System.out.println("   Date and Time - 12th - 14th December,  2024, 11:00 AM");

        System.out.println();
        System.out.println();
        System.out.println("4. To Go Back.");
        System.out.print(green);
        System.out.println("***************        SELECT The WORKSHOP        ***************");
        System.out.print(reset);
        int n = ssc.nextInt();
        String eventName = "";
        int ticketPrice = 0;
        String dat = "";
        String location = "";
        switch (n) {
            case 1:
                eventName = "Master your pohotograph basics";
                ticketPrice = 6000;
                location = "Qutub Shahi Tombs,Hyderabad";
                dat = "21st - 22th November, 11:00 AM";
                break;
            case 2:
                eventName = "Demo Session";
                ticketPrice = 1000;
                location = "Kalyan Cricket Academy,Hyderabad";
                dat = "5th - 7th December, 2024, 11:00 AM";
                break;
            case 3:
                eventName = "Capture Professional Way";
                ticketPrice = 2000;
                location = "Sri laxmi sai towers,Hyderabad";
                dat = "12th - 14th December,  2024, 11:00";
                break;
           case 4:
                   back();
                   break;
             default:
                System.out.println("Invalid selection.");
                System.exit(0);
        }
        System.out.println("You have selected                   : " + eventName);
        System.out.println("Event Date and Time                 : " + dat);
        System.out.println("Event Location                      : " + location);
        System.out.println("Ticket Price                        : " + ticketPrice);
        System.out.print(red);
        System.out.print(blink);
        System.out.println("500 discount on more than 5 tickets");
        System.out.print(reset);

        System.out.print("Enter quantity                      : ");
        int quantity = ssc.nextInt();
        overallCost(eventName, ticketPrice, quantity, location, dat);
    }

    void overallCost(String EventName, int ticketPrice, int quantity, String location, String dat) {
        /*
         * System.out.print(red);
         * System.out.print(blink);
         * System.out.println("500 discount on more than 5 tickets");
         * System.out.print(reset);
         */
        double Cost = quantity * ticketPrice;
        double gst = 0.05 * Cost;
        double totalCost = gst + Cost;
        System.out.println();
        if (quantity > 5) {
            totalCost = totalCost - 500;
        }

        System.out.println();
        if (quantity != 1) {
            System.out.print(blue);
            System.out.println("<<<<<<<<<<<<<<  Successfully Booked your tickets  >>>>>>>>>>>>>>>");
            System.out.print(reset);
        } else {
            System.out.print(blue);
            System.out.println("<<<<<<<<<<<<<<  Successfully Booked your ticket   >>>>>>>>>>>>>>>");
            System.out.print(reset);
        }
        System.out.println("                CONFIRM YOUR CART DETAILS AND PAY                ");
        System.out.println("ORDER SUMMARY");
	System.out.print(yellow+"-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-"+reset);
        System.out.println();
	System.out.println();
        System.out.println("Event Name                          : " + EventName);
        System.out.println("Event Date and Time                 : " + dat);
        System.out.println("Quantity                            : " + quantity);
        System.out.println("Event Location                      : " + location);
        if (quantity > 5) {
            System.out.println("Cost before GST and discount        : " + Cost);
            System.out.println("GST of 5% on cost                   : " + gst);
            System.out.println("Discount                            : 500");
            System.out.println("Total Cost                          : INR " + totalCost + "/-");
        } else {
            System.out.println("Cost before GST                     : " + Cost);
            System.out.println("GST of 5% on cost                   : " + gst);
            System.out.println("Total Cost                          : INR " + totalCost + "/-");
        }
        System.out.println();
        System.out.println("Choose a Payment Method");
        System.out.println("1. Phonepe\n2. Paytm\n3. Googlepay\n4.Debitcard\n5. If you want to cancel the payment and go back\n6. If u want to cancel the payment and exit the app");
        System.out.print("Choose a payment :");
        int n = ssc.nextInt();
        if (n == 1) {
            System.out.println("Enter your Email");
            String email=sc.next();
            System.out.println(pay(totalCost));
            System.out.println("     Ticket Details sent to your mail");
             System.out.print(reset);
        } else if (n == 2) {
            System.out.println("Enter your Email");
            String email=sc.next();
            System.out.println(pay(totalCost));
            System.out.println("     Ticket Details sent to your mail");
             System.out.print(reset);
        } else if (n == 3) {
            System.out.println("Enter your Email");
            String email=sc.next();
            System.out.println(pay(totalCost));
            System.out.println("     Ticket Details sent to your mail");
             System.out.print(reset);
        } 
        else if(n==4)
        {
         System.out.println("Enter your Email");
            String email=sc.next();
         System.out.println(atm(totalCost));
         System.out.println("       Ticket Details sent to your mail");
          System.out.print(reset);

        }
        else if(n==5)
        {
         homepage();

        }
        else if(n==6)
        {
         System.out.print(purpe+blink);

            System.out.println("Thank You!\n Hope You felt Happy with our App Serivce:)");
             System.out.print(reset);
            System.exit(0);
        }
       else {
            System.out.println("Invalid Selection");
            System.exit(0);
        }
        if (quantity != 1) {
	    System.out.println();
            System.out.print(blue);
            System.out.println("<<<<<<<<<<<<<<   Thank you for Booking tickets   >>>>>>>>>>>>>>>>");
            System.out.print(reset);
        } else {
	     System.out.println();
            System.out.print(blue);
            System.out.println("<<<<<<<<<<<<<<    Thank you for Booking ticket    >>>>>>>>>>>>>>>");
            System.out.print(reset);
        }
        System.out.println("1. Exit the App\n2. Continue Booking for other Events");
        int t = ssc.nextInt();
        if (t == 1) {
	    System.out.print(purpe+blink);

            System.out.println("Thank You!\n Hope You felt Happy with our App Serivce:)");
            // System.out.println("We hope you’re enjoying our app service and that it’s
            // meeting your expectations!");
           System.out.print(reset);
            System.exit(0);
        } else if (t == 2) {
            homepage();
        } else {
            System.out.println("Invalid Selection");
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
       
        User obj1 = new User();
        obj1.login();
        Home obj = new Home();
        obj.homepage();}
}
