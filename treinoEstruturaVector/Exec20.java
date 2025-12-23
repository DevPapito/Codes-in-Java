class Exec20 {

    public static void main(String[] args) {

        double[]A = new double[21];

        double cotacao = 5.58;

        for (int i=0; i < A.length; i++) {

            if (i == 0) continue;
            System.out.println(i);

            A[i] = cotacao * i;

        }

    }

}
