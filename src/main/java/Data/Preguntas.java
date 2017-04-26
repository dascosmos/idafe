package Data;

/**
 * Created by Familia on 3/27/2017.
 */
public class Preguntas {
    private int numero_P;
    private String respuesta;

    public Preguntas(int numero_P, String respuesta) {
        this.numero_P = numero_P;
        this.respuesta = respuesta;
    }

    public int getNumero_P() {
        return numero_P;
    }

    public void setNumero_P(int numero_P) {
        this.numero_P = numero_P;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Preguntas{" +
                "numero_P=" + numero_P +
                ", respuesta='" + respuesta + '\'' +
                '}';
    }
}
