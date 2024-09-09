/**
 * Service Consumer.
 *
 * <p>Servizio utilizzato: {@link operations.spi.Operations}.</p>
 *
 * @uses operations.spi.Operations 
 */
module operations.client 
{
    requires operations.spi;
    uses operations.spi.Operations;
}
