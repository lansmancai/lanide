package com.lansmancai.laneditor;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * 文档监听器
 * 
 */
public class EditDocumentListener implements DocumentListener {
	//主界面对象
	private EditorFrame editorFrame;
	public EditDocumentListener(EditorFrame editorFrame) {
		this.editorFrame = editorFrame;
	}
	public void changedUpdate(DocumentEvent e) {
	}
	public void insertUpdate(DocumentEvent e) {
		//设置当前编辑的文件的saved属性为false
		this.editorFrame.getCurrentFile().setSaved(false);
	}
	public void removeUpdate(DocumentEvent e) {
	}
}
