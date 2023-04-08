package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

import modelo.Alumno;
import modelo.Inscripcion;
import modelo.LectorDeArchivos;
import modelo.Materia;

public class Main {
    public static void main(String[] args) {
    	// java -jar GestorDeCorrelativas-1.0-SNAPSHOT.jar "C:\Users\Usuario\eclipse-workspace\GestorDeCorrelativas\src\main\resources\inscripciones.csv"
        
    	//En la variable args va a viajar la ruta del archivo que queremos que abra el programa
        if(args.length == 0){
            System.out.println("ERROR: No ingresaste ningún archivo como argumento!");
            System.exit(88);
        }

        LectorDeArchivos lectorDeArchivos = new LectorDeArchivos(args[0]);
        lectorDeArchivos.parsearArchivo();  //Obtengo todas las lineas del archivo csv
        
        Materia programacionI = new Materia("Programacion I");
        Materia programacionII = new Materia("Programacion II");
        Materia programacionIII = new Materia("Programacion III");
        Materia baseDeDatos = new Materia("Base de Datos");
        
        
        //programacion I no tiene correlativa
        programacionII.agregarMateriaCorrelativa(programacionI);
        programacionIII.agregarMateriaCorrelativa(programacionII);
        baseDeDatos.agregarMateriaCorrelativa(programacionII);

        Collection<Materia> materias = new ArrayList<Materia>();
        materias.add(baseDeDatos);
        materias.add(programacionI);
        materias.add(programacionII);
        materias.add(programacionIII);
        
        Alumno alumnoJose = new Alumno("Jose Rodriguez", "FE1234");
        Alumno alumnoSosa = new Alumno("Vanesa Sosa", "FE1264");
        Alumno alumnoPerez = new Alumno("Lucia Perez", "FE1236");
        
        // Jose NO tiene materias aprobadas
        alumnoSosa.agregarMateriaAprobada(programacionI);
        alumnoSosa.agregarMateriaAprobada(programacionII);
        alumnoPerez.agregarMateriaAprobada(programacionI);
        
        Collection<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(alumnoPerez);
        alumnos.add(alumnoSosa);
        alumnos.add(alumnoJose);
        
        ArrayList<Inscripcion> incripciones = lectorDeArchivos.listarInscripciones(materias, alumnos);
        
        for(Inscripcion inscripcion : incripciones) {
        	System.out.println(inscripcion.getAlumno().getNombre() + ", Materia: " +  inscripcion.getMateria().getNombre() + " --> Estado: " + inscripcion.estadoDeInscripcion());
        	
         }
        
    }
        
}