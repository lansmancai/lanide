package com.lansmancai.laneditor.commons;

import com.lansmancai.laneditor.EditorFrame;
import com.lansmancai.laneditor.handler.add.AddHandler;

/**
 * ��ӵ���Ϣ����
 * 
 */
public class AddInfo {

	//�ַ���, �����������textǰ��ʾ, ����: �ļ�����
	private String info;
	
	//����������Ӱ�����frame
	private EditorFrame editorFrame;
	
	//�������Ĵ�����
	private AddHandler handler;
	
	public AddInfo(String info, EditorFrame editorFrame, AddHandler handler) {
		this.info = info;
		this.editorFrame = editorFrame;
		this.handler = handler;
	}

	public AddHandler getHandler() {
		return handler;
	}

	public void setHandler(AddHandler handler) {
		this.handler = handler;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public EditorFrame getEditorFrame() {
		return editorFrame;
	}

	public void setEditorFrame(EditorFrame editorFrame) {
		this.editorFrame = editorFrame;
	}

}
