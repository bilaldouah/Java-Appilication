/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rh;

/**
 *
 * @author DOUAH
 */
public class empModel {
    public String Cin_emp;
    public String nom_emp;
    public String prenom_emp;
    public int id_fonction;
    public String nom_service;
    public empModel(String Cin_emp, String nom, String prenom, int id_fon,String nom_ser)
    {
        this.Cin_emp=Cin_emp;
        this.nom_emp=nom;
        this.prenom_emp=prenom;
        this.id_fonction=id_fon;
        this.nom_service=nom_ser;
    }
    
}
