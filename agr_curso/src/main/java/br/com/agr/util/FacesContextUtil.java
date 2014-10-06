package br.com.agr.util;

import javax.faces.context.FacesContext;
import org.hibernate.Session;

/**
 *
 * Alessandro Geraldo Ramos
 * Data 01/10/2014
 */
public class FacesContextUtil 
{
    private static final String HIBERNATE_SESSION = "hibernate_session";

    public static Session getRequestSession() 
    {
        return (Session)FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get(HIBERNATE_SESSION);
    }
    public static void setRequestSession(Session session)
    {
        FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put(HIBERNATE_SESSION, session);
    }   
}
