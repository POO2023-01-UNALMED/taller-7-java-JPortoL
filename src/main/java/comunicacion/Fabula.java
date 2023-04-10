package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){
        int n = getPaginas()*palabrasPagina;
        return n;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString(){
        String n = this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor()
        + "\n" + this.getPaginas() + "\n" + this.getEnsenanza();
        return n; 
    }

    //gets y sets
    public void setInterpretacion(String n){
        interpretacion = n;
    }
    public String getInterpretacion(){
        return interpretacion;
    }

    public void setEnsenanza(String n){
        ensenanza = n;
    }
    public String getEnsenanza(){
        return ensenanza;
    }
}
