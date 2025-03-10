package DAA_06_Sorting;

import java.util.Arrays;


public class L_07_MergeOverlappingIntervals {
    public static void main(String[] args) {
        Interval[] intervals = {new Interval(1, 3), new Interval(2, 4), new Interval(5, 7), new Interval(6, 8)};
        Arrays.sort(intervals);

        for (int i = 1; i < intervals.length; i++) {
            Interval oldInt = intervals[i-1];
            Interval currentInd = intervals[i];
            if (currentInd.startTime >= oldInt.startTime && currentInd.startTime <= oldInt.endTime) {
                currentInd.startTime = oldInt.startTime;
                currentInd.endTime = Math.max(oldInt.endTime, currentInd.endTime);
                unsetTime(oldInt);
            }
        }

        Arrays.stream(intervals).toList().forEach(interval -> {
            if (interval.startTime != Integer.MIN_VALUE) {
                System.out.println(interval);
            }
        });
    }

    private static void unsetTime(Interval oldInt) {
        oldInt.endTime = Integer.MIN_VALUE;
        oldInt.startTime = Integer.MIN_VALUE;
    }


    static class Interval implements Comparable<Interval>{
        int startTime;
        int endTime;

        Interval(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }

        @Override
        public int compareTo(Interval o) {
            return this.startTime - o.startTime;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "startTime=" + startTime +
                    ", endTime=" + endTime +
                    '}';
        }
    }
}

/**

 Interval[] intervals = {new Interval(5, 10), new Interval(3, 15), new Interval(18, 30), new Interval(2, 7)};
 Interval[] intervals = {new Interval(1, 3), new Interval(2, 4), new Interval(5, 7), new Interval(6, 8)};
 Interval[] intervals = {new Interval(7, 9), new Interval(6, 10), new Interval(4, 5), new Interval(1, 3), new Interval(2, 4)};

 */
