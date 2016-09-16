/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author LUCYLEONOR
 */
public class Fraccionario {
    private int numerador;
    private int denominador;
    private int entero;

    public Fraccionario(int numerador, int denominador)  {
        this.numerador = numerador;
        this.denominador = denominador;
        
    }
    public Fraccionario(int numerador, int denominador, int entero)  {
        this.numerador = numerador;
        this.denominador = denominador;
        this.entero = entero;
        
    }
    

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccionario suma(Fraccionario f2)  {
        int num, den;
        Fraccionario f;
        num = this.numerador * f2.denominador + this.denominador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Fraccionario(num, den);
        return f;
    }

    public Fraccionario resta(Fraccionario f2)  {
        int num, den;
        Fraccionario f;
        num = this.numerador * f2.denominador - this.denominador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Fraccionario(num, den);
        return f;
    }

    public Fraccionario multiplicacion(Fraccionario f2)  {
        int num, den;
        Fraccionario f;
        num = this.numerador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Fraccionario(num, den);
        return f;

    }
    
    public Fraccionario division(Fraccionario f2) {
        int num, den;
        Fraccionario f;
        num = this.numerador * f2.denominador;
        den = this.denominador * f2.numerador;
        f = new Fraccionario(num, den);
        return f;
    }
    
    public void ConvertirMixto(){
        int num, ent, den;
        num = this.getNumerador() % this.getDenominador();
        ent = this.getNumerador() / this.getDenominador();
        den = this.getDenominador();
        
        this.numerador = num;
        this.denominador = ent;
       
    }
}
