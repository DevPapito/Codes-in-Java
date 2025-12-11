class App2 {

    // cozinhar

    private float horario;

    private static horarioPronto;

    public static void main(String[] args) {


        App2.horarioPronto =


    }

    public static void setHorarioPronto(float novoHorario) {

        if (horario < 0)
            return ;

        horario = novoHorario;


    }

    public static float getHorario() {

        return horario;

    }


}
