package org.g;

/**
 * @author g
 * @date 2020/12/26 10:21 下午
 */
public class HandlerChin {

	private Handler head = null;

	private Handler tail = null;

	public void addHandler(Handler handler){
		handler.setSuccessor(null);

		if(head == null){
			head = handler;
			tail = handler;
			return;
		}

		tail.setSuccessor(handler);
		tail = handler;
	}

	public void handler(){
		if(head!=null){
			head.handler2();
		}
	}

}
