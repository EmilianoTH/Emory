package repositorio;

/**
 *
 * @author Emiliano de la Torre Hernandez
 */
public class Alumnos extends Personas{
    /* Atributos */
    private char paga;
    private String[] materias;
    private float[] promedio;
    private String[] horario;
    private String salon;
    
    /* Constructor */
    public Alumnos(char paga, int numMaterias, String salon, String name, int codigo, String correo, byte edad, char sexo, String telefono, String ocupacion, String domicilio, String curp, String imss) {
        super(name, codigo, correo, edad, sexo, telefono, ocupacion, domicilio, curp, imss);
        this.paga = paga;
        this.materias = new String[numMaterias];
        this.promedio = new float[numMaterias];
        this.horario = new String[numMaterias];
        this.salon = salon;
    }
    
    /* Setter */
    public void setPaga(char paga) {
        if(paga == 'Y' || paga == 'N' || paga == 'y' || paga == 'n')
        this.paga = paga;
        else
            throw new IllegalArgumentException("No escriba mas letras de las que se pide ");
    }

    public void setMaterias(int index, String materia) {
        this.materias[index] = materia;
    }

    public void setPromedio(int index, float promedio) {
        if(promedio >= 0 && promedio <= 100)this.promedio[index] = promedio;
        else throw new NumberFormatException("Promedio invalido");
    }

    public void setHorario(int index, String horario) {
        this.horario[index] = horario;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }
    
    /* Getter */

    public char getPaga() {
        return paga;
    }

    public String getMaterias(int index) {
        return materias[index];
    }

    public float getPromedio(int index) {
        return promedio[index];
    }

    public String getHorario(int index) {
        return horario[index];
    }

    public String getSalon() {
        return salon;
    }
    
    
    /* Getters y Setters de Override */

    @Override
    public String getImss() {
        return super.getImss(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCurp() {
        return super.getCurp(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getDomicilio() {
        return super.getDomicilio(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getOcupacion() {
        return super.getOcupacion(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getTelefono() {
        return super.getTelefono(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public char getSexo() {
        return super.getSexo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public byte getEdad() {
        return super.getEdad(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCorreo() {
        return super.getCorreo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getCodigo() {
        return super.getCodigo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getName() {
        return super.getName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setImss(String imss) {
        //Valida que solo meta de entrada 11 digitos
        if(imss.matches("\\d{11}") || imss == "11Digitos") super.setImss(imss);
        else throw new IllegalArgumentException("Ingrese un numero de 11 digitos\nSi su numero de IMSS cuenta con mas de 11 digitos, escriba exactamente igual la frase '11Digitos'");
    }

    @Override
    public void setCurp(String curp) {
        //Valida que se meta una entrada correcta de CURP
        if(curp.matches("[\\dA-Z]+")) super.setCurp(curp);
        else throw new IllegalArgumentException("Ingresa de forma correcta el formato de su CURP\nNo escriba minusculas");
    }

    @Override
    public void setDomicilio(String domicilio) {
        //Valida que se meta una entrada correcta de domicilio
        if(domicilio.matches("[\\d\\wÁÉÍÓÚáéíóú\\s#]+#.*")) super.setDomicilio(domicilio);
        else throw new IllegalArgumentException("Recuerda que el domicilio debe llevar un '#'");
    }

    @Override
    public void setOcupacion(String ocupacion) {
        super.setOcupacion(ocupacion); 
    }

    @Override
    public void setTelefono(String telefono) {
        //Valida que solo meta de entrada 10 digitos
        if(telefono.matches("\\d{10}")) super.setTelefono(telefono);
        else throw new IllegalArgumentException("Ingrese solamente un numero de 10 digitos");
    }

    @Override
    public void setSexo(char sexo) {
        //Valida que meta un sexo correcto
        if(sexo == 'M' || sexo == 'H' || sexo == 'm' || sexo == 'h')
            super.setSexo(sexo);
        else 
            throw new IllegalArgumentException("Elija un sexo correcto");
    }

    @Override
    public void setEdad(byte edad) {
        //Valida que meta una entrada valida de edad
        if(edad > 10 && edad < 110)
            super.setEdad(edad);
        else
            throw new NumberFormatException("Escriba una edad mayor a 10 años\nEstas en una universidad por dios");
    }

    @Override
    public void setCorreo(String correo) {
        //Valida que meta una entrada valida de correo
        if(correo.matches("[a-z.]+@.*")) super.setCorreo(correo);
        else throw new IllegalArgumentException("Formato de correo invalido\nRevisa los '.' o los '@'\nRecuerda que todo debe estar en minusculas sin acentos");
    }

    @Override
    public void setCodigo(int codigo) {
        if(codigo != 0)super.setCodigo(codigo);
        else throw new NumberFormatException("Escriba bien el codigo");
    }

    @Override
    public void setName(String name) {
        if(name.matches("[A-Za-zÁÉÍÓÚáéíóú\\s']+"))super.setName(name); 
        else throw new IllegalArgumentException("¿Apoco tu nombre lleva numeros o cosas raras?\n¿O no tienes nombre?");
    }
    
    
    
    /* Metodo Polimorfico */
    @Override
    public void accion() {
        System.out.println("Los estudiantes velan por su existencia");
    }
    
}
