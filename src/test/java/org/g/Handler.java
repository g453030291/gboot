package org.g;

/**
 * @author g
 * @date 2020/12/26 10:04 下午
 */
public abstract class Handler {

	protected Handler successor = null;

	public void setSuccessor(Handler successor){
		this.successor = successor;
	}

	public final void handler2(){
		boolean handled = handler();
		if(!handled && successor != null){
			successor.handler();
		}
	}

	public abstract boolean handler();

}
