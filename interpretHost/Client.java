public class Client extends Host implements BasicPC {

    private boolean energy;

    public boolean getEnergy() {

        return energy;

    }

    public void setEnergy(boolean energy) {

        this.energy = energy;

    }

    @Override
    public boolean on() {

        if (energy)
            return false;

        setEnergy(true);

        return true;

    }

    @Override
    public boolean off() {

        if (!energy)
            return false;

        setEnergy(false);

        return true;

    }

    @Override
    public boolean acessInternet() {

        if (!energy)
            return false;

        if (!isIp() || !isMac())
            return false;

        System.out.println(this);

        return true;

    }

}
