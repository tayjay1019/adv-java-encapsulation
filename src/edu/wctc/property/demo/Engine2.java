package edu.wctc.property.demo;

public class Engine2 {

   private int cylinderCount;
   private boolean running;

   public static final int MIN_CYLINDERS = 1;
   public static final int MAX_CYLINDERS = 12;

   public Engine2(int cylinderCount)
   {
       if(cylinderCount < MIN_CYLINDERS || cylinderCount > MAX_CYLINDERS)
       {
           throw new IllegalArgumentException("invalid cylinders");
       }

       this.cylinderCount = cylinderCount;
       this.running = false;
   }

   public int getCylinderCount() {
       return this.cylinderCount;
   }


   public boolean isRunning() {
       return this.running;
   }

   public void start() {
       this.running = true;
   }

   public void stop() {
       this.running = false;
   }
}
