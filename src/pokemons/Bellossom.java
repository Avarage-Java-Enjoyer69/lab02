package pokemons;
import attacks.SpecialAttacks.LeafStorm;

import ru.ifmo.se.pokemon.Type;

public class Bellossom extends Gloom {
    public Bellossom (String name, int lvl){
        super(name, lvl);
        this.setStats(75,80,95,90,100,50);
        this.setType(Type.GRASS);
        this.addMove(new LeafStorm());
    }
}
