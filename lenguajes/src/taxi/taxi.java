/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxi;

/**
 *
 * @author T-102
 */


public class taxi { //El nombre de la clase
 
    private String ciudad; //Ciudad de cada objeto taxi
    private String matricula; //Matrícula de cada objeto taxi
    private String distrito; //Distrito asignado a cada objeto taxi
    private int tipoMotor; //Tipo de motor asignado a cada objeto taxi. 0 = desconocido, 1 = gasolina, 2 = diesel
 
    //Constructor: cuando se cree un objeto taxi se ejecutará el código que incluyamos en el constructor
    public taxi (String valorMatricula, String valorDistrito, int valorTipoMotor) {
        ciudad = "México D.F.";
        matricula = valorMatricula;
        distrito = valorDistrito;
        tipoMotor = valorTipoMotor;
    } //Cierre del constructor
 
      //Método para obtener la matrícula del objeto taxi
    public String getMatricula () { return matricula; } //Cierre del método
 
    //Método para obtener el distrito del objeto taxi
    public String getDistrito () { return distrito; } //Cierre del método  
 
    //Método para obtener el tipo de motor del objeto taxi
    public int getTipoMotor () { return tipoMotor; } //Cierre del método
 
}