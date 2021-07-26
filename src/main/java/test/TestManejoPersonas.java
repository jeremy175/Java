package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO= new PersonaDAO();
        List<Persona>personas=personaDAO.seleccionar();
         //Insertando un nuevo objeto del tipo persona
        Persona PersonaN = new Persona("Carlos", "110", "210", "210");
        personaDAO.insertar(PersonaN);
        
        personas.forEach(persona -> {
            System.out.println("Persona:  " + persona);
        });
        
       
    }
  
}
