package com.lansmancai.laneditor.handler.save;

import com.lansmancai.laneditor.EditorFrame;

/**
 * 保存的中介者
 * 
 */
public abstract class SaveMediator {

	//需要子类去实现的保存方法
	public abstract String doSave(EditorFrame editorFramet);
}
