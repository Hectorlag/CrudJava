
package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;
import java.util.List;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregar(String modelo, String marca, String color, String motor, String patente, int cantPuertas) {
        Automovil auto = new  Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setNum_Puertas(cantPuertas);
        
        controlPersis.agregar(auto);
    }

    public List<Automovil> traerAutos() {
         
        return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
       
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        
       return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil a, String modelo, String marca,
            String color, String motor, String patente, int cantPuertas) {
        
        a.setModelo(modelo);
        a.setMarca(marca);
        a.setColor(color);
        a.setMotor(motor);
        a.setPatente(patente);
        a.setNum_Puertas(cantPuertas);
        
        controlPersis.modificarAuto(a);
    }

  


   
}
