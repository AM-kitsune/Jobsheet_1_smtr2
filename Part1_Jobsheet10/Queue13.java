public class Queue13 {

    int[] data;
    int front, rear, size, max;

    public Queue13(int n) {
        max = n;
        data = new int[max];
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if (size == 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean IsFull(){
        if (size == max) {
            return true;
        }else {
            return false;
        }
    }

    public void peek(){
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        }else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print(){
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i+1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear(){
        if (!IsEmpty()) {
            front = rear -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt){
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0);
        }else {
            if (IsEmpty()) {
                front = rear =0;
            }else {
                if (rear == max -1) {
                    rear = 0; 
                }else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int Dequeue(){
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0);
        }else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            }else {
                if (front == max -1) {
                    front = 0;
                }else {
                    front++;
                }
            }
        }
        return dt;
    }
}