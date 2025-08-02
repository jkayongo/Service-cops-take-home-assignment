public class Task2 {
    public static int findMissingNumber(int[] oldArray ){
        int newArrayLength = oldArray.length + 1;
        int sumOfNumbersInTheNewArray = newArrayLength * (newArrayLength + 1)/2;
        int sumOfNumbersInTheOldArray = 0;
        for(int number: oldArray){
            sumOfNumbersInTheOldArray = sumOfNumbersInTheOldArray + number;
        }
        int missingNumber = sumOfNumbersInTheNewArray - sumOfNumbersInTheOldArray;
        return missingNumber;
    }
    public static void main(String[] args) {
        int[] arrayOfNumbers = {3, 7, 1, 2, 8, 4, 5};
        int displayMissingNumber = findMissingNumber(arrayOfNumbers);
        System.out.println("The missing number is: " + displayMissingNumber);
    }
}
