package attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(){super(Type.PSYCHIC, 100,1);}
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        pokemon.setMod(Stat.SPECIAL_ATTACK, -1);
        super.applyOppEffects(pokemon);

    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.SPECIAL_ATTACK,1);
        super.applySelfEffects(pokemon);
    }
    @Override
    protected String describe(){
        return "Used Dream Eater";
    }
}
