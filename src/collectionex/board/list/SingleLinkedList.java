package collectionex.board.list;

public class SingleLinkedList<T> {

  public Node<T> head = null; //시작값

  public class Node<T> {

    T data;
    Node<T> next = null;

    public Node(T data) {
      this.data = data;
    }
  }

  //노드 추가
  public void addNode(T data) {
    if (head == null) {
      head = new Node<T>(data);
    } else {
      Node<T> node = this.head;
      while (node.next != null) {
        node = node.next;
      }
      node.next = new Node<T>(data);
    }
  }

  //모든 node 출력
  public void printAll() {
    if (head != null) {
      Node<T> node = this.head;
      System.out.println(node.data);
      while (node.next != null) {
        node = node.next;
        System.out.println(node.data);
      }
    }
  }

  //원하는 노드 찾기
  public Node<T> search(T data) {
    if (this.head == null) {
      return null;
    } else {
      Node<T> node = this.head;
      while (node != null) {
        if (node.data == data) {
          return node;
        } else {
          node = node.next;
        }
      }
      return null;
    }
  }

  //노드 삽입
  public void addNodeInside(T data, T isData) {
    Node<T> searchedNode = this.search(isData);

    if (searchedNode == null) {
      this.addNode(data);
    } else {
      Node<T> nextnode = searchedNode.next;
      searchedNode.next = new Node<T>(data);
      searchedNode.next.next = nextnode;
    }

  }

  //노드 삭제
  public boolean delNode2(T isData) {
    if (this.head == null) {
      return false;
    } else {
      Node<T> node = this.head.next;
      if (head.data == isData) {
        head = node;
        return true;
      }

      if (node.data == isData) {
        //this.head = this.head.next;//헤드 다음의 값을 헤드로 만들어줌.
        this.head.next = node.next;
        return true;
      } else {
        while (node.next != null) {
          if (node.next.data == isData) {
            node.next = node.next.next;
            return true;
          }
          node = node.next;
        }
        return false;
      }

    }
  }
}