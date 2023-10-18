package br.com.antizombiecoorporation.DuckTheOnlyHope.util;

/**
 *
 * @author Willian Scaquett
 */
public class MathUtil {

    public static int getRandomModifier(int max, int randomFactor) {
        return randomFactor % (max + 1);
    }
}
