module operations.multiplication
{
    requires operations.spi;
    provides operations.spi.Operations with operations.multiplication.OperationsMultiplication;
}
