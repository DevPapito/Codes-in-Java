class Exec02 {

    public static void main(String[] args) {

        int[] n = {100,3,1,8};

        for (int i =0; i < n.length; i++) {

            // if (n[i] % 2 != 0)
            //     continue;
            // Melhoria sintatica, mais legivel
            
            if (n[i] % 2 != 0) continue;

            System.out.println(n[i]);

        }


    }

}
