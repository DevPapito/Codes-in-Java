class Exec06 {

    public static void main(String[] args) {

        String[] l = {"sol","casa","flor","ar","teto"};

        for (int i =0; i < l.length; i++) {

            //if (l[i].length <= 3) continue; // Nem precisa

            if (l[i].length() > 3) System.out.println(l[i].charAt(0));


        }


    }

}
