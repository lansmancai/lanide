package com.lansmancai.laneditor.handler.add;

import com.lansmancai.laneditor.AddFrame;
import com.lansmancai.laneditor.EditorFrame;

/**
 * 添加事件的接口
 * 
 */
public interface AddHandler {

	//新增完后需要做的事情，需要做的事情由实现类去实现
	//参数为EditorFrame，AddFrame，输入的信息data
	void afterAdd(EditorFrame editorFrame, AddFrame addFrame, Object data);
}
