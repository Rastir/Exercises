package com.mycompany.inyecciondedependencias;

public class InyeccionDeDependenciasPorConstructor {

    private inyeccionChupada inyeChup;
    private inyeccionMetida inyeMet;

    public InyeccionDeDependenciasPorConstructor(inyeccionChupada inyeChup, inyeccionMetida inyeMet) {
        this.inyeChup = inyeChup;
        this.inyeMet = inyeMet;
    }
    
    

}
