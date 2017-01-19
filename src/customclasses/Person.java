package customclasses;

import javax.sound.sampled.Port;
import java.util.EnumSet;
import java.util.Random;

/**
 * Created by jhollinshead on 17/01/2017.
 */
public class Person {

    private Random generator;

    private Portrait portrait;
    private Career career;
    private Name name;
    private Colour favourateColour;
    private Country country;

    public Portrait getPortrait() {
        return portrait;
    }

    public Career getCareer() {
        return career;
    }

    public Name getName() {
        return name;
    }

    public Colour getFavourateColour() {
        return favourateColour;
    }

    public Country getCountry() {
        return country;
    }

    public Person(long seed) {
        generator = new Random(seed);

        this.portrait = getRandom(Portrait.class, true);
        this.career = getRandom(Career.class, false);
        this.name = getRandom(Name.class, false);
        this.favourateColour = getRandom(Colour.class, false);
        this.country = getRandom(Country.class, true);
    }

    private <E extends Enum<E>> E getRandom(Class<E> eClass, boolean excludeFinalValue)
    {
        E[] values = eClass.getEnumConstants();
        int numValues = values.length;

        if (excludeFinalValue)
            --numValues;

        if(numValues > 0) {
            return values[generator.nextInt(numValues)];
        }

        return null;
    }

}
