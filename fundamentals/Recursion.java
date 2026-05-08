public class Recursion {
    
    public static void main(String[] args) { 
        
    RecursionAlgos r = new RecursionAlgos();
    r.countDown(5);
    }    
}

class RecursionAlgos {
    public void infinite() {
        infinite();
    } 
    public void countDown(int n) {
        if (n <=0)
        {
            System.out.println("Hit base case.");
            return;
        }
        System.out.println("stacking up to n: " + n);  
        countDown(n-1);
        System.out.println("unstacking!" + n);
    }
    
}