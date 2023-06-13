package modelo;

import java.util.Random;

public abstract class Util
{
    private static Random r = new Random();

    public Util(){

    }

    public static void espera(int milisegundos)
    {
        try
        {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void espera()
    {
        modelo.Util.espera(r.nextInt(1000));
    }

}
