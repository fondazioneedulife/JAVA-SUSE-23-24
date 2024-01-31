package nicolis_A_marinaio.bin;

import java.io.File;

class marinaio {

        public marinaio() {

        }
}

class marinaioTest {
        public static void main(String[] args) {

                System.out.println("Start");

                //              CALCOLO PATH RELATIVO UNIVERSALE
                //----------------------------------------------------------------------
                String tempPath = new File(
                                String.valueOf(marinaio.class.getPackage()).replace("package ", "").replace(".", "/")  
                ).getParent();
                File uesrPath = new File(System.getProperty("user.dir"));
                String projectPath = uesrPath.getName().equals(tempPath) ?
                                uesrPath.getPath() :
                                new File(uesrPath.getPath() + "/src").exists() ?
                                                uesrPath.getPath() + "/src/" + tempPath :
                                                uesrPath.getPath() + tempPath;
                //----------------------------------------------------------------------

                // COSTANTI
                String resursesPath = "/file/";

                System.out.println("Hello, World");

                System.out.println("End");

        }
}