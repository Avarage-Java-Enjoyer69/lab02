package pokemons;

import attacks.SpecialAttacks.DreamEater;
import attacks.SpecialAttacks.ShadowBall;
import attacks.physicalAttacks.QuickAttack;
import ru.ifmo.se.pokemon.*;

public class Yanma extends Pokemon {
    public Yanma (String name, int lvl){
        super(name, lvl);
        this.setStats(65,65,45,75,45,95);
        this.setType(Type.BUG, Type.FLYING);
        this.addMove(new QuickAttack());
        this.addMove(new DreamEater());
        this.addMove(new ShadowBall());
    }
}
