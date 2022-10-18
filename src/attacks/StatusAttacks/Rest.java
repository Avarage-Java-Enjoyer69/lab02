package attacks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest () {super(Type.PSYCHIC, 0, 0);}
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect effect = new Effect().turns(2).stat(Stat.HP, 57).condition(Status.SLEEP);
        pokemon.addEffect(effect);
        super.applySelfEffects(pokemon);
    }
    @Override
    protected  String describe(){
        return "Use Rest";
    }

}
