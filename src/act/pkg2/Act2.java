/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.pkg2;

/**
 *
 * @author Salvador
 */
public class Act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = factorial(10);
        System.out.println("El factorial de 10 es "+num);
        int [] vector1 = new int[]{10,20,30,20};
        int resultado = suma_vector(vector1, vector1.length-1);
        System.out.println(resultado);
        int [] vector2 = new int[]{10,20,30,20};
        int resultado2 = mult_vector(vector2, vector2.length-1);
        System.out.println(resultado2);
    }
    public static int suma_vector(int [] v, int t)
    {
        if(t==0)
        {
            return v[t];
        }
        else
        {
            System.out.println("Posición: "+t);
            return suma_vector(v, t-1)+v[t];
        }
    }
    public static int mult_vector(int [] v, int t)
    {
        if(t==0)
        {
            return v[t];
        }
        else
        {
            System.out.println("Posición: "+t);
            return mult_vector(v, t-1)*v[t];
        }
    }
    public static int factorial (int n)
    {
        if (n==0)
        {
            return 1;
        }
        else
        {
            System.out.println(n);
            return n*(factorial(n-1));
        }
    }
}
