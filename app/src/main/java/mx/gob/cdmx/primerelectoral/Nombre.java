package mx.gob.cdmx.primerelectoral;

public class Nombre  {

/*
    �lvaro Obreg�n
    Azcapotzalco
    Benito Ju�rez
    Coyoac�n
    Cuajimalpa de Morelos
    Cuauht�moc
    Gustavo A. Madero
    Iztacalco
    Iztapalapa
    La Magdalena Contreras
    Miguel Hidalgo
    Milpa Alta
    Tl�huac
    Tlalpan
    Venustiano Carranza
    Xochimilco
    */


    public static final String customURL = "https://opinion.cdmx.gob.mx/encuestas/";
    public static final String customURLcatalogos = "https://opinion.cdmx.gob.mx/encuestas/catalogos/";
    public static final String encuesta = "primer_electoral";
    public static final String USUARIO = "usuario";
    public static final String ALCALDIA = "Todas";
    public static final String PADRON = "padron";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String IMEI = "imei";

    public String nombreEncuesta(){

        final String nombreEncuesta = "primer_electoral";
        return nombreEncuesta;
    }

    public String nombreDatos(){

        final String nombreEncuesta = "datos_primer_electoral";
        return nombreEncuesta;
    }

}	 