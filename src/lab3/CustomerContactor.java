package lab3;

/**
 *
 * @author Stuart Caddell
 */
public interface CustomerContactor {
    /**
     * Interface used to contact customer if collection activity is needed.
     * 
     * Current contact instantiations include reminder postcard, collection 
     * letter, automated phone call, and "worklists" provided daily to 
     * collection reps.
     */
    public void contactCustomer();
    
    public String logResults();
}
