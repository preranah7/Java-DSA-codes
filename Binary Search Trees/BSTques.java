package BST_Class;

import java.util.ArrayList;

public class BSTques {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        System.out.print("null"+" ");
        preorder(root.right);
        
    }


    //que - sorted array to balanced BST
    public static Node createBST(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    
    }

    //que - 2 Convert BST to balance bst
    public static void getInorder(Node root,ArrayList<Integer>inorder){
        if(root==null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createbst(ArrayList<Integer>inorder, int st,int end){
        if(st>end){
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createbst(inorder, st, mid-1);
        root.right = createbst(inorder, mid+1, end);

        return root;
    }

    public static Node balancedBST(Node root){
        //inorder seq
        ArrayList<Integer>inorder = new ArrayList<>();
        getInorder(root, inorder);

        //sorted inorder --> balanced BST
        root = createbst(inorder, 0, inorder.size()-1);

        return root;
    }

    public static void main(String[] args) {
        //int arr[] = {3,5,6,8,10,11,12};//sorted - inorder
        //    8
        //   / \
        //  5   11
        // / \ /  \
        //3  6 10 12
        // Node root = createBST(arr, 0, arr.length-1);
        // preorder(root);//8536111012




        //que2-
                    //       8
                    //      / \
                    //     6  10
                    //    /     \
                    //   5       11
                    //  /         \
                    // 3           12
                    //given BST

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        //expected tree
        //    8
        //   / \
        //  5   11
        // / \ /  \
        //3  6 10 12

        root = balancedBST(root); //O(n)
        preorder(root);
    }
}
