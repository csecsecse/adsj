class BSTNode {
    String key;
    Integer value;
    BSTNode left, right;

    public BSTNode(String key, Integer value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    private BSTNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Insert a key-value pair into the BST
    public void insert(String key, Integer value) {
        root = insertRec(root, key, value);
    }

    private BSTNode insertRec(BSTNode root, String key, Integer value) {
        if (root == null) {
            root = new BSTNode(key, value);
            return root;
        }
        if (key.compareTo(root.key) < 0) {
            root.left = insertRec(root.left, key, value);
        } else if (key.compareTo(root.key) > 0) {
            root.right = insertRec(root.right, key, value);
        }
        return root;
    }

    // In-order traversal of the BST
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key + ": " + root.value);
            inorderRec(root.right);
        }
    }

    // Search for a key in the BST
    public Integer search(String key) {
        BSTNode result = searchRec(root, key);
        return result != null ? result.value : null;
    }

    private BSTNode searchRec(BSTNode root, String key) {
        if (root == null || root.key.equals(key)) {
            return root;
        }
        if (key.compareTo(root.key) < 0) {
            return searchRec(root.left, key);
        }
        return searchRec(root.right, key);
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert key-value pairs into the BST
        bst.insert("apple", 10);
        bst.insert("banana", 20);
        bst.insert("cherry", 30);
        bst.insert("date", 40);
        bst.insert("fig", 50);
        bst.insert("grape", 60);
        bst.insert("kiwi", 70);
        bst.insert("lemon", 80);
        bst.insert("mango", 90);

        // Display the BST in sorted order
        System.out.println("In-order traversal of the BST:");
        bst.inorder();

        // Search for specific keys
        System.out.println("\nSearch results:");
        System.out.println("Search for 'banana': " + bst.search("banana"));
        System.out.println("Search for 'kiwi': " + bst.search("kiwi"));
        System.out.println("Search for 'orange': " + bst.search("orange"));
    }
}
