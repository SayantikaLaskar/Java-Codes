public class placeTiles {
    public static int tiles(int n, int m){
        if(n==m){
            return  2;
        }
        if(n<m){
            return 1;
        }

        //vertically
        int vertPlacements = tiles(n-m, m);

        //horizontally
        int horPlacements = tiles(n-1, m);

        return vertPlacements+horPlacements;

    }

    public static void main(String[] args) {
        int n=4, m=2;
        System.out.println(tiles(n, m));
    }
    
}
