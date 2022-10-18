package pokemons;

import attacks.physicalAttacks.Slash;

public class Yanmega extends Yanma{
    public Yanmega (String name, int lvl){
        super (name, lvl);
        this.setStats(86,76,86,116,56,95);
        this.addMove(new Slash());
    }
}
