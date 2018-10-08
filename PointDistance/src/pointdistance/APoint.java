/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointdistance;

/**
 *
 * @author Anum
 */
public class APoint {
    
    private int x;
    private int y;
    public APoint(){
        this.x=x;
        this.y=y;
    }
    public APoint(int x,int y){
        this.x=x;
        this.y=y;
    }

        
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    @Override
    public String toString(){
    return "Point("+"x="+x+"y="+y+")";
}
    
           
}

    


        