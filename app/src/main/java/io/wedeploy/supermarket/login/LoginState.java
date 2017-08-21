package io.wedeploy.supermarket.login;

import io.wedeploy.supermarket.util.State;

/**
 * @author Silvio Santos
 */
public class LoginState {

	public LoginState(State state) {
		this.state = state;
	}

	public LoginState(State state, Exception exception) {
		this.state = state;
		this.exception = exception;
	}

	public State getState() {
		return state;
	}

	public Exception getException() {
		return exception;
	}

	private Exception exception;
	private State state;

}
