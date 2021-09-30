public class Tools {

    void kard(){
        System.out.println("\nFelvettél egy kardot! (3-5)");
        AdventureTest.jatekos.weaponvalmin=3;
        AdventureTest.jatekos.weaponvalmax=5;
    }

    void balta(){
        System.out.println("\nFelvettél egy Baltát! (4-5)");
        AdventureTest.jatekos.weaponvalmin=4;
        AdventureTest.jatekos.weaponvalmax=5;
    }

    void páncél(){
        System.out.println("\nFelvettél egy páncélt!(+3 páncél)");
        AdventureTest.jatekos.armorval=3;
    }
}

