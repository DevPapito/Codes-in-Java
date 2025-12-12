class Exec09 {

    public static void main(String[] args) {

        int[] array = {3,
            6,
            9,
            12,
            18,
            27,
            30};

        int sum =0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 9 == 0) continue;
        
            // Estava certo mas tirei essa linha fazendo ficar errado
            // Atencao nas proximas vezes para gerar testes
            if (array[i] % 3 == 0) sum++;

        }

        System.out.println(sum);

    }

}
