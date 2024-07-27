import java.util.List;

public class Computadora extends DispositivoElectronico {
    private String marca;
    private String modelo;
    private String tipo;

    private List<Usuario> usuarios;

    public Computadora(String tipo, String id) {
        super(tipo, id);
    }

public void mostar() {
        System.out.println("Marca de la Computadora: "+getMarca()+" Modelo "+getModelo()+" Tipo: "+getTipo());
}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
