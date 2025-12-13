import java.text.DecimalFormat;

public class Desconto {

    private static DecimalFormat df = new DecimalFormat();

    public static void main(String[] args) {

        df.applyPattern("#00.##R$");

        double porcentagem = porcentagem(20,100);
        String porcentagemMessage = (porcentagem+"%");
        System.out.println(porcentagemMessage);
        double valorDesconto = desconto(100,porcentagem);
        double valorJuros = juros(100,valorDesconto);
        String valor = df.format(valorJuros);
        System.out.println(valor);
        double real = valorReal(100,valorDesconto);
        String realMessage = df.format(real);
        System.out.println(realMessage);

    }

    public static double porcentagem(double valorRetirado, double valorTotal) {

        return (valorRetirado * valorTotal) / 100.0;

    }
    public static double desconto(double valorTotal, double desconto) {

        return (valorTotal - desconto);

    }

    public static double juros(double valorTotal, double preco) {

        return (valorTotal + preco);

    }
    public static double valorReal(double valorTotal, double desconto) {

        return (desconto * 100) / valorTotal;

    }

}
