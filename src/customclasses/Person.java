package customclasses;

import java.util.EnumSet;
import java.util.Random;

/**
 * Created by jhollinshead on 17/01/2017.
 */
public class Person {

    private Random generator;
    private Gender gender;

    public Person(long seed) {
        generator = new Random(seed);

        this.gender = getRandom(Gender.class, true);
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
