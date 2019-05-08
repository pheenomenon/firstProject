package ArraysAndStrings;

    class Solution {

        public static void main(String args[]) {
            int[] n = {0,0,1,1,1,2,2,3,3,4};
            int[] nums1 = {4,9,5};
            int[] nums2 = {1,2,3};



            System.out.println("output : ");
            //int[] result = rotate1(nums2,3);
            rotate(nums2,4);
            for(int i=0;i<nums2.length;i++) {
                System.out.println(nums2[i]);
            }
        }

            public static int[] rotate1(int[] nums, int k) {
                int len = nums.length;
                int start = len-k;
                int[] result = new int[len];
                int j=0;
                for(int i = start ; i < len ; i++) {
                    result[j] = nums[i];
                    j++;
                }

                for(int i = 0; i < start ; i++) {
                    result[j] = nums[i];
                    j++;
                }
                return result;
            }

        public static void rotate2(int[] nums, int k) {
            int len = nums.length;
            for(int i =0; i<len ; i++) {
                for(int j=len-1; j > 0 ; j--) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }


        public static void rotate(int[] nums, int k) {
            int len = nums.length;
            if(k > len) {
                k = len;
                reverse(nums,0,len);
                return;
            }
            if(len == 0 ) {
                return;
            }
            reverse(nums,0,len-k);
            reverse(nums,len-k,len);
            reverse(nums,0,len);
        }
        public static void reverse(int[] arr, int start, int end) {

            int i=start;
            int j=end-1;
            while( i<j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }


        }
