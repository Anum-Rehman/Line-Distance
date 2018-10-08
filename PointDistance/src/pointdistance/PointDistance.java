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
public class PointDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Line myLine=new Line();
        System.out.println("Enter values of x1,x2,y1,y2");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of x1");
        int a=myLine.getBeginX();
        a=sc.nextInt();
        System.out.println("Enter Value of y1");
        int b=myLine.beginY;
        b=sc.nextInt();
        System.out.println("Enter Value of x2");
        int c=myLine.EndX;
        c=sc.nextInt();
        System.out.println("Enter Value of y2");
        int d=myLine.EndY;
        d=sc.nextInt();
        myLine.setBeginX(a);
        myLine.setBeginY(b);
        myLine.setEndX(c);
        myLine.setEndY(d);
        System.out.println(myLine.toString());
        System.out.println("Distance between two lines are:"+myLine.distance());
    }}

