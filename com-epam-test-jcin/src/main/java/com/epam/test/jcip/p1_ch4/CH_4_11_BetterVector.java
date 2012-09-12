package com.epam.test.jcip.p1_ch4;

import java.util.Vector;

import net.jcip.annotations.ThreadSafe;

/**
 * BetterVector
 * <p/>
 * Extending Vector to have a put-if-absent method
 * 
 * @author Brian Goetz and Tim Peierls
 */
@ThreadSafe
public class CH_4_11_BetterVector<E> extends Vector<E> {
	// When extending a serializable class, you should redefine serialVersionUID
	static final long serialVersionUID = -3963416950630760754L;

	public synchronized boolean putIfAbsent(E x) {
		boolean absent = !contains(x);
		if (absent)
			add(x);
		return absent;
	}
}
