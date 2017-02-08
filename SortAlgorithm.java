package com.server.components;

public class SortAlgorithm {
	public static void main(String[]  a){
		int s[] ={0,7,10,1,6,23,4,12,22};
//		sort(s,0,7);
//		 for(int i=0;i<s.length;i++){
//				System.out.println(s[i]);
//		}
		finalMap(s,8);
	}
	public static void sortInsert(int[] nums){
		for(int i=0;i<nums.length-1;i++){
			int j=i+1;
			int temp=nums[j];
			while(i>0&&temp<nums[i]){
				nums[j]=nums[i];
				j--;
				i--;
			}
			nums[j]=temp;
		}
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
	public static void sortSelect(int[] nums ){
		for(int i=0;i<nums.length-1;i++){
			int min=i;
			for(int j=i+1;j<nums.length;j++){
				if(nums[min]>nums[j]){
					min=j;
				}
			}
			if(i!=min){
				int t=nums[i];
				nums[i]=nums[min];
				nums[min]=t;
			}
		}
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
	
	 public static void Sort(int[] array)
	    {
	        aux = new int[array.length]; // 仅分配一次
	        mergeSort(array, 0, array.length - 1);
	        for(int i=0;i<array.length;i++){
				System.out.println(array[i]);
			}
	    }
	 
	public static void mergeSort(int[] a,int l,int h){
		if(l>=h){
			return;
		}
		int m=l+(h-l)/2;
		mergeSort(a, l, m);
		mergeSort(a, m+1, h);
		merge(a,l,m,h);
	}
	
	private static int aux[];
	public static void merge(int[] a,int l,int m,int h){
		int i=l,j=m+1;
		//把元素拷贝到辅助数组中
	    for (int k = l; k <= h; k++)
	    {
	        aux[k] = a[k];
	    }
	    //然后按照规则将数据从辅助数组中拷贝回原始的array中
	    for (int k = l; k <= h; k++)
	    {
	        //如果左边元素没了， 直接将右边的剩余元素都合并到到原数组中
	        if (i > m)
	        {
	            a[k] = aux[j++];
	        }//如果右边元素没有了，直接将所有左边剩余元素都合并到原数组中
	        else if (j > h)
	        {
	            a[k] = aux[i++];
	        }//如果左边右边小，则将左边的元素拷贝到原数组中
	        else if (aux[i]<aux[j])
	        {
	            a[k] = aux[i++];
	        }
	        else
	        {
	            a[k] = aux[j++];
	        }
	    }
		
	}
	
	
	
    public static int partition(int[] nums, int low, int high) {
        int key = nums[low];//基准数
        int i = low;//左指针
        int j = high;//右指针

        if (low < high) {
            while (i < j) {
                //形象点可以理解为,右指针左移
                while (i < j && nums[j] >= key) {
                    j--;
                }

                if (i < j) {
                    nums[i] = nums[j];
                    i++;
                }

                //形象点可以理解为,左指针右移
                while (i < j && nums[i] <= key) {
                    i++;
                }

                if (i < j) {
                    nums[j] = nums[i];
                    j--;
                }
            }

            //把key填入最后的位置,即基准数位
            nums[i] = key;
        }
        return i;
    }
    
    private static int Partition(int[] array, int lo, int hi)
    {
        int i = lo, j = hi + 1;
        while (true)
        {
            //从左至右扫描，如果碰到比基准元素array[lo]小，则该元素已经位于正确的分区，i自增，继续比较i+1；
            //否则，退出循环，准备交换
            while (array[++i]<array[lo])
            {
                //如果扫描到了最右端，退出循环
                if (i == hi) break;
            }

            //从右自左扫描，如果碰到比基准元素array[lo]大，则该元素已经位于正确的分区，j自减，继续比较j-1
            //否则，退出循环，准备交换
            while (array[--j]>array[lo])
            {
                //如果扫描到了最左端，退出循环
                if (j == lo) break;
            }

            //如果相遇，退出循环
            if (i >= j) break;

            //交换左a[i],a[j]右两个元素，交换完后他们都位于正确的分区
            Swap(array, i, j);
        }
        //经过相遇后，最后一次a[i]和a[j]的交换
        //a[j]比a[lo]小，a[i]比a[lo]大，所以将基准元素与a[j]交换
        Swap(array, lo, j);
        //返回扫描相遇的位置点
        return j;
    }
    public static void Swap(int[] a,int i,int j){
    	int t=a[i];
    	a[i]=a[j];
    	a[j]=t;
    }
    
	  public static int[] sort(int[] nums, int low, int high) {
	        if (low < high) {
	            int mid = Partition(nums, low, high);
	            //左边
	            sort(nums, low, mid - 1);
	            //右边
	            sort(nums, mid + 1, high);
	        }
	        return nums;
	    }
	  
	  
	  public static void Sink(int[] pq,int k,int N){
		  while (2 * k <= N)
		    {
		        int j = 2 * k;
		        if(j==N){
		        }else{
		        	if (pq[j]<pq[j + 1]) j++;
		        }
		        //去左右子节点中，稍大的那个元素做比较
		        //如果父节点比这个较大的元素还大，表示满足要求，退出
		        if (pq[k]>pq[j]) break;
		        //否则，与子节点进行交换
		        Swap(pq, k, j);
		        k = j;
		    }
	  }
	  

	  
	  public static void finalMap(int[] pq,int N){
		  for (int k = N / 2; k >= 1; k--)
		  {
		      Sink(pq, k, N);
		  }
		  while(N>0){
			 //根元素从1开始，0不存放值
		      int max = pq[1];
		      //将最后一个元素和根节点元素进行交换
		      Swap(pq, 1, N--);
		      //对根节点从上至下重新建堆
		      Sink(pq,1,N);
		      //将最后一个元素置为空
		      pq[N + 1] = 0;
		      System.out.println(max);
		  }
	  }
}
