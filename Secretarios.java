package repositorio;

/**
 *
 * @author Emiliano
 */
public class Secretarios extends Trabajadores{
    /* Atributos */
    private String oficina;
    
    /* Constructores */

    public Secretarios(String oficina, float sueldo, String rfc, String horario, String profesion, String puesto, String name, int codigo, String correo, byte edad, char sexo, String telefono, String ocupacion, String domicilio, String curp, String imss) {
        super(sueldo, rfc, horario, profesion, puesto, name, codigo, correo, edad, sexo, telefono, ocupacion, domicilio, curp, imss);
        this.oficina = oficina;
    }
    
    
    /* Setter */

    public void setOficina(String oficina) {
        if(oficina.matches("[\\w\\d-]+"))this.oficina = oficina;
        else throw new IllegalArgumentException("No deje espacios en blanco");
    }
    
    /* Getter */

    public String getOficina() {
        return oficina;
    }
    
    /* Setter y Getter de Override */

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
            throw new IllegalArgumentException("Escriba una edad mayor a 10 años\nEstas en una universidad por dios");
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
        else throw new IllegalArgumentException("Escriba bien el codigo");
    }

    @Override
    public void setName(String name) {
        if(name.matches("[A-Za-zÁÉÍÓÚáéíóú\\s']+"))super.setName(name); 
        else throw new IllegalArgumentException("¿Apoco tu nombre lleva numeros o cosas raras?\n¿O no tienes nombre?");
    }

    @Override
    public String getName() {
        return super.getName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getCodigo() {
        return super.getCodigo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCorreo() {
        return super.getCorreo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public byte getEdad() {
        return super.getEdad(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public char getSexo() {
        return super.getSexo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getTelefono() {
        return super.getTelefono(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getOcupacion() {
        return super.getOcupacion(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getDomicilio() {
        return super.getDomicilio(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCurp() {
        return super.getCurp(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getImss() {
        return super.getImss(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /* Setters y Getters de Trabajadores */
    @Override
    public String getPuesto() {
        return super.getPuesto(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getProfesion() {
        return super.getProfesion(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getHorario() {
        return super.getHorario(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getRfc() {
        return super.getRfc(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public float getSueldo() {
        return super.getSueldo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setPuesto(String puesto) {
        if(puesto.matches("[\\d\\w-]+"))super.setPuesto(puesto);
        else throw new IllegalArgumentException("No deje el espacio en blanco");
    }

    @Override
    public void setProfesion(String profesion) {
        if(profesion.matches("[\\w]+"))super.setProfesion(profesion);
        else throw new IllegalArgumentException("No deje el espacio en blanco");
    }

    @Override
    public void setHorario(String horario) {
        if(horario.matches("[\\w\\d-:\\s]+"))super.setHorario(horario);
        else throw new IllegalArgumentException("No deje el espacio en blanco");
    }

    @Override
    public void setRfc(String rfc) {
        if(rfc.matches("[\\dA-Z]+"))super.setRfc(rfc);
        else throw new IllegalArgumentException("Escriba de forma correcta el formato de su RFC");
    }

    @Override
    public void setSueldo(float sueldo) {
        if (sueldo > 0 && sueldo < 1000000)super.setSueldo(sueldo);
        else throw new IllegalArgumentException("No escriba sueldos negativos ni tampoco imposibles");
    }
    
    /* Metodo polimorfico */
    @Override
    public void accion() {
        System.out.println("Los secretarios chismean");
    }
} //Fin de clase de Secretarios