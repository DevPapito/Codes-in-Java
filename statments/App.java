class App {


    public static void main(String[] args) {


        int vel = 0;
        boolean parado = false;

        //if (!parado) {

            //vel++;

        ///}

        if (!parado)
            vel++;

        System.out.println(vel);

        par(2);
        podePassar((byte)15,2);

    }

    public static void par(float value) {

        if (value % 2 == 0)
            System.out.println("e par");
            System.out.println("Tente outros valores!");

    }

    public static void podePassar(byte idade, float bonus) {

        // Ainda e a melhor opcao de if-then,
        // permite mais de uma linha
        if (idade <= 0 || idade >= 18) {

            System.out.println("Vc nao pode passar, somente a jovens");
            return ;

        }

        // condicional if-then que permite uso para adicao em condicao
        // Muito bom

        if (idade < 18)
            bonus++;

        System.out.println("Pode passar");
        System.out.println("Seu bonus> "+bonus);

    }

}
