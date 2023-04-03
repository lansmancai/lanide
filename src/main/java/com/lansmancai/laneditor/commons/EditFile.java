package com.lansmancai.laneditor.commons;

import java.io.File;

import javax.swing.JInternalFrame;

import com.lansmancai.laneditor.EditPane;

/**
 * �༭���ļ�����
 * 
 */
public class EditFile {

	//��ǰ�༭���ļ�
	private File file;
	
	//���ļ��Ƿ��Ѿ�������
	private boolean saved;
	
	//���ļ���Ӧ�Ĵ���
	private JInternalFrame iframe;
	
	//���ļ�����Ӧ�ı༭��
	private EditPane editPane;
	
	public EditFile(File file, boolean saved, JInternalFrame iframe, 
			EditPane editPane) {
		this.file = file;
		this.saved = saved;
		this.iframe = iframe;
		this.editPane = editPane;
	}

	public EditPane getEditPane() {
		return editPane;
	}

	public void setEditPane(EditPane editPane) {
		this.editPane = editPane;
	}

	public JInternalFrame getIframe() {
		return iframe;
	}


	public void setIframe(JInternalFrame iframe) {
		this.iframe = iframe;
	}


	public boolean isSaved() {
		return saved;
	}

	public void setSaved(boolean saved) {
		this.saved = saved;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	
	
}
