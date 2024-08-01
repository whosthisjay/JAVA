public class EvenDigits2 {
        //1295.Find numbers with even  number of digits
        public static void main(String[] args){
            int[] nums ={12,345,-872,68,0,7896};
            System.out.print(findNumbers(nums));
        }


        static int findNumbers(int[] nums){
            int count=0;
            for(int num:nums){
                if(evenDigit(num)){
                    count++;
                }

            }
            return count;
        }

        static boolean evenDigit(int num){
            return (digits2(num)%2 ==0);

        }


        static int digits2(int num){
            if(num<0){
                num=num*(-1);
            }
            if(num==0){
                return 1;
            }

            return (int)(Math.log10(num))+1;
        }


    }

