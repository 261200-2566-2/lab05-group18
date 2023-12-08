package Characters.Jobs;

import Characters.ClassCharacters.Magician;
public class Wizard extends Magician{
    public final String jobs = "Wizard";

    @Override
    public void JobS() {
        super.JobS();
        System.out.println(jobs);
    }
}
