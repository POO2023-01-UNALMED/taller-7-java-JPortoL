package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, 
    String fecha, String primicia, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }


    public int palabrasTotales(int palabrasPagina){
        int n = 10*palabrasPagina;
        return n;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString(){
        String n = this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor()
        + "\n" + this.getPaginas() + "\n" + this.getFecha() + "\n" + this.getPrimicia();
        return n; 
    }

    //gets y sets
    public void setInterpretacion(String n){
        interpretacion = n;
    }
    public String getInterpretacion(){
        return interpretacion;
    }

    public void setPrimicia(String n){
        primicia = n;
    }
    public String getPrimicia(){
        return primicia;
    }

    public void setFecha(String n){
        fecha = n;
    }
    public String getFecha(){
        return fecha;
    }
}
