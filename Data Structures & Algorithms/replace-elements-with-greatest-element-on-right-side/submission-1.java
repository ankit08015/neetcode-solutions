class Solution {
    public int[] replaceElements(int[] arr) {
        // for (int i = 0; i < arr.length; i ++) {
        //     Integer max = Integer.MIN_VALUE;

        //     for (int j = i+1; j < arr.length; j++){
        //         max = Math.max(max, arr[j]);
        //     }

        //     arr[i] = max;
        // }

        // arr[arr.length -1] = -1;
        // return arr;

        int [] res = new int[arr.length];
        int max = -1;

        for (int i = arr.length -1 ; i >= 0; i--) {
            if (i == arr.length -1 ) {
                res[i] = max;
            } else {
                max = Math.max(max, arr[ i +1]);
                res[i] = max;
            }
            

        }

        return res;
    }
}