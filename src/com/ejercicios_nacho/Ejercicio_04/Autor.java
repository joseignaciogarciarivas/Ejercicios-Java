public class Autor {
    private String nombre;
    private String nacionalidad;
    private GeneroLiterario Genlit;

    // Enum
    public enum GeneroLiterario {
        NOVELA,
        CIENCIA_FICCION,
        HISTORIA,
        POESIA;

    }

    // Constructor Vacio
    public Autor() {

    }

    // Constructor con todos los atributos
    public Autor(String pNombre, String pNacionalidad, GeneroLiterario pGenlit) {
        this.nombre = pNombre;
        this.nacionalidad = pNacionalidad;
        this.Genlit = pGenlit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autor: " + Autor);
        sb.append("Nacionalidad: " + nacionalidad);
        sb.append("Genero Literario: " + Genlit);
        return sb.toString();
    }

}
