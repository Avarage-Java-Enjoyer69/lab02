package attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class MegaDrain extends SpecialMove {
    public MegaDrain(){super(Type.GRASS, 40,1.0);}

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect effect = new Effect().chance(0.5).stat(Stat.SPECIAL_ATTACK, -1).stat(Stat.SPECIAL_DEFENSE, -1).turns(-1);
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);

    }

    @Override
    protected String describe(){

        return "Use Mega Drain";
    }
}
