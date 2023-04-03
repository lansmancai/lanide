package com.lansmancai.laneditor.tree;

import java.io.File;

import javax.swing.JTree;

import com.lansmancai.laneditor.EditorFrame;

/**
 * �������ӿ�
 * 
 */
public interface TreeCreator {

	/**
	 * ���ݱ༭��EditorFrame���󴴽���Ŀ��
	 * @param editorFrame
	 * @return
	 */
	JTree createTree(EditorFrame editorFrame);
	
	/**
	 * ����һ��Ŀ¼�������Ľڵ�
	 * @param folder
	 * @return
	 */
	ProjectTreeNode createNode(File folder);
}
