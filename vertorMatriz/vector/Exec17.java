class Exec17 {

    public static void main(String[] args) {

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {

            A[i] = (int)(Math.random() * 99);

        }

        int superTrintaCinco = 0;
        for (int i = 0; i < A.length; i++) {

            if (A[i] <= 35)continue;

            superTrintaCinco++;

        }
        System.out.println(superTrintaCinco);

    }

}
