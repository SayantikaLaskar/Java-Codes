class islandperimeter {
    public int calculate(int[][] grid) {
        int p=0, r=grid.length, c=grid[0].length;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j]==1){
                    p+=4;
                    if(i>0 && grid[i-1][j]==1){
                        p-=2;
                    }
                    if(j>0 && grid[i][j-1]==1){
                        p-=2;
                    }
                }
            }
        }
        return p;
    }
    public static void main(String[] args) {
        int[][] grid = {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };
        
        islandperimeter islandPerimeter = new islandperimeter();
        int perimeter = islandPerimeter.calculate(grid);
        System.out.println("Perimeter of the island: " + perimeter);
    }
}

