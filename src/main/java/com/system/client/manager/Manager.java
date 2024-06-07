package com.system.client.manager;

public abstract class Manager<E> {
	public abstract void create(E input);

	public abstract void update(E input);

	public abstract void delete(E input);
}
