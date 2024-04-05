// IMPORTS ======================================================================================================================

    // En la clase "Main" vamos a importar las librerías de entrada y salida que hemos creado, estas nos van a permitir
    // recoger datos para usarlos en el programa y posteriormente mostrarlos al usuario.

    // Primero importamos la librería de entrada, la cual recoge datos y nos permite usarlos más adelante en el programa.
    import com.Papfredder.In_Out.Entrada;

    // Luego importamos la librería de salida, la cual nos permite mostrar al usuario los datos que hemos recogido y usado.
    import com.Papfredder.In_Out.Salida;

    // Finalmente importamos la librería swing, la cual nos permite crear un entorno gráfico para el usuario.
    import javax.swing.*;

// MAIN =========================================================================================================================

    public class Main {
        public static void main(String[] args) throws Exception {

        // ENUNCIADO ============================================================================================================

            // Este programa se va a encargar de realizar operaciones sencillas, como lo haría una calculadora convencional, 
            // además de eso, crearemos diferentes test para comprobar la total funcionalidad del programa.

            // Créditos:

            /** 
            * @author: Nicolás Viéitez Domínguez
            * @version: 05/04/2024 V0.1
            */

        // DECLARACIONES ========================================================================================================

            // Vamos a declarar la ClaseCalculadora.
            ClaseCalculadora ClaseCalculadora = new ClaseCalculadora();


        // INICIO DEL CÓDIGO ====================================================================================================
        
            // Primero vamos a crear un menú de elección para el usuario, utilizaremos un bucle do while para salir.
            
            // Este será el menú.
            ClaseCalculadora.Opción = Integer.parseInt(JOptionPane.showInputDialog("""
                Por favor, selecciona el tipo de cálculo que desees realizar.

                    1- Sumar
                    2- Restar
                    3- Multiplicar
                    4- Dividir

                """));
                
            // Aquí pediremos los datos para el cálculo.
            ClaseCalculadora.Resultado = ClaseCalculadora.MétodoOpción(ClaseCalculadora.Opción,Entrada.Ventana("Escribe el primer número"),Entrada.Ventana("Escribe el segundo número"));
            
            // Impresión del resultado del cálculo
            Salida.Ventana(ClaseCalculadora.Resultado); 
        }
    }

