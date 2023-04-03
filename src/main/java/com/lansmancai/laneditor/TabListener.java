package com.lansmancai.laneditor;

import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.lansmancai.laneditor.commons.EditFile;

/**
 * tab页转换监听器
 * 
 */
public class TabListener implements ChangeListener {

	private EditorFrame editorFrame;
	
	public TabListener(EditorFrame editorFrame) {
		this.editorFrame = editorFrame;
	}
	
	public void stateChanged(ChangeEvent e) {
		//获得当前点击tab页对象
		JTabbedPane tab = (JTabbedPane)e.getSource();
		//获得tab页的索引
		int index = tab.getSelectedIndex();
		if (index == -1) return; 
		//根据tab页的tips(文件的绝对路径)获得当前的JInternalFrame对象
		JInternalFrame currentFrame = editorFrame.getIFrame(tab.getToolTipTextAt(index));
		//让当前点击的JInternalFrame对象可见
		editorFrame.showIFrame(currentFrame);
		//根据当前的JInternalFrame对象获得对应的文件
		EditFile currentFile = editorFrame.getEditFile(currentFrame);
		//设置EditorFrame当前编辑的文件为tab对应的文件
		editorFrame.setCurrentFile(currentFile);
	}

}
