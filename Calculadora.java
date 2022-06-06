/*/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_comentada;

/**
 *
 * @author redes
 * @version versión 19/20 no para los alumnos
 * @since febrero 2020
 */
public class Calculadora {
    private int num1;
    private int num2;

 /**
 * 
 * @param a primer operador
 * @param b segundo operador
 */    
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    
/**
 * 
 * @return suma de los dos operadores
 */    
    public int suma(){
        int result=num1+num2;
        return result;
    }
    
/**
 * 
 * @return resta de los dos operadores, resultado siempre positivo
 */    
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
    
/**
 * 
 * @return true si el primer operador es el mayor, false en caso contrario
 */      
    public boolean resta2(){
        if (num1 > num2)    return true;
        else                return false;
    }
 
 /**
 * 
 * @return producto de los dos operadores
 */    
    public int multiplica(){
        int result=num1*num2;
        return result;
    }

/**
 * 
 * @return cociente de los dos operadores
 * @deprecated se usa divide2
 */    
    public int divide(){
        int result=num1/num2;
        return result;
    }
 
 /**
 * 
 * @return null si el divisor es cero o cociente de los dos operadores
 */    
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }

 /**
 * 
 * @return si el divisor NO es cero, cociente de los dos operadores
 * @throws ArithmeticException si el divisor es cero
 * @exception ArithmeticException si el divisor es cero
 */    
     public int divide0(){
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
    
}
