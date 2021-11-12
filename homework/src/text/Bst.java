package text;

import java.util.LinkedList;
import java.util.Queue;

public class Bst {
    public static void main(String[] args){
        int list[] = new int[50000];
        Tree t = new Tree();

        for(int i = 0;i < 50000;i++){
            list[i] = (int)(Math.random()* 50000) + 1;
            System.out.println(list[i]);
        }

        list = random(list);

        for(int i = 0;i < 50000;i++){
            TreeNode n = new TreeNode(list[i]);
            t.insert(n);
        }


       

    }

    public static int[] random(int[] list){
        int n,m;
        for(int i = 0;i < 50000;i++){
            n = (int)(Math.random() * 49999) + 1;
            m = list[i];
            list[i] = list[n];
            list[n] = m;
        }

        return list;
    }


    public static class TreeNode{
        int value;
        
        TreeNode left = null;
        TreeNode right = null;
        TreeNode parent = null;
        public TreeNode(){
            this.value = 0;
        }

        public TreeNode(int value){
            this.value = value;
            this.left = null;
            this.right = null;
            this.parent = null;
        }

        public TreeNode(int value,TreeNode left,TreeNode right){
            this.value = value;
            this.left = left;
            this.right = right;
            left.parent = this;
            right.parent = this;
        }
    }

    public static class Tree{
        TreeNode root;
        int size = 0;

        public Tree(){
            this.root = null;
        }

        public void insert(TreeNode node){
            if(this.root == null){
                this.root = node;
                this.size++;
            }else{
                compare(root,node);
                this.size++;
            }
        }

        public void printTree(){
            printNode(this.root);
        }

        private void printNode(TreeNode node){
            System.out.println("---------");
            System.out.println("value = " + node.value);
            if(node.parent != null) System.out.println("parent =" + node.parent.value);
            if(node.left != null) System.out.println("left = " + node.left.value);
            if(node.right != null) System.out.println("right = " + node.right.value);
            if(node.left != null){
                printNode(node.left);
            }
            if(node.right != null){
                printNode(node.right);
            }
            
        }

        private void compare(TreeNode node,TreeNode newNode){
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

        public int Level(){
            int level = 0;
            if(this.root != null){
                level = goLeft(this.root,level);
            }
            return level;
        }

        private int goLeft(TreeNode n,int l){
            if(n.left != null){
                l++;
                l = goLeft(n.left, l);
            }
            return l;
        }

        int Depth(TreeNode n){
            int depthval,depthLeft,depthRight;
            if ( n == null ){
                depthval = 0;
            } 
            else {
                depthLeft = Depth(n.left);
                depthRight= Depth(n.right);
                depthval = 1 + (depthLeft > depthRight ? depthLeft : depthRight);
            }
            
            return depthval;
        }

        public boolean isPerfect(){
            System.out.println(this.size + " " + this.Depth(this.root));
            if(this.size == Math.pow(2, this.Depth(this.root)) - 1){
                return true;
            }else{
                return false;
            }
        }

        public void breadthFirstTraversal(){
            Queue<TreeNode> q = new LinkedList<TreeNode>();
            
            System.out.println(this.root.value);
            q.add(this.root);
            while(q.size() > 0){
                TreeNode n = new TreeNode();
                n = q.poll();
                if(n.left != null){
                    System.out.println(n.left.value);
                    q.add(n.left);
                }
                if(n.right != null){
                    System.out.println(n.right.value);
                    q.add(n.right);
                }
            }
        }

    }

    public class AvlTree<E extends Comparable<E>>{
        private class Node{
            public E e;
            public Node left;
            public Node right;
            public int height;
    
            public Node(E e){
                this.e = e;
                this.left = null;
                this.right = null;
                this.height = 1;
            }
        }
    
        private Node root;
        private int size;
    
        public AvlTree(){
            root=null;
            size=0;
        }
    
        //获取某一结点的高度
        private int getHeight(Node node){
            if(node==null){
                return 0;
            }
            return node.height;
        }
        
        public int getSize(){
            return size;
        }
    
        public boolean isEmpty(){
            return size == 0;
        }
        
        /**
         * 获取节点的平衡因子
         * @param node
         * @return
         */
        private int getBalanceFactor(Node node){
            if(node==null){
                return 0;
            }
            return getHeight(node.left)-getHeight(node.right);
        }
        
        //判断树是否为平衡二叉树
        public boolean isBalanced(){
            return isBalanced(root);
        }
    
        private boolean isBalanced(Node node){
            if(node==null){
                return true;
            }
            int balanceFactory = Math.abs(getBalanceFactor(node));
            if(balanceFactory>1){
                return false;
            }
            return isBalanced(node.left)&&isBalanced(node.right);
        }
    }
}
