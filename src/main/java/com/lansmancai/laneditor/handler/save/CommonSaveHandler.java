package com.lansmancai.laneditor.handler.save;

import com.lansmancai.laneditor.EditorFrame;
import com.lansmancai.laneditor.commons.EditFile;
import com.lansmancai.laneditor.util.FileUtil;

/**
 * 执行普通保存的处理类
 * 
 */
public class CommonSaveHandler implements SaveHandler {

	//提供一个保存方法，作为普通的保存
	public String save(EditorFrame editorFrame) {
		EditFile editFile = editorFrame.getCurrentFile();
		FileUtil.writeFile(editFile.getFile(), editFile.getEditPane().getText());
		return null; 
	}

}
