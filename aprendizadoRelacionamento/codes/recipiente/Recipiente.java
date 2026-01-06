public class Recipiente {

    protected float liquido;
    public static final float LIQUIDO_MAXIMO = 0f;

    public Recipiente(float liquido) {

        if (liquido > Recipiente.LIQUIDO_MAXIMO)
            this.liquido = Recipiente.LIQUIDO_MAXIMO;

        this.liquido = liquido;

    }

    public float getLiquido() {

        return liquido;

    }

    public void setLiquido(float liquido) {

        this.liquido = liquido;

    }

    public void encher(float liquido) {

        float somado = (liquido+this.liquido);

        if (somado > Recipiente.LIQUIDO_MAXIMO) {
            float vazado = (liquido-this.liquido);
            System.out.println("Transbordou "+vazado+" de agua!");
            return ;

        }
        System.out.println("Encheu a agua!");

        this.liquido = somado;

    }

    public float esvaziar(float liquido) {

        float vazado = (this.liquido-liquido);

        if (vazado < Recipiente.LIQUIDO_MAXIMO) {

            System.out.println("Esvaziou até de mais");
            return 0f;

        }

        return vazado;

    }

    public void mostrarLiquido() {

        char charactere = '#';

        String liquidoView = "";
        for (float i = 0; i < liquido; i++) {

            liquidoView += charactere+"\n";

        }
        System.out.print(liquidoView);

    }

}
