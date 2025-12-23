class Exec40 {

    public static void main(String[] args) {

        int[] A = new int[11];
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            A[i] = (int)(Math.random() * 50);
            System.out.println("A: "+A[i]);

        }

        for (int i = 0; i < B.length; i++) {

            B[i] = (int)(Math.random() * 50);
            System.out.println("B: "+B[i]);

        }

        int indexC = 0;

        for (int i = 0; i < A.length; i++) {

            boolean existeEmB = false;

            for (int j = 0; j < B.length; j++) {

                if (A[i] == B[j]) {

                    existeEmB = true;
                    break;

                }

            }

            if (!existeEmB) {

                C[indexC] = A[i];
                indexC++;

            }

        }

        for (int i = 0; i < C.length; i++) {

            System.out.println("C: "+C[i]);

        }

    }

}
