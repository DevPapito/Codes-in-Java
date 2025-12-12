class Exec01 {

    public static void main(String[] args) {

        String[] words = {"uva","amigo","casa","elefante","urso","ideia","sol"};

        String[] vogais = {"a","e","i","o","u"};

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() <= 4) continue;

            // continue tem falhas
            // ele somente repete a loop interno, nesse caso e melhor
            // // break
            // for (String vog : vogais) {

            //     if (words[i].charAt(0) != vog.charAt(0)) continue;

            // }
            
            // Formato ideal, tambem corrige o erro de iniciar
            // com uma nao vogal

            boolean startsWithVowel = false;

            for (String vog : vogais) {

                if (words[i].charAt(0) == vog.charAt(0)) {
                    startsWithVowel = true;
                    break;
                }

            }  

            // Se estiver com nao vogal logo nao pode imprimir
            if (!startsWithVowel) continue;

            System.out.println(words[i]);

        }

    }

}
