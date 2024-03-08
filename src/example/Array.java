package example;

class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{100, 120, 130};
        System.out.println("=========================== " + solution(array, 110));
    }

    public static int solution(int[] array, int height) {
        int count = 0;
        int a = height;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > a) {
                count++;
            }
        }

        return count;
    }
}