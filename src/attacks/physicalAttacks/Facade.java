package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){super(Type.PSYCHIC, 70, 1.0);}

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        if (pokemon.getCondition().equals(Status.PARALYZE) || pokemon.getCondition().equals(Status.BURN) || pokemon.getCondition().equals(Status.POISON)){
            this.power*=2;
        }
        super.applySelfEffects(pokemon);
    }
    @Override
    protected String describe(){
        return "Use Facade";
    }
}
