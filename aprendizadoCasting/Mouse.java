public class Mouse extends Eletronico implements MouseController, MouseCharge {

    private double charge;

    public Mouse(String nome, double peso, double forcaEletrica) {

        super(nome, peso, forcaEletrica);

    }

    @Override
    public void start() {

        charge = MAX_CHARGE;

    }

    @Override
    public void mouse() {

        System.out.println("Click");
        charge -= 0.5;

    }

    @Override
    public void out() {

        charge = MIN_CHARGE;

    }

    public double getCharge() {

        return charge;

    }

}
