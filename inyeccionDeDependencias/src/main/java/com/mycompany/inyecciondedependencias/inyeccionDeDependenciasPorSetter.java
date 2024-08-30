package com.mycompany.inyecciondedependencias;

public class inyeccionDeDependenciasPorSetter {
    
    private inyeccionChupada inyectChup;
    private inyeccionMetida inyectMet;

    public void setInyectChup(inyeccionChupada inyectChup) {
        this.inyectChup = inyectChup;
    }

    public void setInyectMet(inyeccionMetida inyectMet) {
        this.inyectMet = inyectMet;
    }
    
    
    
}
