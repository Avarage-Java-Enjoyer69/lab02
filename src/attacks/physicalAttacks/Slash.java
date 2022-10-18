package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove {
    public Slash(){super(Type.NORMAL, 70, 1.0);}

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (att.getStat(Stat.SPEED) / 64.0 > Math.random()) {
            System.out.println("Критический удар!");
            return 2.0;
        } else {
            return 1.0;
        }
    }

    @Override
    protected String describe(){
        return "Use Slash";
    }
}
