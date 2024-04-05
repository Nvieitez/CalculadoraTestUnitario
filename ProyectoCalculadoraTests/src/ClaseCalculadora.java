// IMPORTS ======================================================================================================================

    // En la clase "ClaseCalculadora" vamos a importar la librería swing, para poder usar el JOptionPane y que el usuario
    // pueda ver la información proporcionada mediante una ventana en la pantalla.

    // Importamos la librería "Swing".
    import javax.swing.JOptionPane;

// CLASE CALCULADORA ============================================================================================================

    public class ClaseCalculadora {

    // ENUNCIADO ================================================================================================================

        // En esta clase crearemos todo el funcionamiento de la calculadora, incluyendo sumas, restas, multiplicaciones
        // y divisiones.

        // Créditos:

        /**
        * @author: Nicolás Viéitez Domínguez
        * @version: 05/04/2024 V0.1
        */
        
    // DECLARACIONES ============================================================================================================

        // Aquí vamos a declarar todas las variables que tendrá nuestro programa.

        // Primero declaramos "Suma" con valor 1.

            /** 
            * @param Suma Esta será la variable que, cuando seleccionada, le dirá al programa que debe sumar los números.
            */
            public final static int Suma = 1;

        // Ahora declaramos "Resta" con valor 2.

            /**
            * @param Resta Esta será la variable que, cuando seleccionada, le dirá al programa que debe restar los números.
            */
            public final static int Resta = 2;

        // Ahora declaramos "Multiplicación" con valor 3.

            /**
            * @param Multiplicación Esta será la variable que, cuando seleccionada, le dirá al programa que debe multiplicar los números.
            */
            public final static int Multiplicación = 3;

        // Y finalmente declaramos "División" con valor 4.

            /**
            * @param División Esta será la variable que, cuando seleccionada, le dirá al programa que debe de dividir los números.
            */
            public final static int División = 4;

    // INICIO DEL CÓDIGO ========================================================================================================

        // Aquí vamos a crear un método que contenga un break, para que el usuario pueda elegir que desea hacer.

        // Dentro del método vamos a declarar "Dato 1".

        /**
        * @param Dato1 Esta será la variable que contenga el valor del dato que dé el usuario para hacer el cálculo.
        */
        public float Dato1;

        // Declaramos "Dato2".

        /**
        * @param Dato2 Esta será la variable que contenga el valor del segundo dato que dé el usuario para hacer el cálculo.
        */
        public float Dato2;
        

        // Declaramos "Resultado".

        /**
        * @param Resultado Esta será la variable que contenga el valor del resultado del cálculo.
        */
        public float Resultado;
        
        // Y finalmente declaramos "Opción".

        /**
        * @param Opción Está será la variable que nos permitirá elegir que tipo de cálculo queremos hacer gracias a los valores que les dimos las opciones.
        */
        public int Opción;

        // Declaramos el método e incluimos todos sus datos dentro.
        public static float MétodoOpción(int Opción, float Dato1, float Dato2){;

            // Dentro del método declaramos Resultado
            float Resultado = 0;
            
            // Dentro del método vamos a crear un Break que permitirá al usuario elegir que desea hacer.
            switch (Opción) {

                // Creamos el cálculo para la suma.
                case 1:

                    Resultado = Dato1 + Dato2;
            
                break;

                // Creamos el cálculo para la resta.
                case 2:

                    Resultado = Dato1 - Dato2;

                break;

                // Creamos el cálculo para la multiplicación.
                case 3:

                    Resultado = Dato1 * Dato2;

                break;

                // Creamos el cálculo de la división.
                case 4:


                    Resultado = Dato1 / Dato2;

                break;

                // Creamos un default para que salte un error en caso de que algo no salga bien.
                default:

                    if(Opción > 4){

                        // Este es el mensaje que se va a mostrar.
                        JOptionPane.showMessageDialog(null, "La opción seleccionada no existe");

                        // convertimos el resultado en un string para que imprima un error.
                        Resultado = Float.parseFloat("");

                    }
                
                break;
            }
            
            // Finalmente retornamos resultado para poder imprimirlo para el usuario.
            return Resultado;

        }; // Fin del método.

    } // Fin de la clase.
    
