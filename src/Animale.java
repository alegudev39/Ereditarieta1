public class Animale {

    String versoAnimale = "Questo è il verso di animale";

    public java.lang.String faiIlVerso() {
        System.out.println("Ecco il verso: " + versoAnimale );
        return versoAnimale;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Animale{" +
                "versoAnimale=" + versoAnimale +
                '}';
    }
}
