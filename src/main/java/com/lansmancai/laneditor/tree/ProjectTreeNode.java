package com.lansmancai.laneditor.tree;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * ��Ŀ���Ľڵ����
 * 
 */
public class ProjectTreeNode extends DefaultMutableTreeNode {

	//�ýڵ��Ӧ���ļ�
	private File file;
	
	//�ýڵ��µ��ӽڵ�
	private List<ProjectTreeNode> children;

	//ProjectTreeNode�Ĺ������������ֱ�ʱ�ýڵ��Ӧ���ļ����Ƿ��������ӽڵ�
	public ProjectTreeNode(File file, boolean allowsChildren) {
		super(file.getName(), allowsChildren);
		this.file = file;
		//��ʼ���ýڵ��µ��ӽڵ㼯��
		children = new ArrayList<ProjectTreeNode>();
	}
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public List<ProjectTreeNode> getChildren() {
		//���children, �����»�ȡһ��
		children.removeAll(children);
		for (int i = 0; i < getChildCount(); i++) {
			children.add((ProjectTreeNode)getChildAt(i));
		}
		return this.children;
	}



	
	
}
