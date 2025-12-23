class Exec22 {

    public static void main(String[] args) {

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {

            A[i] = (int)Math.round((Math.random() * 1));

        }

        int zeros = 0;
        int uns = 0;
        for (int i = 0; i < A.length; i++) {

            if (A[i] == 1) {

                uns++;
                System.out.println("Uns: "+uns);
                continue;

            }

            zeros++;
            System.out.println("Zeros: "+zeros);

        }

        double porcenZeros = (zeros * A.length) / 100.0;
        double porcenUns = (uns * A.length) / 100.0;

        System.out.println("Zeros: "+porcenZeros*100.0+"%");
        System.out.println("Uns: "+porcenUns*100.0+"%");
    }

}
