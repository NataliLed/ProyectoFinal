
package com.nataliledesma.nel.Interface;

import com.nataliledesma.nel.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista  de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto (usuario) pero lo buscamos por Id
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
