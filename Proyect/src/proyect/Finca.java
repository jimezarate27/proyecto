/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect;

/**
 *
 * @author USUARIO
 */
public class Finca {
    public String NombreFinca;
    public String Ubicacion;
    public String NombreEncargado;
    public String IdEncargado;
    public String TelEncargado;
    public int CantPotrero;
    public String TamañoFinca;
    public int CantAnimales;
    
    public Potrero[] Potreros; 
    

    public Finca(String NombreFinca, String Ubicacion, String NombreEncargado, String IdEncargado, String TelEncargado, int CantPotrero, String TamañoFinca, int CantAnimales) {
        this.NombreFinca = NombreFinca;
        this.Ubicacion = Ubicacion;
        this.NombreEncargado = NombreEncargado;
        this.IdEncargado = IdEncargado;
        this.TelEncargado = TelEncargado;
        this.CantPotrero = CantPotrero;
        this.TamañoFinca = TamañoFinca;
        this.CantAnimales = CantAnimales;
       
    }

    public String getNombreFinca() {
        return NombreFinca;
    }

    public void setNombreFinca(String NombreFinca) {
        this.NombreFinca = NombreFinca;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getNombreEncargado() {
        return NombreEncargado;
    }

    public void setNombreEncargado(String NombreEncargado) {
        this.NombreEncargado = NombreEncargado;
    }

    public String getIdEncargado() {
        return IdEncargado;
    }

    public void setIdEncargado(String IdEncargado) {
        this.IdEncargado = IdEncargado;
    }

    public String getTelEncargado() {
        return TelEncargado;
    }

    public void setTelEncargado(String TelEncargado) {
        this.TelEncargado = TelEncargado;
    }

    public int getCantPotrero() {
        return CantPotrero;
    }

    public void setCantPotrero(int CantPotrero) {
        this.CantPotrero = CantPotrero;
    }

    public String getTamañoFinca() {
        return TamañoFinca;
    }

    public void setTamañoFinca(String TamañoFinca) {
        this.TamañoFinca = TamañoFinca;
    }

    public int getCantAnimales() {
        return CantAnimales;
    }

    public void setCantAnimales(int CantAnimales) {
        this.CantAnimales = CantAnimales;
    }
    
}
    

	
	 