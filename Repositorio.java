package repositorio;

import java.util.ArrayList;
import java.util.Scanner;

/* Emiliano De La Torre Hernandez
 * 10-10-2023
 * Conversor(cambia el nombre como lo tengas)
 * Centro Universitario de los Altos | Universidad de Guadalajara
 * Ingenieria en computacion
 * Profesor: Sergio Franco Casillas
 * Descripcion: Main del programa de conversiones
 */

public class Repositorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        /* Variables de objetos */
        ArrayList<Alumnos> listadealumnos = new ArrayList<>();
        
        /* Variables necesarias */
        byte edad = 0;
        int dato = 0, numMaterias = 0;
        char datochar = ' ';
        float datofloat = 0;
        String menu = "", datoString = "";
        boolean init1 = true, init2 = true, init3 = true;
        
        
        while(init1){ //Main
            
            System.out.println("\n\n|---------REPOSITORIO---------|");
            System.out.println("|[A] Alumnos                  |");
            System.out.println("|[D] Docentes                 |");
            System.out.println("|[I] Intendentes              |");
            System.out.println("|[S] Secretarios              |");
            System.out.println("|[F] Salir                    |");
            System.out.println("|-----------------------------|");
            System.out.print("Elije una opcion de la [A-F]: ");
            menu = leer.next();
            switch(menu){
                case "A": case"a":
                    while(init2){ //While para meter datos
                        Alumnos alumno = new Alumnos(' ', 15, "", "", 0, "", (byte)0, ' ', "", "", "", "", "");
                        leer.nextLine();
                        
                        System.out.print("Escribe el nombre: ");
                        datoString = leer.nextLine();
                        alumno.setName(datoString);
                        try{ //Trycatch para meter datos enteros sin problema //Son necesarios 2 trycatch o un while, arreglo pendiente
                            System.out.print("Escribe el codigo: ");
                            dato = leer.nextInt();
                            alumno.setCodigo(dato);
                            System.out.print("Escribe la edad: ");
                            edad = leer.nextByte();
                            alumno.setEdad(edad);
                        } catch(Exception e){
                            System.out.println("Dato incorrecto");
                        } //Fin del try catch
                        
                        leer.nextLine();
                        
                        System.out.print("Escribe el correo(Sin espacios y sin olvidar el @): ");
                        datoString = leer.next();
                        alumno.setCorreo(datoString);
                        System.out.print("Escribe el numero de telefono (Solo 10 digitos): ");
                        datoString = leer.next();
                        alumno.setTelefono(datoString);
                        System.out.print("Escribe tu ocupacion: ");
                        datoString = leer.nextLine();
                        alumno.setOcupacion(datoString);
                        System.out.print("Escribe tu domicilio (Ejemplo Calle Hidalgo #365): ");
                        datoString = leer.nextLine();
                        alumno.setDomicilio(datoString);
                        System.out.print("Escribe tu CURP: ");
                        datoString = leer.nextLine();
                        alumno.setCurp(datoString);
                        System.out.print("Escribe tu imss: ");
                        datoString = leer.nextLine();
                        alumno.setImss(datoString);
                        System.out.print("Escribe tu sexo ('H' o 'M'): ");
                        datochar = leer.next().charAt(0);
                        alumno.setSexo(datochar);
                        System.out.print("El alumno ha pagado el semestre (Yes[Y] o No[N]): ");
                        datochar = leer.next().charAt(0);
                        alumno.setPaga(datochar);
                        leer.nextLine();
                        System.out.print("Escribe el salon en el que estudiará el alumno: ");
                        datoString = leer.nextLine();
                        alumno.setSalon(datoString);
                        
                        //Comienzos para meter Materias con promedio y salon//
                        while(init3){
                            try{
                                System.out.print("Escribe la cantidad de materias que tendra el alumno(1-15): ");
                                numMaterias = leer.nextInt();
                                if (numMaterias > 0 && numMaterias < 16) 
                                    init3 = false;
                                else{
                                    System.out.println("Numero fuera del rango permitido");
                                }
                            } catch(Exception e){
                                System.out.println("Error, numero invalido");
                                leer.nextLine();
                            }
                        } //Fin del while 3
                        
                        init3 = true; //Se vuelve a igualar a true para usarlo a continuacion
                        leer.nextLine();
                        //For para meter materias y demas
                            for (int j = 0; j < numMaterias; j++) { 
                                System.out.print("Escribe la materia: ");
                                datoString = leer.nextLine();
                                alumno.setMaterias(j, datoString);
                                System.out.print("Escribe el horario de esa materia: ");
                                datoString = leer.nextLine();
                                alumno.setHorario(j, datoString);
                                while(init3){
                                    try{
                                    System.out.print("Escribe el promedio del alumno en la materia correspondiente: ");
                                    datofloat = leer.nextFloat();
                                    if (datofloat >= 0 && datofloat <= 100){
                                        init3 = false;
                                    } else {
                                        System.out.println("Escriba un promedio veridico (0 - 100)");
                                    }
                                    } catch(Exception e){
                                        System.out.println("Error, numero invalido");
                                        leer.nextLine();
                                    }
                                } //Fin del while 3 dentro del for
                                alumno.setPromedio(j, datofloat);
                                init3 = true; //Se iguala para seguir usandolo en el transcurso del for
                                leer.nextLine();
                            } //Fin del for
                            
                        //If que valide que ha metido los datos de forma correcta
                        if (dato != 0 && datochar != ' ' && datoString != "" && edad != 0){
                            init2 = false;
                            listadealumnos.add(alumno);
                        } //Fin de if que valida
                        
                    } //Fin de while 2
                    
                    //Ejemplo rapido de como imprimir los arrayList para Midory
                    for (Alumnos alumno : listadealumnos){ //Inicio de for de arrayList
                        System.out.println("Nombre: " + alumno.getName() + ", Edad: " + alumno.getEdad());
                        for (int i = 0; i < numMaterias; i++) { //Otro for para mostrar arreglos
                            System.out.println("Materia " + (i + 1) + ": " + alumno.getMaterias(i) + ", Promedio: " + alumno.getPromedio(i)+ ", Horario: "+alumno.getHorario(i));
                            System.out.println("Salon: "+alumno.getSalon());
                        } //Fin de for para mostrar arreglos
                    } //Fin de for de ArrayList
                    
                    init2 = true;
                    break;
                
                case "F": case "f":
                        System.out.println("Entendido");
                        init1 = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta\nElije una opcion correcta");
                    break;
            } //Fin del switch
        } //Fin del while principal
        
        
        leer.close();
    } //Fin de main
    
} //Fin de clase
