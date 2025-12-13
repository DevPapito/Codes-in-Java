class Exec21 {

    public static void main(String[] args) {

        int[] A = new int[10];

        // zeros e uns
        for (int i = 0; i < A.length; i++) {

            A[i] = (int)(Math.random() * 2);

        }

        int zeros = 0;
        int uns = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] < 1) {

                zeros += 10;
                continue;

            }

            uns += 10;

        }

        int zeroPorcentagem = ((zeros * 10) / 100);

        int unsPorcentagem = ((uns * 10) / 100);

        System.out.println("Um porcentagem: "+unsPorcentagem+"0%");
        System.out.println("Zero porcentagem: "+zeroPorcentagem+"0%");

    }

}
