    public static void findTenLargest(int[] n, int index){
        int[] top = new int[10];
        if (index < 0) {
            return;
        }
        findTenLargest(n, index - 1);
        
    }
