public class SmallestLetter {
        // Ceiling = Smallest Number Greater than Target or Target Element
        //Floor = Greatest Number Smaller than Target or Target Element
    //744

        public char nextGreatestLetter(char[] letters, char target){
            int start = 0;
            int end = letters.length - 1;
            while (start <= end) {
                int middle = start + (end - start) / 2;

                if (target < letters[middle]) {
                    end = middle - 1;
                }else{
                    start=middle+1;
                }
            }
            return letters[start%letters.length];
            //if (start==letters.length()return 0;

        }
}
