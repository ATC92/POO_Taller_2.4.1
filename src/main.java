class Bicicleta {
    private String marca;
    private String modelo;
    private int numRuedas;
    private Rueda rueda;
    private Cuadro cuadro;

    // Constructor
    public Bicicleta(String marca, String modelo, int numRuedas, Rueda rueda, Cuadro cuadro) {
        this.marca = marca;
        this.modelo = modelo;
        this.numRuedas = numRuedas;
        this.rueda = rueda;
        this.cuadro = cuadro;
    }

    // Getters
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public int getNumRuedas() {return numRuedas;}
    // Setters
    public void setMarca(String marca) {this.marca = marca;}
    public void setNumRuedas(int numRuedas) {this.numRuedas = numRuedas;}
    public void setModelo(String modelo) {this.modelo = modelo;}
}

class Rueda {
    private double diametro;
    private String material;
    private double presion;

    // Constructor
    public Rueda(double diametro, String material, double presion) {
        this.diametro = diametro;
        this.material = material;
        this.presion = presion;
    }

    // Getters
    public double getDiametro() {return diametro;}
    public String getMaterial() {return material;}
    public double getPresion() {return presion;}
    // Setters 
    public void setDiametro(double diametro) {this.diametro = diametro;}
    public void setMaterial(String material) {this.material = material;}
    public void setPresion(double presion) {this.presion = presion;}
}

class Cuadro {
    private String material;
    private String tamanio;
    private double peso;

    // Constructor
    public Cuadro(String material, String tamanio, double peso) {
        this.material = material;
        this.tamanio = tamanio;
        this.peso = peso;
    }

    // Getters
    public String getMaterial() {return material;}
    public String getTamanio() {return tamanio;}
    public double getPeso() {return peso;}
    // Setters
    public void setMaterial(String material) {this.material = material;}   
    public void setTamanio(String tamanio) {this.tamanio = tamanio;}
    public void setPeso(double peso) {this.peso = peso;}
}


class main{
    public static void main(String[] args) {
        Rueda rueda = new Rueda(25.43, "Caucho", 33.333);
        Cuadro cuadro = new Cuadro("Acero", "Mediano",20);
        Bicicleta bicicleta = new Bicicleta("BMX", "MX24", 2, rueda, cuadro);
    }
}