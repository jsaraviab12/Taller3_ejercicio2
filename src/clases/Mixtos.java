/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jesus
 */
public class Mixtos {
  private int numerador;
private int denominador;
private int entero;

public Mixtos(int numerador,int denominador, int entero){
  this.denominador = denominador;
   this.numerador = numerador;
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

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }
    public Mixtos sumar(Mixtos m2){
      int numerador,denominador,entero,suma,mixto1,mixto2,denomix1,denomix2,suma2;
      Mixtos m;
      mixto1=(this.denominador*this.entero)+this.numerador;
      denomix1=this.denominador;
      mixto2=(m2.denominador*m2.entero)+m2.numerador;
      denomix2=m2.denominador;
      suma=(mixto1*denomix2)+(mixto2*denomix1);
      suma2=denomix1*denomix2;
      entero=suma/suma2;
      numerador=suma%entero;
      denominador=suma2;
      m =new Mixtos(numerador,denominador,entero);
      return m;
      
    }
    public Mixtos restar(Mixtos m2){
        int numerador,denominador,entero,resta,mixto1,mixto2,denomix1,denomix2,resta2;
      Mixtos m;
      
      mixto1=(this.denominador*this.entero)+this.numerador;
      denomix1=this.denominador;
      mixto2=(m2.denominador*m2.entero)+m2.numerador;
      denomix2=m2.denominador;
      
         resta=(mixto1*denomix2)-(mixto2*denomix1);
         resta2=denomix1*denomix2;
      
           entero=resta/resta2;
           numerador=resta%entero;
           denominador=resta2;
      
           m =new Mixtos(numerador,denominador,entero);
           return m;
    }
    public Mixtos multpiplicar(Mixtos m2){
      int numerador,denominador,entero,multi,mixto1,mixto2,denomix1,denomix2,multi2;
      Mixtos m  ;
      
      mixto1=(this.denominador*this.entero)+this.numerador;
      denomix1=this.denominador;
      mixto2=(m2.denominador*m2.entero)+m2.numerador;
      denomix2=m2.denominador;
      
      multi=mixto1*mixto2;
      multi2=denomix1*denomix2;
      
           entero=multi/multi2;
           numerador=multi%entero;
           denominador=multi2;
           
            m =new Mixtos(numerador,denominador,entero);
           return m;
    }
     public Mixtos dividir(Mixtos m2){
      int numerador,denominador,entero,divi,mixto1,mixto2,denomix1,denomix2,divi2;
      Mixtos m  ;
      
      mixto1=(this.denominador*this.entero)+this.numerador;
      denomix1=this.denominador;
      mixto2=(m2.denominador*m2.entero)+m2.numerador;
      denomix2=m2.denominador;
      
      divi= mixto1*denomix2;
      divi2=mixto2*denomix1;
      
      entero=divi/divi2;
      numerador=divi%entero;
      denominador=divi2;
      
      m =new Mixtos(numerador,denominador,entero);
           return m;
     }   
}
