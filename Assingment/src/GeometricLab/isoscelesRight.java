/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometricLab;

/**
 *
 * @author jhon carlo
 */
public class isoscelesRight extends triangle2 {
    double SideA, SideB, SideC, SideD, equalSide, notequalSide, ans;

        public isoscelesRight (double x){
            ans = x*Math.sqrt(2.0);
            
        }
        
        public double getsideA(){
            return sideA;
        }
        
        public double getsideB(){
            return sideB;
        }
        
        public double getsideC(){
            return sideC;
        }
        
        

        public double getEqualSide() {

            return equalSide;
        }
        
        public double  getNotEqualSide() {
            return notequalSide;
        }
        
        public void Equal(){
            
        }
        
        
        public String toString(){
            return "[IsoscelesRight: equal size = " + getEqualSide() + " not equal size = " + ans + "]";
        }
    
}
