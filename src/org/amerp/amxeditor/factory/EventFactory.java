/**
 * 
 */
package org.amerp.amxeditor.factory;

import org.adempiere.base.event.AbstractEventHandler;
import org.adempiere.base.event.IEventTopics;
import org.amerp.amxeditor.model.MLocationExt;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.osgi.service.event.Event;


/**
 * @author luisamesty
 *
 */
public class EventFactory extends AbstractEventHandler{

	/* (non-Javadoc)
	 * @see org.adempiere.base.event.AbstractEventHandler#doHandleEvent(org.osgi.service.event.Event)
	 */
    CLogger log =  CLogger.getCLogger(EventFactory.class);
    
    @Override
    protected void doHandleEvent(Event p_event) {
	    // TODO Auto-generated method stub
	    PO po = getPO(p_event);
	    
	    // MAMNPayroll
	    if (po instanceof MLocationExt) {
	    	MLocationExt pr = (MLocationExt)po;
log.warning("..............MLocationExt-..............................");

	    }    
    }

	/* (non-Javadoc)
	 * @see org.adempiere.base.event.AbstractEventHandler#initialize()
	 */
    @Override
    protected void initialize() {
	    // TODO Auto-generated method stub
	    // MLocationExt
	    registerTableEvent(IEventTopics.PO_AFTER_CHANGE, MLocationExt.Table_Name);
	    registerTableEvent(IEventTopics.PO_AFTER_NEW , MLocationExt.Table_Name);
	    registerTableEvent(IEventTopics.PO_BEFORE_NEW , MLocationExt.Table_Name);
    }

}
