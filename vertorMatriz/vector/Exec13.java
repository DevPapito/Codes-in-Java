class Exec13 {

    public static void main(String[] args) {

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {

                A[i] = (int)(Math.random() * 15);

        }

        int multiplos = 0;
        for (int i = 0; i < A.length; i++) {

            if (A[i] % 5 == 0) multiplos = A[i];

        }

        System.out.println(multiplos);


    }

}
