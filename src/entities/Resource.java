/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import designpattern.interfaces.Event;
import java.util.HashMap;

/**
 *
 * @author user
 */
public class Resource implements Event {
    private static Resource current_instance = null;
    
    private static int AVAILABLE_INSTANCES = 25;    
    private static int RESOURCE_MARIAGE=5;
    private static int RESOURCE_FORMATION=5;
    private static int RESOURCE_SEMINAR=5;
    
    
    
    public Resource addInstance(Object resource)
    {
        if (AVAILABLE_INSTANCES>0){
            AVAILABLE_INSTANCES--;
            return this.getInstance(resource);
        }
        else
        {
            System.out.println("Unable to create event. The number of available event creation left is 0");
            return null;
            
        }
   }
    
    public Resource getInstance(Object resource)
    {
        if (resource instanceof ResourceMariage)
            return new ResourceMariage();
        else if (resource instanceof ResourceMariage)
            return new ResourceFormation();
        else
            return new ResourceSeminar();
        
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCalendar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setResource() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getResult() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cloneEvent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
            
    
}
