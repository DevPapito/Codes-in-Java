class Exec39 {

    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length * 2];

        for (int i = 0; i < A.length; i++) {

            A[i] = (int)(Math.random() * 20);
            System.out.println("A: "+A[i]);

        }

        for (int i = 0; i < A.length; i++) {

            B[i] = (int)(Math.random() * 20);
            System.out.println("B: "+B[i]);

        }

        int indexB = 0;
        int indexA = 0;
        for (int i = 0; i < C.length; i++) {

            if (i < 10) {

                C[i] = B[indexB];
                indexB++;

            }else {

                C[i] = A[indexA];
                indexA++;

            }
            System.out.println("C: "+C[i]);

        }


    }

}
