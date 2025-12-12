class Exec10 {

    public static void main(String[] args) {

        String frase = "ab3c1d9Z";

        String[] letters = frase.split("");
        
        // Evitar de realizar esses splits
        for (int i = 0; i < letters.length; i++) {

            char c = letters[i].charAt(0);

            // Charactere.isDigite(c) retora todos chars de numero
            // Melhor que ASCII na mao
            if (c >= 48 && c <= 57) continue;

            System.out.println(c);

        }

        // Evitar de criar array desnecessario para memoria
        for (int i = 0; i < frase.length; i++) {

            char c = frase.charAt(0);

            // Charactere.isDigite(c) retora todos chars de numero
            // Melhor que ASCII na mao
            if (Charactere.isDigite(c)) continue;

            System.out.println(c);

        }

    }

}
