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
public class Point {
    MyLine begin,end;
    public Point (int x1,int y1,int x2,int y2){
        begin =new MyLine (x1,y1);
        end =new MyLine (x2,y2); 
    }
 }
