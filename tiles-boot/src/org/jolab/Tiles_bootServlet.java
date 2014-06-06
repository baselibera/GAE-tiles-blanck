package org.jolab;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Tiles_bootServlet extends HttpServlet {
	
	Logger log = Logger.getLogger(this.getClass().getName());
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		java.util.Date now = new java.util.Date();
		log.warning("Lascio un messaggio di log di esempio:" + now.toString() );
		StringBuffer msg = new StringBuffer();
		msg.append(req.getParameter("utente")).append(" - ").append(req.getParameter("titolo")).append(" : ").append(req.getParameter("contenuto"));
		log.warning(msg.toString());
		
			
	}
	
	
	
}
