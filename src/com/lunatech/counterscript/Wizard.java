package com.lunatech.counterscript;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.log.Log;

@Name("wizard")
@Scope(ScopeType.CONVERSATION)
public class Wizard {

	private int step;

	@Logger
	private Log log;

	public int getStep() {
		return step;
	}

	public void cancel() {
		log.info("cancel()");
	}

	public void start() {
		log.info("start()");
		step = 1;
	}

	public void proceed() {
		step++;
	}

	public void left() {
		proceed();
	}

	public void middle() {
		proceed();
	}

	public void right() {
		proceed();
	}

}
