class Exec08
{

    public static void main(String args[])
    {

        String[][] matriz = { {"","","ola"},
                              {"","Eai","Opa"},
                              {"a","",""}

                            };

        for (int i = 0; i < matriz.length; i++) {

            // Melhoria matriz[i].length permite mais robustez no codigo
            for (int y = 0; y < 3; y++) {

                if (matriz[i][y].isEmpty()) continue;

                System.out.println(matriz[i][y]);

            }

        }

    }

}
