public class Fechador {

    private String nome;
    private Iten mao;

    public Fechador(String nome) {

        this.nome = nome;

    }

    public boolean abrirCaixa() {

        return true;

    }

    public boolean fecharCaixa() {

        return false;

    }

    public boolean concluirTrabalho(Caixa caixa) {

        if(caixa.getItens().size() == 0) {

            System.out.println("Não é possivel concluir o trabalho não a um iten na caixa!");
            return false;

        }

        if (caixa.getStatus()) {

            System.out.println("Não é possivel concluir o trabalho com a caixa aberta!");

            return false;

        }

        System.out.println("Parabens "+nome+" você conclui o seu trabalho!");
        return true;

    }

    public String getNome() {

        return nome;

    }

    public void setMao(Iten iten) {

        this.mao = iten;

    }

    public Iten getMao() {

        return mao;

    }

    public boolean isHandFull() {

        return (mao == null) ? false : true;

    }

}
