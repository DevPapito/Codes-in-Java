class Exec12 {


    public static void main(String[] args) {

        int[] A = new int[10];
        int soma = 0;

        for (int i = 0; i < A.length; i++) {

            A[i] = (int)(Math.random() * 20);

        }

        for (int i = 0; i < A.length; i++) {

            soma += A[i];

        }
        System.out.println(soma);

    }

}
