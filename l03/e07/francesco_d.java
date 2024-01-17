package l03.e07;

public class francesco_d {
    public static void main(String[] args) {
        
//se piove e temp < 10 --> letto a dormire altrimenti se piove o fa meno di 10 e contemporaneamente non accadono entrambe le cose --> a piedi con l'ombrello, se non piove e fanno piu di 10 --> suggerire di prendere la scopa
    
    boolean piove = true;
    int temp = 9;
    if(piove && temp<10){
        System.out.println("letto");
    }
    // equivalente di xor
    else if((piove || temp <10) && !(piove && temp<10)){
        System.out.println("A piedi con l'ombrello");
    }
    else{
        System.out.println("scopa");
}
    }
}
