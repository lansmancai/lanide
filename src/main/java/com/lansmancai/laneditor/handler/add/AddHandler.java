package com.lansmancai.laneditor.handler.add;

import com.lansmancai.laneditor.AddFrame;
import com.lansmancai.laneditor.EditorFrame;

/**
 * ����¼��Ľӿ�
 * 
 */
public interface AddHandler {

	//���������Ҫ�������飬��Ҫ����������ʵ����ȥʵ��
	//����ΪEditorFrame��AddFrame���������Ϣdata
	void afterAdd(EditorFrame editorFrame, AddFrame addFrame, Object data);
}
