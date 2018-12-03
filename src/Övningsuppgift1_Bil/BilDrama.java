package Övningsuppgift1_Bil;

public class BilDrama {
    protected static String printBil(Bil bil){
        if (bil.getBilägare() == null){
            return "Bilen med regNummer " + bil.getRegNummer() + " har ingen ägare";
        }
        else {
            return "Bilen med regNummer " + bil.getRegNummer() + " är av typen " 
                    + bil.getSort() + " och ägs av "+ bil.getBilägare().getName();
        }
    }


    public static void main(String[] args) {
        Bilägare Bosse = new Bilägare("Bosse", "Bilvägen 3", 65);
        Bilägare Lisa = new Bilägare("Lisa", "Laduvägen 8", 27);
        Bilägare Kim = new Bilägare("Kim", "Kalasvägen 6", 37);
        Bil rödaSaaben = new Bil("XYZ 123", "Saab");
        Bil vitaVolvon = new Bil("ERT 432", "Volvo");
        
        rödaSaaben.ägsAv(Bosse);
        vitaVolvon.ägsAv(Lisa);
        rödaSaaben.såld();
        rödaSaaben.ägsAv(Kim);
        
        System.out.println(printBil(rödaSaaben));
        System.out.println(printBil(vitaVolvon));
    }
}
