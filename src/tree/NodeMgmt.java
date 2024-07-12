package tree;

//Node 클래스
public class NodeMgmt {

  Node head = null;

  public NodeMgmt() {
  }

  public class Node {

    Node left;
    Node right;
    int value;

    public Node(int data) {
      this.value = data;
      this.left = null;
      this.right = null;
    }
  }

  public boolean insertNode(int data) {
    //CASE 1 : Node 가 하나도 없을 때
    if (this.head == null) {
      this.head = new Node(data);
    } else {
      //CASE 2 : Node 가 하나 이상 들어가 있을 때
      Node findNode = this.head;
      while (true) {
        //CASE 2-1 : 현재 Node 보다 왼쪽에 Node 가 들어가야 할 때
        if (data < findNode.value) {
          if (findNode.left != null) {
            findNode = findNode.left;
          } else {
            findNode.left = new Node(data);
            break;
          }
        } else {
          //CASE 2-2 : 현재 Node 보다 오른쪽에 Node 가 들어가야 할 때
          if (findNode.right != null) {
            findNode = findNode.right;
          } else {
            findNode.right = new Node(data);
            break;
          }
        }
      }
    }
    return true;

  }

  //search() 기능 보완하기

  //delete() 기능 보완하기

}
