package LeetCode;

/**
 * Created by sunginjung on 1/4/18.
 */
public class judgeCircle {

    public static boolean judgeCircle(String moves) {
        int position = 0;

        for(int i = 0; i < moves.length(); i++){
            switch (moves.charAt(i)){
                case 'L':
                case 'D':
                    position -= 1;
                    break;
                case 'R':
                case 'U':
                    position += 1;
                    break;

            }
        }

        if(position == 0){
            return true;
        }

        return false;
    }
}
