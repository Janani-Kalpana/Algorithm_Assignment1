class Algo8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, 2, 1, -9, 6};
        
        int[] union = new int[numA.length + numB.length]; // Union array
        
        int unionSize = 0; // To keep track of the union array size
        
        // Populate union array with elements from numA
        for (int num : numA) {
            union[unionSize++] = num;
        }
        
        // Populate union array with elements from numB that are not already present
        for (int num : numB) {
            boolean found = false;
            for (int i = 0; i < unionSize; i++) {
                if (num == union[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                union[unionSize++] = num;
            }
        }
        
        // Print the union of numA and numB
        System.out.print("Union of numA and numB: {");
        for (int i = 0; i < unionSize; i++) {
            System.out.print(union[i]);
            if (i < unionSize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
