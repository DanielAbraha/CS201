package lab12;

public class CountCharacter {
        public static void main(String[] args) {

            System.out.println(countLen("Daniel"));
        }

        public static int countLen(String str){

            if(str.isEmpty()){
                return 0;
            }
            else{
                return 1 + countLen(str.substring(1));
            }

        }
    }


