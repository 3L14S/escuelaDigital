package modelo;


public class Alumnos {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public Alumnos(int id, String nombre, String apellido, String email, int telefono){
        this.id = id;
        this.nombre = nombre;
        this.apellido= apellido;
        this.email=email;
        this.telefono=telefono;
    }
}
