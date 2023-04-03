package com.lansmancai.laneditor.tree;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

/**
 * ��Ŀ����Model����
 * 
 */
public class ProjectTreeModel extends DefaultTreeModel {
	
	public ProjectTreeModel(ProjectTreeNode arg0) {
		super(arg0);
	}

	public void reload(ProjectTreeNode node, TreeCreator creator) {
		//��ȡnode�ڵ�ĸ��ڵ�
		ProjectTreeNode parent = (ProjectTreeNode)node.getParent();
		//���ڵ�Ϊnull�����أ�����Ҫreload
		if (parent == null) return;
		//��ȡnode�ڵ��ڸ��ڵ������
		int index = parent.getIndex(node);
		//��װnode�ڵ��parent��ɾ��
		parent.remove(index);
		//��ͨ��TreeCreator��ȡ�µĽڵ�
		node = creator.createNode(node.getFile());
		//��ӵ����ڵ���
		parent.insert(node, index);
		//����DefaultTreeModel��reload����
		super.reload(node);
	}

	
	
	
	
}
