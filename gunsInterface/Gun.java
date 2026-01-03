public abstract class Gun {

    protected double damage;
    protected int bullets;
    protected int reservBullets;

    public Gun(double damage, int bullets, int reservBullets) {

        this.damage = damage;
        this.bullets = bullets;
        this.reservBullets = reservBullets;

    }

    public double getDamage() {return damage;}
    public void setDamage(double damage) {this.damage = damage;}

    public int getBullets() {return bullets;}
    public void setBullets(int bullets) {this.bullets = bullets;}

    public int getReservBullets() {return reservBullets;}
    public void setReservBullets(int reservBullets) {this.reservBullets = reservBullets;}

    public boolean shoot(int bulletShoot) {

        if (bullets == 0)
            return false;

        if (bullets < 10)
            this.damage += this.damage;

        this.bullets -= bulletShoot;

        return true;

    }

    public boolean reload(int maxAmmon) {

        if (reservBullets == 0)
            return false;

        int sobra = Math.abs(this.bullets - maxAmmon);

        this.reservBullets = Math.abs(this.reservBullets - sobra);

        this.bullets = (this.bullets + sobra);

        return true;

    }

    @Override
    public String toString() {

        return String.format("{\ndamage:%.2f\nammon: %d\nbag ammon: %d\n}",
                this.damage,
                this.bullets,
                this.reservBullets);

    }

}
