package RecuperacionPracticas2Eva;

public class Libro extends Obra {
    private int npaginas;

    public Libro(String titulo, String any, int n) {
        super(titulo, any);
        this.npaginas = n;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + getTitulo() + ", anyo=" + anyo + ", npaginas=" + npaginas + "]";
    }

   
}
