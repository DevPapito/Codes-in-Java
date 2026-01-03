public class ExportarCSV implements Exportador {

    @Override
    public void exportar(Object dados) {

        System.out.println("Exportado CSV: "+dados);

    }

}
