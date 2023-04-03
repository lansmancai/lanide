package com.lansmancai.laneditor;

import com.lansmancai.laneditor.tree.TreeCreator;
import com.lansmancai.laneditor.tree.TreeCreatorImpl;

/**
 * ���������
 * 
 */
public class Main {

	public static void main(String[] args) {
		TreeCreator treeCreator = new TreeCreatorImpl();
		//����EditorFrame����ʱ�������ÿɼ�
		EditorFrame editorFrame = new EditorFrame("lanide", treeCreator);
		//��editorFrame������ΪSpaceFrame�Ĺ������
		SpaceFrame spaceFrame = new SpaceFrame(editorFrame);
		//��SpaceFrame�ɼ�
		spaceFrame.setVisible(true);
	}
}
