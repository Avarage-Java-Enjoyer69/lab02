package attacks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {
    public CalmMind(){super(Type.PSYCHIC, 0, 0);}

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.SPECIAL_ATTACK,  1);
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
        super.applyOppEffects(pokemon);
    }
    @Override
    protected String describe(){

        return "Used CalmMind";
    }
}
