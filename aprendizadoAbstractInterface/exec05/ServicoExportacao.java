public class ServicoExportacao {

    private final Exportador exportacao;

    public ServicoExportacao(Exportador exportacao) {

        this.exportacao = exportacao;

    }

    public void export(Object export) {

        this.exportacao.exportar(export);

    }


}
