
import java.util.Scanner;

/**
 * Programa para encontrar el impuesto a pagar y precio neto de un carro segun el tipo  * 
 * @author Jeimmy Naranjo   
 * @version 1
 */
public class PrincipalImpuesto  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada
        char Vehiculo;
        int PrecioBruto;

        // Datos de salida
        int ImpPaga, PrecioNeto;
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese el tipo de vehiculo:\n(A = Automovil y C = Camioneta)\n");
        Vehiculo = teclado.next().charAt(0); //Leer el primer caracter
        System.out.print("Ingrese el precio bruto:\n");
        PrecioBruto = teclado.nextInt();

        int ValorV = (int)Vehiculo;

        if (ValorV == 65)
        {
            if (PrecioBruto < 20)
            {
                System.out.print("Impuesto a pagar: 5 \n");
                System.out.print("Precio Neto:  " + (PrecioBruto + 5));
            }

            if (PrecioBruto >= 20 && PrecioBruto <= 40)
            {
                ImpPaga = PrecioBruto / 5;
                PrecioNeto = PrecioBruto + ImpPaga;
                System.out.print("Impuesto a pagar: " + ImpPaga + "  Precio Neto:  " + PrecioNeto);

            }

            if (PrecioBruto > 40)
            {
                System.out.print("Impuesto a pagar: 9 \n");
                System.out.print("Precio Neto:  " + (PrecioBruto + 9));
            }
        }

        if (ValorV == 67)
        {
            if (PrecioBruto < 80)
            {
                System.out.print("Impuesto a pagar: 0 \n");
                System.out.print("Precio Neto:  " + PrecioBruto );
            }

            if (PrecioBruto >=80)
            {
                ImpPaga = PrecioBruto / 2;
                PrecioNeto = PrecioBruto + ImpPaga;
                System.out.print("Impuesto a pagar:  " + ImpPaga );
                System.out.print(" Precio Neto:  " + PrecioNeto);
            }    
        }

        
    }
} 