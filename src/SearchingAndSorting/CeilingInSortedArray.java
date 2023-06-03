package SearchingAndSorting;

import javax.sound.midi.MidiFileFormat;

class FloorCeil {
    int floor;
    int ceil;
}

public class CeilingInSortedArray {
    public FloorCeil getFloorCeilInArray(int[] arr, int x) {
        if (arr.length == 0) return null;
        FloorCeil ans = new FloorCeil();
        int s = 0, e = arr.length-1, m;
        if (arr[s] > x)  {
            ans.ceil = arr[s];
            return ans;
        }
        if (arr[e] < x)  {
            ans.floor = arr[e];
            return ans;
        }
        while (s<=e) {
            m = (s+e)/2;
            if (arr[m] == x) {
                ans.floor = ans.ceil = x;
                return ans;
            }
            if (m-1 >= 0 && arr[m-1] < x && m+1 < arr.length && arr[m+1] > x ) {
                ans.floor = arr[m-1];
                ans.ceil = arr[m+1];
                return ans;
            }
            if (x < arr[m]) e = m-1;
            if (x > arr[m]) s = m+1;
        }
        return ans;
    }
}
