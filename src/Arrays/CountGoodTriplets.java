package Arrays;

public class CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int numGood = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b
                            && Math.abs(arr[i] - arr[k]) <= c){
                        numGood += 1;
                    }
                }
            }
        }
        return numGood;
    }

    public static void main(String[] args) {
        CountGoodTriplets h = new CountGoodTriplets();
        System.out.println(h.countGoodTriplets(new int[]{3,0,1,1,9,7}, 7, 2, 3));
    }
}
