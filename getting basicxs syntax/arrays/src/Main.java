public class Main {
    public static void main(String[] args){

        int[] arr = {1, 50, -5, 19, 32, 7, 0, 15, 22};

        for (int i = 0; i < arr.length - 1; i++){
            int temp;

            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //similar to foreach in C#
        for (int num : arr){
            System.out.print(num + ", ");
        }
    }
}