package com.lansmancai.laneditor.handler.add;

import java.io.File;

import javax.swing.JOptionPane;

import com.lansmancai.laneditor.AddFrame;
import com.lansmancai.laneditor.EditorFrame;
import com.lansmancai.laneditor.exception.FileException;
import com.lansmancai.laneditor.tree.ProjectTreeNode;

/**
 * ���Ŀ¼������
 * 
 */
public class AddFolderHandler implements AddHandler {

	public void afterAdd(EditorFrame editorFrame, AddFrame addFrame, Object data) {
		try {
			//���������ѡȡ�Ľڵ�
			ProjectTreeNode selectNode = editorFrame.getSelectNode();
			//��ȡ�ýڵ�����Ӧ���ļ�����
			File folder = selectNode.getFile();
			//���folder����һ��Ŀ¼������selectNode�ĸ��ڵ㣨��һ��Ŀ¼����Ϊ��Ŀ¼�ĸ�Ŀ¼
			if (!folder.isDirectory()) {
				ProjectTreeNode parent = (ProjectTreeNode)selectNode.getParent();
				//�õ�ǰ��ѡ����ļ��ĸ�Ŀ¼��Ϊ��ǰѡ���Ŀ¼
				selectNode = parent;
				folder = parent.getFile();
			}
			//����һ���ļ�Ŀ¼����
			File newFolder = new File(folder.getAbsoluteFile() + File.separator + data);
			//�����Ŀ¼�Ѿ����ڣ�������ʾ������
			if (newFolder.exists()) {
				JOptionPane.showMessageDialog(addFrame, "Ŀ¼�Ѿ�����");
				return;
			}
			//�����µ�Ŀ¼
			newFolder.mkdir();
			//ˢ�����Ľڵ�
			editorFrame.reloadNode(selectNode);
			//��EditorFrame����
			editorFrame.setEnabled(true);
			//����ӵ�frame���ɼ�
			addFrame.setVisible(false);
		} catch (Exception e) {
			throw new FileException("create folder error: " + e.getMessage());
		}
	}

}
