//Clase Coche con los atributos marca, modelo y anio
public class Coche {
    private String marca;
    private String modelo;
    private int anio;

    //Declaramos los constructores
    public Coche() {}

    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    //Declaracion de setters y getters
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

    public int getAnio() {
        return anio;
    }
    //En setAnio() se hace una restriccion para que el año no sea
    //menor a 1886
    public void setAnio(int anio) {
        if(anio >= 1886) {
            this.anio = anio;
        }else{
            System.out.println("El año debe ser mayor o igual a 1886");
        }
    }

    // Metodo toString para mostrar los atributos
    @Override
    public String toString() {
        return "Coche{" +
                "Marca='" + marca + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Año=" + anio +
                '}';
    }
}
