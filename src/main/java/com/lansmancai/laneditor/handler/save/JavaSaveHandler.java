package com.lansmancai.laneditor.handler.save;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;

import com.lansmancai.laneditor.EditorFrame;
import com.lansmancai.laneditor.config.CompileConfig;
import com.lansmancai.laneditor.util.CommandUtil;

/**
 * ����Java�ļ��Ĵ�����
 * 
 */
public class JavaSaveHandler extends CommonSaveHandler {

	
	
	public String save(EditorFrame editorFrame) {
		//���ø���ı��淽��
		super.save(editorFrame);
		return javac(editorFrame);
	}

	//ִ��javac����
	private String javac(EditorFrame editorFrame) {
		try {
			//�����Ŀ�ı���·������ĿĿ¼��CompileConfig�����õ����Ŀ¼
			String classPath = editorFrame.getCurrentProject().getAbsolutePath() 
				+ File.separator + CompileConfig.OUTPUT_DIR;
			//���Դ�ļ����ļ�·��
			String filePath = editorFrame.getCurrentFile().getFile().getAbsolutePath();
			//ƴװ�ַ������������ֻ����windows������
			String command = "javac -d \"" + classPath + "\" \"" + filePath + "\"";
			System.out.println(command);
			Process p = CommandUtil.executeCommand(command);
			return CommandUtil.getProcessString(p);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	

}
