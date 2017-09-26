/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 *  Project which holds a function that finds part of one string within another.
 */
public class ReclamationProject {
    /**
     * Main function that prints out the result of the function doit(a,b).
     * @param args main method
     */
    public static void main(final String[] args) {
        String a = "supercalifragilicious";
        String b = "california";
        System.out.println(doit(a, b));

    }
    /**
     * Tells how much of one string is within another.
     * @param a - first input string
     * @param b - second input string
     * @return r - the part of one string that is also in the other (first time)
     */
    public static String doit(final String a, final String b) {
        String localA = a;
        String localB = b;
        if (a.length() > b.length()) {
            String c = a;
            localA = b;
            localB = c;
        } else {
            localA = a;
            localB = b;
        }

        String r;
        if (localA.equals(localB)) {
            r = localA;
        } else {
            r = "";
        }

        /*
         * For loop with i. Goes through each letter in each string until there is a match.
         */
        for (int indexOfA = 0; indexOfA < localA.length(); indexOfA++) {
            for (int backIndexOfA = localA.length() - indexOfA; backIndexOfA > 0; backIndexOfA--) {
                for (int indexOfB = 0; indexOfB < localB.length() - backIndexOfA; indexOfB++) {
                    if (localA.regionMatches(indexOfA, localB, indexOfB, backIndexOfA)
                            && backIndexOfA > r.length()) {
                        r = localA.substring(indexOfA, indexOfA + backIndexOfA);
                    }
                }
           }
        } return r; }
}
