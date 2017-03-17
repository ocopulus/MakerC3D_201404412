package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String etv;
    private String etf;

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public NodoC3D(String cad, String ev, String ef) {
        this.cad = cad;
        this.etv = ev;
        this.etf = ef;
    }
    
    public String getCad(){
        return cad;
    }

    /**
     * @return the etv
     */
    public String getEtv() {
        return etv;
    }

    /**
     * @return the etf
     */
    public String getEtf() {
        return etf;
    }
        
}
