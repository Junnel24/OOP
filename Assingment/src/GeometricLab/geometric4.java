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
public class geometric4 {
    
     public geometric4(){
          isoscelesRight isoC = new isoscelesRight(3.0);
          
          isoC.sideA=3.0;
          isoC.equalSide=isoC.sideA;
          isoC.sideB=isoC.sideA;
          isoC.sideC=isoC.getNotEqualSide();
          System.out.println("IsoscelesRight c: " + isoC.toString());
          System.out.println("IsoscelesRight c area : " + isoC.getArea());
          
          isoscelesRight isoD = new isoscelesRight(3.0);
          
          isoD.sideA=3.0;
          isoD.equalSide=isoD.sideA;
          isoD.sideB=isoD.sideA;
          isoD.sideC=isoD.getNotEqualSide();
          System.out.println("IsoscelesRight d: " + isoD.toString());
          System.out.println("IsoscelesRight d area : " + isoD.getArea());
          
          System.out.print("Check if IsoscelesRight c and IsoscelesRight d are Equal? ");
          if(isoC.getArea()==isoD.getArea()){
              System.out.println("True");
          }
          else 
              System.out.println("False");
      }
    
}
