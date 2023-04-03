package com.lansmancai.laneditor;

import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

import com.lansmancai.laneditor.commons.EditFile;

/**
 * ���ڼ�����
 * 
 */
public class IFrameListener extends InternalFrameAdapter {

	private EditorFrame editorFrame;
	
	public IFrameListener(EditorFrame editorFrame) {
		this.editorFrame = editorFrame;
	}

	public void internalFrameActivated(InternalFrameEvent e) {
		JInternalFrame iframe = editorFrame.getDesk().getSelectedFrame();
		int tapIndex = editorFrame.getTabIndex(iframe.getTitle());
		editorFrame.getTabPane().setSelectedIndex(tapIndex);
	}

	public void internalFrameClosing(InternalFrameEvent e) {
		//��ȡ��ǰ�رղ�������Ӧ��JInternalFrame
		JInternalFrame iframe = (JInternalFrame)e.getSource();
		//��ȡ��ǰ�������ļ�
		EditFile editFile = editorFrame.getCurrentFile();
		//ѯ���Ƿ�Ҫ����
		editorFrame.askSave(editFile); 
		//�رյ�ǰ��iframe
		editorFrame.closeIFrame(iframe);
	}
}
