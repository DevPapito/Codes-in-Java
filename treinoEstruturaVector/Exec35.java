class Exec35 {

    public static void main(String[] args) {

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {

            A[i] = (int)(Math.random() * 50);

        }

        for (int i = 0; i < A.length; i++) {

            System.out.println(A[i]);

            for (int y = 1; y <= A[i]; y++) {

                if (A[i] % y == 0) System.out.println("Relação: "+A[i]+" tem de divisivel: "+y);


            }

        }

    }

}
