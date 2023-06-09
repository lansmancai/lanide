package com.lansmancai.laneditor.tree;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * 项目树的节点对象
 * 
 */
public class ProjectTreeNode extends DefaultMutableTreeNode {

	//该节点对应的文件
	private File file;
	
	//该节点下的子节点
	private List<ProjectTreeNode> children;

	//ProjectTreeNode的构造器，参数分别时该节点对应的文件，是否允许有子节点
	public ProjectTreeNode(File file, boolean allowsChildren) {
		super(file.getName(), allowsChildren);
		this.file = file;
		//初始化该节点下的子节点集合
		children = new ArrayList<ProjectTreeNode>();
	}
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public List<ProjectTreeNode> getChildren() {
		//清空children, 再重新获取一次
		children.removeAll(children);
		for (int i = 0; i < getChildCount(); i++) {
			children.add((ProjectTreeNode)getChildAt(i));
		}
		return this.children;
	}



	
	
}
