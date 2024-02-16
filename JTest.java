import org.junit.Assert;
import org.junit.Test;

public class JTest {
    @Test
    public void test_prime_1(){
        JPrime prime = new JPrime();
        Assert.assertEquals(prime.isPrime(11), 1);
    }
    @Test
    public void test_prime_2(){
        JPrime prime = new JPrime();
        Assert.assertEquals(prime.isPrime(0), -1);
    }
    @Test
    public void test_prime_3(){
        JPrime prime = new JPrime();
        Assert.assertEquals(prime.isPrime(-11), -1);
    }
    @Test
    public void test_prime_4(){
        JPrime prime = new JPrime();
        Assert.assertEquals(prime.isPrime(987654323), 1);
    }
    @Test
    public void test_prime_5(){
        JPrime prime = new JPrime();
        Assert.assertEquals(prime.isPrime(20), 0);
    }

}
