//custom exception as user defined exception created by extending exception class in java. program handling of array index out of bound exception

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}


public class Exception1{
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50;  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught array index exception: " + e.getMessage());
        }
        
        try {
            validateArrayIndex(10, 5);
        } catch (CustomException e) {
            System.out.println("Custom exception: " + e.getMessage());
        }
    }
    
    static void validateArrayIndex(int index, int arraySize) throws CustomException {
        if (index >= arraySize) {
            throw new CustomException("Array index " + index + " exceeds size " + arraySize);
        }
    }
}
