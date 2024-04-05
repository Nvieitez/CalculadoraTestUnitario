// IMPORTS ======================================================================================================================

    // En la clase "Test" vamos a importar las librerías org para poder hacer tests sobre nuestro programa.

    // Importamos las librerías "org".
    import org.junit.jupiter.api.Test;
    import org.junit.jupiter.api.Assertions;
    

// CLASE CALCULADORA ============================================================================================================

    public class MainTest {

    // ENUNCIADO ================================================================================================================

        // En esta clase vamos a hacer diferentes test para comprobar que todo el programa funcione correctamente.

        // Créditos:

        /**
        * @author: Nicolás Viéitez Domínguez
        * @version: 05/04/2024 V0.1
        */

    // DECLARACIONES ============================================================================================================

        // En esta clase no vamos a declarar nada.

    // INICIO DEL CÓDIGO ========================================================================================================

        // Aquí vamos a hacer todos nuestros test.

        // Este test será para comprobar la suma de dos número positivos.
        @Test
        public void SumaPositivos(){
            Assertions.assertEquals(2, ClaseCalculadora.MétodoOpción(1, 1, 1));
        }

        // Este test será para comprobar la suma de un número positivo y un número negativo.
        @Test
        public void SumaPositivoNegativo(){
            Assertions.assertEquals(0, ClaseCalculadora.MétodoOpción(1, 1, -1));
        }

        // Este test será para comprobar la suma de dos números negativos.
        @Test
        public void SumaNegativos(){
            Assertions.assertEquals(-2, ClaseCalculadora.MétodoOpción(1, -1, -1));
        }

        // Este test será para comprobar la resta de dos números positivos.
        @Test
        public void RestaPositivos(){
            Assertions.assertEquals(0, ClaseCalculadora.MétodoOpción(2,1 ,1));
        }

        // Este test será para comprobar la resta de un número positivo y un número negativo.
        @Test
        public void RestaPositivoNegativo(){
            Assertions.assertEquals(3, ClaseCalculadora.MétodoOpción(2, 1, -2));
        }

        // Este test será para comprobar la resta de dos números negativos.
        @Test
        public void RestaNegativos(){
            Assertions.assertEquals(1, ClaseCalculadora.MétodoOpción(2, -1, -2));
        }

        // Este test será para comprobar la multiplicación de dos números positivos.
        @Test
        public void MultiplicaciónPositivos(){
            Assertions.assertEquals(2, ClaseCalculadora.MétodoOpción(3, 1, 2));
        }

        // Este test será para comprobar la multiplicación de un número positivo y uno negativo.
        @Test
        public void MultiplicaciónPositivoNegativo(){
            Assertions.assertEquals(-2, ClaseCalculadora.MétodoOpción(3, 1, -2));
        }

        // Este test será para comprobar la multiplicación de dos números negativos.
        @Test
        public void MultiplicaciónNegativos(){
            Assertions.assertEquals(3, ClaseCalculadora.MétodoOpción(3, -1, -3));
        }

        // Este test será para comprobar la división de dos números positivos.
        @Test
        public void DivisiónPositivos(){
            Assertions.assertEquals(0.5, ClaseCalculadora.MétodoOpción(4, 1, 2));
        }

        // Este test será para comprobar la división de un número negativo y un número positivo .
        @Test
        public void DivisiónPositivoNegativo(){
            Assertions.assertEquals(-0.5, ClaseCalculadora.MétodoOpción(4, 1, -2));
        }

        // Este test será para comprobar la división de dos números negativos.
        @Test
        public void DivisiónNegativos(){
            Assertions.assertEquals(0.25, ClaseCalculadora.MétodoOpción(4, -1, -4));
        }
    }


    
