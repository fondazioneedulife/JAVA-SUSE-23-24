package l04.e05_terza_prova.nicolis_A_ordineNumero.bin;

import java.util.Scanner;

public class numeroScelto {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int count = 0;
                int num = 0;
                boolean scrit = false;

                for (int i = 0; i < 63; i++) {
                        count++;
                        if (scrit) {
                                System.out.print(i  + " ");
                        }
                        if (count == 1) {
                                scrit = !scrit;
                                count = 0;
                        }
                }

                System.out.println("il tuo numero è presente?");
                boolean control = sc.nextBoolean();
                if (control) {
                    num += 1;
                }else{
                    num += 0;
                }

                count = 0;

                for (int i = 2; i < 63; i++) {
                    count++;
                    if (scrit) {
                            System.out.print(i + " ");
                    }
                    if (count == 2) {
                            scrit = !scrit;
                            count = 0;
                    }
                }

                System.out.println("il tuo numero è presente?");
                control = sc.nextBoolean();
                if (control) {
                    num += 2;
                }else{
                    num += 0;
                }

                count = 0;

                for (int i = 4; i < 63; i++) {
                    count++;
                    if (scrit) {
                            System.out.print(i + " ");
                    }
                    if (count == 4) {
                            scrit = !scrit;
                            count = 0;
                    }
                }

                System.out.println("il tuo numero è presente?");
                control = sc.nextBoolean();
                if (control) {
                    num += 4;
                }else{
                    num += 0;
                }

                count = 0;

                for (int i = 8; i < 63; i++) {
                    count++;
                    if (scrit) {
                            System.out.print(i + " ");
                    }
                    if (count == 8) {
                            scrit = !scrit;
                            count = 0;
                    }
                }

                System.out.println("il tuo numero è presente?");
                control = sc.nextBoolean();
                if (control) {
                    num += 8;
                }else{
                    num += 0;
                }

                count = 0;

                for (int i = 16; i < 63; i++) {
                    count++;
                    if (scrit) {
                            System.out.print(i + " ");
                    }
                    if (count == 16) {
                            scrit = !scrit;
                            count = 0;
                    }
                }

                System.out.println("il tuo numero è presente?");
                control = sc.nextBoolean();
                if (control) {
                    num += 16;
                }else{
                    num += 0;
                }

                count = 0;

                for (int i = 32; i < 63; i++) {
                    count++;
                    if (scrit) {
                            System.out.print(i + " ");
                    }
                    if (count == 32) {
                            scrit = !scrit;
                            count = 0;
                    }
                }

                System.out.println("il tuo numero è presente?");
                control = sc.nextBoolean();
                if (control) {
                    num += 32;
                }else{
                    num += 0;
                }

                System.out.println("il tuo numero è " + num);

                sc.close();
        }
}
