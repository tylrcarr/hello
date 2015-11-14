import skilstak.c;
/**
 * Print Hello _____ (Default is "world")!
 * first argument can be words or how you want it to be parsed
 * ie -m is multiple colors -c is colors -s gives you static colors
 * (like multi but with 1 color) and just words gives you
 * a plain message spammed
 * done using skilstak.c from skilstak
 */
public class hello {
    /** static colors
     *
     * @param message message
     *
     */
    public static void scolor(String message) throws InterruptedException {
        while(true) {
            System.out.println(c.clear + c.rc() + message);
            Thread.sleep(50);
        }
    }
    /** color portion 
     *
     * @param message message
     *
     */
    public static void color(String message) {
        while(true){
            System.out.println(c.rc() + message + " ");
        }
    }
    /** plain portion 
     *
     * @param message message
     *
     * */
    public static void plain(String message) {
        while(true){
            System.out.println(message + " ");
        }
    }
    /** multiple colors portion 
     *
     * @param message message
     *
     * */
    public static void multi(String message) throws InterruptedException {
        while(true){
            System.out.println(c.clear + c.multi(message));
            Thread.sleep(50);
        }   
    }
    /** actual parser and printer 
     *
     * @param args 1st is generally -c -s -m or even just words
     *
     */
    public static void main(String[] args) throws InterruptedException{
        String who = "world";
        String option = "";
        String message = "";
        System.out.println(c.clear); 
        if(args.length > 1){
            option = args[0];
            who = args[1];
        } else if(args.length == 1){
            if(args[0].startsWith("-")) {
                option = args[0];
            } else {
                who = args[0];
            }
        }
        message = "Hello " + who + "!";
        if(option.equals("-m")) {
            multi(message);
        } else if(option.equals("-c")) {
            color(message);
        } else if(option.equals("-s")) { 
            scolor(message); 
        } else {
            plain(message);
        }
    }
}


