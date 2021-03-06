package org.kapott.hbci.GV;

import org.kapott.hbci.GV_Result.HBCIJobResultImpl;
import org.kapott.hbci.manager.HBCIHandler;
import org.kapott.hbci.manager.LogFilter;

/**
 * Geschaeftsvorfall fuer das Senden der Empfangsquittung mittels HKQTG.
 */
public class GVReceipt extends HBCIJobImpl
{
    /**
     * Liefert den Lowlevel-Namen des Geschaeftsvorfalls.
     * @return der Lowlevel-Namen des Geschaeftsvorfalls.
     */
    public static String getLowlevelName()
    {
        return "Receipt";
    }
    
    /**
     * ct.
     * @param handler
     */
    public GVReceipt(HBCIHandler handler)
    {
      super(handler, getLowlevelName(), new HBCIJobResultImpl());
      addConstraint("receipt","receipt","", LogFilter.FILTER_NONE);
    }
}
