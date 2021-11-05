package text;

public class Bst {
    public static <E> void main(String[] args){
        Tree<E> t;
        TreeNode<E> n;
    }

    public class TreeNode<E>{
        int value;
        TreeNode<E> left = null;
        TreeNode<E> right = null;
        TreeNode<E> parent = null;

        public TreeNode(int value){
            this.value = value;
        }

        public TreeNode(int value,TreeNode<E> left,TreeNode<E> right){
            this.value = value;
            this.left = left;
            this.right = right;
            left.parent = this;
            right.parent = this;
        }
    }

    public class Tree<E>{
        TreeNode<E> root;

        public Tree(){
            this.root = null;
        }

        public void insert(TreeNode<E> node){
            if(this.root == null){
                this.root = node;
            }else{
                compare(root,node);
            }
        }

        public void printTree(){
            System.out.println("root = " + this.root.value);
            printNode(this.root);
        }

        private void printNode(TreeNode<E> node){
            System.out.println("parent =" + node.parent.value);
            System.out.println("left = " + node.left.value);
            System.out.println("right = " + node.left.value);
            if(node.left != null){
                printNode(node.left);
            }
            if(node.right != null){
                printNode(node.right);
            }
        }

        private void compare(TreeNode<E> node,TreeNode<E> newNode){
            if(node.value > newNode.value){
                if(node.left == null){
                    node.left = newNode;
                    newNode.parent = node;
                }else{
                    compare(node.left,newNode);
                }
            }else if(node.value < newNode.value){
                if(node.right == null){
                    node.right = newNode;
                    newNode.parent = node;
                }else{
                    compare(node.right,newNode);
                }
            }

        }
    }


}
