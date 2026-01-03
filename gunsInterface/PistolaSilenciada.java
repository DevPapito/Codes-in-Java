public class PistolaSilenciada extends Pistola implements Silenciavel{

    private boolean silenciador;

    public PistolaSilenciada(double damage, int bullets, int reservBullets) {

        super(damage, bullets, reservBullets);

    }

    public boolean getSilenciador() {

        return silenciador;

    }

    public void setSilenciador(boolean silenciador) {

        this.silenciador = silenciador;

    }

    @Override
    public boolean shootSilenciado(int shootBullets) {

        if (!this.silenciador) {

            System.out.println("Não é possivel atirar silenciado!");
            return false;

        }

        System.out.println("Tiro silenciado!");

        this.damage -= 0.5;

        this.bullets--;

        return true;

    }

}
