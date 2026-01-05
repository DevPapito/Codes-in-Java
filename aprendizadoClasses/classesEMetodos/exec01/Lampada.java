public class Lampada {

    private boolean luz;

    public Lampada(boolean luz) {

        this.luz = luz;

    }

    public boolean ligar() {

        if (luz)
            return false;

        luz = true;
        return true;

    }

    public boolean desligar() {

        if (!luz)
            return false;

        luz = false;
        return true;

    }

}
