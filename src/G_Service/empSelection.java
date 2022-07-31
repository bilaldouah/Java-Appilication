/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rh;

/**
 *
 * @author DOUAH
 */
public class empSelection {
    public int id_emp;
    public int id_fonction;
    public empSelection(int idEmp,int idF)
    {
        this.id_emp=idEmp;
        this.id_fonction=idF;
    }
    public void print()
    {
        System.out.println("id employer="+id_emp+" id Fonction="+id_fonction);
    }
}
