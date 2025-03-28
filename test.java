// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
         long start = System.currentTimeMillis();
                      try{
                    Thread.sleep(150000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
         
         long end = System.currentTimeMillis();
         System.out.println("difference = " + (end - start));
         
         System.out.println(Double.valueOf(1000));
        
        System.out.println("dived by 1000 = " + (double) ((end - start) / Double.valueOf(1000)));
        
        System.out.println(Math.round(0.77));
        System.out.println(Math.round(554.0))
        
        
    }
}


