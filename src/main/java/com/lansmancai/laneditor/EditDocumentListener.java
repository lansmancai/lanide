package com.lansmancai.laneditor;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * �ĵ�������
 * 
 */
public class EditDocumentListener implements DocumentListener {
	//���������
	private EditorFrame editorFrame;
	public EditDocumentListener(EditorFrame editorFrame) {
		this.editorFrame = editorFrame;
	}
	public void changedUpdate(DocumentEvent e) {
	}
	public void insertUpdate(DocumentEvent e) {
		//���õ�ǰ�༭���ļ���saved����Ϊfalse
		this.editorFrame.getCurrentFile().setSaved(false);
	}
	public void removeUpdate(DocumentEvent e) {
	}
}
