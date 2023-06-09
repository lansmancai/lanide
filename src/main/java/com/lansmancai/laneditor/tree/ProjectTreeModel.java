package com.lansmancai.laneditor.tree;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

/**
 * 项目树的Model对象
 * 
 */
public class ProjectTreeModel extends DefaultTreeModel {
	
	public ProjectTreeModel(ProjectTreeNode arg0) {
		super(arg0);
	}

	public void reload(ProjectTreeNode node, TreeCreator creator) {
		//获取node节点的父节点
		ProjectTreeNode parent = (ProjectTreeNode)node.getParent();
		//父节点为null，返回，不需要reload
		if (parent == null) return;
		//获取node节点在父节点的索引
		int index = parent.getIndex(node);
		//先装node节点从parent中删除
		parent.remove(index);
		//再通过TreeCreator获取新的节点
		node = creator.createNode(node.getFile());
		//添加到父节点中
		parent.insert(node, index);
		//调用DefaultTreeModel的reload方法
		super.reload(node);
	}

	
	
	
	
}
