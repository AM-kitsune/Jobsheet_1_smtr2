public class SingleLinkedList13 {
    Node13 head;
    Node13 tail;
    
    boolean isEmpty() {
        return head == null;
    }
    public void print() {
        if (!isEmpty()) {
            Node13 tmp = head;
            System.out.println("Isi Linked List:\t ");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else {
            System.out.println("Linked List Kosong");
        }
    }
    public void addFirst(Mahasiswa13 input){
        Node13 ndinput = new Node13(input, null);
        if (isEmpty()) {
            head = ndinput;
            tail = ndinput;
        }else {
            ndinput.next = head;
            head = ndinput;
        }
    }
    public void addLast(Mahasiswa13 input){ 
        Node13 ndinput = new Node13(input, null);
        if (isEmpty()) {
            head = ndinput;
            tail = ndinput;
        }else {
            tail.next = ndinput;
            tail = ndinput;
        }
    }
    public void insertAfter(String key, Mahasiswa13 input) {
        Node13 ndinput = new Node13(input, null);
        Node13 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndinput.next = temp.next;
                temp.next = ndinput;
                if (ndinput.next == null) {
                    tail = ndinput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertAt(int index, Mahasiswa13 input){
        if (index < 0) {
            System.out.println("indeks salah");
        }else if (index == 0) {
            addFirst(input);
        }else {
            Node13 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node13(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
    public void getData(int index){
        Node13 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }
    public int indexOf(String key){
        Node13 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        }else {
            return index;
        }
    }
    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else if (head == tail) {
            head = tail = null;
        }else {
            head = head.next;
        }
    }
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else if (head == tail) {
            head = tail = null;
        }else {
            Node13 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void remove(String key){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else {
            Node13 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key) && (temp == head))) {
                    this.removeFirst();
                    break;
                }else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        }else {
            Node13 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
