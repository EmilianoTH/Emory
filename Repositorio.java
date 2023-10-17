package repositorio;

import java.util.ArrayList;
import java.util.Scanner;

/* Emiliano De La Torre Hernandez
 * 10-10-2023
 * Repositorio
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
        ArrayList<Docentes> listadedocentes = new ArrayList<>();
        ArrayList<Intendente> listadeintendente = new ArrayList<>();
        ArrayList<Secretarios> listadesecretarios = new ArrayList<>();
        
        /* Variables necesarias */
        byte edad = 0;
        int dato = 0, numMaterias = 0,  ifopci = 0;
        char datochar = ' ';
        float datofloat = 0;
        String menu = "", datoString = "", opcion2 = "", opcion3 = "";
        boolean init1 = true, init2 = true, init3 = true, init4 = true, init5 = true, init6 = true;
        
        
        while(init1){ //Main
            
            System.out.println("\n\n|---------REPOSITORIO---------|");
            System.out.println("|[A] Alumnos                  |");
            System.out.println("|[T] Trabajadores             |");
            System.out.println("|[F] Salir                    |");
            System.out.println("|-----------------------------|");
            System.out.print("Elije una opcion de la [A-F]: ");
            menu = leer.next();
            switch(menu){
                case "A": case"a":
                    while(init4){
                        System.out.println("\n\n|-----------ALUMNOS-----------|");
                        System.out.println("|[I] Ingresar                 |");
                        System.out.println("|[M] Mostrar                  |");
                        System.out.println("|[F] Salir                    |");
                        System.out.println("|-----------------------------|");
                        System.out.print("Elije una opcion de la [I-F]: ");
                        opcion2 = leer.next();
                        switch(opcion2){
                            case "I": case "i":
                                while(init2){ //While para meter datos
                                    Alumnos alumno = new Alumnos(' ', 15, "", "", 0, "", (byte)0, ' ', "", "", "", "", "");
                                    leer.nextLine();
                                    while(init5){ //While que no le permita pasar hasta poner bien los datos
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
                                        leer.nextLine();
                                    } //Fin del try catch

                                    leer.nextLine();
                                        if (alumno.getName() != "" && alumno.getCodigo() != 0 && alumno.getEdad() != 0) 
                                            init5 = false;
                                        
                                    } //Fin del primer while init 5
                                    init5 = true;
                                    
                                    while(init5){
                                        System.out.print("Escribe el correo(Sin espacios y sin olvidar el @): ");
                                        datoString = leer.next();
                                        alumno.setCorreo(datoString);
                                        System.out.print("Escribe el numero de telefono (Solo 10 digitos): ");
                                        datoString = leer.next();
                                        alumno.setTelefono(datoString);
                                        leer.nextLine(); //Nextline necerio para que agarre la ocupacion
                                        System.out.print("Escribe tu ocupacion (En caso de no tener alguna, escribir 'Ninguna'): ");
                                        datoString = leer.nextLine();
                                        alumno.setOcupacion(datoString);
                                        System.out.print("Escribe tu domicilio (Ejemplo Calle Hidalgo #365): ");
                                        datoString = leer.nextLine();
                                        alumno.setDomicilio(datoString);
                                        
                                        if (alumno.getCorreo() != "" && alumno.getTelefono() != "" && alumno.getOcupacion() != "" && alumno.getDomicilio() != "") 
                                            init5 = false;
                                        
                                    } //Fin del segundo while init5
                                    init5 = true;
                                    
                                    while(init5){
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
                                        
                                        if (alumno.getCurp() != "" && alumno.getImss() != "" && alumno.getSexo() != ' ' && alumno.getPaga() != ' ')
                                            init5 = false;
                                        
                                    } //Fin del tercer while init5
                                    init5 = true;
                                    
                                    while(init5){
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
                                        
                                        if (numMaterias > 1) {
                                            if (alumno.getSalon() != "" && alumno.getMaterias(0) != "" && alumno.getHorario(0) != ""
                                                && alumno.getMaterias(1) != "" && alumno.getHorario(1) != "")
                                                init5 = false;
                                        } else {
                                            if (alumno.getSalon() != "" && alumno.getMaterias(0) != "" && alumno.getHorario(0) != "" ) 
                                            init5 = false;
                                        } //Fin del ifelse de validacion
                                        
                                        
                                    } // Fin del cuarto while init5
                                    
                                    init5 = true;
                                    
                                    while(init5){
                                    try{
                                        System.out.println("¿Quiere guardar al alumno?\nYes = 1\nNo = 2");
                                        ifopci = leer.nextInt();
                                        //If que valide que ha metido los datos de forma correcta
                                            if (ifopci == 1){
                                                init2 = false;
                                                init5 = false;
                                                listadealumnos.add(alumno);
                                                System.out.println("Alumno Guardado");
                                            } else {//Fin de if que valida
                                                System.out.println("Entendido");
                                                init5 = false;
                                            }
                                    //If que valide que ha metido los datos de forma correcta
                                    } catch(Exception e){
                                        System.out.println("Dato incorrecto");
                                    } //Fin de try catch
                                    
                                    } //While para saber si quiere ingresar al alumno
                                    
                                    
                                init5 = true;

                                } //Fin de while 2
                                
                                break;
                                
                            case "M": case "m":
                                //Impresion de ArrayList
                                for (Alumnos alumno : listadealumnos){ //Inicio de for de arrayList
                                    System.out.println("\n\nNombre: " + alumno.getName() + ", Codigo: " + alumno.getCodigo());
                                    System.out.println("Edad: " + alumno.getEdad() + ", Sexo: " + alumno.getSexo());
                                    System.out.println("Correo: " + alumno.getCorreo() + ", Ocupacion: " + alumno.getOcupacion());
                                    System.out.println("Telefono: " + alumno.getTelefono() + ", Domicilio: " + alumno.getDomicilio());
                                    System.out.println("CURP: "+ alumno.getCurp() + ", IMSS: " + alumno.getImss());
                                    for (int i = 0; i < numMaterias; i++) { //Otro for para mostrar arreglos
                                        System.out.println("Materia " + (i + 1) + ": " + alumno.getMaterias(i) + ", Promedio: " + alumno.getPromedio(i)+ ", Horario: "+alumno.getHorario(i));
                                        System.out.println("Salon: "+alumno.getSalon());
                                    } //Fin de for para mostrar arreglos
                                alumno.accion();
                                } //Fin de for de ArrayList
                                
                                leer.nextLine();
                                
                                break;
                                
                            case "F": case "f":
                                System.out.println("Entendido");
                                init4 = false;
                                break;
                                
                            default:
                                System.out.println("Opcion incorrecta\nElije una opcion correcta");
                                break;
                        } //Submenu del caso A
                    } //Fin de while 4
                    init4 = true;
                
                case "T": case "t": //Case T del segundo swithc
                    while(init4){
                        System.out.println("\n\n|--------TRABAJADORES---------|");
                        System.out.println("|[D] Docentes                 |");
                        System.out.println("|[N] Intendentes              |");
                        System.out.println("|[S] Secretarios              |");
                        System.out.println("|[F] Salir                    |");
                        System.out.println("|-----------------------------|");
                        System.out.print("Elije una opcion de la [D-F]: ");
                        opcion2 = leer.next();
                        switch(opcion2){
                            case "D": case "d":
                                while(init6){ //Principio del while 6 de Docentes
                                System.out.println("\n\n|--------DOCENTES-------------|");
                                System.out.println("|[I] Ingresar                 |");
                                System.out.println("|[M] Mostrar                  |");
                                System.out.println("|[F] Salir                    |");
                                System.out.println("|-----------------------------|");
                                System.out.print("Elije una opcion de la [I-F]: ");
                                opcion3 = leer.next();
                                switch(opcion3){
                                    case "I": case "i":
                                        while(init2){ //While para meter datos
                                            Docentes docente = new Docentes(15, "", "", 0, "", "", "", "", "", 0, "", (byte)0, ' ', "", "", "", "", "");
                                            leer.nextLine();
                                            while(init5){ //While que no le permita pasar hasta poner bien los datos
                                            System.out.print("Escribe el nombre: ");
                                            datoString = leer.nextLine();
                                            docente.setName(datoString);

                                            try{ //Trycatch para meter datos enteros sin problema //Son necesarios 2 trycatch o un while, arreglo pendiente
                                                System.out.print("Escribe el codigo: ");
                                                dato = leer.nextInt();
                                                docente.setCodigo(dato);
                                                System.out.print("Escribe la edad: ");
                                                edad = leer.nextByte();
                                                docente.setEdad(edad);
                                            } catch(Exception e){
                                                System.out.println("Dato incorrecto");
                                                leer.nextLine();
                                            } //Fin del try catch

                                            leer.nextLine();
                                                if (docente.getName() != "" && docente.getCodigo() != 0 && docente.getEdad() != 0) 
                                                    init5 = false;

                                            } //Fin del primer while init 5
                                            init5 = true;

                                            while(init5){
                                                System.out.print("Escribe el correo(Sin espacios y sin olvidar el @): ");
                                                datoString = leer.next();
                                                docente.setCorreo(datoString);
                                                System.out.print("Escribe el numero de telefono (Solo 10 digitos): ");
                                                datoString = leer.next();
                                                docente.setTelefono(datoString);
                                                leer.nextLine(); //Nextline necerio para que agarre la ocupacion
                                                System.out.print("Escribe tu ocupacion (En caso de no tener alguna, escribir 'Ninguna'): ");
                                                datoString = leer.nextLine();
                                                docente.setOcupacion(datoString);
                                                System.out.print("Escribe tu domicilio (Ejemplo Calle Hidalgo #365): ");
                                                datoString = leer.nextLine();
                                                docente.setDomicilio(datoString);

                                                if (docente.getCorreo() != "" && docente.getTelefono() != "" && docente.getOcupacion() != "" && docente.getDomicilio() != "") 
                                                    init5 = false;

                                            } //Fin del segundo while init5
                                            init5 = true;

                                            while(init5){
                                                System.out.print("Escribe tu CURP: ");
                                                datoString = leer.nextLine();
                                                docente.setCurp(datoString);
                                                System.out.print("Escribe tu imss: ");
                                                datoString = leer.nextLine();
                                                docente.setImss(datoString);
                                                System.out.print("Escribe tu sexo ('H' o 'M'): ");
                                                datochar = leer.next().charAt(0);
                                                docente.setSexo(datochar);
                                                System.out.print("Escriba su categoria como maestro(Tiempo completo[TL] o por horas[H]): ");
                                                datoString = leer.nextLine();
                                                docente.setCategoria(datoString);
                                                if (docente.getCategoria() == "TL" || docente.getCategoria() == "Tiempo completo") {
                                                    System.out.print("Escriba cual es su cubiculo: ");
                                                    datoString = leer.nextLine();
                                                    docente.setCubiculo(datoString);
                                                } //Fin del if que verifica si el profesor tiene cubiculo
                                                

                                                if (docente.getCurp() != "" && docente.getImss() != "" && docente.getSexo() != ' ' && docente.getCategoria() != "")
                                                    init5 = false;

                                            } //Fin del tercer while init5
                                            init5 = true;
                                            
                                            while(init5){
                                                System.out.print("Escribe tu puesto: ");
                                                datoString = leer.nextLine();
                                                docente.setPuesto(datoString);
                                                System.out.print("Escribe tu profesion: ");
                                                datoString = leer.nextLine();
                                                docente.setProfesion(datoString);
                                                System.out.print("Escribe tu horario: ");
                                                datoString = leer.nextLine();
                                                docente.setHorario(datoString);
                                                System.out.print("Escribe tu RFC: ");
                                                datoString = leer.nextLine();
                                                docente.setRfc(datoString);
                                                System.out.print("Escribe tu sueldo: ");
                                                datofloat = leer.nextFloat();
                                                docente.setSueldo(datofloat);
                                                leer.nextLine();
                                                
                                                if (docente.getPuesto() != "" && docente.getProfesion() != "" && docente.getHorario() != ""
                                                        && docente.getRfc() != "" && docente.getSueldo() != 0)
                                                    init5 = false;
                                                
                                            } //Fin del cuarto while init5
                                            init5 = true;

                                            while(init5){

                                                //Comienzos para meter Materias 
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
                                                        docente.setMaterias(j, datoString);
                                                        leer.nextLine();
                                                    } //Fin del for

                                                if (numMaterias > 1) {
                                                    if (docente.getMaterias(0) != "" && docente.getMaterias(1) != "")
                                                        init5 = false;
                                                } else {
                                                    if (docente.getMaterias(0) != "") 
                                                    init5 = false;
                                                } //Fin del ifelse de validacion


                                            } // Fin del quinto while init5

                                            init5 = true;

                                            while(init5){
                                            try{
                                                System.out.println("¿Quiere guardar al alumno?\nYes = 1\nNo = 2");
                                                ifopci = leer.nextInt();
                                                //If que valide que ha metido los datos de forma correcta
                                                    if (ifopci == 1){
                                                        init2 = false;
                                                        init5 = false;
                                                        listadedocentes.add(docente);
                                                        System.out.println("Alumno Guardado");
                                                    } else {//Fin de if que valida
                                                        System.out.println("Entendido");
                                                        init5 = false;
                                                    }
                                            //If que valide que ha metido los datos de forma correcta
                                            } catch(Exception e){
                                                System.out.println("Dato incorrecto");
                                            } //Fin de try catch

                                            } //While para saber si quiere ingresar al alumno


                                        init5 = true;

                                        } //Fin de while 2
                                        break;
                                        
                                    case "M": case "m":
                                        //Impresion de ArrayList
                                        for (Docentes docente : listadedocentes){ //Inicio de for de arrayList
                                            System.out.println("\n\nNombre: " + docente.getName() + ", Codigo: " + docente.getCodigo());
                                            System.out.println("Edad: " + docente.getEdad() + ", Sexo: " + docente.getSexo());
                                            System.out.println("Correo: " + docente.getCorreo() + ", Ocupacion: " + docente.getOcupacion());
                                            System.out.println("Telefono: " + docente.getTelefono() + ", Domicilio: " + docente.getDomicilio());
                                            System.out.println("CURP: "+ docente.getCurp() + ", IMSS: " + docente.getImss());
                                            System.out.println("Puesto: "+ docente.getPuesto() + ", Profesion: "+ docente.getProfesion());
                                            System.out.println("Horario: "+ docente.getHorario() + ", RFC: "+ docente.getRfc());
                                            System.out.println("Sueldo: "+ docente.getSueldo() + ", Categoria: "+ docente.getCategoria());
                                            if(docente.getCategoria() == "TL" || docente.getCategoria() == "Tiempo completo")
                                                System.out.println("Cubiculo: "+ docente.getCubiculo());
                                            
                                            for (int i = 0; i < numMaterias; i++) { //Otro for para mostrar arreglos
                                                System.out.println("Materia " + (i + 1) + ": " + docente.getMaterias(i));
                                            } //Fin de for para mostrar arreglos
                                        docente.accion();
                                        } //Fin de for de ArrayList

                                        leer.nextLine();
                                        break;
                                    
                                    case "F": case "f": //Case f del tercer switch
                                        System.out.println("Entendido");
                                        init6 = false;
                                    break; //Fin del caso F del tercer switch
                                    
                                default:
                                    System.out.println("Opcion incorrecta\nElije una opcion correcta");
                                    break;
                                } //Fin del switch de docentes
                            } //Fin del while 6 Docentes
                            init6 = true;
                            
                                break;
                            
                            case "N": case "n":
                                while(init6){ //Principio del while 6 de Intendentes
                                    System.out.println("\n\n|--------INTENDENTES----------|");
                                    System.out.println("|[I] Ingresar                 |");
                                    System.out.println("|[M] Mostrar                  |");
                                    System.out.println("|[F] Salir                    |");
                                    System.out.println("|-----------------------------|");
                                    System.out.print("Elije una opcion de la [I-F]: ");
                                    opcion3 = leer.next();
                                    switch(opcion3){
                                        case "I": case "i":
                                            while(init2){ //While para meter datos
                                                Intendente Intendentes = new Intendente("", 0, "", "", "", "", "", 0, "", (byte)0, ' ', "", "", "", "", "");
                                                leer.nextLine();
                                                
                                                while(init5){ //While que no le permita pasar hasta poner bien los datos
                                                System.out.print("Escribe el nombre: ");
                                                datoString = leer.nextLine();
                                                Intendentes.setName(datoString);

                                                try{ //Trycatch para meter datos enteros sin problema //Son necesarios 2 trycatch o un while, arreglo pendiente
                                                    System.out.print("Escribe el codigo: ");
                                                    dato = leer.nextInt();
                                                    Intendentes.setCodigo(dato);
                                                    System.out.print("Escribe la edad: ");
                                                    edad = leer.nextByte();
                                                    Intendentes.setEdad(edad);
                                                } catch(Exception e){
                                                    System.out.println("Dato incorrecto");
                                                    leer.nextLine();
                                                } //Fin del try catch

                                                leer.nextLine();
                                                    if (Intendentes.getName() != "" && Intendentes.getCodigo() != 0 && Intendentes.getEdad() != 0) 
                                                        init5 = false;

                                                } //Fin del primer while init 5
                                                init5 = true;

                                                while(init5){
                                                    System.out.print("Escribe el correo(Sin espacios y sin olvidar el @): ");
                                                    datoString = leer.next();
                                                    Intendentes.setCorreo(datoString);
                                                    System.out.print("Escribe el numero de telefono (Solo 10 digitos): ");
                                                    datoString = leer.next();
                                                    Intendentes.setTelefono(datoString);
                                                    leer.nextLine(); //Nextline necerio para que agarre la ocupacion
                                                    System.out.print("Escribe tu ocupacion (En caso de no tener alguna, escribir 'Ninguna'): ");
                                                    datoString = leer.nextLine();
                                                    Intendentes.setOcupacion(datoString);
                                                    System.out.print("Escribe tu domicilio (Ejemplo Calle Hidalgo #365): ");
                                                    datoString = leer.nextLine();
                                                    Intendentes.setDomicilio(datoString);

                                                    if (Intendentes.getCorreo() != "" && Intendentes.getTelefono() != "" && Intendentes.getOcupacion() != "" && Intendentes.getDomicilio() != "") 
                                                        init5 = false;

                                                } //Fin del segundo while init5
                                                init5 = true;

                                                while(init5){
                                                    System.out.print("Escribe tu CURP: ");
                                                    datoString = leer.nextLine();
                                                    Intendentes.setCurp(datoString);
                                                    System.out.print("Escribe tu imss: ");
                                                    datoString = leer.nextLine();
                                                    Intendentes.setImss(datoString);
                                                    System.out.print("Escribe tu sexo ('H' o 'M'): ");
                                                    datochar = leer.next().charAt(0);
                                                    Intendentes.setSexo(datochar);
                                                    System.out.print("Escriba su área: ");
                                                    datoString = leer.nextLine();
                                                    Intendentes.setArea(datoString);
                                                    


                                                    if (Intendentes.getCurp() != "" && Intendentes.getImss() != "" && Intendentes.getSexo() != ' ' && Intendentes.getArea() != "")
                                                        init5 = false;

                                                } //Fin del tercer while init5
                                                init5 = true;

                                                while(init5){
                                                    System.out.print("Escribe tu puesto: ");
                                                    datoString = leer.nextLine();
                                                    Intendentes.setPuesto(datoString);
                                                    System.out.print("Escribe tu profesion: ");
                                                    datoString = leer.nextLine();
                                                    Intendentes.setProfesion(datoString);
                                                    System.out.print("Escribe tu horario: ");
                                                    datoString = leer.nextLine();
                                                    Intendentes.setHorario(datoString);
                                                    System.out.print("Escribe tu RFC: ");
                                                    datoString = leer.nextLine();
                                                    Intendentes.setRfc(datoString);
                                                    System.out.print("Escribe tu sueldo: ");
                                                    datofloat = leer.nextFloat();
                                                    Intendentes.setSueldo(datofloat);
                                                    leer.nextLine();

                                                    if (Intendentes.getPuesto() != "" && Intendentes.getProfesion() != "" && Intendentes.getHorario() != ""
                                                            && Intendentes.getRfc() != "" && Intendentes.getSueldo() != 0)
                                                        init5 = false;

                                                } //Fin del cuarto while init5
                                                init5 = true;
                                                

                                                while(init5){
                                                try{
                                                    System.out.println("¿Quiere guardar al alumno?\nYes = 1\nNo = 2");
                                                    ifopci = leer.nextInt();
                                                    //If que valide que ha metido los datos de forma correcta
                                                        if (ifopci == 1){
                                                            init2 = false;
                                                            init5 = false;
                                                            listadeintendente.add(Intendentes);
                                                            System.out.println("Alumno Guardado");
                                                        } else {//Fin de if que valida
                                                            System.out.println("Entendido");
                                                            init5 = false;
                                                        }
                                                //If que valide que ha metido los datos de forma correcta
                                                } catch(Exception e){
                                                    System.out.println("Dato incorrecto");
                                                } //Fin de try catch

                                                } //While para saber si quiere ingresar al alumno


                                            init5 = true;

                                            } //Fin de while 2
                                            break;

                                        case "M": case "m":
                                            //Impresion de ArrayList
                                            for (Intendente Intendentes : listadeintendente){ //Inicio de for de arrayList
                                                System.out.println("\n\nNombre: " + Intendentes.getName() + ", Codigo: " + Intendentes.getCodigo());
                                                System.out.println("Edad: " + Intendentes.getEdad() + ", Sexo: " + Intendentes.getSexo());
                                                System.out.println("Correo: " + Intendentes.getCorreo() + ", Ocupacion: " + Intendentes.getOcupacion());
                                                System.out.println("Telefono: " + Intendentes.getTelefono() + ", Domicilio: " + Intendentes.getDomicilio());
                                                System.out.println("CURP: "+ Intendentes.getCurp() + ", IMSS: " + Intendentes.getImss());
                                                System.out.println("Puesto: "+ Intendentes.getPuesto() + ", Profesion: "+ Intendentes.getProfesion());
                                                System.out.println("Horario: "+ Intendentes.getHorario() + ", RFC: "+ Intendentes.getRfc());
                                                System.out.println("Sueldo: "+ Intendentes.getSueldo() + ", Área: "+ Intendentes.getArea());
                                                
                                            Intendentes.accion();
                                            } //Fin de for de ArrayList

                                            leer.nextLine();
                                            break;

                                        case "F": case "f": 
                                            System.out.println("Entendido");
                                            init6 = false;
                                        break; //Fin del caso F de Intendetes

                                    default:
                                        System.out.println("Opcion incorrecta\nElije una opcion correcta");
                                        break;
                                    } //Fin del switch de Intendentes
                                } //Fin del while init6 Intendentes
                                init6 = true;
                                
                                break; //Case n del switch Trabajadores
                            
                            case "S": case "s":
                                while(init6){ //Principio del while 6 de Secretarios
                                    System.out.println("\n\n|---------SECRETARIOS---------|");
                                    System.out.println("|[I] Ingresar                 |");
                                    System.out.println("|[M] Mostrar                  |");
                                    System.out.println("|[F] Salir                    |");
                                    System.out.println("|-----------------------------|");
                                    System.out.print("Elije una opcion de la [I-F]: ");
                                    opcion3 = leer.next();
                                    switch(opcion3){
                                        case "I": case "i":
                                            while(init2){ //Comienzo del while init 2 de Secreatirios
                                                Secretarios secretario = new Secretarios("", 0, "", "", "", "", "", 0, "", (byte)0, ' ', "", "", "", "", "");
                                                leer.nextLine();
                                                
                                                while(init5){ //While que no le permita pasar hasta poner bien los datos
                                                System.out.print("Escribe el nombre: ");
                                                datoString = leer.nextLine();
                                                secretario.setName(datoString);

                                                try{ //Trycatch para meter datos enteros sin problema //Son necesarios 2 trycatch o un while, arreglo pendiente
                                                    System.out.print("Escribe el codigo: ");
                                                    dato = leer.nextInt();
                                                    secretario.setCodigo(dato);
                                                    System.out.print("Escribe la edad: ");
                                                    edad = leer.nextByte();
                                                    secretario.setEdad(edad);
                                                } catch(Exception e){
                                                    System.out.println("Dato incorrecto");
                                                    leer.nextLine();
                                                } //Fin del try catch

                                                leer.nextLine();
                                                    if (secretario.getName() != "" && secretario.getCodigo() != 0 && secretario.getEdad() != 0) 
                                                        init5 = false;

                                                } //Fin del primer while init 5
                                                init5 = true;

                                                while(init5){
                                                    System.out.print("Escribe el correo(Sin espacios y sin olvidar el @): ");
                                                    datoString = leer.next();
                                                    secretario.setCorreo(datoString);
                                                    System.out.print("Escribe el numero de telefono (Solo 10 digitos): ");
                                                    datoString = leer.next();
                                                    secretario.setTelefono(datoString);
                                                    leer.nextLine(); //Nextline necerio para que agarre la ocupacion
                                                    System.out.print("Escribe tu ocupacion (En caso de no tener alguna, escribir 'Ninguna'): ");
                                                    datoString = leer.nextLine();
                                                    secretario.setOcupacion(datoString);
                                                    System.out.print("Escribe tu domicilio (Ejemplo Calle Hidalgo #365): ");
                                                    datoString = leer.nextLine();
                                                    secretario.setDomicilio(datoString);

                                                    if (secretario.getCorreo() != "" && secretario.getTelefono() != "" && secretario.getOcupacion() != "" && secretario.getDomicilio() != "") 
                                                        init5 = false;

                                                } //Fin del segundo while init5
                                                init5 = true;

                                                while(init5){
                                                    System.out.print("Escribe tu CURP: ");
                                                    datoString = leer.nextLine();
                                                    secretario.setCurp(datoString);
                                                    System.out.print("Escribe tu imss: ");
                                                    datoString = leer.nextLine();
                                                    secretario.setImss(datoString);
                                                    System.out.print("Escribe tu sexo ('H' o 'M'): ");
                                                    datochar = leer.next().charAt(0);
                                                    secretario.setSexo(datochar);
                                                    System.out.print("Escriba su oficina: ");
                                                    datoString = leer.nextLine();
                                                    secretario.setOficina(datoString);
                                                    


                                                    if (secretario.getCurp() != "" && secretario.getImss() != "" && secretario.getSexo() != ' ' && secretario.getOficina() != "")
                                                        init5 = false;

                                                } //Fin del tercer while init5
                                                init5 = true;

                                                while(init5){
                                                    System.out.print("Escribe tu puesto: ");
                                                    datoString = leer.nextLine();
                                                    secretario.setPuesto(datoString);
                                                    System.out.print("Escribe tu profesion: ");
                                                    datoString = leer.nextLine();
                                                    secretario.setProfesion(datoString);
                                                    System.out.print("Escribe tu horario: ");
                                                    datoString = leer.nextLine();
                                                    secretario.setHorario(datoString);
                                                    System.out.print("Escribe tu RFC: ");
                                                    datoString = leer.nextLine();
                                                    secretario.setRfc(datoString);
                                                    System.out.print("Escribe tu sueldo: ");
                                                    datofloat = leer.nextFloat();
                                                    secretario.setSueldo(datofloat);
                                                    leer.nextLine();

                                                    if (secretario.getPuesto() != "" && secretario.getProfesion() != "" && secretario.getHorario() != ""
                                                            && secretario.getRfc() != "" && secretario.getSueldo() != 0)
                                                        init5 = false;

                                                } //Fin del cuarto while init5
                                                init5 = true;
                                                

                                                while(init5){
                                                try{
                                                    System.out.println("¿Quiere guardar al alumno?\nYes = 1\nNo = 2");
                                                    ifopci = leer.nextInt();
                                                    //If que valide que ha metido los datos de forma correcta
                                                        if (ifopci == 1){
                                                            init2 = false;
                                                            init5 = false;
                                                            listadesecretarios.add(secretario);
                                                            System.out.println("Alumno Guardado");
                                                        } else {//Fin de if que valida
                                                            System.out.println("Entendido");
                                                            init5 = false;
                                                        }
                                                //If que valide que ha metido los datos de forma correcta
                                                } catch(Exception e){
                                                    System.out.println("Dato incorrecto");
                                                } //Fin de try catch

                                                } //While para saber si quiere ingresar al alumno


                                            init5 = true;

                                            } //Fin dek while 2 de secretarios
                                            break;

                                        case "M": case "m":
                                                //Impresion de ArrayList
                                            for (Secretarios secretario : listadesecretarios){ //Inicio de for de arrayList
                                                System.out.println("\n\nNombre: " + secretario.getName() + ", Codigo: " + secretario.getCodigo());
                                                System.out.println("Edad: " + secretario.getEdad() + ", Sexo: " + secretario.getSexo());
                                                System.out.println("Correo: " + secretario.getCorreo() + ", Ocupacion: " + secretario.getOcupacion());
                                                System.out.println("Telefono: " + secretario.getTelefono() + ", Domicilio: " + secretario.getDomicilio());
                                                System.out.println("CURP: "+ secretario.getCurp() + ", IMSS: " + secretario.getImss());
                                                System.out.println("Puesto: "+ secretario.getPuesto() + ", Profesion: "+ secretario.getProfesion());
                                                System.out.println("Horario: "+ secretario.getHorario() + ", RFC: "+ secretario.getRfc());
                                                System.out.println("Sueldo: "+ secretario.getSueldo() + ", Área: "+ secretario.getOficina());
                                                
                                            secretario.accion();
                                            } //Fin de for de ArrayList

                                            leer.nextLine();
                                            break;

                                        case "F": case "f": //Case f de Secretarios
                                            System.out.println("Entendido");
                                            init6 = false;
                                        break; //Fin del caso F de Secretarios

                                    default:
                                        System.out.println("Opcion incorrecta\nElije una opcion correcta");
                                        break;
                                    } //Fin del switch de Secretarios
                                } //Fin del while 6 de Secretarios
                                init6 = true;
                                
                                break; //Fin del Case s del switch Trabajadores
                                
                            case "F": case "f": 
                                System.out.println("Entendido");
                                init4 = false;
                                break; //Fin del caso F del switch Trabajadores

                            default:
                                System.out.println("Opcion incorrecta\nElije una opcion correcta");
                                break;
                            } //Fin del switch de Trabajadores
                        
                        
                    } //Fin del while de Trabajadores
                    init4 = true;
                    
                    break;
                
                case "F": case "f": //Case f del primer switch
                        System.out.println("Entendido");
                        init1 = false;
                    break; //Fin del caso F del primer switch
                    
                default:
                    System.out.println("Opcion incorrecta\nElije una opcion correcta");
                    break;
            } //Fin del switch
        } //Fin del while principal
        
        
        leer.close();
    } //Fin de main
    
} //Fin de clase
