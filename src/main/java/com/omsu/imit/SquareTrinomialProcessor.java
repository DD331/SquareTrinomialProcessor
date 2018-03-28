package com.omsu.imit;

public class SquareTrinomialProcessor {
    private SquareTrinomial equation;
    public SquareTrinomialProcessor(double a,double b,double c){
        equation = new SquareTrinomial(a,b,c);
    }
    public double maxDecision(){
        double[] res = equation.solveEquetion();
        if(res.length==2){
            if(res[0]>res[1]){
                return res[0];
            }else{
                return res[1];
            }
        }else{
            if(res.length==1){
                return res[0];
            }else{
                throw new IllegalArgumentException("Корней нет!");
            }
        }
    }
}