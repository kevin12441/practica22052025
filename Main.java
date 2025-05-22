public class Main {
       public static void main(String[] args) {
          operacion op = new operacion();
        
        // Test the Sumar method with two integers
        int result1 = op.Sumar(5, 10);
        System.out.println("Resultado de la suma de enteros: " + result1);
        
        // Test the Sumar method with two doubles
        double result2 = op.Sumar(5.5, 10.5);
        System.out.println("Resultado de la suma de dobles: " + result2);
        
        // Test the Sumar method with three integers
        int result3 = op.Sumar(5, 10, 15);
        System.out.println("Resultado de la suma de tres enteros: " + result3);
        
        // Test the Sumar method with negative integers
        int result4 = op.Sumar(-5, 10);
        System.out.println("Resultado de la suma con un número negativo: " + result4);

        op.imprimirNumeroImpares(5);
    }
    opcion opcion = opcion.SUMA;
    switch(opcion) {
        case SUMA:
            System.out.println("La opción seleccionada es Suma");
            break;
        case RESTA:
            System.out.println("La opción seleccionada es Resta");
            break;
        case MULTIPLICACION:
            System.out.println("La opción seleccionada es Multiplicación");
            break;
        case DIVISION:
            System.out.println("La opción seleccionada es División");
            break;
    }
    
}
