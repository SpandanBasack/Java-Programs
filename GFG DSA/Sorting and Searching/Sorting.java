import java.util.Scanner;
public class Sorting
{
    public static void bubbleSort(int[] arr,int size)
    {
        int temp = 0;
        for(int i = 0; i<size; i++)
        {
            for(int j = 0; j<size-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr, size, "Bubble");
    }


    public static void selectionSort(int[] arr, int size)
    {
        int temp = 0;
        for(int i=0; i<size-1; i++)
        {
            for(int j=i+1; j<size; j++)
            {
                if(arr[j]<arr[i])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr, size, "Selection");
        
    }


    public static void insertionSort(int[] arr, int size)
    {
        int temp = 0, j = 0;
        for(int i = 1; i<size; i++)
        {
            j = i-1;
            while(j>=0)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    j--;
                }
                else
                break;
            } 
        }
        print(arr, size, "Insertion");        
    }

    public static void mergeSort(int[] arr, int head, int tail)
    {
        if(head<tail)
        {
            int mid =(int) (head+tail)/2;
            mergeSort(arr, head, mid);
            mergeSort(arr, mid+1, tail);
            merge(arr,head, mid, tail);
        } 
    }

    public static void merge(int[] arr, int head, int mid, int tail)
    {
        int n1 = mid-head+1;
        int n2 = tail-mid;
        int n = tail - head + 1;
        int arr1[] = new int[n];
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];
        for(int i = 0; i<n1; i++)
            leftArray[i] = arr[head+i];
        for(int i = 0; i<n2; i++)
            rightArray[i] = arr[mid+1+i];
        int i = 0, j = 0, k = 0;
        while(i<n1 && j<n2)
        {
            if(leftArray[i]<=rightArray[j])
            {
                arr1[k] = leftArray[i];
                k++;
                i++;
            }
            else
            {
                arr1[k] = rightArray[j];
                k++;
                j++;
            }
        }
        while(i<n1)
        {
            arr1[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr1[k] = rightArray[j];
            j++;
            k++;
        }
        for(int l = 0; l<n; l++)
            arr[head+l] = arr1[l];
    }

    public static void quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }        
    }

    public static int partition(int[] arr, int low, int high)
    {
        int i = low-1, j, temp = 0;
        int pivot = high;
        for(j = low; j<high; j++)
        {
            if(arr[j]<arr[pivot])
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;
        return i;
    }

    public static void binarySearch(int[] arr, int size)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to be searched:");
        int key = sc.nextInt();
        mergeSort(arr, 0, size-1);
        int low = 0, high = size - 1, mid = 0, pos = -1;
        while(low<=high)
        {
            mid = (int) (low+high)/2;
            if(arr[mid] == key)
            {
                pos = mid;
                break;
            }
            else if(key<mid)
                high = mid - 1;
            else if(key>mid)
                low = mid+1;
        }
        if(pos == -1)
            System.out.println("The item you are searching has not been found in the array.");
        else
        {
            pos = pos + 1;
            System.out.println("The item you are searching is present in the sorted array in position "+pos+".");
            print(arr, size, "Merge");
        }
        
    }

    public static void print(int []arr,int size,String type)
    {
        System.out.println("The sorted array using "+type+" Sort:");
        for(int i = 0; i<size; i++)
            System.out.print(arr[i]+" ");
    }


    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array you want to enter:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the corresponding value for your preferred sorting algorithm:");
        System.out.println("1 - Bubble Sort\n"+"2 - Selection Sort\n"+"3 - Insertion Sort\n"+"4 - Merge Sort\n"+"5 - Quick Sort");
        System.out.println("6 - Binary Search");
        System.out.println("Enter your choice:");
        int s = sc.nextInt();
        switch(s)
        {
            case 1:
                bubbleSort(arr, n);
                break;
            case 2:
                selectionSort(arr, n);
                break;
            case 3:
                insertionSort(arr, n);
                break;
            case 4:
                mergeSort(arr, 0, n-1);
                print(arr, n, "Merge");
                break;
            case 5:   
                quickSort(arr, 0, n-1);
                print(arr, n, "Quick");
                break;
            case 6:
                binarySearch(arr, n);
                break;
            default:
                System.out.println("Wrong Choice.");
        } 
    }
}