
public class Driver
{
    public static void main(String[] args) throws InterruptedException{
        /*Book b1 = new Book("Advanced Java", "Richie", "BJIJ87");
        
        System.out.println(b1.getTitle());
        
        //b1.author = "";
        
        Book b2 = new Book("Data Structures", "", "JYG671");
        
        System.out.println(b1.getTitle() + " | " + b2.getTitle());
        */
    	/*
    	Note a = new Note("This is Note #1");
    	System.out.println(a.getNoteCount());
    	Note b = new Note("This is Note #2");
    	System.out.println(a.getNoteCount());
    	Note c = new Note("This is Note #3");
    	
    	System.out.println(a.getNote());
    	System.out.println(a.getNoteCount());
    	*/
    	
    	Player p = new Player("Edward"); Thread.sleep(4000);
    	Player q = new Player("Alphonse"); Thread.sleep(2000);
    	Player r = new Player("Trisha"); Thread.sleep(1000);
    	
    	System.out.println(p.getName());
    	System.out.println(p.getPlayerID());
    	System.out.println(p.getTimeCreated());
    	System.out.println(q.getName());
    	System.out.println(q.getPlayerID());
    	System.out.println(q.getTimeCreated());
    	System.out.println(r.getName());
    	System.out.println(r.getPlayerID());
    	System.out.println(r.getTimeCreated());
    	
    	
    	
    }
}
