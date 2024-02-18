/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

/**
 *
 * @author 58414
 */
public class Helpers {
    private boolean isNumber(String num){
        return num.matches("[0-9]*");
    }
    
    private boolean isDecimal(String num){
        try{
           Double.parseDouble(num);
           return true;
        }catch(NumberFormatException nfe){
            return false;
        }
    }
    
    private double validateDecimalNumbers(String num){
        if(isDecimal(num)){
            double number = Double.parseDouble(num);
            if(number>=0){
                return number;
            }else{
                return -1;
            }
        }else{
            return -1;
        }
    }
    
    private double validateNumber(String num){
        if(isNumber(num)==true){
            int number = Integer.parseInt(num);
            return number;
        }else{
            return -1;
        }
    }
    
}
