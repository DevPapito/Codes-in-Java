class Exec38 {

    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            A[i] = (int)(Math.random() * 50);
            System.out.println(A[i]);

        }

        for (int i = 0; i < B.length; i++) {

            for (int y = 0; y < A.length; y++) {

                B[i] += A[y];

            }
            System.out.println(B[i]);

        }

    }

}
