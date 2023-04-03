package com.lansmancai.laneditor.handler.run;

import java.io.File;

import com.lansmancai.laneditor.EditorFrame;
import com.lansmancai.laneditor.config.CompileConfig;
import com.lansmancai.laneditor.util.CommandUtil;

/**
 * ����Java�ļ�������
 * 
 */
public class JavaRunHandler {

	public String run(EditorFrame editorFrame) {
		try {
			//�����ĿĿ¼��·��
			String projectPath = editorFrame.getCurrentProject().getAbsolutePath();
			//���Դ�ļ���ȫ·��
			String sourcePath = editorFrame.getCurrentFile().getFile().getAbsolutePath();
			//�����Ŀ�ı���·������ĿĿ¼��CompileConfig�����õ����Ŀ¼
			String classPath = editorFrame.getCurrentProject().getAbsolutePath() 
				+ File.separator + CompileConfig.OUTPUT_DIR;
			//��ȡ����
			String className = getClassName(projectPath, sourcePath);
			//ƴװ����
			String command = "java -cp \"" + classPath + "\" " + className;
			Process p = CommandUtil.executeCommand(command);
			return CommandUtil.getRunString(p);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	//������ĿĿ¼��·����JavaԴ�ļ���·����ȡһ�����ȫ�޶�����
	private String getClassName(String projectPath, String sourcePath) {
		String temp = projectPath + File.separator + CompileConfig.SRC_DIR + 
		File.separator;
		String result = sourcePath.replace(temp, "");
		result = result.replace(".java", "");
		result = result.replace(String.valueOf(File.separatorChar), ".");
		return result;
	}
	

}
