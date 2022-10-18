package pokemons;

import attacks.SpecialAttacks.MegaDrain;
import attacks.physicalAttacks.Facade;
import ru.ifmo.se.pokemon.*;

public class Oddish extends Pokemon {
    public Oddish(String name, int lvl){
        super (name, lvl);
        this.setStats(45,50,55,75,65,30);
        this.setType(Type.GRASS, Type.POISON);
        this.addMove(new MegaDrain());
        this.addMove(new Facade());
    }
}
