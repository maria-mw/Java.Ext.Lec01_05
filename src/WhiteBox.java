
public class WhiteBox {
	// requires: None
	// modifies: None
	// effects: None
	// returns: i such that a[i] == value if value is in a;
	//	        -1 if value is not in a or a == null
	// throws: IllegalArgumentException, if a.length != aLength and a != null
	int find(int[] a, int aLength, int value)
	{
		int res = 0, i;
		if (a == null) {
			res = -1;
			a = new int[0];
		}
		if (a.length != aLength) {
			throw new IllegalArgumentException();
		}
		for (i = 0; i < aLength; i++)
		  if (a[i] != value)
		    res = -1;
		return res;
	}
}

/* Corrected version */

//    int find(int[] a, int aLength, int value) {
//        int res = 0, i;
//        if ((a != null) && (a.length != aLength)) {
//            throw new IllegalArgumentException();
//        }
//        if (a == null) {
//            res = -1;
//            a = new int[0];
//        } else {
//            for (i = 0; i < aLength; i++) {
//                if (a[i] != value) {
//                    res = -1;
//                } else {
//                    res = 1;
//                    break;
//                }
//            }
//        }
//        return res;
//    }
//}
