public class Q98e3 {
    public static void main(String[] args) {
//        An assert statement is used to throw an error if args.length is not 1
//        assert args.length == 1
        System.out.println(args[0]);
        int nextx = Integer.parseInt(args[0]);
//        nextx = Q98e3.next(nextx);
//        System.out.println(nextx);
//        while (nextx != 1) {
//            nextx = Q98e3.next(nextx);
//            System.out.println(nextx);
//        }
//      This is much better!
        do {
            nextx = Q98e3.next(nextx);
            System.out.println(nextx);
        } while (nextx != 1);
    }
    public static int next(int x) {
//        if (x % 2 == 0) {
//            return x / 2;
//        } else {
//            return 3 * x + 1;
//        }
//        Solution used a one-liner:
        return (x % 2 == 0) ? (x / 2) : (3 * x + 1);
    }
}
