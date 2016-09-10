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
  private int Numerador;
private int Denominador;
private int Entero;

public Mixtos(int numerador,int denominador, int entero)throws DenominadorCeroException{
  this.Denominador = denominador;
   this.Numerador = numerador;
this.Entero = entero;   
        if (Denominador == 0){
            throw new DenominadorCeroException();
        }
}    

    public int getNumerador() {
        return Numerador;
    }

    public void setNumerador(int numerador) {
        this.Numerador = numerador;
    }

    public int getDenominador() {
        return Denominador;
    }

    public void setDenominador(int denominador) {
        this.Denominador = denominador;
    }

    public int getEntero() {
        return Entero;
    }

    public void setEntero(int entero) {
        this.Entero = entero;
    }
    public Mixtos sumar(Mixtos m2)throws DenominadorCeroException{
      int numerador,denominador,entero,suma,mixto1,mixto2,denomix1,denomix2,suma2;
      Mixtos m;
      mixto1=(this.Denominador*this.Entero)+this.Numerador;
      denomix1=this.Denominador;
      mixto2=(m2.Denominador*m2.Entero)+m2.Numerador;
      denomix2=m2.Denominador;
      suma=(mixto1*denomix2)+(mixto2*denomix1);
      suma2=denomix1*denomix2;
      entero=suma/suma2;
      numerador=suma%entero;
      denominador=suma2;
      m =new Mixtos(numerador,denominador,entero);
      return m;
      
    }
    public Mixtos restar(Mixtos m2)throws DenominadorCeroException{
        int numerador,denominador,entero,resta,mixto1,mixto2,denomix1,denomix2,resta2;
      Mixtos m;
     
      mixto1=(this.Denominador*this.Entero)+this.Numerador;
      denomix1=this.Denominador;
      mixto2=(m2.Denominador*m2.Entero)+m2.Numerador;
      denomix2=m2.Denominador;
      
         resta=(mixto1*denomix2)-(mixto2*denomix1);
         resta2=denomix1*denomix2;
      
           entero=resta/resta2;
           numerador=resta%entero;
           denominador=resta2;
      
           m =new Mixtos(numerador,denominador,entero);
           return m;
    }
    public Mixtos multpiplicar(Mixtos m2)throws DenominadorCeroException{
      int numerador,denominador,entero,multi,mixto1,mixto2,denomix1,denomix2,multi2;
      Mixtos m  ;
      
      mixto1=(this.Denominador*this.Entero)+this.Numerador;
      denomix1=this.Denominador;
      mixto2=(m2.Denominador*m2.Entero)+m2.Numerador;
      denomix2 =m2.Denominador;
      
      multi=mixto1*mixto2;
      multi2=denomix1*denomix2;
      
           entero=multi/multi2;
           numerador=multi%entero;
           denominador=multi2;
           
            m =new Mixtos(numerador,denominador,entero);
           return m;
    }
     public Mixtos dividir(Mixtos m2)throws DenominadorCeroException{
      int numerador,denominador,entero,divi,mixto1,mixto2,denomix1,denomix2,divi2;
      Mixtos m  ;
      
      mixto1=(this.Denominador*this.Entero)+this.Numerador;
      denomix1=this.Denominador;
      mixto2=(m2.Denominador*m2.Entero)+m2.Numerador;
      denomix2 =m2.Denominador;
      
      divi= mixto1*denomix2;
      divi2=mixto2*denomix1;
      
      entero=divi/divi2;
      numerador=divi%entero;
      denominador=divi2;
      
      m =new Mixtos(numerador,denominador,entero);
           return m;
     }   
}
