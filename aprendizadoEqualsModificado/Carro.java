public class Carro {

    public String marca;
    public String modelo;

    // Por padrao equals compara alem do tipo de objeto referido
    // Realiza a comparacao dos atributos das classes

    // E valido alterar a validacao basica do Equals nativo do java
    @Override
    public boolean equals(Object obj) {

        // Comparativos basicos

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        // Comparativo de tipo de Classe igual entre as referencias
        if (getClass() != obj.getClass())
            return false;

        // Comparativos de atributo
        // Por referencia diferentes

        Carro other = (Carro) obj;

        // Somente igual caso o modelo seja igual a ambos
        if (modelo.equalsIgnoreCase(other.modelo))
            return true;

        return false;

    }

}
