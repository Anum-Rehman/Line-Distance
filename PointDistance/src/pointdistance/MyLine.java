/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointdistance;

import static com.sun.org.apache.xalan.internal.lib.ExsltSets.difference;

/**
 *
 * @author Anum
 */
public class MyLine {
    
    private int x;
    private int y;
    public MyLine(int x,int y){
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
    public boolean difference(Object obj){
      MyLine p=(MyLine) obj;
      p.x=x;
      p.y=y;
      return true;
    }
    
        @Override
    public String toString(){
    return "Point("+"x="+x+"y="+y+")";
}
}    
           


    

