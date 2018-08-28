/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yoesimulator;

import java.awt.AWTEvent;
import java.awt.Event;
import java.awt.EventQueue;
import java.sql.Time;

/**
 *
 * @author Yoe
 */
/**
 *
 */
public class YoeSimulator {

    /**
     * @param args the command line arguments
     */
    // Make an EventQueue
    EventQueue queue;
    int statCount;
    Time sys_clk;
    
    String summary;

    public enum events {
        EVENT_ENQUEUE, EVENT_DISPATCH
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //Initialized

        //testing git
    }

    public void init() {
        queue = new EventQueue();
        statCount = 0;
        sys_clk = new Time(0);
        summary="";

    }

    public Time Time() {
        
        return sys_clk;
    }

    public EventQueue EventsQueue() {
        
        return queue;
    }

    public String ReportGenerator() {
        
        // Get the events back, hopefull in order!
//    for (int i=0; i < 5; i++) {
//      event = queue.pop();
//      System.out.println("Popped event time:"+event.getTime());
//      
      return summary;
    }

    


    public void Schedule() {
//        AWTEvent event = new AWTEvent(new Event(this, statCount, this)) {
//        }
//    event = new SimEvent();
//    event.setTime(0.5);
//    queue.

    }

}
