package pro1p1_víctorromero;

public class Cancion2 {

    private String nombre;
    private String album;
    private String artista;

    public Cancion2(String nombre, String album, String artista) {
        this.nombre = nombre;
        this.album = album;
        this.artista = artista;
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

    @Override
    public String toString() {
        return "Nombre de la Cancion: " + nombre + "\n"
                + "Nombre del Album: " + album + "\n"
                + "Nombre del Artista: " + artista + "\n\n";
    }
}
