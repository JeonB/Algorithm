public class PriorityQueue {
    int arr[] = {0, 24, 5, 15, 8, 9, 3, 33};
    int size = arr.length-1;

    public static void main(String[] args) {
    }
    public void max_heapify (int arr[], int i) //최대힙
    {
        int largest = i;
        int left = 2*i;              //left child
        int right = 2*i +1 ;         //right child

        // 현재 요소 i와 자식 노드의 값을 비교
        if(left <= size && arr[left] > arr[i] )
            largest = left;
        if(right <= size && arr[right] > arr[largest] )
            largest = right;

        // 자식 노드의 값이 더 크다면 교환하고 교환된 자식 노드부터 heapify 진행
        if(largest != i ) {
            swap (i , largest);
            max_heapify (arr, largest);
        }
        System.out.println();
    }
    public void swap(int i, int largest){
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;
    }
}
