package cz.czechitas.ukol07;

/**
 * Spouštěcí třída aplikace
 */
public class Aplikace {
    public static void main(String[] args) {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        knihaSluzba.nacistSeznamKnih();
        System.out.println(knihaSluzba.nacistSeznamKnih());


        knihaSluzba.nacistKnihyAutora();//toto není dobře
        System.out.println();
    }


}
