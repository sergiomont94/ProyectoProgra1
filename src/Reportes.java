/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SergioAlejandro
 */
public class Reportes {
    private String nombre;
    private String dificultad;
    private String enemigo;
    private String usuario;
    
  public Reportes(){
      nombre = log.getLogin;
      dificultad = log.getDificultad;
      enemigo = log.getEnemigo;
     }
  
    public Reportes(String nom,String difi,String ene){
        nombre = nom;
        dificultad = difi;
        enemigo = ene;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setDificultad(String d){
        dificultad = d;
    }
    
    public void setEnemigo(String e){
        enemigo = e;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    
}
