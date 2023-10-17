package repositorio;

/**
 *
 * @author Emiliano de la Torre Hernandez
 */
public class Trabajadores extends Personas{
    private float sueldo;
    private String rfc;
    private String horario;
    private String profesion;
    private String puesto;

    /* Constructor Overraay*/
    public Trabajadores(String name, int codigo, String correo, byte edad, char sexo, String telefono, String ocupacion, String domicilio, String curp, String imss) {
        super(name, codigo, correo, edad, sexo, telefono, ocupacion, domicilio, curp, imss);
    }

    /* Constructor propio */
    public Trabajadores(float sueldo, String rfc, String horario, String profesion, String puesto, String name, int codigo, String correo, byte edad, char sexo, String telefono, String ocupacion, String domicilio, String curp, String imss) {
        super(name, codigo, correo, edad, sexo, telefono, ocupacion, domicilio, curp, imss);
        this.sueldo = sueldo;
        this.rfc = rfc;
        this.horario = horario;
        this.profesion = profesion;
        this.puesto = puesto;
    }

    
    
    /* Setters */

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    /* Getters */

    public float getSueldo() {
        return sueldo;
    }

    public String getRfc() {
        return rfc;
    }

    public String getHorario() {
        return horario;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getPuesto() {
        return puesto;
    }
    
    
    /* Getters de Override */
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

    
    /* Setters de Override */
    @Override
    public void setImss(String imss) {
        super.setImss(imss); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCurp(String curp) {
        super.setCurp(curp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setDomicilio(String domicilio) {
        super.setDomicilio(domicilio); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setOcupacion(String ocupacion) {
        super.setOcupacion(ocupacion); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTelefono(String telefono) {
        super.setTelefono(telefono); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setSexo(char sexo) {
        super.setSexo(sexo); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setEdad(byte edad) {
        super.setEdad(edad); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCorreo(String correo) {
        super.setCorreo(correo); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCodigo(int codigo) {
        super.setCodigo(codigo); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setName(String name) {
        super.setName(name); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void accion() {
        System.out.println("Los trabajadores trabajan"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
} //Fin de clase Trabajadores
