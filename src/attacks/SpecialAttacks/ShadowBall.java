package attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;
public class ShadowBall extends SpecialMove {
    public ShadowBall(){super(Type.GHOST, 80, 1.0);}

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect effect = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1).turns(-1);
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);

    }
    @Override
    protected String describe(){

        return "Used Shadow Ball";
    }
}
