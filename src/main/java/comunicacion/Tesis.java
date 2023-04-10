package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, 
    String[] argumentos, String conclusion, String referencias, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(){
        int n = this.getPaginas()*10;
        return n;
    }

    public int palabrasTotales(int palabrasPagina){
        int n = this.getPaginas()*palabrasPagina;
        return n;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString(){
        String n = this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor()
        + "\n" + this.getPaginas() + "\n" + this.getIdea() + "\n" + this.getArgumentos().length
        + "\n" + getConclusion() + "\n" + getReferencias();

        return n; 
    }

    //gets y sets
    public void setInterpretacion(String n){
        interpretacion = n;
    }
    public String getInterpretacion(){
        return interpretacion;
    }

    public void setReferencias(String n){
        referencias = n;
    }
    public String getReferencias(){
        return referencias;
    }

    public void setConclusion(String n){
        conclusion = n;
    }
    public String getConclusion(){
        return conclusion;
    }

    public void setArgumentos(String[] n){
        argumentos = n;
    }
    public String[] getArgumentos(){
        return argumentos;
    }

    public void setIdea(String idea){
        this.idea = idea;
    }

    public String getIdea(){
        return this.idea;
    }
}
