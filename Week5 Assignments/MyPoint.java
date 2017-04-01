/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekFiveAssignments;



public class MyPoint {

    public MyPoint(int par, double par1) {
    }
       public static void main(String[] args) {

        MyPoint p1 = new MyPoint(10, 30.5);
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(1, 0));

    }

    private boolean distance(MyPoint p2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean distance(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

