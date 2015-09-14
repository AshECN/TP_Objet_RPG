/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 * Super classe personnage
 * @author Hicham
 */
public class Personnage {
    
    // Attributs
    private int ptVie ;
    private int ptMana ;
    private int pourcentageAtt ;
    private int pourcentagePar ;
    private int pourcentageMag ;
    private int pourcentageResistMag ;
    private int degAtt ;
    private int degMag ;
    private int distAttMax ;
    private Point2D pos ;
    
    // Constructeurs
    public Personnage () {
        // Constructeur de personnage générique
        this.ptVie = 100 ;
        this.ptMana = 100 ;
        this.pourcentageAtt = 50 ;
        this.pourcentagePar = 50 ;
        this.pourcentageMag = 50 ;
        this.pourcentageResistMag = 50 ;
        this.degAtt = 20 ;
        this.degMag = 20 ;
        this.distAttMax = 3 ;
        this.pos = new Point2D(0,0) ;
    }
    
    public Personnage (Personnage perso){
        // Constructeur de personnage par copie
        this.ptVie = perso.ptVie ;
        this.ptMana = perso.ptMana ;
        this.pourcentageAtt = perso.pourcentageAtt ;
        this.pourcentagePar = perso.pourcentagePar ;
        this.pourcentageMag = perso.pourcentageMag ;
        this.pourcentageResistMag = perso.pourcentageResistMag ;
        this.degAtt = perso.degAtt ;
        this.degMag = perso.degMag ;
        this.distAttMax = perso.distAttMax ;
        this.pos = perso.pos ;        
    }
    
    public Personnage (int pV, int pM, int pA, int pP, int pctM, int rM, int dA, int dM, int distMax, Point2D pos){
        // Constructeur de personnage customisé
        this.ptVie = pV ;
        this.ptMana = pM ;
        this.pourcentageAtt = pA ;
        this.pourcentagePar = pP ;
        this.pourcentageMag = pctM ;
        this.pourcentageResistMag = rM ;
        this.degAtt = dA ;
        this.degMag = dM ;
        this.distAttMax = distMax ;
        this.pos = pos ;        
    }
    
    // Méthodes
        // Affectation
    public void setPtVie (int pV){
        this.ptVie = pV ;
    }
    
    public void setPtMana (int pM){
        this.ptMana = pM ;
    }
    
    public void setPourcentageAtt (int pA){
        this.pourcentageAtt = pA ;
    }
    
    public void setPourcentagePar (int pctM){
        this.pourcentagePar = pctM ;
    }    

     public void setPourcentageMag (int pA){
     this.pourcentageAtt = pA ;
    }
    
}
