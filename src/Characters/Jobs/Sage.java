package Characters.Jobs;

import Characters.ClassCharacters.Magician;
public class Sage extends Magician{
    public final String jobs = "Sage";

    @Override
    public void JobS() {
        super.JobS();
        System.out.println(jobs);
    }

}
