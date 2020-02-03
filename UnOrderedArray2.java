package com.company;

public class UnOrderedArray {
    private int[] m_array;
    private int maxSize;
    private int numElements;

    public UnOrderedArray(int maxSize) {
        this.m_array = new int[maxSize];
        this.maxSize = maxSize;
        this.numElements = 0;
    }

    public void addLast(int item){
        if(numElements < maxSize){
            m_array[numElements] = item;
            numElements++;
        }
    }

    public int linearSearch(int key){
        for(int x=0;x<numElements; x++){
          if(m_array[x] == key){
              return x;
          }
        }
        return -1;
    }
    public int binarySearch(int key){
        int index = 0;
        int lo = 0;
        int hi = numElements-1;
        int mid;
        while(lo <= hi){
            mid = (lo+hi)/2;
            if(m_array[mid]==key)
                return mid;
            if(m_array[mid] < key)
                lo=mid+1;
            else
                lo=mid-1;
        }
        return -1;
    }

    public void removeLast(){
        if(numElements > 0){
            numElements--;
        }
    }

    public void removeByIndex(int index) {
        for (int x = 0; x < numElements; x++) {
            //get our index
            if (m_array[x] == index) {
                for (int y = x; y < numElements; y++) {
                    //start from index
                    m_array[numElements] = m_array[numElements + 1];
                }
            }
        }
    }
    public void selectionSort(){
            for(int x=0;x<numElements;x++){
                int locSmall = x;
             for(int y=x+1;y<numElements;y++){
                 if(m_array[y] < m_array[locSmall]){
                     locSmall = y;
                 }
             }
             int temp = m_array[x];
             m_array[x] = m_array[locSmall];
             m_array[locSmall] = temp;
            }

        }
        public void insertionSort(){
            for(int x=1;x<numElements;x++){
                int temp = m_array[x];
                int pos = x-1;
                while(pos>= 0 && m_array[pos]>temp){
                    m_array[pos+1] = m_array[pos]; //shift item up
                    pos--; //more position left
                    }
                m_array[pos+1] = temp;
                }
            }

}
