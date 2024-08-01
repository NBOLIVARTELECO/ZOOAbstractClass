/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoo;

public class Animales {
    String Animal;
    String Dieta;
    String Horario;

    public Animales(String Animal, String Dieta, String Horario) {
        this.Animal = Animal;
        this.Dieta = Dieta;
        this.Horario = Horario;
    }

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String Animal) {
        this.Animal = Animal;
    }

    public String getDieta() {
        return Dieta;
    }

    public void setDieta(String Dieta) {
        this.Dieta = Dieta;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
    
    
}
