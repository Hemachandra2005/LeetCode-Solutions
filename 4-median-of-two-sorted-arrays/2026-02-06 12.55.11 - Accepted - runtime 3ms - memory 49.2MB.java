class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] ans=new int[2000];
        int i=0;
        int j=0;
        int k=0;
        int n=nums1.length;
        int m=nums2.length;

        while(i < n && j < m ){
            if(nums1[i] < nums2[j]){
                ans[k]=nums1[i];
                i++;
            }else{
                ans[k]= nums2[j];
                j++;
            }
            k++;
        }

        while(i<n){
            ans[k]=nums1[i];
            k++;
            i++;
        }
        
        while(j<m){
            ans[k]=nums2[j];
            k++;
            j++;
        }

        int tot=n+m;
        if(tot %2==1){
            return ans[tot/2];
        }else{
            return ((double)(ans[tot/2]+ans[(tot/2)-1])/2);
        }
    }
}