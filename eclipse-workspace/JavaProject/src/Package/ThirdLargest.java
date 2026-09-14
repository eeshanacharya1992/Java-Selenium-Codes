package Package;

public class ThirdLargest {

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 5, 6, 7, 7 }; // Third largest = 5
        System.out.println("Third Largest: " + thirdLargest(arr));
      System.out.println("Third Smallest: "+thirdSmallest(arr));
        System.out.println("Minimum Value: " + minValue(arr));
        System.out.println("Maximum Value: " + maxValue(arr));
    }

    public static int thirdLargest(int arr[]) { // 3rd largest value in array
        int first = -234567;
        int sec = -234567;
        int third = -234567;

        for (int i = 0; i < arr.length; i++) {
            if (first == arr[i] || sec == arr[i] || third == arr[i]) {
                continue;
            }

            if (first < arr[i]) {
                third = sec;
                sec = first;
                first = arr[i];
            } else if (sec < arr[i]) {
                third = sec;
                sec = arr[i];
            } else if (third < arr[i]) {
                third = arr[i];
            }
        }

        return third;
    }

    public static int minValue(int arr[]) { // minimum value in array
        int minv = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (minv > arr[i]) {
                minv = arr[i];
            }
        }
        return minv;
    }

    public static int maxValue(int arr[]) { // maximum value in array
        int maxv = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxv < arr[i]) {
                maxv = arr[i];
            }
        }
        return maxv;
    }
    public static int thirdSmallest(int arr[]) { // 3rd smallest value in an array
        int first = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (first == arr[i] || sec == arr[i] || third == arr[i]) {
                continue;
            }

            if (first > arr[i]) {
                third = sec;
                sec = first;
                first = arr[i];
            } else if (sec > arr[i]) {
                third = sec;
                sec = arr[i];
            } else if (third > arr[i]) {
                third = arr[i];
            }
        }

        return third;
    }

}


