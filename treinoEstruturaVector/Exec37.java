class Exec37 {

    public static void main(String[] args) {

        int[] A = new int[15];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            A[i] = (int)(Math.random() * 100);

        }

        for (int i = 0; i < A.length; i++) {

            B[i] = (int)fatorial(A[i]);
            System.out.println(A[i]);
            System.out.println(B[i]);

        }

    }
    public static long fatorial(int n) {
        long resultado = 1;

        for (int i = 2; i <= n; i++) {

            resultado *=i;

        }
        return resultado;

    }

}
