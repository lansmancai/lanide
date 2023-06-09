package com.lansmancai.laneditor.handler.save;

import com.lansmancai.laneditor.EditorFrame;
import com.lansmancai.laneditor.commons.EditFile;

/**
 * 保存动作的中介者实现
 * 
 */
public class SaveMediatorConcrete extends SaveMediator {

	private SaveHandler commonHandler;
	
	private SaveHandler javaHandler;
	
	//构造两个处理保存的对象
	public SaveMediatorConcrete() {
		this.commonHandler = new CommonSaveHandler();
		this.javaHandler = new JavaSaveHandler();
	}
	
	public String doSave(EditorFrame editorFrame) {
		//获得当前编辑的文件名
		String fileName = editorFrame.getCurrentFile().getFile().getName();
		String result = null;
		//判断文件是否为Java文件， 再决定处理类
		if (fileName.endsWith(".java")) {//保存java文件
			result = javaHandler.save(editorFrame);
		} else {//执行普通的保存
			result = commonHandler.save(editorFrame);
		}
		return result;
	}

}
