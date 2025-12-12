class Exec03 {

    public static void main(String[] args) {

        String entrada = "a a1bb cC9d";

        // definido em 65536 int para corresponder os 16 bits em char Java:
        boolean[] seen = new boolean[65536]; // ou hashSet
        
        // Nao imprimi em sequencia mas caso altera-se emprimie
        for (int i = 0; i < entrada.length(); i++) {

            char c = entrada.charAt(i);

            // Alteracoes na ordem e uso de vetor boolean
            // if (!Character.isDigit(c) && c != ' '  && c != b) System.out.println(c);
            if (!Character.isDigit(c) || c != ' ') System.out.println(c);

            // Verifica se ja existou algum elemento verdadeiro 
            // Nesse caso marcado sim ja existiu ele sai do loop
            if (seen[c]) continue;

            System.out.println(c);

            // Setando n elemento para verdadeiro
            seen[c] = true; 

        }

    }

}
