/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taylor;

import java.math.BigDecimal;

/**
 *
 * @author Ryan
 */
public class SumModel {
    private String errorFirstNumber = "";
    private String errorSecoundNumber = "";
    public String giveAnswer(String numberOne, String numberTwo){
        BigDecimal numOne = validateNumber(numberOne, "firstNumber");
        BigDecimal numTwo = validateNumber(numberTwo, "secoundNumber");
        BigDecimal answerNum = numTwo.add(numOne);
              
        String answer = "Result: "+numOne+" + "+numTwo+" = "+answerNum;
        
        return answer;
    }
    
    public BigDecimal validateNumber(String number, String error ){
        BigDecimal result;
        try{
            result = new BigDecimal(number);
        }
        catch(NumberFormatException e){
            if(error == "firstNumber"){
                errorFirstNumber = number+" is not a number";
            }
            else if(error == "secoundNumber"){
                errorSecoundNumber = number+" is not a number";
            }
            result = new BigDecimal("0");
        }
        return result;
    }
    
    public String getErrorFirstNumber(){
        return errorFirstNumber;
    }
    public String getErrorSecoundNumber(){
        return errorSecoundNumber;
    }
}
