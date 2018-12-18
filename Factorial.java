
package factorial;


public class Factorial {


    public static void main(String[] args) {


    int numeroJ;
    int numeroF;

  
   numeroJ = 8;    
   

    
   int contador;
   if (numeroJ == 0)
numeroF = 1;
   else
   {
numeroF = 1;
for (contador = numeroJ; contador >= 1; contador--)
{
    numeroF = numeroF * contador;
}
   }    
  
 

System.out.println(numeroF); 


    }
    
}
