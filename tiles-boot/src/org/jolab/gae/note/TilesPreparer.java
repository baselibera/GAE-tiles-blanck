package org.jolab.gae.note;

import org.apache.tiles.Attribute;
import org.apache.tiles.AttributeContext;
import org.apache.tiles.preparer.PreparerException;
import org.apache.tiles.preparer.ViewPreparer;
import org.apache.tiles.request.Request;
import org.apache.tiles.request.servlet.ServletRequest;
import org.apache.tiles.request.servlet.ServletUtil;

/**
 * Con questa classe viene modicifato il rendering dell'area centrale dell'applicazione
 * sulla base del parametro di Request "azione". Il valore del parametro viene 
 * utilizzato per comporre il path relativo della jsp presente nella directory "tiles".
 * Questa jsp contiene la logica di rendering dell'attributo "body" del tile
 * 
 * @author jolab
 *
 */
public class TilesPreparer implements ViewPreparer {
	
    public void execute(Request tilesRequest, AttributeContext attributeContext)
    throws PreparerException {
    	ServletRequest req = ServletUtil.getServletRequest(tilesRequest);
    	try {
			
			String azione = req.getRequest().getParameter("azione");
			String renderPage = "body";
			if (azione!=null && !azione.equals(""))
				renderPage =  azione;
			
			attributeContext.putAttribute(
				"body",
				new Attribute("/tiles/" + renderPage +".jsp"));
			
			
			
		} catch (Exception e) {
			req.getRequest().setAttribute("errore", e.getMessage());
			attributeContext.putAttribute(
					"body",
					new Attribute("/tiles/tilesError.jsp"));
			
		}
        
        
    }
}