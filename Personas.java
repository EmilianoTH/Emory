package repositorio;

/* Emiliano De La Torre Hernandez
 * 10-10-2023
 * Repositorio
 * Centro Universitario de los Altos | Universidad de Guadalajara
 * Ingenieria en computacion
 * Profesor: Sergio Franco Casillas
 * Descripcion: Main del programa de conversiones
 */
public abstract class Personas {
    /* Atributos en comun */
    private String name;
    private int codigo;
    private String correo;
    private byte edad;
    private char sexo;
    private String telefono;
    private String ocupacion;
    private String domicilio;
    private String curp;
    private String imss;
    
    /* Constructor */

    public Personas(String name, int codigo, String correo, byte edad, char sexo, String telefono, String ocupacion, String domicilio, String curp, String imss) {
        this.name = name;
        this.codigo = codigo;
        this.correo = correo;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
        this.ocupacion = ocupacion;
        this.domicilio = domicilio;
        this.curp = curp;
        this.imss = imss;
    }
    
    
    
    /* Setters de todos los atributos*/
    public void setName(String name) {
        this.name = name;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setImss(String imss) {
        this.imss = imss;
    }
    
    /* Getters de los atributos*/

    public String getName() {
        return name;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public byte getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getCurp() {
        return curp;
    }

    public String getImss() {
        return imss;
    }
    
    /* Metodos polimorficos */
    public abstract void accion();
    
} //Fin de la clase personas
