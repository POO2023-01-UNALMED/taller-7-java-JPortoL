package comunicacion;

public class Libro extends Escrito {
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen,String titulo, String autor, int paginas, String co_autor, 
    String editorial, String edicion, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    

    public int palabrasTotales(int palabrasPagina){
        int n = 2*palabrasPagina;
        return n;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString(){
        String n = this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor()
        + "\n" + this.getPaginas() + "\n" + this.getCo_autor() + "\n" + this.getEditorial()
        + "\n" + this.getEdicion();
        return n; 
    }

    

    //gets y sets
    public void setInterpretacion(String n){
        interpretacion = n;
    }
    public String getInterpretacion(){
        return interpretacion;
    }

    public void setEdicion(String n){
        edicion = n;
    }
    public String getEdicion(){
        return edicion;
    }

    public void setEditorial(String n){
        editorial = n;
    }
    public String getEditorial(){
        return editorial;
    }

    public void setCo_autor(String n){
        co_autor = n;
    }
    public String getCo_autor(){
        return co_autor;
    }
}
