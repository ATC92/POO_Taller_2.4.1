class CuerpoHumano {
    private String nombre;
    private int edad;
    private String sexo;
    private Corazon corazon;
    private Pulmon pulmon;
    private Higado higado;
    private Apendice apendice;

    // Constructor
    public CuerpoHumano(String nombre, int edad, String sexo, Corazon corazon, Pulmon pulmon, Higado higado, Apendice apendice) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.corazon = corazon;
        this.pulmon = pulmon;
        this.higado = higado;
        this.apendice = apendice;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getSexo() {
        return sexo;
    }
    // Setters
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

class Corazon {
    private String tamaño;
    private int frecuenciaLatido;
    private String tipoSangre;

    // Constructor
    public Corazon(String tamaño, int frecuenciaLatido, String tipoSangre) {
        this.tamaño = tamaño;
        this.frecuenciaLatido = frecuenciaLatido;
        this.tipoSangre = tipoSangre;
    }

    // Getters
    public String getTamaño() {
        return tamaño;
    }
    public int getFrecuenciaLatido() {
        return frecuenciaLatido;
    }
    public String getTipoSangre() {
        return tipoSangre;
    }

    // Setters
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public void setFrecuenciaLatido(int frecuenciaLatido) {
        this.frecuenciaLatido = frecuenciaLatido;
    }
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }


}

class Pulmon {
    private double volumen;
    private double capacidadOxigeno;
    private String tipo;

    // Constructor
    public Pulmon(double volumen, double capacidadOxigeno, String tipo) {
        this.volumen = volumen;
        this.capacidadOxigeno = capacidadOxigeno;
        this.tipo = tipo;
    }

    // Getters
    public double getVolumen() {
        return volumen;
    }
    public double getCapacidadOxigeno() {
        return capacidadOxigeno;
    }
    public String getTipo() {
        return tipo;
    }
    // Setters
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    public void setCapacidadOxigeno(double capacidadOxigeno) {
        this.capacidadOxigeno = capacidadOxigeno;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

class Higado {
    private double peso;
    private String funciones;
    private String enfermedadesComunes;

    // Constructor
    public Higado(double peso, String funciones, String enfermedadesComunes) {
        this.peso = peso;
        this.funciones = funciones;
        this.enfermedadesComunes = enfermedadesComunes;
    }

    // Getters
    public double getPeso() {
        return peso;
    }
    public String getFunciones() {
        return funciones;
    }
    public String getEnfermedadesComunes() {
        return enfermedadesComunes;
    }
    // Setters
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }
    public void setEnfermedadesComunes(String enfermedadesComunes) {
        this.enfermedadesComunes = enfermedadesComunes;
    }

}

class Apendice {
    private double longitud;
    private String funciones;
    private String enfermedadesComunes;

    // Constructor
    public Apendice(double longitud, String funciones, String enfermedadesComunes) {
        this.longitud = longitud;
        this.funciones = funciones;
        this.enfermedadesComunes = enfermedadesComunes;
    }

    // Getters 
    public double getLongitud() {
        return longitud;
    }
    public String getFunciones() {
        return funciones;
    }
    public String getEnfermedadesComunes() {
        return enfermedadesComunes;
    }
    // Setters
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }
    public void setEnfermedadesComunes(String enfermedadesComunes) {
        this.enfermedadesComunes = enfermedadesComunes;
    }
}

class main{
    public static void main(String[] args) {
        Corazon corazon = new Corazon("Mediano", 80,"O-");
        Pulmon pulmon = new Pulmon(50.499, 100.329, "Grande");
        Higado higado = new Higado(2.432, "ALL", "No");
        Apendice apendice = new Apendice(10.3223,"NONE", "No");
        CuerpoHumano cuerpoHumano = new  CuerpoHumano("Alan Torres", 25, "Homvre", corazon, pulmon, higado, apendice);
        //
        System.out.println(cuerpoHumano);
    }
}