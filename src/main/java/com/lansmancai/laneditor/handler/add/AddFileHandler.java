package com.lansmancai.laneditor.handler.add;

import java.io.File;

import javax.swing.JOptionPane;

import com.lansmancai.laneditor.AddFrame;
import com.lansmancai.laneditor.EditorFrame;
import com.lansmancai.laneditor.exception.FileException;
import com.lansmancai.laneditor.tree.ProjectTreeModel;
import com.lansmancai.laneditor.tree.ProjectTreeNode;

/**
 * ����ļ�������
 * 
 */
public class AddFileHandler implements AddHandler {

	public void afterAdd(EditorFrame editorFrame, AddFrame addFrame, Object data) {
		try {
			//��õ�ǰ��ѡ������ڵ�
			ProjectTreeNode selectNode = editorFrame.getSelectNode();
			//��ȡ��ǰѡ��ڵ�����Ӧ���ļ�
			File folder = selectNode.getFile();
			//���folder����һ��Ŀ¼������selectNode�ĸ��ڵ㣨��һ��Ŀ¼����Ϊ���ļ��Ĵ��Ŀ¼
			if (!folder.isDirectory()) {
				ProjectTreeNode parent = (ProjectTreeNode)selectNode.getParent();
				selectNode = parent;
				folder = parent.getFile();
			}
			//�����ļ����ŵ�folder��
			File newFile = new File(folder.getAbsoluteFile() + File.separator + data);
			//����ļ��Ѿ����ڣ��͵�����ʾ������
			if (newFile.exists()) {
				JOptionPane.showMessageDialog(addFrame, "�ļ��Ѿ�����");
				return;
			}
			newFile.createNewFile();
			editorFrame.reloadNode(selectNode);
			//ʹ���༭frame����
			editorFrame.setEnabled(true);
			///����ӵ�frame���ɼ�
			addFrame.setVisible(false);
		} catch (Exception e) {
			throw new FileException("create file error: " + e.getMessage());
		}
	}

}
