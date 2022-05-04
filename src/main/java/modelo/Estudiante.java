package modelo;

/**
 *
 * @author david
 */
public class Estudiante {

    //Atributos
    String nombre;
    String matricula;
    String carrera;
    String correo;

    //Constructores
    public Estudiante(String nombre, String matricula, String carrera, String correo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.correo = correo;
    }

    public Estudiante() {
    }

    //Getters and Setters
    //Metodo para obtener información
    public String getNombre() {
        return nombre;
    }

    //Metodo para asignar nueva informacion
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo para obtener información
    public String getMatricula() {
        return matricula;
    }

    //Metodo para asignar nueva informacion
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Metodo para obtener información
    public String getCarrera() {
        return carrera;
    }

    //Metodo para asignar nueva informacion
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //Metodo para obtener información
    public String getCorreo() {
        return correo;
    }

    //Metodo para asignar nueva informacion
    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
