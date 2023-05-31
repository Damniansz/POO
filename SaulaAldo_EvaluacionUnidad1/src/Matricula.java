
public class Matricula {//Se definene atributos private
	private Profesor profesor;
    private Alumno alumno;
    private Materia materia;

    public Matricula(Profesor profesor, Alumno alumno, Materia materia) {//Se usa el metodo get y set 
        this.profesor = profesor;
        this.alumno = alumno;
        this.materia = materia;
    }
//Retorna los atributos ingresados
    public Profesor getProfesor() {
        return profesor;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }


}
