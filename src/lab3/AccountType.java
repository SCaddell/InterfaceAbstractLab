package lab3;

/**
 *
 * @author Stuart Caddell
 */
public interface AccountType {
    
    /**
     * This method should retrieve the minimum Past Due balance which will 
     * cause the account to enter collections treatment.
     * The input argument should be an account object.  The threshold should be
     * based up the account type.  (Each account type can have a different 
     * balance at which the account enters collection processing.
     * 
     * If no matching account type is found (array?), then return a threshold of
     * zero ($0.00).
     */
    double retrieveCollectionThreshold();
    
}
