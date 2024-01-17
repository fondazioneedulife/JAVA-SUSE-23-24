package l04.e01.pietrofornale;

public class hogsmade {
  
  public static void main(String[] args) {
    boolean uniform = false;
    boolean student = false;
    boolean teacher = true;
    boolean headmaster = false;
    boolean ghost = false;
    boolean dog = false;

    System.out.println(canEnter(uniform, student, teacher, headmaster, ghost, dog));
  }

  private static boolean canEnter(boolean uni, boolean stu, boolean teach, boolean hM, boolean gh, boolean dog) {
    return (((stu && uni) ^ (teach ^ hM ^ gh)) && !dog);
  }
}
