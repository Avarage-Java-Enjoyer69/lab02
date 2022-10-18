package attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FairyWind extends SpecialMove {
    public FairyWind(){super(Type.FAIRY, 40, 1.0);}
    @Override
    protected String describe(){
        return "Use Fairy Wind";
    }
}
