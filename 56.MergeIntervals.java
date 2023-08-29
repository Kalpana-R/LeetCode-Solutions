class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<int[]>();
        
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));

        for(int i=0;i<intervals.length;i++) 
        {
            if(i+1 < intervals.length && intervals[i][1]>= intervals[i+1][0])
            {
                intervals[i+1][1] =Math.max(intervals[i][1], intervals[i+1][1]); 
                intervals[i+1][0] = Math.min(intervals[i][0], intervals[i+1][0]);
            }
            else
            {
                result.add(new int[]{intervals[i][0], intervals[i][1]});
            }

        }  
 

    return result.toArray(new int[0][]);
        }



        
    }
