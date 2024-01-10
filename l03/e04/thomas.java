package l03.e04;

public class thomas {
    public static void main(String[] args){

        int i;

        for(i=1; i<=20; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        i = 40;
        while(i<=50){
            if(i%2!=0){
                System.out.print(i + " ");
            }
            i++;
        }

    }

}
