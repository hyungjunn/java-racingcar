package race;

import race.utils.RandomUtil;

import java.util.Random;

public class RaceRule implements RandomUtil {

    private static final Random RANDOM = new Random();
    private static final int END_BOUND = 10;

    public int generate() {
        return RANDOM.nextInt(END_BOUND);
    }

}
