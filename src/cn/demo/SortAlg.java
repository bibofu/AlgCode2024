package cn.demo;

import org.junit.Test;

public class SortAlg {

    @Test
    public void test1(){
        int[] nums = {3,2,1,4,2,5,6,0,7,9,8};
        //bubSort(nums);
        //selSort(nums);
        //insertSort(nums);
        //quickSort(nums);
        mergeSort(nums);
    }
    public void bubSort(int[] nums){
        int n = nums.length;
        for(int i =0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(nums[j] > nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
        for(int i:nums){
            System.out.println(i+" ");
        }

    }

    public void swap(int[] nums,int i,int j){
        if(nums[i] > nums[j]){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public void selSort(int[] nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i]){
                    swap(nums,i,j);
                }
            }
        }
        for(int i:nums){
            System.out.println(i);
        }
    }

    public void insertSort(int[] nums){
        int n =nums.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(nums[j-1]>nums[j]){
                    swap(nums,j-1,j);
                }
            }
        }
        for(int i:nums){
            System.out.println(i);
        }
        
    }

    public void quickSort(int[] nums){

        int[] res = quick(nums,0,nums.length-1);
        for(int i:res){
            System.out.println(i+" ");
        }
    }

    public int[] quick(int[] nums,int left,int right){
        if(left<right){
            int partition_num = partition(nums,left,right);
            quick(nums,left,partition_num-1);
            quick(nums,partition_num+1,right);
        }
        return nums;
    }

    public int partition(int[] nums,int left,int right){
        int pivot = nums[left];
        int start = left;
        while (left<right){
            while (left<right&&nums[right]>=pivot){
                right--;
            }
            while(left<right&&nums[left]<=pivot){
                left++;
            }
            if(left>=right){
                break;
            }
            swap(nums,left,right);
        }
        swap(nums,start,left);
        return left;
    }

    public void mergeSort(int[] nums){
        int[] temp = new int[nums.length];
        sort(nums,0,nums.length-1,temp);
        for(int i:nums){
            System.out.println(i+" ");;
        }
    }

    public void sort(int[] nums,int left,int right,int[] temp){
        if (left<right){
            int mid = left+(right-left)/2;
            sort(nums,left,mid,temp);
            sort(nums,mid+1,right,temp);
            merge(nums,left,right,temp);
        }
    }

    /** 对nums中 [left,right]区间进行排序 */
    public void merge(int[] nums,int left,int right,int[] temp){
        int mid = left+(right-left)/2;
        int i =left;
        int j =mid+1;
        int t = 0;
        while(i<=mid&&j<=right){
            if(nums[i]<nums[j]){
                temp[t]=nums[i];
                i++;
                t++;
            }else{
                temp[t] = nums[j];
                j++;
                t++;
            }
        }
        while (i<=mid){
            temp[t]=nums[i];
            i++;
            t++;
        }
        while (j<=right){
            temp[t]=nums[j];
            j++;
            t++;
        }
        t=0;
        while(left<=right){
            nums[left]=temp[t];
            t++;
            left++;
        }
    }

}
