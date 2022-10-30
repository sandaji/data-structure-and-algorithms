import java.util.ArrayList;

class Heap {
    void heapify(ArrayList<Integer> hT, int i) {
        int size = hT.size();
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < size && hT.get(l) > hT.get(largest))
            largest = l;

        if (r < size && hT.get(r) > hT.get(largest))
            largest = r;

        if (largest != i) {
            int temp = hT.get(largest);
            hT.set(largest, hT.get(i));
            hT.set(i, temp);

            heapify(hT, largest);
        }

    }

    void Insert(ArrayList<Integer> hT, int neNum) {
        int size = hT.size();
        if (size == 0) {
            hT.add(neNum);
        } else {
            hT.add(neNum);
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(hT, i);
            }
        }
    }

    
    void deleteNode(ArrayList<Integer> hT, int num) {
        int size = hT.size();
        int i;
        for (i = 0; i < size; i++) {
            if (num == hT.get(i))
                break;
        }
        int temp = hT.get(i);
        hT.set(i, hT.get(size - 1));
        hT.set(size - 1, temp);

        hT.remove(size - 1);
        for (int j = size / 2 - 1; j >= 0; j--) {
            heapify(hT, j);
        }
    }

    void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();
            
        Heap h = new Heap();
        h.Insert(array, 3);
        h.Insert(array, 5);
        h.Insert(array, 33);
        h.Insert(array, 36);
        h.Insert(array, 35);
        h.Insert(array, 53);
        h.Insert(array, 73);
        h.Insert(array, 93);
        h.Insert(array, 93);
        h.Insert(array, 7);

        System.out.println("max eap array i: ");
        h.printArray(array, size);

        h.deleteNode(array, 7);
        System.out.println("after deleting array i: ");
        h.printArray(array, size);

        }

    }
