class Exec04 {

    public static void main(String[] args) {

        int[] i = {10,34,64,5,26};
        int cont = 0;

        for (int n : i) {

            // if (n % 5 == 0)
            //     continue;
            // cont++;

            // if (n % 13 == 0)
            //     break;
            // System.out.println(n);
            // Melhoria de logica, sempre conter o break primeiro

            if (n % 13 == 0) break;

            if (n % 5 == 0) continue;

            System.out.println(n);
            cont++; // ideal deixar o contador sempre por ultimo
            // logica nao errada mas com as melhorias fica mais legivel

        }


        System.out.println(cont);
    }

}
