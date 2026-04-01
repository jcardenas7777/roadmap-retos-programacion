
    /*EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */

public class jcardenas7777 {

   
    static int a=5,b=6;

public static void main(String[] args) {
    operadoresAritmeticos();
    operadoresComparacion();
    operadoresLogicos();
    operadoresAsignacion();
    operadoresIdentidad();
    operadoresBit();
    control();
    extra();
}

//Operadores aritmeticos


public static void operadoresAritmeticos() {
    System.out.println("===Operadores Aritméticos===");
    System.out.println("suma:" + (a + b));
    System.out.println("resta:" + (a - b));
    System.out.println("multiplicacion:" + (a * b));
    System.out.println("division:" + (a / b));
    System.out.println("modulo:" + (a % b));
    System.out.println("incremento:" + (a++));
    System.out.println("decremento:" + (a--));
    System.out.println("negacion:" + (-a));
}


    //operqadores de comparacion
    public static void operadoresComparacion() {
        System.out.println("===Operadores de Comparación===");
    System.out.println("igual a:" + (a == b));
    System.out.println("diferente a:" + (a != b));
    System.out.println("mayor que:" + (a > b));
    System.out.println("menor que:" + (a < b));
    System.out.println("mayor o igual que:" + (a >= b));
    System.out.println("menor o igual que:" + (a <= b));
    }
    //operadores logicos
    public static void operadoresLogicos() {
            System.out.println("===Operadores Lógicos===");
    System.out.println("AND:" + (a > 0 && b > 0));
    System.out.println("OR:" + (a > 0 || b > 0));
    System.out.println("NOT:" + !(a > 0));
    System.out.println("XOR:" + (a > 0 ^ b > 0) );
    System.out.println("NAND:" + !(a > 0 && b > 0));
    System.out.println("NOR:" + !(a > 0 || b > 0));
    System.out.println("XNOR:" + !(a > 0 ^ b > 0));
    System.out.println("AND corto circuito:" + (a > 0 && b++ > 0));
    System.out.println("OR corto circuito:" + (a > 0 || b++ > 0));
    }
    //operadores de asignacion
    public static void operadoresAsignacion() {
        System.out.println("===Operadores de Asignación===");
    int c = a + b;
    System.out.println("asignacion:" + c);
    c += a; // c = c + a
    System.out.println("+= :" + c);
    c -= a; // c = c - a    
    System.out.println("-= :" + c);
    c *= a; // c = c * a
    System.out.println("*= :" + c);
    c /= a; // c = c / a
    System.out.println("/= :" + c);
    c %= a; // c = c % a
    System.out.println("%= :" + c);
    c &= a; // c = c & a
    System.out.println("&= :" + c);
    c |= a; // c = c | a
    System.out.println("|= :" + c);
    c ^= a; // c = c ^ a
    System.out.println("^= :" + c);
    c <<= 1; // c = c << 1
    System.out.println("<<= :" + c);
    c >>= 1; // c = c >> 1
    System.out.println(">>= :" + c);
    c >>>= 1; // c = c >>> 1
    System.out.println(">>>= :" + c);
    }
// operadores de identidad
    public static void operadoresIdentidad() {
        System.out.println("===Operadores de Identidad===");
    System.out.println("identidad:" + (a == b));
    System.out.println("no identidad:" + (a != b));

    //operadores de pertenencia
    System.out.println("===Operadores de Pertenencia===");
    Integer[] arr = {1, 2, 3, 4, 5};
    System.out.println("pertenencia:" + (java.util.Arrays.asList(arr).contains(a)));
    System.out.println("no pertenencia:" + (!java.util.Arrays.asList(arr).contains(a)));
    }
    //operadores bit a bit
        public static void operadoresBit() { 
            System.out.println("===Operadores Bit a Bit===");   
    System.out.println("AND bit a bit:" + (a & b));
    System.out.println("OR bit a bit:" + (a | b));
    System.out.println("XOR bit a bit:" + (a ^ b));
    System.out.println("NOT bit a bit:" + (~a));
    System.out.println("desplazamiento a la izquierda:" + (a << 1));
    System.out.println("desplazamiento a la derecha:" + (a >> 1));
    System.out.println("desplazamiento a la derecha sin signo:" + (a >>> 1));

}


    
    //Estructuras de control
    public static void control() {
        System.out.println("===Estructuras de Control===");
        //condicionales
        if (a > b) {
            System.out.println("a es mayor que b");
        } else if (a < b) {
            System.out.println("a es menor que b");
        } else {
            System.out.println("a es igual a b");
        }

        //iterativas
        for (int i = 0; i < 5; i++) {
            System.out.println("for: " + i);
        }

        int j = 0;
        while (j < 5) {
            System.out.println("while: " + j);
            j++;
        }

        int k = 0;
        do {
            System.out.println("do-while: " + k);
            k++;
        } while (k < 5);

        //excepciones
        try {
            int x = a / 0;
            System.out.println("division por cero: " + x);
        } catch (ArithmeticException e) {
            System.out.println("Excepción: " + e.getMessage());
        }

        //switch
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido");
        }

    
    }
    // DIFICULTAD EXTRA
    public static void extra() {
        System.out.println("===DIFICULTAD EXTRA===");
        System.out.println("Números pares entre 10 y 55, excluyendo el 16 y múltiplos de 3:");
        for (int i = 10; i <= 55; i++) {
            if (i % 2 == 0 && i != 16 && i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
}

