package Easy;

public class BST {

        public int value;
        public BST left;
        public BST right;

        public BST(int value){
            this.value = value;
        }

        // Average: O(log(n) time | O(log(n)) space
        // Worst: O(n) time | O(n) space
        public BST insert(int value){
            if(value < this.value) {
                if (left == null) {
                    BST newBST = new BST(value);
                    left = newBST;
                } else {
                    left.insert(value);
                }
            } else {
               if(right == null) {
                BST newBST = new BST(value);
                right = newBST;
            } else {
                   right.insert(value);
               }
            }
            return this;
        }

    // Average: O(log(n) time | O(log(n)) space
    // Worst: O(n) time | O(n) space
    public boolean contains(int value){
            if (value < this.value){
                if (left == null){
                    return false;
                } else {
                    return left.contains(value);
                }
            } else if (value > this.value) {
                if(right == null){
                    return false;
                } else {
                    return right.contains(value);
                }
            } else {
                return true;
            }
    }



}
