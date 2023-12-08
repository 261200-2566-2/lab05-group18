package Characters.ClassCharacters;

import Characters.Characters;

public class Archer extends Characters {
    public final String Attack_Distance = "Ranged attack";
    public final String Attack_Type = "Magic or Physical";

    @Override
    public void AttackDistance() {
        super.AttackDistance();
        System.out.println(Attack_Distance);
    }

    @Override
    public void AttackType() {
        super.AttackType();
        System.out.println(Attack_Type);
    }
}
