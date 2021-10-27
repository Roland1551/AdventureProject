import javax.tools.Tool;
import java.util.Scanner;
import java.util.Random;


//rand.nextInt((max - min) + 1) + min between 2 numbers



public class Mechanism {

    static Random rand = new Random();
    static Scanner in = new Scanner(System.in);

    /////Press ENTER to continue..////
    static public void waitforbutton()
    {
        System.out.println("\n  >>  Press enter to continue  >>");
        String wait = in.nextLine();
    }

    /////HARC/////
    public static void Fight(Boolean random, String name, int powermin, int powermax, int health)
    {
        //Enemy változó deklarálás
        String n = "";
        int pmin = 0;
        int pmax = 0;
        int h = 0;
        if(random)
        {
            n=RandomName();
            pmin=1;
            //rand.nextInt((max - min) + 1) + min    (between 2 numbers)
            pmax=rand.nextInt((8 - 4) + 1) + 4;
            h=rand.nextInt(10)+1;
        }
        else
        {
            n=name;          //Enemy name
            pmin=powermin;   //Enemy max power
            pmax=powermax;   //Enemy max power
            h=health;        //Enemy health
        }
        while(h > 0 && AdventureTest.player.health>0)
        {
            //HARC MENÜ
            System.out.println("|" + n +"|\n  Sebzés:  ("+ pmin +" - "+ pmax +")   Életerő: "+ h);
            System.out.println("  |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
            System.out.println("  |   (T)ámadás     (V)édekezés     |");
            System.out.println("  |   (F)utás       (K)ötözés(Heal) |");
            System.out.println("  |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
            System.out.println("|"+AdventureTest.player.playername + "|\n  Sebzés: ("+  AdventureTest.player.weaponvalmin + " - " +
                                AdventureTest.player.weaponvalmax + ")  Életerő: " + AdventureTest.player.health + "  Kötszer: "+
                                AdventureTest.player.bandage );
            String input = in.nextLine();


            if(input.contains("T"))    //Támadás//
            {

                System.out.println("Támadásba lendülsz és a(z) "+n+" felé csapsz.");
                //rand.nextInt((max - min) + 1) + min    (between 2 numbers)
                int attack = rand.nextInt((AdventureTest.player.weaponvalmax - AdventureTest.player.weaponvalmin)+1)
                            + AdventureTest.player.weaponvalmin;
                System.out.println("** "+ attack + " sebzést okozol.**");
                h -= attack;     //h = Enemy életereje

                if(h>0) {
                    int damage = rand.nextInt(((pmax) - pmin) + 1) + pmin;
                    AdventureTest.player.health -= damage;  //Saját életerőnk//
                    System.out.println("A " + n + " visszatámad!");
                    System.out.println("** "+ damage + " életerőt veszítesz.**");
                }
                waitforbutton();
            }

            else if(input.contains("V"))    //Védekezés//
            {

                System.out.println("Próbálsz kitérni a(z) "+n+" támadása elől, de teljesen hárítanod nem sikerül...");
                int damage = (rand.nextInt(((pmax)-pmin)+1)+pmin) - AdventureTest.player.shieldval;
                if(damage<0)
                    damage=0;
                System.out.println("**"+ damage + " életerőt veszítesz**");

                AdventureTest.player.health -= damage;  //Saját életerőnk

                waitforbutton();
            }

            else if(input.contains("F"))  //Futás//
            {
                System.out.println("Megpróbálsz elmenekülni ellenfeled elől");
                System.out.println("**Veszítesz 1 életerőt.**");
                AdventureTest.player.health -= 1;

                break;
            }

            else if(input.contains("K"))  //Kötözés//
            {
                System.out.println("Előkapsz egy kötszert a zsebedből és gyorsan bekötözöd a sebeidet.");
                AdventureTest.player.health += 4;
                System.out.println("** 4 Életerőpontot szereztél és elhasználtál 1 kötszert.** ");
                AdventureTest.player.bandage -=1;

                waitforbutton();
            }

        }

        //VÉGKIMENETELEK
        if(h>0 && AdventureTest.player.health>0)
            System.out.println("Elmenekültél a harc elől."); //MENEKÜLÉS
        else if(h>0 && AdventureTest.player.health<=0)
            System.out.println("You LOST try again..."); //VESZTETTÉL
        else if(h<=0 && AdventureTest.player.health>0)
        {
            System.out.println("You defeated the " + n); //NYERTÉL
                    //rand.nextInt((max - min) + 1) + min    (between 2 numbers)
             int scrap = rand.nextInt(5) + 1;
            AdventureTest.player.scrap += scrap;
            System.out.println("You gained " + scrap + " scrap.");
        }
    }

    public static String RandomName()
    {
        switch(rand.nextInt(5)+1)
        {
            case 1:
                return "Spider";
            case 2:
                return "Wolf";
            case 3:
                return "Bear";
            case 4:
                return "Fox";
            case 5:
                return "Snake";
        }
        return("Human");
    }



}
