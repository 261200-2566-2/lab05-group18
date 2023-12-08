package Characters.ClassCharacters;

import Characters.Characters;

public class SwordMan extends Characters {
    public final String Attack_Distance = "Melee attack";
    public final String Attack_Type = "Physical";
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
