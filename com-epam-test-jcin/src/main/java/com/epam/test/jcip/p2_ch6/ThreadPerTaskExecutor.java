package com.epam.test.jcip.p2_ch6;

import java.util.concurrent.Executor;

/**
 * ThreadPerTaskExecutor
 * <p/>
 * Executor that starts a new thread for each task
 * 
 * @author Brian Goetz and Tim Peierls
 */
public class ThreadPerTaskExecutor implements Executor {
	public void execute(Runnable r) {
		new Thread(r).start();
	};
}
