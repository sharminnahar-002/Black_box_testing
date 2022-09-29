import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPrime {
    
    @Test
   public void test01 () {

        assertEquals(prime.isPrime(3), true);
    }
    @Test
    public void test02 () {
 
    
         assertEquals(prime.isPrime(0), false);
     }
     @Test
     public void test03 () {
  
         
        assertEquals(prime.isPrime(-1), false);
      }
      @Test
      public void test04 () {
   
           
           assertEquals(prime.isPrime(10), false);
       }
    
    @Test
       public void test05 () {
    
            assertEquals(prime.isPrime(11),true);
        }
        @Test
        public void test06 () {
     
             assertEquals(prime.isPrime(9), false);
         }
         @Test
         public void test07 () {
      
            
              assertEquals(prime.isPrime(1), false);
          }
}