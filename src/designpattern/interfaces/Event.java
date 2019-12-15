/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.interfaces;

/**
 *
 * @author user
 */
public interface Event {
    
    void reset();
    void setLocation();
    void setCalendar();
    void setResource();
    void getResult();
    void cloneEvent();
}
