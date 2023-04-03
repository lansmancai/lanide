package com.lansmancai.laneditor;

import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.lansmancai.laneditor.commons.EditFile;

/**
 * tabҳת��������
 * 
 */
public class TabListener implements ChangeListener {

	private EditorFrame editorFrame;
	
	public TabListener(EditorFrame editorFrame) {
		this.editorFrame = editorFrame;
	}
	
	public void stateChanged(ChangeEvent e) {
		//��õ�ǰ���tabҳ����
		JTabbedPane tab = (JTabbedPane)e.getSource();
		//���tabҳ������
		int index = tab.getSelectedIndex();
		if (index == -1) return; 
		//����tabҳ��tips(�ļ��ľ���·��)��õ�ǰ��JInternalFrame����
		JInternalFrame currentFrame = editorFrame.getIFrame(tab.getToolTipTextAt(index));
		//�õ�ǰ�����JInternalFrame����ɼ�
		editorFrame.showIFrame(currentFrame);
		//���ݵ�ǰ��JInternalFrame�����ö�Ӧ���ļ�
		EditFile currentFile = editorFrame.getEditFile(currentFrame);
		//����EditorFrame��ǰ�༭���ļ�Ϊtab��Ӧ���ļ�
		editorFrame.setCurrentFile(currentFile);
	}

}
