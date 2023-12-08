package Characters.ClassCharacters;

import Characters.Characters;

public class Magician extends Characters {
    public final String Attack_Distance = "Mid range attack";
    public final String Attack_Type = "Magic";
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
