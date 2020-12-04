package AttendanceSystem;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Employee{
	String name;
    String temperature;
    String id;
    long epochTime;


    Employee(String name, String temperature, String id){
        this.name = name;
        this.id = id;
        this.temperature = temperature;
        this.epochTime = new Date().getTime();
    }

   public void setName(String name) { this.name = name; } 
   public String getName() { return this.name; }
   public void setTemperature(String temperature) { this.temperature = temperature; } 
   public String getTemperature() { return this.temperature; }
   public void setId(String id) { this.id = id; } 
   public String getId() { return this.id; }
   public void setEpochTime(long epochTime) { this.epochTime = epochTime; } 
   public long getEpochTime() { return this.epochTime; }


}