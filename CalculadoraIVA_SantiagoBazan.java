
import java.util.Scanner;
public class CalculadoraIVA_SantiagoBazan {
    public static void main(String[] args){
        /*Definimos las variables numericas y para las opciones*/
        float precioProd, iva, resultado;
        int op, op2;

        Scanner leer= new Scanner(System.in);

        /*Le pedimos al usuario que ingrese los datos mediante la funcion Scanner*/
        System.out.println("Ingrese el precio del producto sin el IVA: ");
        precioProd=leer.nextInt();
        System.out.println("Ingrese el valor del IVA: ");
        iva=leer.nextInt();

        /*Le pedimos al usuario que ingrese la operacion que desee realizar*/
        do {
            do {
                System.out.println("Menu de opciones.");
                System.out.println("Ingrese 1 para sumar el IVA en su producto");
                System.out.println("Ingrese 2 para restar el IVA en su producto");
                System.out.println("Ingrese 3 para multiplicar el IVA por el producto");
                System.out.println("Ingrese 4 para dividir el IVA por el producto");
                op=leer.nextInt();
            }while (op != 1 && op != 2 && op != 3 && op != 4);
            switch (op){
                /*Si elusuario ingresa la opcion 1 se realizara la suma*/
                case 1:
                    System.out.println("Ingreso a la opcion para sumar el IVA.");
                    /*Se realiza la suma*/
                    resultado=(precioProd*iva/100)+precioProd;
                    System.out.println("La suma entre el IVA y el precio del producto es "+resultado);
                    break;
                /*Si elusuario ingresa la opcion 2 se realizara la resta*/
                case 2:
                    System.out.println("Ingreso a la opcion para restar el IVA.");
                    /*Se realiza la resta*/
                    resultado=precioProd-(precioProd*iva/100);
                    System.out.println("La resta entre el precio del producto y el IVA es "+resultado);
                    break;
                /*Si elusuario ingresa la opcion 3 se realizara la multiplicacion*/
                case 3:
                    System.out.println("Ingreso a la opcion para multiplicar el IVA.");
                    /*Se realiza la multiplicacion*/
                    resultado=(precioProd*iva/100)*precioProd;
                    System.out.println("La multiplicacion entre el IVA y el precio del producto es "+resultado);
                    break;
                /*Si elusuario ingresa la opcion 4 se realizara la division*/
                case 4:
                    System.out.println("Ingreso a la opcion para dividir el IVA.");
                    /*Se evalua si en la division no hay ceros*/
                    if (precioProd == 0 || iva == 0){
                        System.out.println("No se puede calcular la division ya que hay ceros");
                        break;
                    }else{
                        /*Se realiza la division*/
                        resultado=precioProd/(precioProd*iva/100);
                        System.out.println("La division entre el precio del producto y el IVA es "+resultado);
                    }
                    break;
            }
            /*Se le pide al usuario si quiere seguir en la calculadora o si desea salir*/
            System.out.println("Si desea realizar otra operacion presione cualquier numero, si desea salir del programa presione 0");
            op2 = leer.nextInt();
        }while (op2 != 0);
        /*Nos despedimos del usuario*/
        System.out.println("Saliendo del programa, muchas gracias");

    }
}

