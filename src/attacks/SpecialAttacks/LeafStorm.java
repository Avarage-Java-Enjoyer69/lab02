package attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class LeafStorm extends SpecialMove {
    public LeafStorm(){super(Type.GRASS, 130,0.9);}

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.SPECIAL_ATTACK, -2);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe(){

        return "Used Leaf Storm";
    }
}
