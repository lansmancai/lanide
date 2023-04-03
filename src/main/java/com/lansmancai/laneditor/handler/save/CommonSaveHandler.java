package com.lansmancai.laneditor.handler.save;

import com.lansmancai.laneditor.EditorFrame;
import com.lansmancai.laneditor.commons.EditFile;
import com.lansmancai.laneditor.util.FileUtil;

/**
 * ִ����ͨ����Ĵ�����
 * 
 */
public class CommonSaveHandler implements SaveHandler {

	//�ṩһ�����淽������Ϊ��ͨ�ı���
	public String save(EditorFrame editorFrame) {
		EditFile editFile = editorFrame.getCurrentFile();
		FileUtil.writeFile(editFile.getFile(), editFile.getEditPane().getText());
		return null; 
	}

}
