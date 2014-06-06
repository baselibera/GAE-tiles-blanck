package org.jolab.gae.note;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@SuppressWarnings("serial")
public class InserisciNota extends HttpServlet {

	/* (non-Javadoc)
	 * Inserisce una nuova nota nella Kind "Nota"
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//Leggo parametri request
		String titolo = req.getParameter("titolo");
		String contenuto = req.getParameter("contenuto");
		String utente = req.getParameter("utente");
		
		//Preparo oggetto datastore GAE
		Entity nota = new Entity("Nota");
		nota.setProperty("Utente", utente);
		nota.setProperty("Titolo", titolo);
		nota.setProperty("Contenuto", contenuto);		
		
		//Preparo il servizio Datastore
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		
		// Salvo il record
		ds.put(nota);
		
		
	}

}
