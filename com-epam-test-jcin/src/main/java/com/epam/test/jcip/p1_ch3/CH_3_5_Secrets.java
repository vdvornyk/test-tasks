package com.epam.test.jcip.p1_ch3;

import java.util.HashSet;
import java.util.Set;

/**
 * Secrets
 * 
 * Publishing an object
 * 
 * @author Brian Goetz and Tim Peierls
 */
class CH_3_5_Secrets {
	public static Set<Secret> knownSecrets;

	public void initialize() {
		knownSecrets = new HashSet<Secret>();
	}
}

class Secret {
}
