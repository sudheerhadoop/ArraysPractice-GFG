class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
     
     ArrayList<Integer> list = new ArrayList<>();

    for (int x = 0; x < arr.length; x++) {

    int index = arr[x] % n;

    arr[index] += n;

    }

    for (int x = 0; x < n; x++) {

    if (arr[x] / n >= 2) {

    list.add(x);

    }

    }

    if (list.isEmpty()) {

    list.add(-1);

    }

    return list;
    }
}
