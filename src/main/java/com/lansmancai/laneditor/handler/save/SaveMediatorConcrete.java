package com.lansmancai.laneditor.handler.save;

import com.lansmancai.laneditor.EditorFrame;
import com.lansmancai.laneditor.commons.EditFile;

/**
 * ���涯�����н���ʵ��
 * 
 */
public class SaveMediatorConcrete extends SaveMediator {

	private SaveHandler commonHandler;
	
	private SaveHandler javaHandler;
	
	//��������������Ķ���
	public SaveMediatorConcrete() {
		this.commonHandler = new CommonSaveHandler();
		this.javaHandler = new JavaSaveHandler();
	}
	
	public String doSave(EditorFrame editorFrame) {
		//��õ�ǰ�༭���ļ���
		String fileName = editorFrame.getCurrentFile().getFile().getName();
		String result = null;
		//�ж��ļ��Ƿ�ΪJava�ļ��� �پ���������
		if (fileName.endsWith(".java")) {//����java�ļ�
			result = javaHandler.save(editorFrame);
		} else {//ִ����ͨ�ı���
			result = commonHandler.save(editorFrame);
		}
		return result;
	}

}
