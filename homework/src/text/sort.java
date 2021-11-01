package text;

public class sort {
    public static void main(String[] args){
        int[] list1 = new int[50000];
        int[] list2 = new int[100000];
        int[] list3 = new int[150000];
        int[] list4 = new int[200000];
        int[] list5 = new int[250000];
        int[] list6 = new int[300000];

        list1 = getRandomList(list1);
        list2 = getRandomList(list2);
        list3 = getRandomList(list3);
        list4 = getRandomList(list4);
        list5 = getRandomList(list5);
        list6 = getRandomList(list6);

        int[][] allList = {list1,list2,list3,list4,list5};

        for(int i = 0;i < 5;i++){
            int[] temp = allList[i];
            long startTime = System.currentTimeMillis();
            selectSort(temp);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("大小为" + temp.length + "的数组选择排序所用时间为" + executionTime);
        }

        for(int i = 0;i < 5;i++){
            int[] temp = allList[i];
            long startTime = System.currentTimeMillis();
            bubblingSort(temp);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("大小为" + temp.length + "的数组冒泡排序所用时间为" + executionTime);
        }

        for(int i = 0;i < 5;i++){
            int[] temp = allList[i];
            long startTime = System.currentTimeMillis();
            mergeSort(temp);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("大小为" + temp.length + "的数组归并排序所用时间为" + executionTime);
        }

        for(int i = 0;i < 5;i++){
            int[] temp = allList[i];
            long startTime = System.currentTimeMillis();
            quickSort(temp);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("大小为" + temp.length + "的数组快速排序所用时间为" + executionTime);
        }

        for(int i = 0;i < 5;i++){
            int[] temp = allList[i];
            long startTime = System.currentTimeMillis();
            heapSort(temp);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("大小为" + temp.length + "的数组堆排序所用时间为" + executionTime);
        }

        for(int i = 0;i < 5;i++){
            int[] temp = allList[i];
            long startTime = System.currentTimeMillis();
            radixSort(temp);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("大小为" + temp.length + "的数组基数排序所用时间为" + executionTime);
        }
        
        

        // selectSort(list1);
        // bubblingSort(list1);
        // mergeSort(list1);
        // quickSort(list1);
        // heapSort(list1);
        // radixSort(list1);

        // for(int i = 0;i < list1.length;i++){
        //     System.out.print(list1[i] + " ");
        // }


    }

    public static int[] getRandomList(int[] list){
        for(int j = 0;j < list.length;j++){
            list[j] = (int)(Math.random() * list.length + 1);
        }
        return list;
    }

    //选择排序
    public static void selectSort(int[] oldList){
        int[] list = new int[oldList.length];
        System.arraycopy(oldList, 0, list, 0, oldList.length);
        long startTime = System.currentTimeMillis();
        int min,num = 0,m;
        for(int i = 0;i < list.length;i++){
            min = list.length + 1;
            for(int j = i;j < list.length;j++){
                if(list[j] < min){
                    min = list[j];
                    num = j;
                }
            }
            m = list[i];
            list[i] = list[num];
            list[num] = m;
        }
    } 


    //冒泡排序
    public static void bubblingSort(int[] oldList){
        int[] list = new int[oldList.length];
        System.arraycopy(oldList, 0, list, 0, oldList.length);
        for(int i =0 ; i < list.length-1 ; i++) { 
           
            for(int j=0 ; j<list.length-1-i ; j++) {  
 
                if(list[j] > list[j+1]) {
                    int temp = list[j];
                     
                    list[j] = list[j+1];
                     
                    list[j+1] = temp;
            }
            }    
        }
    }

    //归并排序
    public static void mergeSort(int[] oldList){
        int[] list = new int[oldList.length];
        System.arraycopy(oldList, 0, list, 0, oldList.length);
        if(list.length > 1){
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, list);
        }
    }

    public static void merge(int[] list1,int[] list2,int[] temp){
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while(current1 < list1.length && current2 < list2.length){
            if(list1[current1] < list2[current2]){
                temp[current3++] = list1[current1++];
            }else{
                temp[current3++] = list2[current2++];
            }
        }

        while(current1 < list1.length && current1 + 1 < list1.length){
            temp[current3++] = list1[current1++];
        }

        while(current2 < list2.length && current2 + 1 < list2.length){
            temp[current3++] = list2[current2++];
        }
    }

    //快速排序
    public static void quickSort(int[] oldlist){
        int[] list = new int[oldlist.length];
        System.arraycopy(oldlist, 0, list, 0, oldlist.length);
        quickSort(list, 0, list.length - 1);
    }

    public static void quickSort(int[] list, int  first, int last){
        if(last > first){
            //定位主元
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    public static int partition(int[] list,int first,int last){
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        //排序
        while(high > low){
            while(low <= high && list[low] <= pivot)
                low++;
            
            while(low <= high && list[low] > pivot)
                high--;
            
            if(high > low){
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        
        //特殊情况
        while(high > first && list[high] >= pivot){
            high--;
        }

        //确定主元位置
        if(pivot > list[high]){
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }else{
            return first;
        }
    }

    //堆排序
    public static void heapSort(int[] list){
        int[] arr = new int[list.length];
        System.arraycopy(list, 0, arr, 0, list.length);
        for(int i=arr.length/2-1;i>=0;i--){
            adjustHeap(arr,i,arr.length);
        }
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }
 
    }

    public static void adjustHeap(int []arr,int i,int length){
        int temp = arr[i];
        for(int k=i*2+1;k<length;k=k*2+1){
            if(k+1<length && arr[k]<arr[k+1]){
                k++;
            }
            if(arr[k] >temp){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;
    }

    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    //基数排序
    public static void radixSort(int[] list) {
        int[] arr = new int[list.length];
        System.arraycopy(list, 0, arr, 0, list.length);
        int max = arr[0];
        int exp;

        for (int anArr : arr) {
            if (anArr > max) {
                max = anArr;
            }
        }

        for (exp = 1; max / exp > 0; exp *= 10) {
            int[] temp = new int[arr.length];
            int[] buckets = new int[10];

            for (int value : arr) {
                buckets[(value / exp) % 10]++;
            }

            for (int i = 1; i < 10; i++) {
                buckets[i] += buckets[i - 1];
            }

            for (int i = arr.length - 1; i >= 0; i--) {
                temp[buckets[(arr[i] / exp) % 10] - 1] = arr[i];
                buckets[(arr[i] / exp) % 10]--;
            }

            System.arraycopy(temp, 0, arr, 0, arr.length);
        }

    }

    
}
