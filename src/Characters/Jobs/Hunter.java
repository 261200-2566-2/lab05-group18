package Characters.Jobs;

import Characters.ClassCharacters.Archer;
public class Hunter extends Archer {
    public final String jobs = "Hunter";

    @Override
    public void JobS() {
        super.JobS();
        System.out.println(jobs);
    }
}
