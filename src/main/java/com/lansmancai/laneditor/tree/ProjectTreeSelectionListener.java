package com.lansmancai.laneditor.tree;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.event.TreeSelectionEvent;

import com.lansmancai.laneditor.EditorFrame;

/**
 * ��Ŀ��ѡ�������
 * 
 */
public class ProjectTreeSelectionListener extends MouseAdapter {

	//�������frame
	private EditorFrame editorFrame;
	
	//���������frame(EditorFrame)��Ϊ����������������
	public ProjectTreeSelectionListener(EditorFrame editorFrame) {
		this.editorFrame = editorFrame;
	}

	public void mousePressed(MouseEvent e) {
		//�õ���ǰ��ѡ��Ľڵ�
		ProjectTreeNode selectNode = this.editorFrame.getSelectNode();
		//���û��ѡ��ڵ㣬�ͷ���
		if (selectNode == null) return;
		//���ѡ�����һ��Ŀ¼������
		if (selectNode.getFile().isDirectory()) return;
		//ʹ��EditorFrame�ķ��������ļ�
		this.editorFrame.openFile(selectNode.getFile());
	}

}
