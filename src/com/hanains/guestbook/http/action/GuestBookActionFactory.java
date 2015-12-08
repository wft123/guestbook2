package com.hanains.guestbook.http.action;

import com.hanains.http.action.Action;
import com.hanains.http.action.ActionFactory;

public class GuestBookActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		
		if("add".equals(actionName)){
			action = new AddAction();
		}else if("delete".equals(actionName)){
			action = new DeleteAction();
		}else if("deleteform".equals(actionName)){
			action = new DeleteFormAction();
		}else{
			action = new IndexAction();
		}
		
		return action;
	}

}
