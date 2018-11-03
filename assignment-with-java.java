public class PeachAssignment{

    static int getPossibleMobileNumbers(int digits, String[] reservedPrefixesArray){
        int totalPossibilities = (int) Math.pow(10,digits);
        int reservedPrefixesPossibilities = 0;
        for(int i=0; i<reservedPrefixesArray.length;i++) {
            reservedPrefixesPossibilities = (int) (reservedPrefixesPossibilities + Math.pow(10,digits-reservedPrefixesArray[i].length()));
        }
        return totalPossibilities - reservedPrefixesPossibilities;
    }

    public static void main(String[] args) {
        int actualPossibilities;
        String[] reservedPrefixesArray1 = {"0","2","100"};
        actualPossibilities = getPossibleMobileNumbers(7, reservedPrefixesArray1);
        System.out.println(actualPossibilities);
        String[] reservedPrefixesArray2 = {"1","2","3"};
        actualPossibilities = getPossibleMobileNumbers(6, reservedPrefixesArray2);
        System.out.println(actualPossibilities);
        String[] reservedPrefixesArray3 = {"10","20"};
        actualPossibilities = getPossibleMobileNumbers(3, reservedPrefixesArray3);
        System.out.println(actualPossibilities);
    }
}
