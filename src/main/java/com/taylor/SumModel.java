/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taylor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Ryan
 */
public class SumModel implements Serializable{
    private String errorFirstNumber;
    private String errorSecoundNumber;
    private String answer;
    
    public SumModel() {
        answer= "";
        errorSecoundNumber = "";
        errorFirstNumber = "";
    }

    public String getErrorFirstNumber() {
        return errorFirstNumber;
    }

    public void setErrorFirstNumber(String errorFirstNumber) {
        this.errorFirstNumber = errorFirstNumber;
    }

    public String getErrorSecoundNumber() {
        return errorSecoundNumber;
    }

    public void setErrorSecoundNumber(String errorSecoundNumber) {
        this.errorSecoundNumber = errorSecoundNumber;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String numberOne, String numberTwo) {
        BigDecimal numOne = validateNumber(numberOne, "firstNumber");
        BigDecimal numTwo = validateNumber(numberTwo, "secoundNumber");
        BigDecimal answerNum = numTwo.add(numOne);
        
        this.answer = "Result: "+numOne+" + "+numTwo+" = "+answerNum;
    }
    
    public BigDecimal validateNumber(String number, String error ){
        BigDecimal result;
        if(number == null || number.equals("")) {
            number = "0";
        }
        try{
            result = new BigDecimal(number);
        }
        catch(NumberFormatException e){
            if(error == "firstNumber"){
                setErrorFirstNumber(number+" is not a number");
            }
            else if(error == "secoundNumber"){
                setErrorSecoundNumber(number+" is not a number");
            }
            result = new BigDecimal("0");
        }
        return result;
    }
}
