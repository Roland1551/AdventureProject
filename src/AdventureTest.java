import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class AdventureTest
{
    public static Tools tools = new Tools();
    public static Player player = new Player();

    public static void main(String[] args) {
        System.out.println("███████████████████████████████████████████████████████████████████████████████████████");
        System.out.println("      / /    ____    _____ / /    (_)___     / /_  / /_  ____     | |     / (_) /___/ /");
        System.out.println("     / /    / __ \\  / ___ / __/  / / __ \\   / __  / __ \\/ __ \\    | | /| / / / / __  / ");
        System.out.println("    / /___ / /_/ / (__  )  /_   / / / / /  / /_  / / / /  ___/    | |/ |/ / / / /_/ /  ");
        System.out.println("   /_____/ \\____/ _____/ \\__/  /_/_/ /_/   \\__/ / /_/ /\\____/     |__/|__/_/_/\\__,_/   ");
        System.out.println("███████████████████████████████████████████████████████████████████████████████████████");


        System.out.println("            Would you like to start the game? (Type in \"yes\")");


        Scanner in = new Scanner(System.in);

        String yesorno = in.nextLine();
        if (yesorno.contains("yes") || yesorno.contains("y"))
        {
            Events.Start();
            Events.randomfight();
            Events.End();
        }
        else
            System.exit( 0);
    }

}

