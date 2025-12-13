class Exec11 {

    public static void main(String[] args) {

        int[] A = new int[10];
        int pares = 0;

        boolean[] seen = new boolean[65536];

        // generate
        for (int i = 0; i < A.length; i++) {

            A[i] = (int)(Math.random() * 35);
        }

        for (int i = 0; i < A.length; i++) {

            if (seen[A[i]]) {

                // no repeat
                seen[A[i]] = true;

            }

            if (A[i] % 2 == 1) continue;

            pares++;

        }

        System.out.println(pares);

    }

}
