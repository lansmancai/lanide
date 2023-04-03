package com.lansmancai.laneditor;

import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

import com.lansmancai.laneditor.commons.EditFile;

/**
 * 窗口监听器
 * 
 */
public class IFrameListener extends InternalFrameAdapter {

	private EditorFrame editorFrame;
	
	public IFrameListener(EditorFrame editorFrame) {
		this.editorFrame = editorFrame;
	}

	public void internalFrameActivated(InternalFrameEvent e) {
		JInternalFrame iframe = editorFrame.getDesk().getSelectedFrame();
		int tapIndex = editorFrame.getTabIndex(iframe.getTitle());
		editorFrame.getTabPane().setSelectedIndex(tapIndex);
	}

	public void internalFrameClosing(InternalFrameEvent e) {
		//获取当前关闭操作所对应的JInternalFrame
		JInternalFrame iframe = (JInternalFrame)e.getSource();
		//获取当前操作的文件
		EditFile editFile = editorFrame.getCurrentFile();
		//询问是否要保存
		editorFrame.askSave(editFile); 
		//关闭当前的iframe
		editorFrame.closeIFrame(iframe);
	}
}
