package operations.multiplication;

import operations.spi.Operations;

public class OperationsMultiplication implements Operations
{
    private static final String PROVIDER_NAME = "OperationsMultiplication";

    public int getResult(int left_operand, int right_operand)
    {
        return left_operand * right_operand;
    }

    public String getName() { return PROVIDER_NAME; }    
}
