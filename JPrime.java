public class JPrime {

    public int isPrime(int num){
        if(num <= 0) return -1;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return 0;
        }
        return 1;
    }
}
