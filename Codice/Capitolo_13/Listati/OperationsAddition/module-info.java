module operations.addition
{
    requires operations.spi;
    provides operations.spi.Operations with operations.addition.OperationsAddition;
}
