import java.util.Scanner;

public class EventOrder {

    public static void Start()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("A játék megkezdéséhez, add meg a karaktered nevét...");
        AdventureTest.jatekos.playername = in.nextLine();

        System.out.println("    Egy erdei túrán veszel részt, több száz km-re a legközelebbi településtől. A túra során egy függőhídhoz érkeztek...");
        System.out.println("A csoportból mindenki sikeresen átkel a hídon, azonban amikor te próbálsz meg átkelni rajta, kiáltást hallasz, hogy "+ AdventureTest.jatekos.playername + " vigyázz!!De a híd leszakad és te a folyóba zuhansz.");
        System.out.println("Elveszíted az eszméletedet és órákkal később a partra sodródva ébredsz. Esteledik. A telefonodat elhagytad és a csoportod sem talált meg.");
        System.out.println("Egy pók üvöltve szalad feléd hogy elvegye az életedet.");

    }

    public static void ElsoEsemeny()
    {
        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("Felkapsz egy botot a földről és a pók felé szegezed.");
        Esemeny.Harc(false, "Pók", 1, 2, 5);
    }

    public static void MasodikEsemeny()
    {
        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("Tovább haladsz az erdőben, egy farkas támad rád.");
        Esemeny.Harc(false, "Farkas", 3, 3, 7);
    }

    public static void End()
    {
        System.out.println("\n\nGratulalok, kijutottál az erdőből!!!!!");
    }
}


