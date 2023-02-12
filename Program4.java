class Programm4{
    public static void main(String[] args) {
        int a [] = new int[3];
        int b [] = {1, 2, 3, 4};
        int c[]= b;
        c[2] = 7;
        System.out.println(b[2]);
    }
}