
public class Expand {
	
	public static String expand(String str) {
		String [] strArr = str.split("\\-");
		String expandString = "";
		
		for(int i = 0; i < strArr.length; i++) {
			if(i != strArr.length -1) {
				String [] strArrStart = strArr[i].split(", ");
				String [] strArraEnd = strArr[i+1].split(", ");
				
				for(int j = Integer.parseInt(strArrStart[strArrStart.length-1]) + 1; j < Integer.parseInt(strArraEnd[0]); j++) {
					strArr[i] = strArr[i] + ", " + j;
				}
			}
			
			if(expandString != "") {
				expandString = expandString + ", " + strArr[i];
			} else {
				expandString = expandString + strArr[i];
			}
		}

		return expandString;
	}

}
