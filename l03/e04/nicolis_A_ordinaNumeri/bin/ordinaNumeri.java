package l03.e04.nicolis_A_ordinaNumeri.bin;


class ordinaNumeri {
        public static void main(String[] args) {
                int[] lista = new int[16];
                int posti = 0; 

                for (int i = 0; i < 21; i++) {
                        if ( i % 2 == 0){
                                lista[posti] = i;
                                posti++;
                        }
                }

                int j = 40;

                while (j <= 50) {
                        if ( j % 2 != 0){
                                lista[posti] = j;
                                posti++;
                        }
                        j ++;
                }

                System.out.println("i numeri sono: ");

                for (int i = 0; i < lista.length; i++) {
                        System.out.println(lista[i]);
                }

        }
}