class Exec01 {

    public static void main(String[] args) {

        int[][][] cubo3d = new int[3][3][3];

        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;

        for (int x = 0; x < cubo3d.length; x++) {

            for (int y = 0; y < cubo3d[x].length; y++) {

                for (int z = 0; z < cubo3d[x][y].length; z++) {

                    // Soma dos indices das dimenções
                    cubo3d[x][y][z] = (x+y+z);

                    // Soma total
                    soma += cubo3d[x][y][z];

                    // Soma pares e impares
                    if (cubo3d[x][y][z] % 2 == 0) {

                        somaPares += cubo3d[x][y][z];

                    }else {somaImpares += cubo3d[x][y][z];}

                }

            }

        }
        System.out.println(soma);
        System.out.println(somaPares);
        System.out.println(somaImpares);


    }

}
