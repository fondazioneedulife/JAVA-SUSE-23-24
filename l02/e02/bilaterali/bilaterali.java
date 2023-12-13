package bilaterali;

public class bilaterali {
    public static void main(String[] args) {

    }
    static int functionRed(){

    }
    static int functionBleu(){

    }
    static int functionGreen(){
        if(n == 0){
            System.out.println("allora svagiamoci un po, ");
            int i;
            int k = 0;
            do{
                System.out.println("cos'altro ti va di fare?");
                System.out.println("mi piace? 0/no 1/si");
                int x = sc.nextInt();

                if(x==0){
                    i =+ 1;
                    if(i > 6){
                        System.out.println("scegli tra tutte le opzioni quella meno disumana");
                        System.out.println("fattela piacere");
                        System.out.println("svagatevi in sieme");
                        k = 1;
                        //siete amici
                    }
                }else{
                    System.out.println("facciamo in sime");
                    System.out.println("svagatevi in sieme");
                    //siete amici
                    k = 1;
                }

            }while(k==0);
            

        }
    }
}
