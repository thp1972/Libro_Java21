package operations.addition;

import operations.spi.Operations;

/**
 * Addizionatore.
 */
public class OperationsAddition implements Operations
{
    private static final String PROVIDER_NAME = "OperationsAddition";
    
    public int getResult(int left_operand, int right_operand)
    {
        return left_operand + right_operand;
    }

    public String getName() { return PROVIDER_NAME; }    
}