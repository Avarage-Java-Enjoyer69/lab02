package attacks.physicalAttacks;
import ru.ifmo.se.pokemon.*;
public class QuickAttack extends PhysicalMove{
    public QuickAttack(){super(Type.NORMAL, 40, 1.0, 2, 1);}

    @Override
    protected String describe(){
        return "Use QuickAttack";
    }
}
