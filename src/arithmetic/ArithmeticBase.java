/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/**
 * This class takes String input plus,minus,divide and times from user and
 * execute the arithmetic operation change the code to use enum instead String
 * and mention the advantage of enum.
 *
 * @author sivagamasrinivasan date 30/20
 */
public class ArithmeticBase {



    public enum ArType {
        PLUS, MINUS, TIMES, DIVIDE
    }
    public String myName = "ALQASSAM_";
    public void setArtype(ArType artype) {
        this.artype = artype;
    }

    public ArType getArtype() {
        return artype;
    }

    private ArType artype;
        public double x, y;

        double calculate ( double x, double y){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: ");
        String s = sc.next().toUpperCase();
        if (s == myName + ArType.PLUS.toString()){
            return x + y;
        }else if (s == myName + ArType.MINUS.toString() ){
            return x - y;
        }else if(s == myName + ArType.TIMES.toString()){
            return x * y;
        }else if(s == myName + ArType.DIVIDE.toString()){
            return x / y;
        }else {
            throw new AssertionError("Unknown operations " + this);
        }
    }

    }

