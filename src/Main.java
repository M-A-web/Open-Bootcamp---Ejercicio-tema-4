public class Main {
    public static void main(String[] args) {

        System.out.println("Primer punto");

       int numeroIf = -1;

       if (numeroIf == 0){
           System.out.println("es 0");
       }else if (numeroIf < 0){
           System.out.println("es negativo");
       }else {
            System.out.println("es positivo");
        }

        System.out.println("Segundo punto");

       int numeroWhile = -5;
       while (numeroWhile < 3){
           System.out.println(numeroWhile);
           numeroWhile++;
    }

        System.out.println("Tercer punto");

       do{
           System.out.println(numeroWhile);
           numeroWhile++;
       }while (numeroWhile < 3);

        System.out.println("Cuarto punto");

        int numeroFor =0;

        for (;numeroFor < 4; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("Ultimo punto");

       var estacion = "VERANO";

       switch (estacion){
           case "VERANO":
           case "OTOÑO":
           case "INVIERNO":
           case "PRIMAVERA":
               System.out.println(estacion);
               break;
           default:
               System.out.println("Lo siento,esto no es una estacion");
       }



            System.out.println("Fin del ejercicio");

       }
}

