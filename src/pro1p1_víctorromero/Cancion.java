package pro1p1_víctorromero;

public class Cancion {

    private String nombre;
    private String album;
    private String artista;
    private int año;
    private int duracion;

    public Cancion(String nombre, String album, String artista, int año, int duracion) {
        this.nombre = nombre;
        this.album = album;
        this.artista = artista;
        this.año = año;
        this.duracion = duracion;
    } // Constructor
  
    
    public String getNombre() {
        return nombre;
    } // Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }// Getter

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Nombre de la Cancion: " + nombre + "\n"
                + "Nombre del Album: " + album + "\n"
                + "Nombre del Artista: " + artista + "\n"
                + "El A\u00f1o de Creacion: " + año + "\n"
                + "La Duracion de la Cancion es: " + duracion + "\n\n";
    }
    
}
