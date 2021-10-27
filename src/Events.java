import java.util.Random;
import java.util.Scanner;

public class Events {

    static Random rand = new Random();
    static Scanner in = new Scanner(System.in);

    public static void Start()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("A játék megkezdéséhez, add meg a karaktered nevét...");
        AdventureTest.player.playername = in.nextLine();

        System.out.println("    Egy erdei túrán veszel részt, több száz km-re a legközelebbi településtől. A túra során egy függőhídhoz érkeztek...");
        System.out.println("A csoportból mindenki sikeresen átkel a hídon, azonban amikor te próbálsz meg átkelni rajta, kiáltást hallasz, hogy "+ AdventureTest.player.playername + " vigyázz!!De a híd leszakad és te a folyóba zuhansz.");
        System.out.println("Elveszíted az eszméletedet és órákkal később a partra sodródva ébredsz. Esteledik. A telefonodat elhagytad és a csoportod sem talált meg.");
        System.out.println("Egy pók üvöltve szalad feléd hogy elvegye az életedet.");

    }

    public static void tutorial()
    {
        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("Felkapsz egy botot a földről és a pók felé szegezed.");
        Mechanism.Fight(false, "Pók", 1, 2, 3);
    }

    public static void randomfight()
    {
        System.out.println("\n---------------------------------------------------------------------------------------");
        Mechanism.Fight(true, "", 0, 0, 0);
    }


    public static void End()
    {
        System.out.println("\n\nGratulalok, kijutottál az erdőből!!!!!");
    }
}


