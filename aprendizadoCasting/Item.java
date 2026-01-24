public abstract Item {

    protected String nome;
    protected double peso;

    public Item(String nome, double peso) {

        super(nome, peso);

    }

    @Override
    public String toString() {

        return String.format("[%s, %s]",nome,peso);

    }

    public String getNome() {

        return nome;

    }

    public double getPeos() {

        return peso;

    }

}
