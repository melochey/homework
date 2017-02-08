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
	        aux = new int[array.length]; // ������һ��
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
		//��Ԫ�ؿ���������������
	    for (int k = l; k <= h; k++)
	    {
	        aux[k] = a[k];
	    }
	    //Ȼ���չ������ݴӸ��������п�����ԭʼ��array��
	    for (int k = l; k <= h; k++)
	    {
	        //������Ԫ��û�ˣ� ֱ�ӽ��ұߵ�ʣ��Ԫ�ض��ϲ�����ԭ������
	        if (i > m)
	        {
	            a[k] = aux[j++];
	        }//����ұ�Ԫ��û���ˣ�ֱ�ӽ��������ʣ��Ԫ�ض��ϲ���ԭ������
	        else if (j > h)
	        {
	            a[k] = aux[i++];
	        }//�������ұ�С������ߵ�Ԫ�ؿ�����ԭ������
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
        int key = nums[low];//��׼��
        int i = low;//��ָ��
        int j = high;//��ָ��

        if (low < high) {
            while (i < j) {
                //�����������Ϊ,��ָ������
                while (i < j && nums[j] >= key) {
                    j--;
                }

                if (i < j) {
                    nums[i] = nums[j];
                    i++;
                }

                //�����������Ϊ,��ָ������
                while (i < j && nums[i] <= key) {
                    i++;
                }

                if (i < j) {
                    nums[j] = nums[i];
                    j--;
                }
            }

            //��key��������λ��,����׼��λ
            nums[i] = key;
        }
        return i;
    }
    
    private static int Partition(int[] array, int lo, int hi)
    {
        int i = lo, j = hi + 1;
        while (true)
        {
            //��������ɨ�裬��������Ȼ�׼Ԫ��array[lo]С�����Ԫ���Ѿ�λ����ȷ�ķ�����i�����������Ƚ�i+1��
            //�����˳�ѭ����׼������
            while (array[++i]<array[lo])
            {
                //���ɨ�赽�����Ҷˣ��˳�ѭ��
                if (i == hi) break;
            }

            //��������ɨ�裬��������Ȼ�׼Ԫ��array[lo]�����Ԫ���Ѿ�λ����ȷ�ķ�����j�Լ��������Ƚ�j-1
            //�����˳�ѭ����׼������
            while (array[--j]>array[lo])
            {
                //���ɨ�赽������ˣ��˳�ѭ��
                if (j == lo) break;
            }

            //����������˳�ѭ��
            if (i >= j) break;

            //������a[i],a[j]������Ԫ�أ�����������Ƕ�λ����ȷ�ķ���
            Swap(array, i, j);
        }
        //�������������һ��a[i]��a[j]�Ľ���
        //a[j]��a[lo]С��a[i]��a[lo]�����Խ���׼Ԫ����a[j]����
        Swap(array, lo, j);
        //����ɨ��������λ�õ�
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
	            //���
	            sort(nums, low, mid - 1);
	            //�ұ�
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
		        //ȥ�����ӽڵ��У��Դ���Ǹ�Ԫ�����Ƚ�
		        //������ڵ������ϴ��Ԫ�ػ��󣬱�ʾ����Ҫ���˳�
		        if (pq[k]>pq[j]) break;
		        //�������ӽڵ���н���
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
			 //��Ԫ�ش�1��ʼ��0�����ֵ
		      int max = pq[1];
		      //�����һ��Ԫ�غ͸��ڵ�Ԫ�ؽ��н���
		      Swap(pq, 1, N--);
		      //�Ը��ڵ�����������½���
		      Sink(pq,1,N);
		      //�����һ��Ԫ����Ϊ��
		      pq[N + 1] = 0;
		      System.out.println(max);
		  }
	  }
}
