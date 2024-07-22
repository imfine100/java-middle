package collection.link;

public class Node {
    /**
     * LinkedList
     * 노드를 만들고 각 노드를 서로 연결
     * 낭비되는 메모리 없이 딱 필요한 만큼만 메모리를 확보해서 사용하고,
     * 또 앞이나 중간에 데이터를 추가하거나 삭제할 때도 효율적인 자료 구조
     */
    Object item; // 내부에 저장하는 데이터
    Node next; // 다음으로 연결할 노드의 참조

    public Node(Object item) {
        this.item = item;
    }

    /*@Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }*/


    // A -> B -> C
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString(); //Ctrl + Alt + N => Inline
    }
}
