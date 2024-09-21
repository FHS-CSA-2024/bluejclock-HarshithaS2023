package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println(test1Output);
        
        ClockDisplay test2 = new ClockDisplay(1,28);
        String test2Output = test2.getTime();
        System.out.println(test2Output);
        
        test2.setTime(2,45);
        String test3Output = test2.getTime();
        System.out.println(test3Output);
        
        System.out.println("Tick test 1");
        ClockDisplay tickTest1 = new ClockDisplay(3,32);
        String tickTest1Output = tickTest1.getTime();
        System.out.println(tickTest1Output); //before increment
        tickTest1.timeTick();
        tickTest1Output = tickTest1.getTime();
        System.out.println(tickTest1Output);
        
        System.out.println("Tick test 2");
        ClockDisplay tickTest2 = new ClockDisplay(3,9);
        String tickTest2Output = tickTest2.getTime();
        System.out.println(tickTest2Output);
        tickTest2.timeTick();
        tickTest2Output = tickTest2.getTime();
        System.out.println(tickTest2Output);
        
        System.out.println("Tick test 3");
        ClockDisplay tickTest3 = new ClockDisplay(1,59);
        String tickTest3Output = tickTest3.getTime();
        System.out.println(tickTest3Output);
        tickTest3.timeTick();
        tickTest3Output = tickTest3.getTime();
        System.out.println(tickTest3Output);
        
        System.out.println("Tick test 4");
        ClockDisplay tickTest4 = new ClockDisplay(9,59);
        String tickTest4Output = tickTest4.getTime();
        System.out.println(tickTest4Output);
        tickTest4.timeTick();
        tickTest4Output = tickTest4.getTime();
        System.out.println(tickTest4Output);
        
        System.out.println("Tick test 5");
        ClockDisplay tickTest5 = new ClockDisplay(23,59);
        String tickTest5Output = tickTest5.getTime();
        System.out.println(tickTest5Output);
        tickTest5.timeTick();
        tickTest5Output = tickTest5.getTime();
        System.out.println(tickTest5Output);
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds test1S = new ClockDisplaySeconds();
        String test1SOutput = test1S.getTime();
        System.out.println(test1SOutput);
        
        ClockDisplaySeconds test2S = new ClockDisplaySeconds(1,28,0);
        String test2SOutput = test2S.getTime();
        System.out.println(test2SOutput);
        
        test2S.setTime(2,45,10);
        String test3SOutput = test2S.getTime();
        System.out.println(test3SOutput);
        
        System.out.println("Tick test 1");
        ClockDisplaySeconds tickTest1s = new ClockDisplaySeconds(3,32,59);
        String tickTest1sOutput = tickTest1s.getTime();
        System.out.println(tickTest1sOutput); //before increment
        tickTest1s.timeTick();
        tickTest1sOutput = tickTest1s.getTime();
        System.out.println(tickTest1sOutput);
        
        System.out.println("Tick test 2");
        
        ClockDisplaySeconds tickTest2s = new ClockDisplaySeconds(1,0,59);
        String tickTest2sOutput = tickTest2s.getTime();
        System.out.println(tickTest2sOutput); //before increment
        tickTest2s.timeTick();
        tickTest2sOutput = tickTest2s.getTime();
        System.out.println(tickTest2sOutput);
        
        System.out.println("Tick test 3");
        
        ClockDisplaySeconds tickTest3s = new ClockDisplaySeconds(1,59,59);
        String tickTest3sOutput = tickTest3s.getTime();
        System.out.println(tickTest3sOutput); //before increment
        tickTest3s.timeTick();
        tickTest3sOutput = tickTest3s.getTime();
        System.out.println(tickTest3sOutput);
        
        System.out.println("Tick test 4");
        
        ClockDisplaySeconds tickTest4s = new ClockDisplaySeconds(23,59,59);
        String tickTest4sOutput = tickTest4s.getTime();
        System.out.println(tickTest4sOutput); //before increment
        tickTest4s.timeTick();
        tickTest4sOutput = tickTest4s.getTime();
        System.out.println(tickTest4sOutput);
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        ClockDisplay12Hour test10 = new ClockDisplay12Hour();
        String test10Output = test10.getTime();
        System.out.println(test10Output);
        
        ClockDisplay12Hour test11 = new ClockDisplay12Hour(14,32);
        String test11Output = test11.getTime();
        System.out.println(test11Output);
        
        test11.setTime(2,45);
        String test13Output = test11.getTime();
        System.out.println(test13Output);
        
        System.out.println("Tick test 1");
        ClockDisplay12Hour tickTest14 = new ClockDisplay12Hour(15,32);
        String tickTest14Output = tickTest14.getTime();
        System.out.println(tickTest14Output); //before increment
        tickTest14.timeTick();
        tickTest14Output = tickTest14.getTime();
        System.out.println(tickTest14Output);
        
        System.out.println("Tick test 2");
        ClockDisplay12Hour tickTest15 = new ClockDisplay12Hour(23,59);
        String tickTest15Output = tickTest15.getTime();
        System.out.println(tickTest15Output); //before increment
        tickTest15.timeTick();
        tickTest15Output = tickTest15.getTime();
        System.out.println(tickTest15Output);
        
        System.out.println("Tick test 3");
        ClockDisplay12Hour tickTest16 = new ClockDisplay12Hour(11,59);
        String tickTest16Output = tickTest16.getTime();
        System.out.println(tickTest16Output); //before increment
        tickTest16.timeTick();
        tickTest16Output = tickTest16.getTime();
        System.out.println(tickTest16Output);
        
        System.out.println("Tick test 4");
        ClockDisplay12Hour tickTest17 = new ClockDisplay12Hour(12,59);
        String tickTest17Output = tickTest17.getTime();
        System.out.println(tickTest17Output); //before increment
        tickTest17.timeTick();
        tickTest17Output = tickTest17.getTime();
        System.out.println(tickTest17Output);
    }
}
