class Exec14 {

    public static void main(String[] args) {

        int[] A = new int[10];

        for (int i = 0; i <  A.length; i++) {

            A[i] = (int)(Math.random() * 20);

        }

        int media = 0;
        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 == 0) continue;

            media += A[i];

        }
        media = (media * A.length);
        System.out.println(media);


    }

}
