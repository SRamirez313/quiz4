
package quiz4;
import javax.swing.JOptionPane;

class Estudiante {
    private String nombre;
    private String curso;
    private String profesor;
    private int calificacion;

    // Constructor
    public Estudiante(String nombre, String curso, String profesor, double calificacion) {
        this.nombre = nombre;
        this.curso = curso;
        this.profesor = profesor;
        this.calificacion = (int) calificacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = (int) calificacion;
    }
}

public class Quiz4 {
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("juan", "matematicas", "eduardo", 95);
        Estudiante estudiante2 = new Estudiante("maria", "español", "julian", 88);
        Estudiante estudiante3 = new Estudiante("pedro", "ciencias", "iniesta", 91);
        Estudiante estudiante4 = new Estudiante("roberto", "estudios sociales", "pepe", 82);
        Estudiante estudiante5 = new Estudiante("alberto", "informatica", "victor", 78);
        Estudiante estudiante6 = new Estudiante("jose", "programacion", "valentina", 86);
        Estudiante estudiante7 = new Estudiante("samuel", "fisica", "sofia", 75);
        Estudiante estudiante8 = new Estudiante("mohammed", "ingles", "tony", 98);
        Estudiante estudiante9 = new Estudiante("benito", "artes plasticas", "julio", 93);
        Estudiante estudiante10 = new Estudiante("kimberly", "hogar", "josefina", 90);
        
        
        System.out.println("Listado general de estudiantes:");
        mostrarEstudiante(estudiante1);
        mostrarEstudiante(estudiante2);
        mostrarEstudiante(estudiante3);
        mostrarEstudiante(estudiante4);
        mostrarEstudiante(estudiante5);
        mostrarEstudiante(estudiante6);
        mostrarEstudiante(estudiante7);
        mostrarEstudiante(estudiante8);
        mostrarEstudiante(estudiante9);
        mostrarEstudiante(estudiante10);
        
       
        Estudiante estudianteMayor = NotaMayor(estudiante1, estudiante2, estudiante3, estudiante4, estudiante5, estudiante6, estudiante6, estudiante7, estudiante8, estudiante9, estudiante10);
        JOptionPane.showMessageDialog(null,"Estudiante con la nota mayor: " + estudianteMayor.getNombre());

        Estudiante estudianteMenor = NotaMenor(estudiante1, estudiante2, estudiante3, estudiante4, estudiante5, estudiante6, estudiante6, estudiante7, estudiante8, estudiante9, estudiante10);
        JOptionPane.showMessageDialog(null,"Estudiante con la nota menor: " + estudianteMenor.getNombre());
    }
    
    private static void mostrarEstudiante(Estudiante estudiante) {
        JOptionPane.showMessageDialog(null,estudiante.getNombre() + " / Curso: " + estudiante.getCurso() + " / Profesor: " + estudiante.getProfesor() +" / Calificación: " + estudiante.getCalificacion()); 
    }

    private static Estudiante NotaMayor(Estudiante... estudiantes) {
        Estudiante estudianteMayor = estudiantes[0];
        for (int i = 1; i < estudiantes.length; i++) {
            if (estudiantes[i].getCalificacion() > estudianteMayor.getCalificacion()) {
                estudianteMayor = estudiantes[i];
            }
        }
        return estudianteMayor;
    }

    private static Estudiante NotaMenor(Estudiante... estudiantes) {
        Estudiante estudianteMenor = estudiantes[0];
        for (int i = 1; i < estudiantes.length; i++) {
            if (estudiantes[i].getCalificacion() < estudianteMenor.getCalificacion()) {
                estudianteMenor = estudiantes[i];
            }
        }
        return estudianteMenor;
    }
}
  