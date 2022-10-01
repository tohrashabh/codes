  public int solve(int[] A) {
        HashMap<Integer,Integer>counts = new HashMap<>();
        int ans = 0;

        for(int i = 0 ; i < A.length ; i++){
            if(counts.containsKey(A[i])){
                counts.put(A[i],counts.get(A[i])+1);
            }else{
                 counts.put(A[i],1);
            }
        }

         for(int i = 0 ; i < A.length ; i++){
            if(counts.get(A[i]) == 1){
                ans++;
            }
        }
        return ans;

    }
