package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        int n = this.letras.length;
        return n;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString() {
        String salida = "";
        for (int i = 0; i < this.letras.length; i++) {
            salida += this.letras[i];
            if (i < this.letras.length - 1) {
                salida += ", ";
            }
        }
        return salida;
    }

    //gets y sets
    public void setLetas(String[] n){
        letras = n;
    }
    public String[] getLetras(){
        return letras;
    }

    public void setInterpretacion(String n){
        interpretacion = n;
    }
    public String getInterpretacion(){
        return interpretacion;
    }
}

