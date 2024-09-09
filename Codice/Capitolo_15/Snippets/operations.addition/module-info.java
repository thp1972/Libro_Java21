/**
 * Implementazione concreta della Service Interface. 
 *
 * <p>Implementazione concreta di 
      {@link operations.spi.Operations Operations}</p>
 *
 * @provides operations.spi.Operations 
 */
module operations.addition
{
    requires operations.spi;
    provides operations.spi.Operations with operations.addition.OperationsAddition;
}
