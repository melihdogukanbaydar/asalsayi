public class Main {
    public static void main(String[] args) {
        for (int i =2; i < 100; i++){
            boolean right = true;
            for (int k =2; k < i; k++){
                if (i % k == 0){
                    right = false;

                }
            }if (right == true){
                System.out.print(" " + i);
            }
        }
    }
}