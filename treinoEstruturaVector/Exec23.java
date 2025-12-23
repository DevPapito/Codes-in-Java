class Exec23 {

    public static void main(String[] args) {

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {

            A[i] = (int)(Math.random() * 20);

        }

        for (int i = 0; i < A.length; i++) {


            if (A[i] % 2 == 1) break;

            System.out.println(A[i]);

        }

    }

}
