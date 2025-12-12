class Exec07
{

    /**
     * Com sintaxe de C / C++ para treinar leeto code em Java
     *
     * */
    public static void main(String args[])
    {

        int number = 0;
        int sum = 0;

        for (int i = 0; i > -1; i++) {

            number = (int)((Math.random() * 100) - 50);

            if (number == 0){break;}

            if (number < 0 && number % 2 == 0){continue;}

            sum++;

        }

        System.out.println(sum);

    }

}
