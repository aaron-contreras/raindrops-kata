class RaindropConverter {

    String convert(int number) {
	// keep a string for the return value
	String s = "";

	/* check each of the three conditions
	   independently, adding to the empty string if
	   the conditions are true*/
	
	if (number % 3 == 0) {
	    s = s + "Pling";
	}
	if (number % 5 == 0) {
	    s = s + "Plang";
	}
	if (number % 7 == 0) {
	    s = s + "Plong";
	}
	
	if (s.equals("")) {
	    /* if after evaluating the three conditions
	       the string remains empty, there are no
	       factors*/
	    return Integer.toString(number);
	} else {
	    return s;
	}
    }

}
