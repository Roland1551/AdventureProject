public class Tools {

    void kard(){
        System.out.println("\nFelvettél egy kardot! (3-5)");
        AdventureTest.player.weaponvalmin=3;
        AdventureTest.player.weaponvalmax=5;
    }

    void balta(){
        System.out.println("\nFelvettél egy Baltát! (4-5)");
        AdventureTest.player.weaponvalmin=4;
        AdventureTest.player.weaponvalmax=5;
    }


    void páncél(){
        System.out.println("\nFelvettél egy pajzsot!(+3 pajzsérték)");
        AdventureTest.player.shieldval=3;
    }
}

