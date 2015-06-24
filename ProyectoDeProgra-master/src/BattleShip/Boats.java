/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BattleShip;

/**
 *
 * @author Jorge
 */
public class Boats {
    private int boatHp;
    private String tipodebote;
    public boolean hit;
    public boolean isBoat = false;
    public boolean isDead = false;
    public boolean gotHit = false;
    public boolean gotMoved = false;

    //constructors
    public Boats(String tipodebote)
    {
        this.hit = true;
        switch (tipodebote)
        {
            case "pa":
                this.tipodebote = "Portaaviones";
                boatHp = 5;
                isBoat = true;
                break;
            case "az":
                this.tipodebote = "Acorazado";
                boatHp = 4;
                isBoat = true;
                break;
            case "sm":
                this.tipodebote = "Submarino";
                boatHp = 3;
                isBoat = true;
                break;
            case "dt":
                this.tipodebote = "Destructor";
                boatHp = 2;
                isBoat = true;
                break;
            case "~":
                this.tipodebote = "Mar";
                isDead = true;
                break;

        }

    }
    
    public Boats(Boats another)//copy constructor
    {
        this.tipodebote = another.tipodebote;
        this.boatHp = another.boatHp;
        this.isBoat = another.isBoat;
        this.gotHit = another.gotHit;
    }

//    Boats(String pa) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    //methods
    public boolean getHit()
    {
//        if (!tipodebote.equals("Miss") && !tipodebote.equals("Mar"))
//        {

            return this.hit;
    } 
//        else if (tipodebote.equals("Mar"))
//        {
//           //wasHit = true;
//           tipodebote= "Miss";
//           isDead = true;
//        }
//
//    }

    public int getBoatHp() {
        return boatHp;
    }

    public void setBoatHp(int boatHp) {
        this.boatHp = boatHp;
    }

    public String getTipodebote() {
        return tipodebote;
    }

    public void setTipodebote(String tipodebote) {
        this.tipodebote = tipodebote;
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
        this.boatHp--;
    }

    public boolean isIsBoat() {
        return isBoat;
    }

    public void setIsBoat(boolean isBoat) {
        this.isBoat = isBoat;
    }

    public boolean isIsDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }

    public boolean isGotHit() {
        return gotHit;
    }

    public void setGotHit(boolean gotHit) {
        this.gotHit = gotHit;
    }

    public boolean isGotMoved() {
        return gotMoved;
    }

    public void setGotMoved(boolean gotMoved) {
        this.gotMoved = gotMoved;
    }
    
}
