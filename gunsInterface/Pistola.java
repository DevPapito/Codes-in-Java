public class Pistola extends Gun {

    public Pistola(double damage,int bullets, int reservBullets) {

        super(damage, bullets, reservBullets);

    }

    @Override
    public boolean shoot(int shootBullets) {

        return super.shoot(shootBullets);

    }

    @Override
    public boolean reload(int maxAmmon) {

        return super.reload(maxAmmon);

    }


}
