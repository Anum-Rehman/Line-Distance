/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointdistance;

import java.util.Scanner;

/**
 *
 * @author Anum
 */
public class Line {
    APoint point=new APoint();
    private APoint begin,end;
    int beginX,beginY,EndX,EndY;
    public Line(){
        this.begin = begin;
        this.end = end;
        this.beginX=beginX;
        this.beginY=beginY;
        this.EndX=EndX;
        this.EndY=EndY;
    }
    
    public APoint getbegin(){
        return begin;
    }
    public void setbegin(APoint begin){
        this.begin=begin;
    }
    public APoint getend(){
        return end;
    }
    public void setend(APoint end){
        this.end=end;
    }
    public int getBeginX(){
        return beginX;
    }
    public void setBeginX(int beginX){
        this.beginX=beginX;
    }
    public int getBeginY(){
        return beginY;
    }
    public void setBeginY(int beginY){
        this.beginY=beginY;
    }
    public void setBeginXY(int BeginX,int BeginY){
        
    }
    public int getEndX(){
        return EndX;
    }
    public void setEndX(int EndX){
        this.EndX=EndX;
    }
    public int getEndY(){
        return EndY;
    }
    public void setEndY(int EndY){
        this.EndY=EndY;
    }
    public void setEndXY(int EndX,int EndY){
        
    }
    public Line (int beginX,int beginY,int EndX,int EndY){
        begin =new APoint (beginX,beginY);
        end =new APoint (EndX,EndY); 
    }
    public double distance(){
        double distance=Math.sqrt((this.EndX-this.beginX)*(this.EndX-this.beginX)+(this.EndY-this.beginY)*(this.EndY-this.beginY));
        return distance;
    }
    @Override
    public String toString(){
        return "(x1,y1)="+"("+this.beginX+","+this.beginY+")"+" "+"and"+" "+"(x2,y2)="+"("+this.EndX+","+this.EndY+")";
    }
}
