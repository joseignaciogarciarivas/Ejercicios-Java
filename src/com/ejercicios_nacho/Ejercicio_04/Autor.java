public class Autor {
    private String nombre;
    private String nacionalidad;
    private GeneroLiterario Genlit;

    // Constructor Vacio
    public Autor() {

    }

    // Construcor con todos los atributos
    public Autor(String pNombre, String pNacionalidad, GeneroLiterario pGenlit) {
        this.nombre = pNombre;
        this.nacionalidad = pNacionalidad;
        this.Genlit = pGenlit;
    }

    @Override
    public String StringBuiler() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autor: " + Autor);
        sb.append("Nacionalidad: " + nacionalidad);
        sb.append("Genero Literario: " + Genlit);
        return sb.toString();
    }

}
