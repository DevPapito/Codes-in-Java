public abstract class Arma {

    protected String nome;
    protected double dano;
    protected int municaoPrincipal;
    protected int municaoSecundaria;

    public Arma(String nome, double dano, int municaoPrincipal, int municaoSecundaria) {

        this.nome = nome;
        this.dano = dano;
        this.municaoPrincipal = municaoPrincipal;
        this.municaoSecundaria = municaoSecundaria;

    }

    public abstract void atirar();
    public abstract void carregar();

    @Override
    public String toString() {

        return String.format("Arma: %s\nDano: %.2f\nMunicaoAtual: %d\nMunicaoReserva: %d",nome,dano,municaoPrincipal,municaoSecundaria);

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Arma other = (Arma) obj;

        if (nome.equalsIgnoreCase(other.getNome()))
            return true;

        return false;

    }

    public String getNome() {

        return nome;

    }

    public double getDano() {

        return dano;

    }

    public int getMunicaoPrincipal() {

        return municaoPrincipal;

    }

    public int getMunicaoSecundaria() {

        return municaoSecundaria;

    }

}
