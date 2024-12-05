public class Primes {
    public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    boolean[] arr = new boolean[n + 1];
   
   for (int i = 2; i <= n; i++) {
      arr[i] = true;
    }

for (int p = 2; p * p <= n; p++) {
    if (arr[p]) {
        for (int multiple = p * p; multiple <= n; multiple += p) {
            arr[multiple] = false;
        }
    }
}

int count = 0; 
    System.out.println("Prime numbers up to " + n + ":");
    for (int i = 2; i <= n; i++) {
        if (arr[i]) {
            System.out.println(i);
            count++;
        }
    }


    double percentage = (double) count / n * 100; 
    System.out.println("There are " + count + " primes between 2 and " + n + 
                       " (" + Math.round(percentage) + "% are primes)");
}






 }
