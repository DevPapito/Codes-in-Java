class Exec01 {


    public static void main(String[] args) {

        int[] numbers = {5,
            -2,
            7,
            -1,
            3};

        int soma = 0;

        for (int i =0; i < numbers.length; i++) {

            // Continue não ignora o bloco de codigo
            // Ele ignora toda a linha seguinte
            // E indo diretamente para um novo loop
            // Tanto e while/do-while quando for/for-reach
            if (numbers[i] < 0)
                continue;

            soma += numbers[i];


        }

        System.out.println(soma);

    }

}
