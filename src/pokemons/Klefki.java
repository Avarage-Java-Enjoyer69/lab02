package pokemons;

import attacks.SpecialAttacks.FairyWind;
import attacks.StatusAttacks.CalmMind;
import attacks.StatusAttacks.Confide;
import attacks.StatusAttacks.Rest;
import ru.ifmo.se.pokemon.*;

public class Klefki extends Pokemon {
    public Klefki(String name, int lvl) {
        super(name, lvl);
        this.setStats(57, 80, 91, 80, 87, 75);
        this.setType(Type.FAIRY, Type.STEEL);
        this.addMove(new Rest());
        this.addMove(new Confide());
        this.addMove(new FairyWind());
        this.addMove(new CalmMind());
    }
}