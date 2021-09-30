import javax.tools.Tool;
import java.util.Scanner;
import java.util.Random;


//rand.nextInt((max - min) + 1) + min between 2 numbers



public class Esemeny {

    static Random rand = new Random();
    static Scanner in = new Scanner(System.in);

    /////Press ENTER to continue..////
    static public void waitforbutton()
    {
        System.out.println("\n  >>  Press enter to continue  >>");
        String wait = in.nextLine();
    }

    /////HARC/////
    public static void Harc(Boolean random, String name, int powermin, int powermax, int health)
    {
        //Enemy változó deklarálás
        String n = "";
        int pmin = 0;
        int pmax = 0;
        int h = 0;
        if(random)
        {

        }
        else
        {
            n=name;          //Enemy name
            pmin=powermin;   //Enemy max power
            pmax=powermax;   //Enemy max power
            h=health;        //Enemy health
        }
        while(h > 0 && AdventureTest.jatekos.health>0)
        {
            //HARC MENÜ
            System.out.println("|" + n +"|\n  Sebzés:  ("+ pmin +" - "+ pmax +")   Életerő: "+ h);
            System.out.println("  |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
            System.out.println("  |   (T)ámadás     (V)édekezés     |");
            System.out.println("  |   (F)utás       (K)ötözés(Heal) |");
            System.out.println("  |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
            System.out.println("|"+AdventureTest.jatekos.playername + "|\n  Sebzés: ("+  AdventureTest.jatekos.weaponvalmin + " - " + AdventureTest.jatekos.weaponvalmax + ")  Életerő: " + AdventureTest.jatekos.health + "  Kötszer: "+ AdventureTest.jatekos.bandage );
            String input = in.nextLine();


            if(input.contains("T"))    //Támadás//
            {

                System.out.println("Támadásba lendülsz és a(z) "+n+" felé csapsz, de a(z) "+n+" visszatámad és megsért.");
                //rand.nextInt((max - min) + 1) + min    (between 2 numbers)
                int damage = rand.nextInt(((pmax)-pmin)+1)+pmin - AdventureTest.jatekos.armorval;
                if(damage<0)
                    damage=0;
                //rand.nextInt((max - min) + 1) + min    (between 2 numbers)
                int attack = rand.nextInt((AdventureTest.jatekos.weaponvalmax - AdventureTest.jatekos.weaponvalmin)+1)+AdventureTest.jatekos.weaponvalmin;
                System.out.println("**"+ damage + " életerőt veszítesz és " + attack + " sebzést okozol.**");

                AdventureTest.jatekos.health -= damage;  //Saját életerőnk
                h -= attack;                             //Enemy életereje

                waitforbutton();
            }

            else if(input.contains("V"))    //Védekezés//
            {

                System.out.println("Próbálsz kitérni a(z) "+n+" támadása elől, de teljesen hárítanod nem sikerül...");
                int damage = (rand.nextInt(((pmax)-pmin)+1)+pmin/4) - AdventureTest.jatekos.armorval;
                if(damage<0)
                    damage=0;
                int attack = (AdventureTest.jatekos.weaponvalmin)/2;
                System.out.println("**"+ damage + " életerőt veszítesz és " + attack + " sebzést okozol.**");

                AdventureTest.jatekos.health -= damage;  //Saját életerőnk
                h -= attack;

                waitforbutton();
            }

            else if(input.contains("F"))  //Futás//
            {
                System.out.println("Megpróbálsz elmenekülni ellenfeled elől, de mielőtt ezt megteszed, enyhén megsebez.");
                System.out.println("**Veszítesz 1 életerőt.**");
                AdventureTest.jatekos.health -= 1;

                break;
            }

            else if(input.contains("K"))  //Kötözés//
            {
                System.out.println("Előkapsz egy kötszert a zsebedből és gyorsan bekötözöd a sebeidet.");
                AdventureTest.jatekos.health += 5;
                System.out.println("** Életerőpontot szereztél és elhasználtál 1 kötszert.** ");
                AdventureTest.jatekos.bandage -=1;

                waitforbutton();
            }

        }

        //VÉGKIMENETELEK
        if(h>0 && AdventureTest.jatekos.health>0)
            System.out.println("Elmenekültél a harc elől."); //MENEKÜLÉS
        else if(h>0 && AdventureTest.jatekos.health<=0)
            System.out.println("You LOST try again..."); //VESZTETTÉL
        else if(h<=0 && AdventureTest.jatekos.health>0)
            System.out.println("You defeated the "+ n); //NYERTÉL
    }



}
