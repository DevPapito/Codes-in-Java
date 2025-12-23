class Exec34 {



    public static void main(String[] args) {

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {

            A[i] = (int)(Math.random() * 50);

        }


        for (int i = 0; i < A.length; i++) {

            System.out.println("Elemento: "+A[i]);

            for (int y = 0; y < A[i]; y++) {

                if (y % 2 == 0) System.out.println("Relação: "+A[i]+"x"+y+" é par");

            }

        }

    }
}
