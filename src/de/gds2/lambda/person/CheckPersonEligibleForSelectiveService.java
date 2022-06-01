package de.gds2.lambda.person;

public class CheckPersonEligibleForSelectiveService implements CheckPerson {

    @Override
    public boolean test(Person p) {
        boolean eligible = false;
        if (p.getAge() >= 18 && p.getAge() <= 25)
            eligible = true;
        return eligible;
    }
}
