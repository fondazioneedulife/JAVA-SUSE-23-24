package l07.e01.pietrofornale;

/*
Scrivere un programma in grado di istanziare un oggetto rappresentante l'area di un rettangolo, assegnate base ed altezza dello stesso. Dalla stessa classe
derivare una classe che descriva un oggetto parallelepipedo che utilizzi i metodi della classe per il calcolo dell'area per poter restituire il volume del solido. Fare in modo che Rettangolo e Parallelepipedo implementino un’interfaccia con un metodo lati(). Questo metodo restituisce una stringa con i lati della figura.
Fare in modo che Rettangolo estenda a sua volta una classe abstract quadrilatero che abbia in comune con la sua sottoclasse il metodo Area().
La classe astratta Quadrilatero non implementa Area(), che è un metodo astratto.
*/

public class Solution {
  public static void main(String[] args) {

    Rectangle rect = new Rectangle(5, 10);
    System.out.println("Rectangle's Area: " + rect.area());
    System.out.println("Rectangle: " + rect.sides());

    Parallelepiped para = new Parallelepiped(5, 10, 3);
    System.out.println("\nParallelepiped's Volume: " + para.volume());
    System.out.println("Parallelepiped: " + para.sides());
  }
}
