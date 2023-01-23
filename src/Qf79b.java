public class Qf79b {
  public static void main(String[] args) {
      System.out.println(isPerfectPalindromicCubeRoot(101));
      // for (int i = 0; i < 103; i++) {
      //     if (isPerfectPalindromicCubeRoot(i)) {
      //         System.out.println(String.format("%d cubed is %d", i, (int) Math.round(Math.pow(i, 3))));
      //     }
      // }
  }

  public static boolean isPerfectPalindromicCubeRoot(int x) {
    // See if I need to do Math.round
    int cube = (int) Math.round(Math.pow(x, 3));
    System.out.println(cube);
    return isPalindrome(cube);
  }

  // Challenge for myself: how to define isPalindrome without converting int to
  // string
  private static boolean isPalindrome(int x) {
    int noDigit = (int) Math.ceil(Math.log10(x));
    System.out.println(noDigit);
    for (int i = 0; i < noDigit / 2; i++) {
        boolean digitEquals = Math.round(x % Math.pow(10, i+1)) == Math.round(x / Math.pow(10, noDigit-i-1));
        System.out.println(digitEquals);
        if (!digitEquals) {
            return false;
        }
    }
    return true;
  }
}

