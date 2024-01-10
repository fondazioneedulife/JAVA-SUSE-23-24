/**
 * davide_antinori
 */
public class davide_antinori {

    public static void main(String[] args) {
        int i;
        for (i = 0; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        while (i > 20 && i < 40) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}