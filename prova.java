public class ZywOo {
    public static String warnTheSheep(String[] array) {
        if (array[array.length-1] == "wolf") {
            return "Pls go away and stop eating my sheep";
        }
        for (int i = 1; i < array.length; i++) {
            if (array[array.length-1-i] == "wolf") {
                return "Oi! Sheep number "+ (i) +"! You are about to be eaten by a wolf!";
            }
        }
        return "";
    }
}
a e i o u
