package btstopwatch;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StopWatch {
    private double startTime;
    private double endTime;



    StopWatch() {
     this.startTime = System.currentTimeMillis();
    }


    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public double getElapseTime(){

        return (this.endTime - this.startTime);
    }
}

