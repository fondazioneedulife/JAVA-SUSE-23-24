package l03.e07.severino;

public class severino {
    public static void main(String args[]){
        boolean piove = true;
        int temp = 9;
        if(piove && temp<10){
            System.out.println("letto");
        }
        // equivalente di xor
        else if((piove || temp <10) && !(piove && temp<10)){
            System.out.println("ombrello");
        }
        else{
            System.out.println("scopa");
        }
    }
}
