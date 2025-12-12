class Exec03 {

    public static void main(String[] args) {

        String[] n = {"ana","","lucas","","paulo"};

        for (String i : n) {

            // if (i.equals(""))
            //     continue;
            // Melhoria sugerida
            
            if (i.isEmpty()) continue;

            System.out.println(i);

        }


    }

}
