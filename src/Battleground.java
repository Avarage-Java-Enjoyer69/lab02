import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Battleground {
    public static void main(String []args) {


        Battle b = new Battle();
        Pokemon p1 = new Klefki("Key Keeper", 10);
        Pokemon p2 = new Yanma("Bururich", 15);
        Pokemon p3 = new Yanmega("Burburich", 12);
        Pokemon p4 = new Oddish("Rediska", 5);
        Pokemon p5 = new Gloom("Valera", 20);
        Pokemon p6 = new Bellossom("Handsome", 18);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }

}
