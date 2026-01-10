import java.util.List;
import java.util.ArrayList;

public class Caixa {

    private String nome;
    private List<Iten> itens = new ArrayList<>();
    private boolean status;

    public Caixa(String nome) {

        this.nome = nome;

    }

    public void addIten(Iten iten) {

        if (!status) {
            System.out.println("Não é possivel adicionar itens a uma caixa fechada!");
            return ;

        }

        if (itens.size() == 2) {
            System.out.println("Caixa está cheia!");
            return ;

        }

        System.out.println("Add "+iten.getNome()+" da caixa "+nome);
        this.itens.add(iten);

    }


    public void removeIten(Iten iten) {

        if (!status) {

            System.out.println("Não é possivel remover itens a uma caixa fechada!");
            return ;

        }

        if (itens.size() == 0) {

            System.out.println("Não é possivel remover itens de uma caixa vazia!");
            return ;

        }


        int index = this.itens.indexOf(iten);

        if (index == -1) {

            System.out.println("Iten não existe!");
            return ;

        }

        System.out.println("Removido "+iten.getNome()+" da caixa "+nome);
        this.itens.remove(index);

    }

    public void abrir(boolean status) {

        if (!status) {

            System.out.println("Não é possivel abrir desta forma!");
            return ;

        }

        this.status = status;
        System.out.println("Caixa aberta!");

    }

    public void fechar(boolean status) {

        if(status) {

           System.out.println("Não é possivel abrir desta forma!");
           return ;

        }

        this.status = status;
        System.out.println("Caixa fechada!");

    }

    public List<Iten> getItens() {

        return itens;

    }

    public boolean getStatus() {

        return status;

    }

}
