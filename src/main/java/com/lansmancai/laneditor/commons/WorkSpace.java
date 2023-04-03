package com.lansmancai.laneditor.commons;

import java.io.File;

import com.lansmancai.laneditor.EditorFrame;

/**
 * �����ռ����
 * 
 */
public class WorkSpace {

	//�����ռ��Ӧ��Ŀ¼
	private File folder;
	
	//�����ռ��е����༭������
	private EditorFrame editorFrame;
	
	public WorkSpace(File folder, EditorFrame editorFrame) {
		this.folder = folder;
		this.editorFrame = editorFrame;
	}

	public EditorFrame getEditorFrame() {
		return editorFrame;
	}

	public void setEditorFrame(EditorFrame editorFrame) {
		this.editorFrame = editorFrame;
	}


	public File getFolder() {
		return folder;
	}

	public void setFolder(File folder) {
		this.folder = folder;
	}
	
}
