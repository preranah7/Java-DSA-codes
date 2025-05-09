package DividenConquer;

//question - input:sorted, rotated array with distinct numbers (in ascending order). It is rotated at a pivot point. Find the index of the given element.
//{4,5,6,7,0,1,2} target=0 
//modified binary search

public class question {

    public static int search(int arr[], int tar, int si, int ei){
        if(si > ei){
            return -1;
        }

        //kaam
        int mid = si + (ei-si)/2;

        //case FOUND
        if(arr[mid] == tar){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
            //case a : left
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr,tar,si,mid-1);//mid-1 coz for mid case already written
            } else {
                //case b : right
                return search(arr, tar, mid+1, ei);
            }
        }

        //mid on L2
        else {
            //case c : right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            } else {
                //case d : left
                return search(arr, tar, si, mid-1);
            }
        }
    }

    public static int iterativeSearch(int arr[], int tar, int si, int ei){
        
        while(si<=ei){

            int mid = si + (ei-si)/2;
            
            if(arr[mid] == tar){
                return mid;
            }

            //mid on L1
            if(arr[si] <= arr[mid]){
                //case a : left
                if(arr[si]<=tar && tar<=arr[mid]){
                    ei = mid-1;
                } else {
                    //case b : right
                    si = mid+1;
                }
            }

            //mid on L2
            else {
                //case c : right
                if(arr[mid] <= tar && tar <= arr[ei]){
                    si = mid+1;
                } else {
                    //case d : left
                    ei = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0; //output -> 4

        //int tarIdx = search(arr, target, 0, arr.length);
        int tarIdx = iterativeSearch(arr, target, 0, arr.length);
        System.out.println(tarIdx);
    }
}