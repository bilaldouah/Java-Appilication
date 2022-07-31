/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rh;



/**
 *
 * @author DOUAH
 */
import java.time.LocalDateTime;
public class heureSupplémentaire {
       private int id_heure_supp;
       private String cin_emp;
       private LocalDateTime date_heure_supp;
       private int nbr_heure_supp;    
       private LocalDateTime heure_entrée;
       private LocalDateTime heure_de_sortie;
       private LocalDateTime heure_de_pause;
       private LocalDateTime heure_de_pause_entrée;
    
    public heureSupplémentaire(String cin_emp, LocalDateTime date_heure_supp,int nbr_heure_supp , LocalDateTime heure_entrée,LocalDateTime heure_de_sortie, LocalDateTime heure_de_pause,LocalDateTime heure_de_pause_entrée)
    {   
        this.cin_emp=cin_emp;
        this.date_heure_supp=date_heure_supp;
        this.nbr_heure_supp=nbr_heure_supp;
        this.heure_entrée=heure_entrée;
        this.heure_de_sortie=heure_de_sortie;
        this.heure_de_pause=heure_de_pause;
        this.heure_de_pause_entrée=heure_de_pause_entrée;
    } 
}
