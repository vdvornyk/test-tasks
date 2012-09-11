package com.epam.test.jcip.p1_ch3;

/**
 * SafeListener
 * <p/>
 * Using a factory method to prevent the this reference from escaping during construction
 * 
 * @author Brian Goetz and Tim Peierls
 */
public class CH_3_8_SafeListener {
	private final EventListener listener;

	private CH_3_8_SafeListener() {
		listener = new EventListener() {
			public void onEvent(Event e) {
				doSomething(e);
			}
		};
	}

	public static CH_3_8_SafeListener newInstance(EventSource source) {
		CH_3_8_SafeListener safe = new CH_3_8_SafeListener();
		source.registerListener(safe.listener);
		return safe;
	}

	void doSomething(Event e) {
	}

	interface EventSource {
		void registerListener(EventListener e);
	}

	interface EventListener {
		void onEvent(Event e);
	}

	interface Event {
	}
}
