    public static int findMax(int[] n, int index){
        if(index == 0) {
            return n[0];
        }
        if(index > n.length - 1)
        {
            System.out.print("index should be smaller than array size");
        }
        int maxSoFar = findMax(n, index - 1);

        return Math.max(n[index], maxSoFar);
        //it has 1 recursive call and make 1 comparison so the running time is O(n)
    }
