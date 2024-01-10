package l03.e04.Docente;

public class e04 {
    public static void main(String args[]){
        for(int i=2; i<=20; i+=2){
            System.out.println(i);
        }
        //oppure
        for(int i=1; i<=20; i++){
            if(i%2==0)
                System.out.println(i);
        }
        for(int i=40;i<50;i++){
            if(i%2==1)
                System.out.println(i);
        }
    }
    
}
