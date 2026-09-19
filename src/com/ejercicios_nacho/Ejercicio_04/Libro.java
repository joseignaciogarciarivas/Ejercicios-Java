public class Libro{
    private String titulo;
    private String isbn;
    private static int cantidadLibros;
    private Autor autor;

    public Libro(String pTitulo, String pIsbn, int pCantidadLibros, Autor pAutor){
        this.titulo = pTitulo;
        this.isbn = pIsbn;
        this.cantidadLibros = pCantidadLibros;
        this.autor = pAutor;
        
        cantidadLibros++;

    }

    public static int getCantidadLibros(){
        return cantidadLibros;
    }

    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: " + titulo);
        sb.append("ISBN: " + isbn);
        sb.append("Cantidad de Libros: " + cantidadLibros);
        sb.append("Autor: " + autor);
        return sb.toString();

    }
    

}