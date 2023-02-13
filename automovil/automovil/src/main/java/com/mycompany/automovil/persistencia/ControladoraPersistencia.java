
package com.mycompany.automovil.persistencia;

import com.mycompany.automovil.logica.Automovil;
import com.mycompany.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void agregar(Automovil auto) {
        
        autoJpa.create(auto);
        
    }

    public List<Automovil> traerAutos() {
        
        return autoJpa.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto)  {
        
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Automovil traerAuto(int idAuto) {
        
        return autoJpa.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil a) {
         
        try {
            autoJpa.edit(a);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}
