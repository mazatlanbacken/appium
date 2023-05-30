package co.com.pearls.certification.mazatlan.utils.constants;

public class TipoClaseConstante {
    /** Constante tipo CLASE_TASK. */
    public static final String CLASE_TASK = "Clase Task";

    /**Contante CLASE_CONSTANTE. */
    public static final String CLASE_CONSTANTE = "Clase constante";

    /**instancia nuevo gestor de constantes. */
    private  TipoClaseConstante(){
        throw new IllegalStateException(CLASE_CONSTANTE);
    }
}
