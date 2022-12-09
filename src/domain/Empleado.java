
package domain;



public class Empleado {
    
    private String nombre;
    private int cantHorasTrabajadas;
    private double precioPorHoraTrabajada;
    double sueldoNeto; //Lo necesito para calcular las comisiones

    public Empleado() {
    }

    public double getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantHorasTrabajadas() {
        return cantHorasTrabajadas;
    }

    public void setCantHorasTrabajadas(int cantHorasTrabajadas) {
        this.cantHorasTrabajadas = cantHorasTrabajadas;
    }

    public double getPrecioPorHoraTrabajada() {
        return precioPorHoraTrabajada;
    }

    public void setPrecioPorHoraTrabajada(double precioPorHoraTrabajada) {
        this.precioPorHoraTrabajada = precioPorHoraTrabajada;
    }
 
}
